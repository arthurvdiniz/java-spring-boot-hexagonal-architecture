package com.arthurvdiniz.hexagonalarchitecture.adapters.out.persistence;

import com.arthurvdiniz.hexagonalarchitecture.application.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataH2TodoRepository extends JpaRepository<Todo, Integer> {
}
