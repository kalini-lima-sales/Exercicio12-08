fun main () {

    var E = 0.0
    var M = 0.0

    println(" Digite o peso dos tomates: ")
    var peso = readLine()!!.toFloat()

    if(peso > 50){
        E = (peso - 50).toDouble()
        M = E * 4.0
    }
    println("O peso dos tomates é: " + peso + "Kg")
    println("O número de quilos excedentes é: " + E)
    println("O valor da multa fica em R$ " + M)
}