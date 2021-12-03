package com.example.fizzbuzz.tasks;

public class FizzBuzz {

  public String generate(int debut,int fin) {
    return checkSetOfNumbers(debut, fin);
  }

  private String checkSetOfNumbers(int begin,int end){
    StringBuilder resultSet = new StringBuilder();
    while ( begin <= end){
      resultSet.append(checkFizBuz(begin++));
    }
    return resultSet.toString();
  }

  private String checkFizBuz(int number){
    return (number % 15 == 0) ? "FizzBuzz" :
      (number % 3 == 0) ? "Fizz" :
        (number % 5 == 0) ? "Buzz" : String.valueOf(number);
  }
}
