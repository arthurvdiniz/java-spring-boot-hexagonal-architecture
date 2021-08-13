package com.arthurvdiniz.hexagonalarchitecture.adapters.in.controllers;

import com.arthurvdiniz.hexagonalarchitecture.adapters.in.dto.TodoDto;
import com.arthurvdiniz.hexagonalarchitecture.application.entity.Todo;
import com.arthurvdiniz.hexagonalarchitecture.application.entity.enums.StatusTodo;
import com.arthurvdiniz.hexagonalarchitecture.application.port.TodoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = TodoControllerHttp.class)
@AutoConfigureMockMvc
@EnableAutoConfiguration
class TodoControllerHttpTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private TodoService todoService;

  private final ObjectMapper objectMapper = new ObjectMapper();

  @Test
  void testShouldCreateTodo_successfully() throws Exception {
    Todo todo = new Todo(null, "title test", "description test", StatusTodo.TODO);
    TodoDto todoDto = new TodoDto("title test", "description test", "TODO");

    when(todoService.createTodo(any())).thenReturn(todo);

    mockMvc
        .perform(
            MockMvcRequestBuilders
                .post("/todo")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(todoDto))
        )
        .andExpect(status().isCreated())
        .andExpect(jsonPath("$.title").value(todo.getTitle()))
        .andDo(print());
  }
}