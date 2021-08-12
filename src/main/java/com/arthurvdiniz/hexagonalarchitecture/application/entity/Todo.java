package com.arthurvdiniz.hexagonalarchitecture.application.entity;

import com.arthurvdiniz.hexagonalarchitecture.application.entity.enums.StatusTodo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Todo implements Serializable {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private Integer id;
  private String title;
  private String description;
  private StatusTodo status;
}
