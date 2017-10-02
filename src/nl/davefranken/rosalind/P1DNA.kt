import java.io.File
import java.util.stream.Collectors

fun main(args: Array<String>) {
  val dna = File("rosalind_dna.txt").readText()
  val histogram = dna.chars()
      .boxed()
      .collect(Collectors.groupingBy({ it }
          , Collectors.counting()))

  println(String.format("%s %s %s %s",
      histogram['A'.toInt()],
      histogram['C'.toInt()],
      histogram['G'.toInt()],
      histogram['T'.toInt()]))
}