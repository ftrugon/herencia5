class Articulo(var nombre: String, var precio: Double, val id: Int = totalArticulos){


    override fun toString(): String {
        return "$nombre $precio $id"
    }

    init {
        totalArticulos ++
    }

    companion object{
        var totalArticulos = 1
    }
}

fun main() {
    val articulo1 = Articulo("paco",22.3)
    println(articulo1)
    val articulo2 = Articulo("paco",22.3)
    println(articulo2)
    val articulo3 = Articulo("paco",22.3)
    println(articulo3)
    val articulo4 = Articulo("paco",22.3)
    println(articulo4)
    val articulo5 = Articulo("paco",22.3)
    println(articulo5)
    val articulo6 = Articulo("paco",22.3)
    println(articulo6)
    val articulo7 = Articulo("paco",22.3)
    println(articulo7)
}