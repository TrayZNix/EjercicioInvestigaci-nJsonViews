package com.salesianostriana.dam.trianafy.dto;

import lombok.*;

import javax.validation.constraints.NotNull;

/**
 Esta clase se usará para registrar una playlist
 */
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Builder
public class PlaylistDtoIn {
    @NotNull
    private String name;
    @NotNull
    private String description;
}
