package com.study.kotlin.Model.Client

import com.study.kotlin.Model.Account

class PessoaFisica(
  val name:String,
  val age:Int,
  override var address:Address,
  val CPF:String,
  override var account:Account
):Client(address, account) {

  override fun printClientData(){

    println("""
      =============================================
      - Pessoa Física
      ---------------------------------------------
      - Nome: ${name}
      - Idade: ${age}
      - CPF: ${CPF}
      ---------------------------------------------
      - Endereço: ${this.address.city}
      - CEP: ${this.address.cep}
      ---------------------------------------------
      - Conta: ${account.getNumber()}
      - Saldo Atual: R$ ${account.getBalance()}
      - Agencia: ${this.account.getAgency()}
      =============================================
    """.trimIndent())
  }
}
