package com.company;
public class Main {
public static void main(String[] args) {
new Seat();
}
}
def addInt(a: Array[Int]): Int = {
  var sum: Int = 0

  for (i <- 0 until a.length) {
    if (a(0) < a(i)) {
      sum = a(i) + sum
    }
  }

  return sum
}