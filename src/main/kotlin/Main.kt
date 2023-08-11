import java.lang.ref.PhantomReference
import java.text.DecimalFormat
import kotlin.math.ceil
import kotlin.math.floor

fun main() {
    /*
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

    var raiz = Math.sqrt(AI.toDouble())
    println("LA RAIZ ES: $raiz ")
    //redondeo de numeros
    println(DecimalFormat("#,###").format(raiz))

    //REDONDEAR NUMERO HACIA ABAJO
    println(floor(raiz).toInt())
    println(ceil(raiz).toInt())





    //ESTRUCTURAS
    //CONDICIONALES IF - ELSE

    var edad:Int
    println("Ingrese su edad")
    edad = readln().toInt()
    if (edad>=18){
        println("ES MAYOR DE EDAD")
    }else{
        println("ES MENOR DE EDAD")
    }

    //WHEN
    var numero = 3

    when (numero){
        1-> println("NO ES IGUAL")

        2->{
            println("NO ES IGUAL")
        }
        3->{
            println("Si es igual")
        }

        else ->println("NUMERO NO ENCONTRADO")


    }

    //CICLOS
    //CICLO FOR
    for (i in 1 .. 100){
        println(i)
    }
    for (j in 100 downTo 1 step 2){
        println(j)
    }

    var z =1
    while (z<=100){

        println(z)
        z++

    }
    println(z)


    var f = 100

    do{

        println(f)
        f--


    }while (f>=1)



    var numero = 2

    when (numero){
        1->
            println("NO ES IGUAL")

        2->{
            println("NO ES IGUAL")
        }
        3->{
            println("Si es igual")
        }

        else ->println("NUMERO NO ENCONTRADO")

    var combustible = "gasolina"
    when (combustible) {
        "galonina", "diesel" -> println("NO ES UN CARRO ELECTRICO")
        else -> println("EL CARRO ES ELECTRICO")
    }

    var edad =24
    when (edad){
        in 1.. 10 -> println("ES UN NIÑO")
        in 11 .. 17 -> println("ES UN ADOLESCENTE")
        in 18..29 -> println("ES UN ADULTO JOVEN")
    }



    //ARREGLOS
    //arraitof: me permiten almacenar cualquier tipo de dato

    var estudiantes = arrayOf("LORENA","PEDRO", "LUIS", 20,58,67)
    println(estudiantes[4])

    println(estudiantes.size)
    *//*

    var numeros = intArrayOf(12,45,67,19)
    println(numeros[0])
    println(numeros[1])
    println(numeros[2])
    println(numeros[3])


    for (i in 0 .. numeros.size-1){
        println(numeros[i])
    }
    */
    //USO DE ARRAYLIST
    //arrayListOf<String> La lista va a ser de tipo string
    //Sino lo especifico el tipo de dato lo que sucede es que la lista recibe recibe cualquier tipo de dato

    var milista =arrayListOf("Lorena","Pedro",28,58,41)

    var num1:Int = milista[2] as Int
    var num2:Int = milista[3] as Int

    /* var nombre:String =milista[0] as String + milista[2]
    println(nombre)

    //println(num1 + num2)
    */



    milista.forEach {i, est ->
        println("$i - $est")
    }










}