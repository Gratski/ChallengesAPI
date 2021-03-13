package com.dalbot.challenges.api.advice;

import java.io.Serializable;
import java.util.Collection;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * RequestErrorDTO class.
 *
 * @author joao.rodrigues
 */
@Getter
@Setter
@Builder
public class RequestErrorDTO implements Serializable {

  private Collection<String> errors;

}
