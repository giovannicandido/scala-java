package com.example.scala

import java.util.Random

import scala.collection.mutable

/**
 * @author Giovanni Silva 
 *         09/03/15.
 */
object PessoaOperations {
  val nomes = List("Mestre", "Dengoso", "Atchim", "Feliz", "Dunga", "Soneca", "Zangado")
  val sobrenomes = List("Schwarzenegger", "Van Dame", "Lee", "Chan", "Stallone", "Lundgren", "Li")

  val random = new Random()

  def gerarPessoaRandon(idadeMaxima: Int): Pessoa = {
    val nome = nomes(random.nextInt(nomes.size))
    val sobrenome = sobrenomes(random.nextInt(sobrenomes.size))
    val idade = random.nextInt(idadeMaxima)
    Pessoa(nome, sobrenome, idade)
  }

  def gerarLista(tamanho: Int): List[Pessoa] = {
    List.fill(tamanho)(gerarPessoaRandon(50))
  }

  def imprimirLista[T](lista: List[T]) {

//    lista.foreach({ e => println(e)})
//    lista.foreach( e => println(e))
//    lista.foreach(println(_))
//    lista.foreach(println)
    lista foreach println
  }

}
