package com.dalbot.challenges.api.controller;

import com.dalbot.challenges.api.dto.ChallengeDetailsDTO;
import com.dalbot.challenges.api.dto.ChallengeListItemDTO;
import com.dalbot.challenges.api.dto.CreateChallengeDTO;
import com.dalbot.challenges.api.service.ChallengesService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * ChallengesController class.
 *
 * @author joao.rodrigues
 */
@RestController
@RequestMapping("/challenges")
public class ChallengesController {

  private final ChallengesService challengesService;

  @Autowired
  public ChallengesController(ChallengesService challengesService) {
    this.challengesService = challengesService;
  }

  @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
  public Flux<ChallengeListItemDTO> getChallenges() {
    return challengesService.fetchChallenges(0, 0);
  }

  @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
  public Mono<ChallengeDetailsDTO> getChallenge(@PathVariable("id") String id) {
    return challengesService.fetchChallenge(id);
  }

  @PostMapping(path = "")
  public Mono<String> createChallenge(@RequestBody @Valid CreateChallengeDTO dto) {
    return challengesService.createChallenge(dto);
  }

  @PutMapping(path = "/{id}")
  public Mono<String> createChallenge(@PathVariable("id") String id,
                              @RequestBody CreateChallengeDTO dto) {
    return challengesService.updateChallenge(id, dto);
  }

}
