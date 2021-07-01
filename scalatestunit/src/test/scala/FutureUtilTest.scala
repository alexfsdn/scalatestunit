import org.junit.{After, Before}

class FutureUtilTest {

  @After
  def setup(): Unit ={
    println("----------------------------Setting.....----------------------------")
  }

  @org.junit.Test
  def testDivideVars(): Unit = {
    var expected: Int = 10
    var actual: Int = FutureXUtil.divideVars(30, 3);

    assert(expected == actual)
  }

  @Before
  def clear(): Unit ={
    println("----------------------------Cleaning up...----------------------------")
  }

}
