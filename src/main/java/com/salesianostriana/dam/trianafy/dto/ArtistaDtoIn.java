package com.salesianostriana.dam.trianafy.dto;

import io.swagger.v3.oas.annotations.Hidden;
import lombok.*;

import javax.validation.constraints.NotNull;

/**
 Esta clase se usará para registrar un artista
 */
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Builder
public class ArtistaDtoIn {
    @NotNull
    private String name;
}
