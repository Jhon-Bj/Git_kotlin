fun main(){

    println("hola kotlin")

    // TIPOS DE VARIABLES
    //Variables de var--> cambian con el tiempo
    //constantes var--> No cambian
    var num1 = 5
    var nota = 3.5
    var nombre ="pedro"
    var letra = "D"

    var num2:Int =15
    var final:Double =3.8
    var apellido:String = "Lopez"
    val pi = 3.1416
    val fecha = "15-08-2023"
    var suma = num1 + num2
    var resta = num1 - num2
    var multi = num1 * num2
    var div = num1 / num2
    println("LA SUMA ES : $suma ")
    println("""
        suma : $suma
        resta : $resta
        multi : $multi
        div : $div
        
        
    """.trimIndent())

    //CONVERTIR TIPOS DE DATOS
    var nu1= "5"
    var total=nu1.toInt()*5
    println("LA SUMA TOTAL ES: $total ")

    // COMO INGRESAAR LOS DATOS POR TECLADO
    // AT=(B*H)/2
    println("INGRESE EL VALOR DE LA BASE")
    var base = readln().toDouble()
    println("INGRESE EL VALOR DE LA ALTURA")
    var altura = readln().toDouble()
    var AI = (base*altura)/2
    println("""
        LOS VALORES INGRESADOS SON:
        BASE: $base
        ALTURA: $altura
        EL AREA DEL TRIANGULO ES: $AI
    """.trimIndent())

    var raiz = Math.sqrt(at.toDouble())
    println("LA RAIZ ES: $raiz ")



}