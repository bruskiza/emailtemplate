package test.bruski.emailtemplate.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import test.bruski.emailtemplate.exception.EmailTemplateNotFoundException;

@ControllerAdvice
class EmailTemplateNotFoundAdvice {

  @ResponseBody
  @ExceptionHandler(EmailTemplateNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String emailTemplateNotFoundHandler(EmailTemplateNotFoundException ex) {
    return ex.getMessage();
  }

}