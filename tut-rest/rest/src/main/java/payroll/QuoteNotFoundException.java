package payroll;

class QuoteNotFoundException extends RuntimeException {

	QuoteNotFoundException(Long id) {
		super("Could not find quote " + id);
	}
}
