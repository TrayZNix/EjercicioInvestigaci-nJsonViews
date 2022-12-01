package com.salesianostriana.dam.trianafy.model;


import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Data
@Builder
public class Artista {
    @JsonView(Views.Public.class)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonView(Views.Public.class)
    private String name;
    @JsonView(Views.ArtistaDtoConfidencial.class)
    private String telefono;
    @JsonView(Views.ArtistaDtoConfidencial.class)
    private String dni;

}
