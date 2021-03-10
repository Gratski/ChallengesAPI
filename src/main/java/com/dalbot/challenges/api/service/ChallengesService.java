package com.dalbot.challenges.api.service;

import com.dalbot.challenges.api.dao.repository.ChallengesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
