package com.mert.Players.service;

import com.mert.Players.dto.request.PlayerSaveRequestDto;
import com.mert.Players.mapper.IPlayerMapper;
import com.mert.Players.repository.IPlayerRepository;
import com.mert.Players.repository.entity.Group;
import com.mert.Players.repository.entity.Player;
import com.mert.Players.utility.ServiceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlayerService extends ServiceManager<Player,Long> {
    private final IPlayerRepository repository;
    @Autowired
    private GroupService groupService;

    public PlayerService(IPlayerRepository repository){
        super(repository);
        this.repository=repository;
    }

    public Boolean existsPlayerByJerseyno(String jerseyno){
        return repository.existsPlayerByJerseyno(jerseyno);
    }


    public Boolean register(PlayerSaveRequestDto dto) {
        Optional<Group> groups = groupService.findById(0L);
        dto.setGroup(groups.get());
        save(IPlayerMapper.INSTANCE.toPlayer(dto));
        return true;
    }
}
