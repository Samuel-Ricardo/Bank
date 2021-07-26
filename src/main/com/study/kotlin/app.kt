package com.study.kotlin.app

import java.util.Scanner
import com.study.kotlin.Model.ContaCorrente



fun createAccount(option:Int) {
  when(option){
    1 -> {

    }

    2 - > {

    }

    else -> println("""

    ===============================
      Selecione uma Opção válida
    ===============================

    """.trimIndent())
  }
}

fun main() {

  var scanner = Scanner(System.`in`);
  var online = true;

  println("")
  println("Welcome to Bank :)")



  fun runApp(){

    println("")
    println("Qual Operação deseja realizar?")
    println("")
    println("===============================")
    println("")
    println("(1) - Logar na minha conta")
    println("(2) - Criar uma conta")
    println("(3) - Sair")
    println("")
    println("================================")
    println("")

    var option = scanner.nextInt();

    when(option){

      1 -> println("Serviço Indisponível");
      2 -> {
        println("""
        ===============================
          (1) - Pessoa Física - PF
          (2) - Pessoa Jurídica - PJ
        ===============================
        """.trimIndent())

        option = scanner.nextInt();

        createAccount(option);
      }
      3 -> {
        online = false
        println("""

        ===============================
          Selecione uma Opção válida
        ===============================

        """.trimIndent())
      }

      else -> {
        println("")
        println("Serviço Indisponível ou inexistente, tente outro...");
        println("")
      }
    }
  }


  while(online){

    runApp();
  }
}
