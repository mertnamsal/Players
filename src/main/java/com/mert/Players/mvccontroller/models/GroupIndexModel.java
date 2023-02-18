package com.mert.Players.mvccontroller.models;

import com.mert.Players.repository.entity.Player;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GroupIndexModel {

    String name;
    String location;
    List<Player> playerList;
}
