package com.movie.movieapplication.movie.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "seat")
public class SeatEntity extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long screenId;

    @Column
    private String seatNumber;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SeatEntity seatEntity)) return false;
        return id != null && id.equals(seatEntity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
