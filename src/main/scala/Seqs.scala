object Seqs {

  def sum(xs: Seq[Double], ys: Seq[Double]): Seq[Double] = {
    xs.zip(ys).map(x => x._1 + x._2)
  }

  def multiply(xs: Seq[Double], ys: Seq[Double]): Seq[Double] = {
    xs.zip(ys).map(x => x._1 * x._2)
  }

  def diff(xs: Seq[Double], ys: Seq[Double]): Seq[Double] = {
    xs.zip(ys).map(x => Math.abs(x._1 - x._2))
  }
}
