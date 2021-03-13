package com.dalbot.challenges.api.dao.repository;

import com.dalbot.challenges.api.dao.model.Challenge;
import java.util.UUID;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

/**
 * ChallengesRepository class.
 *
 * @author joao.rodrigues
 */
@Repository
public interface ChallengesRepository extends ReactiveCrudRepository<Challenge, UUID> {

}
