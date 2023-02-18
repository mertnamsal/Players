package com.mert.Players.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IPlayerMapper {

    IPlayerMapper INSTANCE = Mappers.getMapper(IPlayerMapper.class);


}
