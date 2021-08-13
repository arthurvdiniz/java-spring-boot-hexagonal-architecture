package com.arthurvdiniz.hexagonalarchitecture.adapters.in.dto;

import com.arthurvdiniz.hexagonalarchitecture.application.entity.Todo;
import com.arthurvdiniz.hexagonalarchitecture.application.entity.enums.StatusTodo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TodoDto {
  @NotBlank
  private String title;
  private String description;
  @NotBlank
  private String status;

  public Todo toTodo() {
    return new Todo(null, title, description, StatusTodo.valueOf(status));
  }
}
