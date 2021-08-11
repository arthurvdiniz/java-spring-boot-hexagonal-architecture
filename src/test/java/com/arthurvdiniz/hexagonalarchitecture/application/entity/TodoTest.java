package com.arthurvdiniz.hexagonalarchitecture.application.entity;

import com.arthurvdiniz.hexagonalarchitecture.application.entity.enums.StatusTodo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TodoTest {

  @Test
  void testCreate() {
    Todo todo = new Todo(1, "todo title example", "todo description example", StatusTodo.TODO);

    assertEquals(1, todo.getId());
    assertEquals(StatusTodo.TODO, todo.getStatus());
  }
}