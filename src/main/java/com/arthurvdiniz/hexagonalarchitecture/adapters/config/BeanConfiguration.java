package com.arthurvdiniz.hexagonalarchitecture.adapters.config;

import com.arthurvdiniz.hexagonalarchitecture.HexagonalArchitectureApplication;
import com.arthurvdiniz.hexagonalarchitecture.application.port.TodoRepository;
import com.arthurvdiniz.hexagonalarchitecture.application.service.TodoServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = HexagonalArchitectureApplication.class)
public class BeanConfiguration {

  @Bean
  TodoServiceImpl todoServiceImpl(TodoRepository todoRepository) {
    return new TodoServiceImpl(todoRepository);
  }
}
