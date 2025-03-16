package com.movie.movieapplication.movie.dto;

import com.movie.movieapplication.movie.domain.TimeTable;

import java.time.LocalDateTime;

public class TimeTableInfo {

    public record Get(LocalDateTime startDate, LocalDateTime endDate) {
        public static Get of(LocalDateTime startDate, LocalDateTime endDate) {
            return new Get(startDate, endDate);
        }
        public static Get from(TimeTable timeTable) {
            return Get.of(timeTable.getStartTime(), timeTable.getEndTime());
        }
    }

}
