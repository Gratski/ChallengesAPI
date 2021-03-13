package com.dalbot.challenges.api.dao.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Challenge class.
 *
 * @author joao.rodrigues
 */
@Getter
@Setter
public class Challenge extends BaseEntity {

  private String title;
  private String description;
  private String videoURL;

}
