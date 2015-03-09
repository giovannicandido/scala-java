package com.example.scala

import java.util.Random

import scala.collection.mutable

/**
 * @author Giovanni Silva 
 *         09/03/15.
 */
object PessoaOperations {
  val nomes: List[String] = List("Mestre", "Dengoso", "Atchim", "Feliz", "Dunga", "Soneca", "Zangado")
  val sobrenomes: List[String] = List("Schwarzenegger", "Van Dame", "Lee", "Chan", "Stallone", "Lundgren", "Li")

  val random = new Random()

  def gerarPessoaRandon(idadeMaxima: Int): Pessoa = {
    val nome: String = nomes(random.nextInt(nomes.size))
    val sobrenome: String = sobrenomes(random.nextInt(sobrenomes.size))
    val idade: Int = random.nextInt(idadeMaxima)
    return new Pessoa(nome, sobrenome, idade)
  }

  def gerarLista(tamanho: Int): mutable.ListBuffer[Pessoa] = {
    val pessoas: mutable.ListBuffer[Pessoa] = mutable.ListBuffer.empty
    for (i <- 0 until tamanho) {
      pessoas.append(gerarPessoaRandon(50))
    }
    return pessoas
  }

  def imprimirLista[T](lista: mutable.ListBuffer[T]) {
    for (i <- 0 until lista.size) {
      println(lista(i))
    }
  }

}
