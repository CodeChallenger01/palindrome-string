import org.scalatest.flatspec.AnyFlatSpec

class PalindromeTest extends AnyFlatSpec{
  val obj=new StringPalindrome
  //Test case fail
  it should "match" in{
    assert("Manish"==obj.isPalindrome("Manish"))
  }
}