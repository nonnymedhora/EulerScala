package org.bawaweb.euler
//Problem 7
class TenThousandthPrime extends Prime {

  val target       = 10001
  var num: Long    = 2l
  var aList        = Seq[Long](2)

  while ( aList.length < target ) {
    num += 1
    if (isPrimeNumber(num)) {
      aList = aList :+ num
    }
  }

  println("The " + target + "th Prime Number is " + aList(aList.length - 1))
}

object TenThousandthPrime extends App {
  new TenThousandthPrime()

}
