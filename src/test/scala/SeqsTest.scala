import org.scalatest.{FlatSpec, Matchers}

class SeqsTest extends FlatSpec with Matchers {

  "Seqs" should "sum two sequences" in {
    val s1 = Seq(1.0, 1.0, 1.0)
    val s2 = Seq(1.0, 2.0, 3.0)
    Seqs.sum(s1, s2) shouldBe Seq(2.0, 3.0, 4.0)
  }

  it should "multiply two sequences" in {
    val s1 = Seq(1.0, 2.0, 3.0)
    val s2 = Seq(1.0, 2.0, 3.0)
    Seqs.multiply(s1, s2) shouldBe Seq(1.0, 4.0, 9.0)
  }

  it should "find diff for two sequences" in {
    val s1 = Seq(1.0, 1.0, 1.0)
    val s2 = Seq(1.0, 2.0, 3.0)
    Seqs.diff(s1, s2) shouldBe Seq(0.0, 1.0, 2.0)
  }
}
