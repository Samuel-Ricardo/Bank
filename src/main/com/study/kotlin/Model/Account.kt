package com.study.kotlin.Model;

import com.study.kotlin.Interface.BankTransition;

abstract class Account(
  open val number:Int,
  open val agency:String,
  private var balance: Double = 0.0): BankTransition {

  abstract fun rate(): Double

  open fun checkBalance(value: Double):Boolean {
    return (balance >= value);
  }

  open fun getBalance():Double {
    return balance;
  }

  override fun deposit(value: Double) {

    if (value > 0) {
        balance += value

        println("")
        println("- Deposito realizado com sucesso")
        println("- ")
        println("- Saldo Atual: $balance")
        println("")
    } else {

      println("")
      println("- Deposito não pode ser 0 ou negativo")
      println("- Insira um Valor válido")
      println("")
    }
}

  override fun withdraw(value:Double){

    if(checkBalance(value)) {
      balance -= value;

      println("")
      println("- Saque realizado com sucesso")
      println("- ")
      println("- Saldo Atual: $balance")
      println("")
    } else {

      println("")
      println("- Saldo Insuficiente :(")
      println("- Faltam ${balance - value}")
      println("")
    }
  }

}
