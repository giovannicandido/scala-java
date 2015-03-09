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

  def gerarLista(tamanho: Int): mutable.ListBuffer[Pessoa] = {
    val pessoas: mutable.ListBuffer[Pessoa] = mutable.ListBuffer.empty
    for (i <- 0 until tamanho) {
      pessoas.append(gerarPessoaRandon(50))
    }
    pessoas
  }

  def imprimirLista[T](lista: mutable.ListBuffer[T]) {
    for (i <- 0 until lista.size) {
      println(lista(i))
    }
  }

}
