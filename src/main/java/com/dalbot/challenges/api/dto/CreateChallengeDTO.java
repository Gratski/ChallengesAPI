package com.dalbot.challenges.api.dto;

import java.io.Serializable;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/**
 * CreateChallengeDTO class.
 *
 * @author joao.rodrigues
 */
@Getter
@Setter
public class CreateChallengeDTO implements Serializable {
  @NotNull
  private String title;
  @NotNull
  private String description;
}
