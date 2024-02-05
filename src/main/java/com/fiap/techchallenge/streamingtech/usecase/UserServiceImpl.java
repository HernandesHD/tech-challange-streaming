package com.fiap.techchallenge.streamingtech.usecase;

import com.fiap.techchallenge.streamingtech.model.User;
import com.fiap.techchallenge.streamingtech.model.Video;
import com.fiap.techchallenge.streamingtech.repository.UserRepository;
import com.fiap.techchallenge.streamingtech.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public Mono<User> createUser(User newUser) {
        return userRepository.save(newUser);
    }

    @Override
    public Mono<User> updateUserPassword(String userId, User updatedUser) {
        return userRepository.findById(userId)
                .flatMap(existingUser -> {
                    existingUser.setPassword(updatedUser.getPassword());
                    return userRepository.save(existingUser);
                });
    }

    @Override
    public Mono<User> getUserById(String userId) {
        return userRepository.findById(userId);
    }

    @Override
    public Mono<Void> deleteUser(String userId) {
        return userRepository.deleteById(userId).then();
    }

    @Override
    public Mono<User> addVideoToFavorites(String userId, Video newFavoriteVideo) {
        return userRepository.findById(userId)
                .flatMap(user -> {
                    user.addFavoriteVideo(newFavoriteVideo);
                    return userRepository.save(user);
                });
    }
}
