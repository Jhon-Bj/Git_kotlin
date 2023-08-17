fun main() {


//Programa que solicita al usuario los datos de dirección
    println("DATOS DE DIRECCIÓN")
    println("Digita el nombre de la calle: ")
    var n_calle = readln()

    println("Digita la cuidad: ")
    var ciudad = readln()

    println("Digita el estado o la provincia: ")
    var estado_pro = readln()

    println("Digita el pais: ")
    var pais = readln()

    println("Digita el codigo postal: ")
    var c_postal = readln()
    println("la dirección es:$n_calle,$ciudad,$estado_pro,$pais,$c_postal")


//Solicita al usuario
    println("SALARIO")

    println("Digita tu salario mensual: ")
    var s_mensual = readln().toDouble()
    println("Digita el porcentaje de impuesto pagado por mes: ")
    var impuesto = readln().toDouble()


    var imp_mes = s_mensual * impuesto / 100
    var salario = s_mensual - imp_mes
    var salario_a = salario * 12

    var imp_año = imp_mes * 12



    println("el impuesto pago en el mes sera de: $imp_mes")
    println("El impuesto pagado al año sera de: $imp_año")
    println("el salario mensual menos el impuesto sera de: $salario")
    println("el salario anual menos el impuesto sera de: $salario_a")


//Area de un circulo
    println("ÁREA DE UN CIRCULO")
    var radio = readln().toDouble()






}