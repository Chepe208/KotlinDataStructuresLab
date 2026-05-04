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

// 13. Reparto de Pedidos por Camión
fun reto13() {
    val paquetes = (1..50).toList().map { "Paquete #$it" }
    val lotes = paquetes.chunked(10)

    println("\n -Reto 13: Reparto de Pedidos por Camion- ")
    lotes.forEachIndexed { index, lote ->
        println("Camión ${index + 1}: ${lote.size} paquetes")
    }
    println("  ")
}

// 14. Identificador de Ticket Único
fun reto14() {
    val tickets = listOf("ERR-01", "ERR-02", "ERR-01", "ERR-03", "ERR-02", "ERR-04")
    val conteo = tickets.groupingBy { it }.eachCount()
    val unico = tickets.firstOrNull { conteo[it] == 1 }

    println("\n -Reto 14: Identificador de Ticket Único- ")
    println("Primer ticket único: $unico")
    println("  ")
}

// 15. Calculadora de IVA Selectiva
fun reto15() {
    val productos = mapOf("Leche" to 4800.0, "Carne" to 90000.0, "Coca-Cola" to 6500.0, "Juguete" to 110000.0)
    val conIVA = productos.mapValues { (_, precio) ->
        if (precio > 50000) precio * 1.19 else precio
    }

    println("\n -Reto 15: Calculadora de IVA Selectiva-")
    println("Precios con IVA: $conIVA")
    println("  ")
}

// 16. Mantenimiento de Sensores
fun reto16() {
    val sensores = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    sensores.removeAll { it % 3 == 0 }

    println("\n -Reto 16: Mantenimiento de Sensores- ")
    println("Sensores funcionales: $sensores")
    println("  ")
}

// 17. Mapa de Almacén (Matriz)
fun reto17() {
    val almacen = arrayOf(
        arrayOf(0, 15, 12, 8),
        arrayOf(1, 5, 16, 2),
        arrayOf(18, 13, 20, 25),
        arrayOf(4, 10, 14, 19)
    )
    var principal = 0
    var secundaria = 0
    val n = almacen.size
    for (i in 0 until n) {
        principal += almacen[i][i]
        secundaria += almacen[i][n - 1 - i]
    }

    println("\n  -Reto 17: Mapa de Almacén- ")
    println("Suma Principal: $principal, Suma Secundaria: $secundaria")
    println("  ")
}

// 18. Fusión de Recetas
fun reto18() {
    val chef1 = mapOf("Sal" to 10.0, "Pimienta" to 5.0, "Harina" to 500.0)
    val chef2 = mapOf("Sal" to 5.0, "Azúcar" to 100.0, "Harina" to 200.0)

    val compras = (chef1.keys + chef2.keys).associateWith {
        (chef1[it] ?: 0.0) + (chef2[it] ?: 0.0)
    }

    println("\n -Reto 18: Fusión de Recetas- ")
    println("Lista de compras: $compras")
    println("  ")
}

// 19. Ranking de Apps por Calificación
fun reto19() {
    val apps = mutableListOf("App A" to 4.5, "App B" to 3.8, "App C" to 4.9, "App D" to 4.2)
    for (i in 0 until apps.size - 1) {
        for (j in 0 until apps.size - 1 - i) {
            if (apps[j].second < apps[j + 1].second) {
                val temp = apps[j]
                apps[j] = apps[j + 1]
                apps[j + 1] = temp
            }
        }
    }

    println("\n -Reto 19: Ranking de Apps- ")
    println("Top Apps: $apps")
    println("  ")
}

// 20. Unión de Agendas Ordenadas
fun reto20() {
    val agenda1 = listOf("Carlos", "Hernando", "Luz")
    val agenda2 = listOf("Maria", "Rafael", "Valentina")

    val fusion = mutableListOf<String>()
    var i = 0
    var j = 0

    while (i < agenda1.size && j < agenda2.size) {
        if (agenda1[i] < agenda2[j]) {
            fusion.add(agenda1[i++])
        } else {
            fusion.add(agenda2[j++])
        }
    }
    while (i < agenda1.size) fusion.add(agenda1[i++])
    while (j < agenda2.size) fusion.add(agenda2[j++])

    println("\n -Reto 20: Unión de Agendas Ordenadas- ")
    println("Agenda Fusionada: $fusion")
    println("  ")
}

// 21. Días de Mantenimiento (Primos)
fun reto21() {
    val n = 100
    val esPrimo = BooleanArray(n + 1) { true }
    esPrimo[0] = false
    esPrimo[1] = false
    for (p in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (esPrimo[p]) {
            for (i in p * p..n step p) esPrimo[i] = false
        }
    }
    val pisosPrimos = (1..n).filter { esPrimo[it] }

    println("\n -Reto 21: Dias de Mantenimiento- ")
    println("Pisos con mantenimiento: $pisosPrimos")
    println("  ")
}

// 22. Pila de Platos Sucios
fun reto22() {
    val pila = mutableListOf<String>()
    fun push(plato: String) = pila.add(plato)
    fun pop(): String? = if (pila.isNotEmpty()) pila.removeAt(pila.size - 1) else null

    println("\n -Reto 22: Pila de Platos- ")
    push("Plato Base")
    push("Plato Sopa")
    println("Lavando: ${pop()}")
    println("Pila restante: $pila")
    println("  ")
}

// 23. Seguimiento de Dieta
fun reto23() {
    val calorias = listOf(1600.0, 2000.0, 1900.0, 1100.0, 2200.0)
    val diferencias = mutableListOf<Double>()
    var sumaAnterior = 0.0

    for (i in calorias.indices) {
        if (i == 0) {
            diferencias.add(0.0)
        } else {
            val promedioAnterior = sumaAnterior / i
            diferencias.add(calorias[i] - promedioAnterior)
        }
        sumaAnterior += calorias[i]
    }

    println("\n -Reto 23: Seguimiento Dieta- ")
    println("Diferencias vs Promedio Anterior: $diferencias")
    println("  ")
}

// 24. Organización de Contenedores
fun reto24() {
    val manifiesto = "(()(())())"
    var balance = 0
    var esValido = true
    for (char in manifiesto) {
        if (char == '(') balance++
        else if (char == ')') balance--
        if (balance < 0) {
            esValido = false
            break
        }
    }
    if (balance != 0) esValido = false

    println("\n  -Reto 24: Organizacion de Contenedores Balanceados- ")
    println("Manifiesto: $manifiesto - ¿Válido?: $esValido")
    println("  ")
}

// 25. Rendimiento de Maratón
fun reto25() {
    val tiempos = mutableListOf(135.0, 130.0, 120.0, 108.0, 145.0)
    tiempos.sort()
    tiempos.removeAt(0)
    tiempos.removeAt(tiempos.size - 1)
    val promedioReal = tiempos.average()

    println("\n -Reto 25: Rendimiento Maratón- ")
    println("Promedio sin outliers: $promedioReal")
    println("  ")
}

// 26. Compresión de Logs
fun reto26() {
    val logs = listOf("DOWN", "DOWN", "UP", "DOWN", "UP", "UP")
    val comprimido = mutableListOf<Pair<String, Int>>()
    if (logs.isNotEmpty()) {
        var actual = logs[0]
        var cuenta = 0
        for (log in logs) {
            if (log == actual) {
                cuenta++
            } else {
                comprimido.add(actual to cuenta)
                actual = log
                cuenta = 1
            }
        }
        comprimido.add(actual to cuenta)
    }

    println("\n -Reto 26: Compresión de Logs- ")
    println("Resumen: $comprimido")
    println("")
}

// 27. Premios a Vendedores
fun reto27() {
    val ventas = mapOf("Carlos" to 10000.0, "Lucia" to 5500.0, "Rafael" to 3000.0, "Maria" to 12000.0)
    val promedio = ventas.values.average()
    val premiados = ventas.filter { it.value > promedio }.keys

    println("\n -Reto 27: Premios Vendedores- ")
    println("Promedio: $promedio, Premiados: $premiados")
    println("  ")
}

// 28. Calculadora de Tarifas de Parking
fun reto28() {
    val tarifas = (1..10).associateWith { it * 2000.0 }
    val horas = 8
    val costo = tarifas[horas] ?: (horas * 2000.0)

    println("\n -Reto 28: Parking- ")
    println("Costo por $horas horas: $costo")
    println("  ")
}

// 29. Parejas de Viaje por Peso
fun reto29() {
    val maletas = listOf(10, 15, 20, 5, 25)
    val target = 30
    var pareja: Pair<Int, Int>? = null
    val vistos = mutableSetOf<Int>()

    for (peso in maletas) {
        val complemento = target - peso
        if (vistos.contains(complemento)) {
            pareja = complemento to peso
            break
        }
        vistos.add(peso)
    }

    println("\n -Reto 29: Parejas de Carga- ")
    println("Para target $target, pareja encontrada: $pareja")
    println("  ")
}

// 30. Espejo de Layout de Tienda
fun reto30() {
    val layout = arrayOf(
        arrayOf("A1", "A2"),
        arrayOf("B1", "B2"),
        arrayOf("C1", "C2")
    )
    val filas = layout.size
    val cols = layout[0].size
    val transpuesto = Array(cols) { Array(filas) { "" } }

    for (i in 0 until filas) {
        for (j in 0 until cols) {
            transpuesto[j][i] = layout[i][j]
        }
    }

    println("\n -Reto 30: Espejo de Layout de Tienda- ")
    for (fila in transpuesto) {
        println(fila.joinToString(" | "))
    }
    println("  ")
}