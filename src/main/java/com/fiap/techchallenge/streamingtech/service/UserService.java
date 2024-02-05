package com.fiap.techchallenge.streamingtech.service;

import com.fiap.techchallenge.streamingtech.model.User;
import com.fiap.techchallenge.streamingtech.model.Video;
import reactor.core.publisher.Mono;

public interface UserService {
    Mono<User> createUser(User newUser);
    Mono<User> updateUserPassword(String userId, User updatedUser);
    Mono<User> getUserById(String userId);
    Mono<Void> deleteUser(String userId);
    Mono<User> addVideoToFavorites(String userId, Video newFavoriteVideo);

}
