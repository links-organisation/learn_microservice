package io.learn.user.service;

import io.learn.user.entity.app.auth.AuthenticationRequest;
import io.learn.user.entity.app.auth.AuthenticationResponse;
import io.learn.user.entity.app.auth.RegisterRequest;

public interface AuthenticationService {
    AuthenticationResponse register(RegisterRequest request);

    AuthenticationResponse authenticate(AuthenticationRequest request);
}
