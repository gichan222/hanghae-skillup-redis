package com.movie.moviepresentation.interfaces.movie.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

public class SearchDto {

    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Movie {
        private Long id;
        private LocalDateTime searchDate;
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Schedule {
        private Long id;
        private Long theaterId;  // 외래키 제거, theaterId로 대체
    }

}
