package com.mert.Players.dto.request;

import com.mert.Players.repository.entity.Group;
import lombok.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PlayerSaveRequestDto {
    private String name;
    private String surname;
    private String age;
    private String jerseyno;
    private Group group;
}
