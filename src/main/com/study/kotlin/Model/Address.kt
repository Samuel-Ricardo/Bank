package com.study.kotlin.Model;

data class Address(
  val description:String = null,
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
