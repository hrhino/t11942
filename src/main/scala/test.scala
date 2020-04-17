import scalajs.js.annotation._
import scalajs.js

@js.native
trait Eg extends js.Object {
  var a: Boolean = js.native
  val b: Boolean = js.native
  def c(d: String = js.native): String  = js.native
}
