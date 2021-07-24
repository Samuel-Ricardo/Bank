package com.study.kotlin.Model.Client

import com.study.kotlin.Model.Account

abstract class Client(
  open var address:Address,
  open var account:Account
){

  val segment: Segment
}
