package com.dalbot.challenges.api.dao.repository;

import com.dalbot.challenges.api.dao.model.Challenge;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * ChallengesRepository class.
 *
 * @author joao.rodrigues
 */
@Repository
public interface ChallengesRepository extends CrudRepository<Challenge, UUID> {
}
