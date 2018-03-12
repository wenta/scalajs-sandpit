import scala.scalajs.js
import scala.scalajs.js.annotation._
import js.JSConverters._


@JSExportTopLevel("Seqs")
@JSExportAll
object JsSeqs {

  def sum(xs: js.Array[Double], ys: js.Array[Double]): js.Array[Double] = Seqs.sum(xs.toSeq, ys.toSeq).toJSArray

  def multiply(xs: js.Array[Double], ys: js.Array[Double]): js.Array[Double] = Seqs.multiply(xs.toSeq, ys.toSeq).toJSArray

  def diff(xs: js.Array[Double], ys: js.Array[Double]): js.Array[Double] = Seqs.diff(xs.toSeq, ys.toSeq).toJSArray
}
