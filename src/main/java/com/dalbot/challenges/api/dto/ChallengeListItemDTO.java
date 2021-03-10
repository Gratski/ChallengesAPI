package com.dalbot.challenges.api.dto;

import java.io.Serializable;
import java.util.Collection;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * ChallengeListItemDTO class.
 *
 * @author joao.rodrigues
 */
@Getter
@Setter
@Builder
@ToString
public class ChallengeListItemDTO implements Serializable {
  private String id;
  private String title;
  private String description;
  private String videoURL;
  private FileDescriptorDTO primaryPicture;
  private SponsorListItemDTO sponsor;
  private Collection<FileDescriptorDTO> files;

}
