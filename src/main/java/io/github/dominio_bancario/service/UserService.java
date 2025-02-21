package io.github.dominio_bancario.service;

import io.github.dominio_bancario.model.User;

public interface UserService {

    User findById(Long id);

    User create(User user);
}
