package payroll;

class CharacterNotFoundException extends RuntimeException {

	CharacterNotFoundException(Long id) {
		super("Could not find character " + id);
	}
}
