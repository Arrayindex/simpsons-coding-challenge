package payroll;


import java.util.List;
import java.util.stream.Collectors;

// tag::hateoas-imports[]
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
// end::hateoas-imports[]

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class CharacterController {

	private final CharacterRepository repository;

	CharacterController(CharacterRepository repository) {
		this.repository = repository;
	}

	// Aggregate root

	// tag::get-aggregate-root[]
	@GetMapping("/characters")
	CollectionModel<EntityModel<Character>> all() {

		List<EntityModel<Character>> characters = repository.findAll().stream()
				.map(character -> new EntityModel<>(character,
						linkTo(methodOn(CharacterController.class).one(character.getIdChar())).withSelfRel(),
						linkTo(methodOn(CharacterController.class).all()).withRel("characters")))
				.collect(Collectors.toList());

		return new CollectionModel<>(characters,
				linkTo(methodOn(CharacterController.class).all()).withSelfRel());
	}
	// end::get-aggregate-root[]

	@PostMapping("/characters")
	Character newCharacter(@RequestBody Character newCharacter) {
		return repository.save(newCharacter);
	}

	// Single item

	// tag::get-single-item[]
	@GetMapping("/characters/{idChar}")
	EntityModel<Character> one(@PathVariable Long idChar) {

		Character character = repository.findById(idChar)
				.orElseThrow(() -> new CharacterNotFoundException(idChar));

		return new EntityModel<>(character,
				linkTo(methodOn(CharacterController.class).one(idChar)).withSelfRel(),
				linkTo(methodOn(CharacterController.class).all()).withRel("characters"));
	}
	// end::get-single-item[]

	@PutMapping("/characters/{idChar}")
	Character replaceCharacter(@RequestBody Character newCharacter, @PathVariable Long idChar) {

		return repository.findById(idChar)
				.map(character -> {
					character.setFirstName(newCharacter.getFirstName());
					character.setLastName(newCharacter.getLastName());
					return repository.save(character);
				})
				.orElseGet(() -> {
					newCharacter.setIdChar(idChar);
					return repository.save(newCharacter);
				});
	}

	@DeleteMapping("/characters/{idChar}")
	void deleteCharacter(@PathVariable Long idChar) {
		repository.deleteById(idChar);
	}
}
