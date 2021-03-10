package com.dalbot.challenges.api.dto;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * SponsorListItemDTO class.
 *
 * @author joao.rodrigues
 */
@Getter
@Setter
public class SponsorListItemDTO extends AbstractIdDTO implements Serializable {
  private String name;
  private FileDescriptorDTO image;
}
