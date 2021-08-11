package com.arthurvdiniz.hexagonalarchitecture.application.port;

import com.arthurvdiniz.hexagonalarchitecture.application.entity.Todo;

public interface TodoRepository {
  Todo save(Todo todo);
}
