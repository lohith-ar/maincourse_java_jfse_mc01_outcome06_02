## Problem Statement: Understanding Custom Functional Interface, Generic, and Lambda expression ##

This exercise should be completed using Test Driven Development Technique

  - Write Test classes in the TDD approach 
  - Functionality of methods should be completed, such that all the test cases pass 
  - Some requirements/hints are mentioned below

  ```
   In this problem, two lambda expressions should be written for the following functionality using the same functional interface 
        
   - Following functionality needs to be implemented in the TDD approach
   
        - Given an input string should return the string in changed case
        - Given an input number should return the cube of that number
   
   - Empty and null inputs should be checked  
```
 ```
Interface MyFunction must be implemented using TDD for the following abstract method 
   - Declare a FunctionalInterface MyFunction<T> which has an abstract method doJob(T t) which returns T  

       + doJob(T t): T
             returns T  
             
Class CustomFunctionalInterfaceImplementation must be implemented using TDD  

   - Use a lambda expression to return the cube of a given number  

       + Take the variable name as cube 
                                 
   - Use a lambda expression to return the string with changed case  
       
       + Take the variable name as changeCase

   ```      
                   
 - Write the test cases in the class `CustomFunctionalInterfaceImplementationTests`.    
 - Minimum test cases expected: 8
 - Test cases should be written for positive and negative scenarios, wherever applicable
 - Test methods should follow (given...ThenShould) naming convention.
     - For example: `givenTwoIntegersWhenAddedThenShouldReturnSum`. If the method name is very long,then you can skip `when` part.
 - Test coverage should be 100%   
 
## Instructions
- Avoid printing unnecessary values other than expected output as given in the sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding  

## Code coverage 

 - Run mvn test, the JaCoCo code coverage report will be generated at target/site/jacoco/*
 - Open the target/site/jacoco/index.html file, review the code coverage report 
 
            - Green – Code is tested or covered.
            - Red – Code is not tested or covered.
            - Yellow – Code is partially tested or covered.
 - Make sure lines coverage must meet the minimum 90%
