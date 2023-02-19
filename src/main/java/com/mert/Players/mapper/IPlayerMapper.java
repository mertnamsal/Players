package com.mert.Players.mapper;

import com.mert.Players.dto.request.PlayerSaveRequestDto;
import com.mert.Players.dto.response.PlayerFindAllResponse;
import com.mert.Players.repository.entity.Player;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IPlayerMapper {

    IPlayerMapper INSTANCE = Mappers.getMapper(IPlayerMapper.class);

    Player toPlayer(final PlayerSaveRequestDto dto);

    PlayerFindAllResponse playerFindAllResponseFromPlayer(final Player player);

}
