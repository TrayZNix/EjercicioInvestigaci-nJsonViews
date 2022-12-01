package com.salesianostriana.dam.trianafy.dto;

import io.swagger.v3.oas.annotations.Hidden;
import lombok.*;

import javax.validation.constraints.NotNull;

/**
 * Esta clase se usará para devolver un artista, cambiando el nombre del atributo nombre de un artista
 * a simplemente "artista": "nombreArtista"
 */
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Builder
public class ArtistaDtoOut {
    private Long id;
    private String artist;
}
