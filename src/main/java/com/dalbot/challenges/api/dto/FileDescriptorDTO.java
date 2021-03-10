package com.dalbot.challenges.api.dto;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * FileDescriptorDTO class.
 *
 * @author joao.rodrigues
 */
@Getter
@Setter
public class FileDescriptorDTO extends AbstractIdDTO implements Serializable {
  private String url;
  private FileTypeDTO type;
}
