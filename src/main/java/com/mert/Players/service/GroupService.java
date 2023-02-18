package com.mert.Players.service;

import com.mert.Players.repository.IGroupRepository;
import com.mert.Players.repository.entity.Group;
import com.mert.Players.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class GroupService extends ServiceManager<Group,Long> {

    private final IGroupRepository repository;

    public GroupService(IGroupRepository repository){
        super(repository);
        this.repository=repository;
    }
}
