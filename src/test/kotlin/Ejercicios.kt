import java.text.DecimalFormat


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

    println("""
    Salario neto al mes: ${DecimalFormat("#.##").format(salario)} 
    Salario neto al año: ${DecimalFormat("#.##").format(salario_a)}
    Impuestos al mes:  ${DecimalFormat("#.##").format(imp_mes)}
    Impuestos al año:  ${DecimalFormat("#.##").format(imp_año)}  
        
    """.trimIndent())


//Area de un circulo
    println(" DIGITA EL ÁREA DE UN CIRCULO")

    var radio = readln().toDouble()


    fun area (): Double {
        return Math.PI * Math.pow(radio, 2.0)

    }
    fun circunferencia () : Double {
        return  2 * Math.PI * radio

    }
    var area_p = area() / 2.54
    var circunferencia_p = circunferencia() /2.54
    println("""
    Área en cm : "${DecimalFormat("#.##").format(area())}
    La circunfeencia es : ${DecimalFormat("#.##").format(circunferencia())}
    Área en pulgadas : ${DecimalFormat("#.##").format(circunferencia_p)} 
    Circunfrencia en pulgadas : ${DecimalFormat("#.##").format(circunferencia_p)}
        
    """.trimIndent())

// Transporte




    }







