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

    println("\n -RETO 3: Limpieza de Contactos Duplicados- ")
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

    println("\n -RETO 4: Analisis de Carrito de Compras- ")
    println("Conteo: $conteo")
    println("  ")
}

// 5. Historial de Navegacion Reversible
fun reto5(){
    val historial = arrayOf("github.com", "exito.com", "loom.com", "alkosto.com", "youtube.com")
    val invertidos = arrayOfNulls<String>(historial.size)
    for (i in historial.indices) {
        invertidos[i] = historial[historial.size -1 - i]
    }

    println("\n -RETO 5: Historial de Navegacion Reversible- ")
    println("Originales: ${historial.joinToString()}")
    println("Invertidos: ${invertidos.joinToString()}")
    println("  ")
}

// 6. Compatibilidad de Interes (Match)
fun reto6() {
    val interesesP1 = setOf("Viajes", "Cocinar", "Negocios", "Musica")
    val interesesP2 = setOf("Musica", "Leer", "Negocios", "Deportes")

    val comunes = interesesP1.intersect(interesesP2)
    val exclusivosP1 = interesesP1.subtract(interesesP2)

    println("\n -RETO 6: Compatibilidad de Interes- ")
    println("Interes Comunes: $comunes")
    println("Exclusivos de Persona 1: $exclusivosP1")
    println("  ")
}

// 7. Inventario de Despensa
fun reto7() {
    val despensa = mutableMapOf("Arroz" to 5, "Frijol" to 2, "Leche" to 1)

    fun consumir(producto: String, cantidad: Int) {
        val actual = despensa[producto] ?: 0
        if (actual > 0) {
            val nuevo = actual - cantidad
            if (nuevo <= 0) {
                despensa.remove(producto)
                println("\n Cuidado $producto se ha agotado")
            } else {
                despensa[producto] = nuevo
            }
        }
    }

    println("\n -RETO 7: Inventario de Despensa- ")
    println("Inicial: $despensa")
    consumir("Leche", 1)
    consumir("Arroz", 2)
    println("Final: $despensa")
    println("  ")

}

// 8. Calculo de Promedio Academico
fun reto8() {
    val notas = listOf(4.2 to 0.1, 5.0 to 0.1, 4.3 to 0.2, 3.5 to 0.5, 3.2 to 0.1)
    var notaFinal = 0.0
    for (par in notas) {
        notaFinal += par.first * par.second
    }

    println("\n -RETO 8: Calculo de Promedio Academico- ")
    println("Nota Final: $notaFinal")
    println("  ")
}

// 9. Traductor de Códigos de País
fun reto9() {
    val paises = mapOf("CO" to "Colombia", "MX" to "México", "AR" to "Argentina", "ES" to "España")

    println("\n -Reto 9: Traductor de Codigos de País- ")
    for ((codigo, nombre) in paises) {
        println("El código [$codigo] pertenece a [$nombre]")
    }
    println("  ")
}

// 10. Rotación de Turnos de Trabajo
fun reto10() {
    val empleados = listOf("Empleado1", "Empleado2", "Empleado3", "Empleado4", "Empleado5", "Empleado6", "Empleado7")
    val k = 2
    val rotada = mutableListOf<String>()
    for (i in empleados.indices) {
        rotada.add(empleados[(i + k) % empleados.size])
    }

    println("\n -Reto 10: Rotación de Turnos de Trabajo- ")
    println("Original: $empleados")
    println("Rotada (k=$k): $rotada")
    println("  ")
}

// 11. Organizador de Maleta
fun reto11() {
    val objetos = listOf("Ropa" to 2, "Zapatos" to 1, "Laptop" to 2, "Libro" to 1, "Cámara" to 3)
    val porPeso = mutableMapOf<Int, MutableList<String>>()

    for (obj in objetos) {
        porPeso.getOrPut(obj.second) { mutableListOf() }.add(obj.first)
    }

    println("\n -Reto 11: Organizador de Maleta- ")
    println("Objetos por peso: $porPeso")
    println("  ")
}

// 12. Verificador de Ruta Reversible
fun reto12() {
    val ruta = listOf(1 to 1, 2 to 2, 3 to 3, 2 to 2, 1 to 1)
    var esEspejo = true
    for (i in 0 until ruta.size / 2) {
        if (ruta[i] != ruta[ruta.size - 1 - i]) {
            esEspejo = false
            break
        }
    }

    println("\n -Reto 12: Verificador de Ruta Reversible- ")
    println("¿Es espejo?: $esEspejo")
    println("  ")
}