package test.bruski.emailtemplate.exception;

public class EmailTemplateNotFoundException extends RuntimeException {

  public EmailTemplateNotFoundException(Long id) {
    super("Could not find email template " + id);
  }
}