package com.study.kotlin.Interface;

import com.study.kotlin.Model.Account

interface BankTransition {

  fun withdraw(value:Double)

  fun deposit(value:Double)

  fun transfer(DestinationAccount:Account, value:Double)
}
