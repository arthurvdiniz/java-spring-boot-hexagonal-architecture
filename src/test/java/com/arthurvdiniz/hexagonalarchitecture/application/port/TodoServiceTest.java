package com.arthurvdiniz.hexagonalarchitecture.application.port;

import com.arthurvdiniz.hexagonalarchitecture.application.entity.Todo;
import com.arthurvdiniz.hexagonalarchitecture.application.entity.enums.StatusTodo;
import com.arthurvdiniz.hexagonalarchitecture.application.service.TodoServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class TodoServiceTest {

  TodoService todoService;

  @Mock
  TodoRepository todoRepository;

  @BeforeEach
  public void setup() {
    MockitoAnnotations.openMocks(this);
    todoService = new TodoServiceImpl(todoRepository);
  }

  @Test
  void testShouldCreateTodo() {
    when(todoRepository.save(any())).thenReturn(new Todo());

    todoService.createTodo(any());

    verify(todoRepository, times(1)).save(any());
  }

}