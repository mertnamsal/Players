package com.mert.Players.repository;

import com.mert.Players.repository.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlayerRepository extends JpaRepository<Player,Long> {
    Boolean existsPlayerByJerseyno(String jerseyno);
}
