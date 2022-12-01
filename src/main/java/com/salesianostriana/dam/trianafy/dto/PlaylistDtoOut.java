package com.salesianostriana.dam.trianafy.dto;

import lombok.*;

import javax.persistence.Id;

/**
 Esta clase se usará para devolver una playlist.
 */
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Builder
public class PlaylistDtoOut {
    @Id
    private Long id;
    private String name;
    private Integer numberOfSongs;
}
