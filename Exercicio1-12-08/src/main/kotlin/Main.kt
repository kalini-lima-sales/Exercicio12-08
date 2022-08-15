fun main() {

    var sal =0.0
    var exc = 0.0
    var salExc = 0.0

    println("Insira o código do funcionário: ")
    var cod = readLine()!!.toInt()

    println("Insira o total de horas trabalhadas: ")
    var numH = readLine()!!.toInt()

    exc = (numH - 50).toDouble()

    if(exc > 0){
        sal = 50.0 * 10.00
        salExc= exc * 20.00

        sal += salExc
    }else{
       sal = ((numH * 10).toDouble())

    }
    println("O salário total do funcionário é: " + sal)
    println("O salário excedente do funcionário é: " + salExc)

}
