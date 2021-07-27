package com.study.kotlin.Model.Client

import com.study.kotlin.Model.Account

class PessoaFisica(
  override val id:Int,
  val name:String,
  val age:Int,
  override var address:Address,
  val CPF:String,
  override var account:Account
):Client(id, address, account) {

  override fun printClientData(){

    println("""
      =============================================
      - Pessoa Física
      ---------------------------------------------
      - Id: ${id}
      - Nome: ${name}
      - Idade: ${age}
      - CPF: ${CPF}
      ---------------------------------------------
      - Endereço: ${this.address.city}
      - CEP: ${this.address.cep}
      ---------------------------------------------
      - Conta: ${account.number}
      - Saldo Atual: R$ ${account.getBalance()}
      - Agencia: ${this.account.agency}
      =============================================
    """.trimIndent())
  }

  override fun toString():String {

       return """
       =============================================
       - Pessoa Física
       ---------------------------------------------
       - Id: ${id}
       - Nome: ${name}
       - Idade: ${age}
       - CPF: ${CPF}
       ---------------------------------------------
       - Endereço: ${this.address.city}
       - CEP: ${this.address.cep}
       ---------------------------------------------
       - Conta: ${account.number}
      - Saldo Atual: R$ ${account.getBalance()}
      - Agencia: ${this.account.agency}
       =============================================
     """.trimIndent();
    }
}
