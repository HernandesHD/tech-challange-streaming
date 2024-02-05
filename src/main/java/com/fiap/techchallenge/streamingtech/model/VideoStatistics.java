package com.fiap.techchallenge.streamingtech.model;

import lombok.Data;

@Data
public class VideoStatistics {
    private long totalVideos;
    private long favoritedVideos;
    private double averageViews;

    public VideoStatistics(long totalVideos, long favoritedVideos, double averageViews) {
        this.totalVideos = totalVideos;
        this.favoritedVideos = favoritedVideos;
        this.averageViews = averageViews;
    }
}
