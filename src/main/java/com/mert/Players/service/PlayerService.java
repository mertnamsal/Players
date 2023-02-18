package com.mert.Players.service;

import com.mert.Players.dto.request.PlayerRequestDto;
import com.mert.Players.mapper.IPlayerMapper;
import com.mert.Players.repository.IPlayerRepository;
import com.mert.Players.repository.entity.Player;
import com.mert.Players.utility.ServiceManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService extends ServiceManager<Player,Long> {
    private final IPlayerRepository repository;

    public PlayerService(IPlayerRepository repository){
        super(repository);
        this.repository=repository;
    }
    public List<PlayerRequestDto> findAllResponseDto(){
        List<PlayerRequestDto> result = new ArrayList<>();

        return result;
    }
}
