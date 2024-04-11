package com.example.demo.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "movies",indexes = {
        @Index(name = "idx_movies_title", columnList = "title")
})
public class Movie {
    @Id
    private Long movieId;
    private String title;
    private String genres;
}
