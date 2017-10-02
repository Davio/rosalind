import java.io.File
import java.util.stream.Collectors

fun main(args: Array<String>) {
  val dna = File("rosalind_revc.txt").readText()
  val result = dna.reversed().chars()
      .map({ complement(it) })
      .mapToObj { i -> i.toChar().toString() }
      .collect(Collectors.joining())

  println(result)
}

private fun complement(i: Int): Int {
  return when (i.toChar()) {
    'A' -> 'T'
    'T' -> 'A'
    'G' -> 'C'
    'C' -> 'G'
    else -> throw IllegalArgumentException()
  }.toInt()
}