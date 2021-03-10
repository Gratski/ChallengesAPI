package com.dalbot.challenges.api.controller;

import com.dalbot.challenges.api.dto.ChallengeListItemDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * ChallengesController class.
 *
 * @author joao.rodrigues
 */
@RestController
@RequestMapping("/challenges")
public class ChallengesController {

  @GetMapping(path = "", produces = MediaType.APPLICATION_NDJSON_VALUE)
  public Flux<ChallengeListItemDTO> getChallenges() {
    return Flux.just(ChallengeListItemDTO.builder().build(), ChallengeListItemDTO.builder().build());
  }

}
