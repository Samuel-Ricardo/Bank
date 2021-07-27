package com.study.kotlin;

import java.util.Scanner;

import com.study.kotlin.Model.*
import com.study.kotlin.API.Accounts
import com.study.kotlin.Model.Client.Address
import com.study.kotlin.Model.Client.Client
import com.study.kotlin.Model.Client.PessoaFisica
import kotlin.random.Random


public class App{

 companion object{

  var scanner = Scanner(System.`in`);

  var online = true;
  var accounts = Accounts();

  fun invalidOption(){
     println("""

  ===============================
    Selecione uma Opção válida
  ===============================

  """.trimIndent())
  }

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

        1 -> {
          /*
          val agency = getAgency();

          println("""

          ===============================
            Digite o número da conta bancária:
          ===============================

          """.trimIndent())

          val number = scanner.nextInt();

            Thread.sleep(500L)
*/

            println("""

            ===================================
              Digite o Seu Identificador - ID:
            ===================================

            """.trimIndent())

            val id = scanner.nextInt();

              Thread.sleep(500L)

              var client:Client? = accounts.all.get(id);

            when(client == null){

              true ->{

               showPlatform(client);

              }

              false -> {

                println("""

            ===============================
              Conta não encontrada
            ===============================

            """.trimIndent())

              }

            }
        }
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
    println("""

          ===============================
            (1) - Conta Corrente
            (2) - Conta Poupança
          ===============================

          """.trimIndent())

          var option = scanner.nextInt();

          when(option){

            1 -> return ContaCorrente(Random.nextInt(100000, 999999), getAgency());

            2 -> return ContaPoupanca(Random.nextInt(100000, 999999), getAgency());

            else -> {
              invalidOption();

              return ContaCorrente(123456, "Inter")
            }
          }
  }

  fun getAgency():String{
    println("""

              ===============================
                Digite sua Agencia:
              ===============================

              """.trimIndent())

                val agency:String = scanner.next();

                Thread.sleep(500L)

                return agency;
  }

  fun showPlatform(client:Client){

    while(online) {

      println("""

    ===============================
    |  (1) - Deposito             |
    |  (2) - Saque                |
    |  (3) - Transferência        |
    |  (4) - Sair                 |
    ===============================

    """.trimIndent())

    var option = scanner.nextInt();

    when(option){

      1 -> {

        println("""

          ================================
            Digite o Valor:
          ================================

        """.trimIndent())

        val value = scanner.nextDouble();

        Thread.sleep(500L);

        client.account.deposit(value)


      }

      2 -> {

        println("""

          ================================
            Digite o Valor:
          ================================

        """.trimIndent())

        val value = scanner.nextDouble();

        Thread.sleep(500L);

        client.account.withdraw(value)

      }

      3 -> {

        println("""


          ================================
            Digite o ID do destinatário:
          ================================

        """.trimIndent())

        val destID:Int = scanner.nextInt();

        Thread.sleep(500L);

        val destination:Client? = accounts.all.get(destID);

        println("""

          ================================
            Digite o Valor:
          ================================

        """.trimIndent())

        val value = scanner.nextDouble();

        Thread.sleep(500L);

        client.account.transfer(destination!!.account, value)


      }

      4 -> {
        println("""


          ======================================
            Obrigado Por usar nosso Sistema :)
          ======================================

        """.trimIndent())

        online = false;
      }

      else -> {
        invalidOption();
      }
    }

    }

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

        accounts.insertPessoaFisica(
          account,
          name,
          age,
          address,
          CPF).printClientData();
      }

      2 -> {
        println("""

      ===============================
        Digite seu nome:
      ===============================

      """.trimIndent())

        val name:String = scanner.next();

        Thread.sleep(500L)

        println("""

      ===============================
        Digite seu CNPJ:
      ===============================

      """.trimIndent())

        val CNPJ = scanner.next();

        Thread.sleep(500L)

        println("""

      ===============================
        Digite sua Razão social:
      ===============================

      """.trimIndent())

        val reason = scanner.next();

        Thread.sleep(500L)

        val address:Address = getAddress();

        val account:Account = getAccount();

        accounts.insertPessoaJuridica(
          account,
          name,
          CNPJ,
          reason,
          address)
            .printClientData();
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

