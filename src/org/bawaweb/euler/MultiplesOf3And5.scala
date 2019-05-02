package org.bawaweb.euler
// Problem 1
object MultiplesOf3And5 extends App {

  var sum = 0
  val target = 1000
  
  for (i <- 1 to target) {
    if ( (i % 3 == 0) || (i % 5 == 0) ) {
      sum += i;
    }
  }
  

  println("Sum of Multiples of 3 & 5 upto " + target + " is --> " + sum)

}