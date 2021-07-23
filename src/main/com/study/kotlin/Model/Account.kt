package com.study.kotlin.Model.Account;

abstract class Account(
  open val number:Int,
  open val agency:String,
  private var balance: Double = 0.0
){

}
