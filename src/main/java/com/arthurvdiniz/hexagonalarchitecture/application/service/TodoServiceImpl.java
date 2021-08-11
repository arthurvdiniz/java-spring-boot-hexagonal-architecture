package com.arthurvdiniz.hexagonalarchitecture.application.service;

import com.arthurvdiniz.hexagonalarchitecture.application.entity.Todo;
import com.arthurvdiniz.hexagonalarchitecture.application.port.TodoRepository;
import com.arthurvdiniz.hexagonalarchitecture.application.port.TodoService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TodoServiceImpl implements TodoService {

  private final TodoRepository todoRepository;

  @Override
  public Todo createTodo(Todo todo) {
    return todoRepository.save(todo);
  }
}
