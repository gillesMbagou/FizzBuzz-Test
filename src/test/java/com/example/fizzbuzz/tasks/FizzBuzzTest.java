package com.example.fizzbuzz.tasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

  FizzBuzz fizzBuzz;
  @BeforeEach
  void setUp() {
    fizzBuzz = new FizzBuzz();
  }

  @Test
  public void shouldReturnOne_If_NumberIs_1(){
    // Given 1
    // When call function

    String result = fizzBuzz.generate(1);

    // Then should return "1".
    assertEquals("1", result);
  }
}
