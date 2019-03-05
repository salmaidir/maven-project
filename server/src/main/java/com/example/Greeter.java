package com.example;


public class Greeter {

  
  public Greeter() {

  }
  
  /**
  * @param someone name of person
  * @return gretting string
  */

  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
