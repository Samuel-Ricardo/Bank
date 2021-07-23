import java.util.Scanner

fun main() {

  var scanner = Scanner(System.`in`);
  var online = true;

  println("")
  println("Welcome to Bank :)")


  while(online){

    println("")
    println("Qual Operação deseja realizar?")
    println("")
    println("===============================")
    println("")
    println("(1) - Logar na minha conta")
    println("(2) - Sair")
    println("")
    println("================================")
    println("")

    var option = scanner.nextInt();

    when(option){

      1 -> println("Serviço Indisponível");
      2 -> {
        online = false
        println("")
      }

      else -> { // Note the block

      }
    }
  }
}
