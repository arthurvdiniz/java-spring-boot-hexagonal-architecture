package com.arthurvdiniz.hexagonalarchitecture.application.port;

import com.arthurvdiniz.hexagonalarchitecture.application.entity.Todo;
import com.arthurvdiniz.hexagonalarchitecture.application.entity.enums.StatusTodo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class TodoRepositoryTest {

  @Mock
  private TodoRepository todoRepository;

  @BeforeEach
  public void getMocks() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void testShouldSaveTodo() {
    Todo todo = new Todo(null, "todo title", "todo description", StatusTodo.TODO);

    when(todoRepository.save(todo)).thenReturn(new Todo(1, todo.getTitle(), todo.getDescription(), todo.getStatus()));

    Todo savedTodo = todoRepository.save(todo);

    assertEquals(1, savedTodo.getId());
    assertEquals(todo.getTitle(), savedTodo.getTitle());
    assertEquals(todo.getDescription(), savedTodo.getDescription());
    assertEquals(todo.getStatus(), savedTodo.getStatus());
  }
}