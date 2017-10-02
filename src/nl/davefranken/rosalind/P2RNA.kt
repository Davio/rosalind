import java.io.File

fun main(args: Array<String>) {
  val dna = File("rosalind_rna.txt").readText()
  val result = dna.replace('T', 'U')

  println(result)
}