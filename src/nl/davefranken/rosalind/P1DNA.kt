import java.io.File
import java.util.stream.Collectors

/**
 * Problem

A string is simply an ordered collection of symbols selected from some alphabet and formed into a word; the length of a string is the number of symbols that it contains.

An example of a length 21 DNA string (whose alphabet contains the symbols 'A', 'C', 'G', and 'T') is "ATGCTTCAGAAAGGTCTTACG."

Given: A DNA string ss of length at most 1000 nt.

Return: Four integers (separated by spaces) counting the respective number of times that the symbols 'A', 'C', 'G', and 'T' occur in ss.

Sample Dataset

AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC
Sample Output

20 12 17 21
 */
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