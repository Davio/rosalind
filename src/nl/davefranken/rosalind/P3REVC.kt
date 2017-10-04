import java.io.File
import java.util.stream.Collectors

/**
 * Problem

In DNA strings, symbols 'A' and 'T' are complements of each other, as are 'C' and 'G'.

The reverse complement of a DNA string ss is the string scsc formed by reversing the symbols of ss, then taking the complement of each symbol (e.g., the reverse complement of "GTCA" is "TGAC").

Given: A DNA string ss of length at most 1000 bp.

Return: The reverse complement scsc of ss.

Sample Dataset

AAAACCCGGT
Sample Output

ACCGGGTTTT
 */
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