package com.example.scala;
object ParalelTest {
  def measure[T] (func: => T):T ={
    val start = System.nanoTime()
    val result = func
    val elapsed = System.nanoTime() - start
    println("A execução do método demorou %s ns".format(elapsed))
    result
  }
  var sum:Int = _
  def heavyComputation ="abcdefghijk".permutations.foreach(i=> sum+=1)

  def main(args: Array[String]) {
    measure(heavyComputation)
    println(s"Soma das permutacoes: ${sum}")
    measure((0 to 5).foreach(i => heavyComputation))
    measure((0 to 5).par.foreach(i => heavyComputation))
    println(s"Soma das permutacoes: ${sum}")
  }

}
