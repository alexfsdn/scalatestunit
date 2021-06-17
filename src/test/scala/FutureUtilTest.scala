import org.junit.Assert.assertEquals

class FutureUtilTest {

  @org.junit.Test
  def testDivideVars(): Unit = {
    var expected: Int = 10
    var actual: Int = FutureXUtil.divideVars(30, 3);

    assert(expected == actual)
  }

}
