package com.study.kotlin.Model

class ContaPoupanca(

  override val number:Int,
  override val agency:String
): Account (number, agency) {

  override fun rate(): Double{
    return 0.50;
  }

  override fun transfer(destinationAccount:Account, value:Double) {

      super.transfer(destinationAccount, value + rate())
  }

  override fun toString():String {

    return("""
      =============================================
      - Conta Poupança
      ---------------------------------------------
      - Numero da Conta: ${this.number}
      - Agencia: ${this.agency}
      - Saldo: R$ ${this.getBalance()}
      =============================================
    """.trimIndent())
  }
}
