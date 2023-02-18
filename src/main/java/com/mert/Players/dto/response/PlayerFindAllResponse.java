package com.mert.Players.dto.response;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class PlayerFindAllResponse {
    private Long id;
    private String name;
    private String surname;
    private String jerseyno;
}
