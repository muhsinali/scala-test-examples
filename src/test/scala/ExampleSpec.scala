import model.SpellChecker
import org.mockito.ArgumentMatchers.anyString
import org.mockito.Mockito._
import org.scalatest.{FlatSpec, Matchers}


/**
  * Some quick start examples
  */
class ExampleSpec extends FlatSpec with Matchers {

  "example" should "showcase better syntax" in {
    val list = (0 to 100).toList

    list should contain(100)
  }

  it should "allow this test to work" in {
    true shouldNot equal(false)
  }

  "SpellChecker" should "return true for correct spelling" in {
    val spellChecker = mock(classOf[SpellChecker])
    when(spellChecker.isCorrect(anyString)).thenReturn(true)

    spellChecker.isCorrect("example") should equal(true)
  }
}
