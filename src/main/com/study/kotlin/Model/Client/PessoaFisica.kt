package com.study.kotlin.Model.Client

import com.study.kotlin.Model.Account

class PessoaFisica(
  val name:String,
  val age:Int,
  override var address:Address,
  val CPF:String = "",
  override var account:Account
):Client(address, account) {

  override fun printClientData(){

  }
}
