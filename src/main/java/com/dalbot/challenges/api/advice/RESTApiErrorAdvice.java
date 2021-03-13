package com.dalbot.challenges.api.advice;

import com.dalbot.challenges.api.exception.ResourceNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * RESTApiErrorAdvice class.
 *
 * @author joao.rodrigues
 */
@RestControllerAdvice
public class RESTApiErrorAdvice {

  @ExceptionHandler(Exception.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public void handleUncaughtException(Exception e) {
    System.out.println(e.getMessage());
  }

  @ExceptionHandler(ResourceNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public void handleResourceNotFoundException() {}

  /**
   * Handle request body validation errors.
   *
   * @return RestRequestErrorDTO
   */
  @ExceptionHandler(MethodArgumentNotValidException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public RequestErrorDTO handleAnyNonCatchError(MethodArgumentNotValidException ex) {
    return RequestErrorDTO.builder()
        .errors(collectErrors(ex))
        .build();
  }

  private List<String> collectErrors(MethodArgumentNotValidException ex) {
    List<String> errors = new ArrayList<String>();
    for (FieldError e : ex.getBindingResult().getFieldErrors()) {
      errors.add(e.getField() + ": " + e.getDefaultMessage());
    }
    return errors;
  }

}
