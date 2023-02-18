package com.mert.Players.dto.request;


import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GroupRequestDto {

    private Long id;
    private String name;

}
