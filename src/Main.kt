import kotlin.math.roundToInt

fun main() {
    val teste = Flutuante()
    teste.calculo(576.24)
}

class Flutuante {
    fun calculo(valor: Double) {
        val notas: List<Int> = listOf(100, 50, 20, 10, 5, 2)
        val moedas: List<Double> = listOf(1.00, 0.50, 0.25, 0.10, 0.05, 0.01)

        var valorRestante = valor

        println("NOTAS:")
        for (nota in notas) {
            val quantidadeNotas = (valorRestante / nota).toInt()
            valorRestante %= nota
            println("$quantidadeNotas nota(s) de R$ $nota.00")
        }

        println("MOEDAS:")
        for (moeda in moedas) {
            val quantidadeMoedas = (valorRestante / moeda).toInt()
            valorRestante %= moeda

            println("$quantidadeMoedas moeda(s) de R$ %.2f".format(moeda))
        }
    }
}