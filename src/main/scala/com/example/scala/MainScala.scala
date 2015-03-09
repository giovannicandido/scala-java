package com.example.scala

/**
 * @author Giovanni Silva 
 *         09/03/15.
 */
object MainScala {
  def main(args: Array[String]): Unit = {
    val lista = PessoaOperations.gerarLista(7)
    PessoaOperations.imprimirLista(lista)
  }
}
