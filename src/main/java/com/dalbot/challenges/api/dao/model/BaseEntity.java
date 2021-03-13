package com.dalbot.challenges.api.dao.model;

import java.time.Instant;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;


/**
 * BaseEntity class.
 *
 * @author joao.rodrigues
 */
@Getter
@Setter
public abstract class BaseEntity {

  @Id
  private UUID id;

  private Instant createdAt;

  private Instant updatedAt;

}
