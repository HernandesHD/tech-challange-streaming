package com.fiap.techchallenge.streamingtech.service;

import com.fiap.techchallenge.streamingtech.model.Video;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.text.ParseException;

public interface VideoService {
    Mono<Video> createVideo(Video newVideo);
    Mono<Video> updateVideo(String videoId, Video updatedVideo);
    Flux<Video> getAllVideos(int pageNumber, int pageSize, String sortBy);
    Mono<Void> deleteVideo(String videoId);
    Flux<Video> getVideosByTitleAndDate(String searchTitle, String searchDate) throws ParseException;
    Flux<Video> getVideosByCategory(String searchCategory);
    Mono<Video> getVideoWithIncrementedViews(String videoId);

}
