package com.salesianostriana.dam.trianafy.dto;

import lombok.*;

import javax.persistence.Id;

/**
 Esta clase se usará para devolver los datos de una playlist
 */
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Builder
public class PlaylistDtoOutPCreate {
    @Id
    private Long id;
    private String name;
    private String description;
}
