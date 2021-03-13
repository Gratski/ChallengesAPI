package com.dalbot.challenges.api.dto;

import java.io.Serializable;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * ChallengeDetailsDTO class.
 *
 * @author joao.rodrigues
 */
@Getter
@Setter
@Builder
public class ChallengeDetailsDTO implements Serializable {
  private String id;
  private String title;
  private String description;
}
