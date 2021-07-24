package com.study.kotlin.Model

//import com.study.kotlin.Model.Account;

class ContaCorrente (

  override val number:Int,
  override val agency:String
): Account(number, agency){

  override fun rate(): Double{
    return 0.0;
  }


}
