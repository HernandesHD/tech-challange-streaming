package com.fiap.techchallenge.streamingtech.controller;

import com.fiap.techchallenge.streamingtech.model.Video;
import com.fiap.techchallenge.streamingtech.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.text.ParseException;

@RestController
@RequestMapping("/videos")
@RequiredArgsConstructor
public class VideoController {

    private final VideoService videoService;

    @PostMapping("/create")
    public Mono<Video> createVideo(@RequestBody Video newVideo) {
        return videoService.createVideo(newVideo);
    }

    @PutMapping("/{id}")
    public Mono<Video> updateVideo(@PathVariable String id, @RequestBody Video updatedVideo) {
        return videoService.updateVideo(id, updatedVideo);
    }

    @GetMapping("/all")
    public Flux<Video> getAllVideos(@RequestParam(defaultValue = "0") int page,
                                    @RequestParam(defaultValue = "10") int size,
                                    @RequestParam(defaultValue = "title") String sortBy) {
        return videoService.getAllVideos(page, size, sortBy);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteVideo(@PathVariable String id) {
        return videoService.deleteVideo(id);
    }

    @GetMapping("/search")
    public Flux<Video> getVideosByTitleAndDate(@RequestParam String searchTitle, @RequestParam String searchDate) throws ParseException {
        return videoService.getVideosByTitleAndDate(searchTitle, searchDate);
    }

    @GetMapping("/categories")
    public Flux<Video> getVideosByCategory(@RequestParam String category) {
        return videoService.getVideosByCategory(category);
    }

    @GetMapping("/{id}")
    public Mono<Video> getVideoWithIncrementedViews(@PathVariable String id) {
        return videoService.getVideoWithIncrementedViews(id);
    }

}
