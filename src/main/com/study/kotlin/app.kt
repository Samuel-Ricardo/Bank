package com.study.kotlin.app;

import java.util.Scanner;

import com.study.kotlin.Model.*;
import com.study.kotlin.Model.Client.Address;
import com.study.kotlin.API.Accounts;

var scanner = Scanner(System.`in`);

var online = true;
var accounts = Accounts();


fun getAddress():Address{

  println("""

  ===============================
    Digite sua Rua:
  ===============================

  """.trimIndent())

    val street = scanner.next();

    println("""

    ===============================
      Digite Numero da Casa:
    ===============================

    """.trimIndent())

      val houseNumber = scanner.nextInt();

    println("""

  ===============================
    Digite seu CEP:
  ===============================

  """.trimIndent())

    val CEP = scanner.next();


    println("""

  ===============================
    Digite sua Cidade:
  ===============================

  """.trimIndent())

    val city = scanner.next();

    println("""

    ===============================
      Digite seu Estado:
    ===============================

    """.trimIndent())

      val state = scanner.next();

      println("""

    =========================================
      Digite uma descrição extra (Opcional):
    =========================================

    """.trimIndent())

      val desc = scanner.next();

    return Address(
      desc,
      street,
      houseNumber,
      CEP,
      city,
      state
    )
}

fun createAccount(option:Int) {
  when(option){
    1 -> {
      println("""

    ===============================
      Digite seu nome:
    ===============================

    """.trimIndent())

      val name:String = scanner.next();


      println("""

    ===============================
      Digite seu CPF:
    ===============================

    """.trimIndent())

      val CPF = scanner.next();

      println("""

    ===============================
      Digite sua Idade:
    ===============================

    """.trimIndent())

      val age = scanner.nextInt();

      val address:Address = getAddress();

      var logged = accounts.insertPessoaFisica(
        ContaPoupanca(123, "123"),
        name,
        age,
        address,
        CPF);

      logged.printClientData();
    }

    2 -> {
      println("")
    }

    else -> println("""

    ===============================
      Selecione uma Opção válida
    ===============================

    """.trimIndent())
  }
}

fun main() {



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
