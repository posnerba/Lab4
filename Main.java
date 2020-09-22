/*
Lab 4
Partners: Brittany Posner and Nat Hauck
Date: 9/21/2020
*/

import java.util.Random;

class Main {
  public static void main(String[] args) {
   
    Random r = new Random();
    int randomNum = r.nextInt(50) + 1 ;

    System.out.println("The Random number is: " + randomNum);

    if (randomNum < 25)
    {
      System.out.println("Ahoy Matey's!");
    }
    else if (randomNum > 25 && randomNum <42)
    {
      System.out.println("Cannonball!");
    }
    else if (randomNum > 42)
    {
      System.out.println("Blastoff!");
    }

    while (randomNum > 0)
      {
       randomNum -= 1;
       System.out.println(randomNum);
      }
    

    
     
    

  }
}