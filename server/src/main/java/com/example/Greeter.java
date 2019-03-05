package com.example;


public class Greeter {

  /**
  constructor
  */
  
  public Greeter() {

  }
/**
* @param somenone name of a person 
* @return greeting string 
*/
  
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
