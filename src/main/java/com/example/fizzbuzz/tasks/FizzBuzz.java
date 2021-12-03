package com.example.fizzbuzz.tasks;

public class FizzBuzz {

  public String generate(int i) {
    return ( i % 15 == 0)? "FizzBuzz" : (i % 3 == 0)? "Fizz" : (i % 5 == 0) ? "Buzz": String.valueOf(i);
  }
}
