package com.study.kotlin.Model.Client;



data class Address(
  val description:String = "",
  val street:     String,
  val number:     Int,
  val cep:        String,
  val city:       String,
  val state:      String,
){

  init {
    require(cep.trim().isBlank()) {
      """
      =================================
      - O Campo CEP não Pode ser Nulo -
      =================================
      """.trimIndent();
    }
  }


}
