package com.study.kotlin.Model.Client

import com.study.kotlin.Model.Account

abstract class Client(
  open val id:Int,
  open var address:Address,
  open var account:Account
){

  val segment: Segment
    get() = if (account.getBalance() < 10.0) {
      Segment.CLASSIC
    } else {
      Segment.VAN_GOGH
    }

    abstract fun printClientData()
}
