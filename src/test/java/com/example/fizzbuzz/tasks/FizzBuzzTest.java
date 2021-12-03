package com.example.fizzbuzz.tasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

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

    String result = fizzBuzz.generate(1,1);

    // Then should return "1".
    assertEquals("1", result);
  }
  @Test
  public void shouldReturn_Two_Given_2_As_input(){

     // Given 2
     // When Calling generate method
       String result = fizzBuzz.generate(2,2);
     // Then It should return "2"
      assertEquals("2", result);
  }
  @Test
  public void shouldReturnFizzIfNumberIs3() {
    assertEquals("Fizz", fizzBuzz.generate(3, 3));
  }

  @Test
  public void shouldReturnFizzIfNumberIs6() {
    assertEquals("Fizz", fizzBuzz.generate(6, 6).trim());
  }

  @Test
  public void shouldReturnBuzzIfNumberIs5() {
    assertEquals("Buzz", fizzBuzz.generate(5, 5).trim());
  }

  @Test
  public void shouldReturnFizzBuzzIfNumberIs15() {
    assertEquals("FizzBuzz", fizzBuzz.generate(15, 15).trim());

  }

  @Test
  public void shouldReturnFizzBuzzIfNumberIs30() {
    assertEquals("FizzBuzz", fizzBuzz.generate(30, 30).trim());
  }

  @Test
  public void shouldReturn12IframeAre1And2() {
    assertEquals("12", fizzBuzz.generate(1, 2).trim());
  }

  @Test
  public void mapTestTen(){
    Map<Integer, String> map = Map.of(3,"Fizz",5,"Buzz");
    assertEquals("FizzBuzz", fizzBuzz.checkFizzBuzz(map, 15));
  }


}
