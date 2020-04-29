package payroll;


import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

// tag::hateoas-imports[]
// end::hateoas-imports[]

@RestController
class QuoteController {

	private final QuoteRepository repository;

	QuoteController(QuoteRepository repository) {
		this.repository = repository;
	}

	// Aggregate root

	// tag::get-aggregate-root[]
	@GetMapping("/quotes")
	CollectionModel<EntityModel<Quote>> all() {

		List<EntityModel<Quote>> quotes = repository.findAll().stream()
				.map(quote -> new EntityModel<>(quote,
						linkTo(methodOn(QuoteController.class).one(quote.getIdQuote())).withSelfRel(),
						linkTo(methodOn(QuoteController.class).all()).withRel("quotes")))
				.collect(Collectors.toList());

		return new CollectionModel<>(quotes,
				linkTo(methodOn(QuoteController.class).all()).withSelfRel());
	}
	// end::get-aggregate-root[]

	@PostMapping("/quotes")
	Quote newQuote(@RequestBody Quote newQuote) {
		return repository.save(newQuote);
	}

	// Single item

	// tag::get-single-item[]
	@GetMapping("/quotes/{idQuote}")
	EntityModel<Quote> one(@PathVariable Long idQuote) {

		Quote quote = repository.findById(idQuote)
				.orElseThrow(() -> new QuoteNotFoundException(idQuote));

		return new EntityModel<>(quote,
				linkTo(methodOn(QuoteController.class).one(idQuote)).withSelfRel(),
				linkTo(methodOn(QuoteController.class).all()).withRel("quotes"));
	}
	// end::get-single-item[]

	@PutMapping("/quotes/{idQuote}")
	Quote replaceQuote(@RequestBody Quote newQuote, @PathVariable Long idQuote) {

		return repository.findById(idQuote)
				.map(quote -> {
					quote.setFirstName(newQuote.getFirstName());
					quote.setLastName(newQuote.getLastName());
					quote.setPhrase(newQuote.getPhrase());
					return repository.save(quote);
				})
				.orElseGet(() -> {
					newQuote.setIdQuote(idQuote);
					return repository.save(newQuote);
				});
	}

	@DeleteMapping("/quotes/{idQuote}")
	void deleteQuote(@PathVariable Long idQuote) {
		repository.deleteById(idQuote);
	}
}
