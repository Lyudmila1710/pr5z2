import kotlin.math.sqrt
class Point(val x: Double, val y: Double){
    fun distancePoint(point2: Point): Double {
        val dx = x - point2.x
        val dy = y - point2.y
         return sqrt(dx*dx+dy*dy)
    }
}

fun main() {
    print("Программа считает расстояние между 2-мя точками:")
    println("ведите координаты точек с клавиатуры: ")
    println("Введите координаты 1 точки:")
    println("Введите координаты x:")
val x1= readLine()!!.toDouble()
    println("Введите координаты y:")
    val y1= readLine()!!.toDouble()

    println("Введите координаты 2 точки:")
    println("Введите координаты x:")
    val x2= readLine()!!.toDouble()
    println("Введите координаты y:")
    val y2= readLine()!!.toDouble()
    val  point1=Point(x1, y1)
    val  point2=Point(x2, y2)

    print("Расстояние между точками: ${point1.distancePoint(point2)}")
}
