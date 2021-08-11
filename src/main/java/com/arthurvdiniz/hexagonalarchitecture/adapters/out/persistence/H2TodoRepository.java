package com.arthurvdiniz.hexagonalarchitecture.adapters.out.persistence;

import com.arthurvdiniz.hexagonalarchitecture.application.entity.Todo;
import com.arthurvdiniz.hexagonalarchitecture.application.port.TodoRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@AllArgsConstructor
public class H2TodoRepository implements TodoRepository {

  private final SpringDataH2TodoRepository todoRepository;

  @Override
  public Todo save(Todo todo) {
    return null;
  }
}
