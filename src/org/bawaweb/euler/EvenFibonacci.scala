package org.bawaweb.euler
// Problem 2
object EvenFibonacci extends App {

  var n1 = 1
  var n2 = 0
  var n3 = 0

  var evenSum: Int = 0
  val target = 4000000;

  def doEvenFibonacci(sum:Int): Unit = {
    if (sum < target) {
      n3 = n1 + n2;
      n1 = n2;
      n2 = n3;
      if (n3 % 2 == 0) {
        evenSum += n3;        
      }
      doEvenFibonacci(evenSum);
    }
  }
  doEvenFibonacci(0);
  println("Sum of the even-valued Fibonacci terms\n whose values\n do not exceed " + target + "\n========================\n is " + evenSum)

}