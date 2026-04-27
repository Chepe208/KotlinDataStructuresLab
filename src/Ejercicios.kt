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
}