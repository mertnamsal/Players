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

    String name0;
    String name1;
    String name2;
    List<Player> playerList0;
    List<Player> playerList1;
    List<Player> playerList2;
}
