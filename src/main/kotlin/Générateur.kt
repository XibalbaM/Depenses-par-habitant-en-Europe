import java.io.File
import kotlin.math.roundToInt

fun main() {
    val spendingInFractionOfGdp = File("Dépenses en fraction du PIB.csv").readLines().associate { it.substringBefore(";") to it.substringAfter(";").toDouble() }
    val gpdPerCapita = File("PIB par habitant.csv").readLines().associate { it.substringBefore(";") to it.substringAfter(";").toInt() }
    val spendingPerCapita = spendingInFractionOfGdp.mapValues { (it.value * gpdPerCapita.getValue(it.key) / 100).roundToInt() }.toList().sortedByDescending { it.second }.toMap()
    val output = spendingPerCapita.map { "${it.key};${it.value}" }.joinToString("\n")
    File("Dépenses par habitant.csv").writeText(output)
}