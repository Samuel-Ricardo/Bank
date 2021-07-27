package com.study.kotlin;

import java.util.Scanner;

import com.study.kotlin.Model.*
import com.study.kotlin.API.Accounts
import com.study.kotlin.Model.Client.Address


public class App{

 companion object{

  var scanner = Scanner(System.`in`);

  var online = true;
  var accounts = Accounts();

  @JvmStatic
   fun main(args: Array<String>) {


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

  fun getAddress():Address{

    println("""

    ===============================
      Digite sua Rua:
    ===============================

    """.trimIndent())

      val street = scanner.next();

      Thread.sleep(500L)

      println("""

      ===============================
        Digite Numero da Casa:
      ===============================

      """.trimIndent())

        val houseNumber = scanner.nextInt();

        Thread.sleep(500L)

      println("""

    ===============================
      Digite seu CEP:
    ===============================

    """.trimIndent())

      val CEP = scanner.next();

      Thread.sleep(500L)


      println("""

    ===============================
      Digite sua Cidade:
    ===============================

    """.trimIndent())

      val city = scanner.next();

      Thread.sleep(500L)

      println("""

      ===============================
        Digite seu Estado:
      ===============================

      """.trimIndent())

        val state = scanner.next();

        Thread.sleep(500L)

        println("""

      =========================================
        Digite uma descrição extra (Opcional):
      =========================================

      """.trimIndent())

        val desc = scanner.next();

        Thread.sleep(500L)

      return Address(
        desc,
        street,
        houseNumber,
        CEP,
        city,
        state
      )
  }

  fun getAccount():Account{

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

        Thread.sleep(500L)

        println("""

      ===============================
        Digite seu CPF:
      ===============================

      """.trimIndent())

        val CPF = scanner.next();

        Thread.sleep(500L)

        println("""

      ===============================
        Digite sua Idade:
      ===============================

      """.trimIndent())

        val age = scanner.nextInt();

        Thread.sleep(500L)

        val address:Address = getAddress();

        val account:Account = getAccount();

        var logged = accounts.insertPessoaFisica(
          account,
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
}
}

