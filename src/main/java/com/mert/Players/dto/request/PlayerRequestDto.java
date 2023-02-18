package com.mert.Players.dto.request;

import lombok.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PlayerRequestDto {
    private Long id;
    private String name;
    private String surname;
    private String jerseyno;
}
