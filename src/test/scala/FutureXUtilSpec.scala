import org.scalatest.flatspec.AnyFlatSpec

class FutureXUtilSpec extends AnyFlatSpec {

  it should "match" in {
    assert(10 == FutureXUtil.divideVars(30, 3))
  }

}