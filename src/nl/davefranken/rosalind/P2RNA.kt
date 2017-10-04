import java.io.File

/**
 * Problem

An RNA string is a string formed from the alphabet containing 'A', 'C', 'G', and 'U'.

Given a DNA string tt corresponding to a coding strand, its transcribed RNA string uu is formed by replacing all occurrences of 'T' in tt with 'U' in uu.

Given: A DNA string tt having length at most 1000 nt.

Return: The transcribed RNA string of tt.

Sample Dataset

GATGGAACTTGACTACGTAAATT
Sample Output

GAUGGAACUUGACUACGUAAAUU
 */
fun main(args: Array<String>) {
  val dna = File("rosalind_rna.txt").readText()
  val result = dna.replace('T', 'U')

  println(result)
}