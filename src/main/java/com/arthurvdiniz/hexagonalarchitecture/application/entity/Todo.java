package com.arthurvdiniz.hexagonalarchitecture.application.entity;

import com.arthurvdiniz.hexagonalarchitecture.application.entity.enums.StatusTodo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Todo {

  private Integer id;
  private String title;
  private String description;
  private StatusTodo status;
}
