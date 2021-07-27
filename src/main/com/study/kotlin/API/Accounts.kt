package com.study.kotlin.API;

import com.study.kotlin.Model.Account;
import com.study.kotlin.Model.Client.PessoaFisica;
import com.study.kotlin.Model.Client.Client;
import com.study.kotlin.Model.Client.Address;

import kotlin.random.Random;
import com.study.kotlin.App

class Accounts{

  val accounts:MutableMap<Int, Client> = mutableMapOf();

  private fun generateId():Int{

    return Random.nextInt(0, Random.nextInt(0, 10000));
  }

  fun insertPessoaFisica(account:Account, name:String, age:Int, address:Address, cpf:String):PessoaFisica{

    var pf:PessoaFisica = PessoaFisica(
      generateId(),
      name,
      age,
      address,
      cpf,
      account
    );

    accounts.put(pf.id, pf);

    return  accounts.get(pf.id) as PessoaFisica;
  }


}
