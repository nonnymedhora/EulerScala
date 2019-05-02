package org.bawaweb.euler
// Problem 5
object SmallestMultiple extends App {
  
  
//  v1  separated

//  var gcd = (a: Long, b: Long) => {
//    var b1 = b
//    var a1 = a
//    while (b1 > 0) {
//      var temp = b1
//      b1 = a1 % b1
//      a1 = temp
//    }
//    a1
//  }

//  def lcm(a: Long, b: Long): Long = {
//    return a * (b / gcd(a, b))
//  }
  
//  ends v1

  
  def lcm(anArray: Seq[Long]): Long = {
//    moved v1
    var gcd = (a: Long, b: Long) => {
      var b1 = b
      var a1 = a
      while (b1 > 0) {
        var temp = b1
        b1 = a1 % b1
        a1 = temp
      }
      a1
    }

    var lcm = (a: Long, b: Long) => {
      a * (b / gcd(a, b))
    }
//    ends moved v1

    
    var res = anArray(0)

    for (i <- 1 to anArray.length - 1)
      res = lcm(res, anArray(i))

    return res;
  }
  
  var arr = Seq[Long](1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)

  println("Smallest multiple for first " + arr.length + " numbers is")
  println("==> " + lcm(arr))

}