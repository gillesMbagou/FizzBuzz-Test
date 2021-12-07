package com.example.fizzbuzz.tasks;

import java.util.Map;
import java.util.function.Function;

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

  public String checkFizzBuzz(Map<Integer,String> map, int number){
    String result = "";
    for (final Map.Entry<Integer,String> entry: map.entrySet()
         ) {
      final Integer key = entry.getKey();
      final String value = entry.getValue();

      if ((number % 15 == 0)) {
       return  "FizzBuzz";
      } else {
        if ((key == 3) & (number % key == 0) | (key == 5) & (number % key == 0)) return  value;
        else result = String.valueOf(number);
      }

    }
    return result;
  }
  // Using functional programming version
  public static Function<Integer,String> fizzbuzzFunc(Map<Integer,String> map){
    
     return (number ->  {
            String result = "";
            for (final Map.Entry<Integer,String> entry: map.entrySet()
            ) {
                final Integer key = entry.getKey();
                final String value = entry.getValue();

                if ((number % 15 == 0)) {
                    return  "FizzBuzz";
                } else {
                    if ((key == 3) & (number % key == 0) | (key == 5) & (number % key == 0)) return  value;
                    else result = String.valueOf(number);
                }

            }
            return result;});
  }
  
  // Method to print all result between 1 and 100 as require.
   public static void printTest(Function<Integer,String> fizz){
              int i=100;
        while(i-- >1)
         System.out.println(fizz.andThen(s-> s.toUpperCase()).apply(i));
     }
  

  public static void main(String[] args) {
    FizzBuzz fizzBuzz = new FizzBuzz();
    Map<Integer,String> map = Map.of(3,"Fizz",5,"Buzz");
    System.out.println(fizzBuzz.checkFizzBuzz(map,12));
    System.out.println(fizzBuzz.checkFizzBuzz(map,13));
    System.out.println(fizzBuzz.checkFizzBuzz(map,14));
    System.out.println(fizzBuzz.checkFizzBuzz(map,15));
    System.out.println(fizzBuzz.checkFizzBuzz(map,16));
    System.out.println(fizzBuzz.checkFizzBuzz(map,99));
    System.out.println(fizzBuzz.checkFizzBuzz(map,100));
    
    // calling the functional implementation
      Map<Integer,String> mapTest = Map.of(3, "Fizz", 5, "Buzz", 2, "Out", 4, "Nor");

        printTest(fizzbuzzFunc(mapTest));
  }
}
