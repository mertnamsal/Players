package com.mert.Players.repository;

import com.mert.Players.repository.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGroupRepository extends JpaRepository<Group,Long> {
}
