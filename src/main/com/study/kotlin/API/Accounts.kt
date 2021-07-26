package com.study.kotlin.API

import com.study.kotlin.Model.Account
import kotlin.random.Random

class Accounts{

  val accounts:MutableMap<Int, Account> = mutableMapOf();
  private set
  
  private fun generateId():Int{

    return Random.nextInt(0, Random.nextInt(0, 10000));
  }


}
