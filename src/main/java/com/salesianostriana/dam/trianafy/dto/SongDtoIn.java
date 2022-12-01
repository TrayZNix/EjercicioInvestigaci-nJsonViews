package com.salesianostriana.dam.trianafy.dto;

import lombok.*;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

/**
  Esta clase se usará para registrar una canción.
 */

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Builder
public class SongDtoIn {
    @NotNull
    private String title;
    @NotNull
    private String album;
    @NotNull
    private String year;
    private Long artistId;
}
