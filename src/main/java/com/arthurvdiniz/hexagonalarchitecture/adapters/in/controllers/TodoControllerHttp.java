package com.arthurvdiniz.hexagonalarchitecture.adapters.in.controllers;

import com.arthurvdiniz.hexagonalarchitecture.adapters.in.dto.TodoDto;
import com.arthurvdiniz.hexagonalarchitecture.application.entity.Todo;
import com.arthurvdiniz.hexagonalarchitecture.application.port.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/todo")
public class TodoControllerHttp {

  @Autowired
  private TodoService todoService;

  @PostMapping
  public ResponseEntity<Todo> createTodo(@RequestBody @Valid TodoDto todoDto) {
    Todo todo = todoService.createTodo(todoDto.toTodo());
    return new ResponseEntity<>(todo, HttpStatus.CREATED);
  }
}
