import kotlin.math.roundToInt

fun main() {
    val teste = Flutuante()
    teste.calculo(576.73f)
}

class Flutuante {
    fun calculo(valor: Float) {
        val notas: List<Int> = listOf(100, 50, 20, 10, 5, 2)
        val moedas: List<Float> = listOf(1.00f, 0.50f, 0.25f, 0.10f, 0.05f, 0.01f)

        var valorRestante = valor

        println("NOTAS:")
        for (nota in notas) {
            val quantidadeNotas = (valorRestante / nota).toInt()
            valorRestante %= nota
            println("$quantidadeNotas nota(s) de R$ $nota.00")
        }

        // Convertendo para centavos (usando arredondamento para evitar problemas de precisão)
        var valorMoedas = valorRestante

        println("MOEDAS:")
        for (moeda in moedas) {
            val valorMoedaEmCentavos = (moeda * 100).toInt()
            val quantidadeMoedas = valorRestanteCentavos / valorMoedaEmCentavos
            valorRestanteCentavos %= valorMoedaEmCentavos
            println("$quantidadeMoedas moeda(s) de R$ ${"%.2f".format(moeda)}")
        }
    }
}
