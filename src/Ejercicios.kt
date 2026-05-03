// 1. Control de gastos
fun reto1(){
    val gastos = arrayOf(25000, 8000, 4500, 10000, 38000, 20000, 7200, 9800, 6000, 11500, 18000, 15300, 100000, 60000, 5000)
    var total = 0.0
    var max = gastos[0]
    var min = gastos[0]

    for (gasto in gastos) {
        total += gasto
        if (gasto > max) max = gasto
        if (gasto < min) min = gasto
    }
    val promedio = total / gastos.size

    println(" -RETO 1: Control de Gastos- ")
    println("Total: $total, Promedio: $promedio, Maximo: $max, Minimo: $min")
    println("  ")
}

// 2 Filtro de Empleados Senior
fun reto2 () {
    val empleados = listOf("Luis" to 32, "Cristina" to 45, "Oscar" to 28, "Maria" to 31, "Carlos" to 25)
    val seniorNames = empleados
        .filter { it.second > 30 }
        .map { it.first.uppercase() }
    println("\n -RETO 2: Filtro de Empleados Senior- ")
    println("Empleados Seniores: ${seniorNames}")
    println("  ")
}

// 3. Limpieza de contactos duplicados
fun reto3() {
    val contactos = listOf("1234567", "9876543", "1234567", "5551234", "9876543", "1112223", "1234567", "9998887", "5551234", "4445566", "7778899", "1234567", "9876543", "1112223", "3334445", "5551234", "6667778", "7778899", "8889990", "9998887")
    val unicos = contactos.toSet().sorted()

    println("\n -RETO 3: Limpieza de Contactos Duplicados")
    println("Contactos unicos ordenados: $unicos")
    println("  ")
}

// 4. Analisis de Carrito de Compras
fun reto4() {
    val carrito = listOf("Arepas", "Huevos", "Arepas", "Galletas", "Pan", "Arepas", "Galletas", "Huevos")
    val conteo = mutableMapOf<String, Int>()
    for (producto in carrito) {
        conteo[producto] = conteo.getOrDefault(producto, 0) + 1
    }

    println("\n -RETO 4: Analisis de Carrito de Compras")
    println("Conteo: $conteo")
    println("  ")
}

fun reto5(){
    val historial = arrayOf("github.com", "exito.com", "loom.com", "alkosto.com", "youtube.com")
    val invertidos = arrayOfNulls<String>(historial.size)
    for (i in historial.indices) {
        invertidos[i] = historial[historial.size -1 - i]
    }

    println("\n -RETO 5: Historial de Navegacion Reversible")
    println("Originales: ${historial.joinToString()}")
    println("Invertidos: ${invertidos.joinToString()}")
    println("  ")
}
