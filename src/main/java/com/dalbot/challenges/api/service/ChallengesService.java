package com.dalbot.challenges.api.service;

import com.dalbot.challenges.api.dao.model.Challenge;
import com.dalbot.challenges.api.dao.repository.ChallengesRepository;
import com.dalbot.challenges.api.dto.ChallengeDetailsDTO;
import com.dalbot.challenges.api.dto.ChallengeListItemDTO;
import com.dalbot.challenges.api.dto.CreateChallengeDTO;
import com.dalbot.challenges.api.exception.ResourceNotFoundException;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * ChallengesService class.
 *
 * @author joao.rodrigues
 */
@Service
public class ChallengesService {

  private final ChallengesRepository challengesRepository;

  @Autowired
  public ChallengesService(
      ChallengesRepository challengesRepository) {
    this.challengesRepository = challengesRepository;
  }

  public Flux<ChallengeListItemDTO> fetchChallenges(int page, int size) {
    return challengesRepository.findAll()
        .map(e -> ChallengeListItemDTO.builder()
            .id(e.getId().toString())
            .title(e.getTitle())
            .description(e.getDescription())
            .build()
        );
  }

  public Mono<ChallengeDetailsDTO> fetchChallenge(String id) {
    return challengesRepository.findById(UUID.fromString(id))
        .map(e -> ChallengeDetailsDTO.builder()
            .id(e.getId().toString())
            .title(e.getTitle())
            .description(e.getDescription())
            .build()
        ).switchIfEmpty(Mono.error(new ResourceNotFoundException()));
  }

  public Mono<String> createChallenge(CreateChallengeDTO dto) {
    Challenge challenge = new Challenge();
    challenge.setTitle(dto.getTitle());
    challenge.setDescription(dto.getDescription());
    return challengesRepository.save(challenge)
        .map(e -> e.getId().toString());
  }

  public Mono<String> updateChallenge(String id, CreateChallengeDTO dto) {
    return challengesRepository.findById(UUID.fromString(id))
        .map(challenge -> {
          challenge.setTitle(dto.getTitle());
          challenge.setDescription(dto.getDescription());
          return challengesRepository.save(challenge);
        }).flatMap(mono -> mono.map(e -> e.getId().toString()));
  }

}
