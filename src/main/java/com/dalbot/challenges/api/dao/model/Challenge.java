package com.dalbot.challenges.api.dao.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * Challenge class.
 *
 * @author joao.rodrigues
 */
@Getter
@Setter
@Entity
@Table(name = "challenge")
public class Challenge extends BaseEntity {

  private String title;
  private String description;
  private String videoURL;

}
