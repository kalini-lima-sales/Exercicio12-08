fun main() {

    println("Digite o primeiro número: ")
    var n1 = readLine()!!.toFloat()
    println("Digite o segundo número: ")
    var n2 = readLine()!!.toFloat()
    println("Digite o terceiro número: ")
    var n3 = readLine()!!.toFloat()
    println("Digite o quarto número: ")
    var n4 = readLine()!!.toFloat()

    n1 = n1 * n1
    n2 = n2 * n2
    n3 = n3 * n3
    n4 = n4 * n4

    if(n3 >=1000){
        println("O quadrado do terceiro número é: " + n3)

    }else{
        println("O quadrado do primeiro número é: " + n1)
        println("O quadrado do segundo número é: " + n2)
        println("O quadrado do terceiro número é: " + n3)
        println("O quadrado do quarto número é: " + n4)
    }

}
