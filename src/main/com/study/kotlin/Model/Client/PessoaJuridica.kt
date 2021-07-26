package com.study.kotlin.Model.Client

import com.study.kotlin.Model.Account

class PessoaJuridica(
  override val id:Int,
  val name:String,
  val pCNPJ:String,
  val socialReason:String,
  override var address:Address,
  override var account:Account,
):Client(id, address, account) {

  var CNPJ = pCNPJ
    private set(value) {
      value.uppercase()
      field = value
    }

    override fun printClientData(){

      println("""
        =============================================
        - Pessoa Jurídica
        ---------------------------------------------
        - Nome: ${name}
        - Razão Social: ${socialReason}
        - CNPJ: ${CNPJ}
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
         - Pessoa Jurídica
         ---------------------------------------------
         - Nome: ${name}
         - Razão Social: ${socialReason}
         - CNPJ: ${CNPJ}
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

      fun main(args: Array<String>) {
        println("bay")
      }
}
