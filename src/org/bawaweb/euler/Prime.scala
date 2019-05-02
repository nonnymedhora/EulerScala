package org.bawaweb.euler
import java.lang.Math

trait Prime {
  
  val isPrimeNumber = (number: Long) => {
    var isPrime = true

    if (number < 0) {
      println("Invalid")
      isPrime = false
    } else if (number == 1 || number == 2 || number == 3) {
      isPrime = true
    } else {
      val sq = Math.sqrt(number).toInt

      for (i <- 2 to sq) {
        if (number % i == 0) {
          isPrime = false
        }
      }
    }
    isPrime
  }

}