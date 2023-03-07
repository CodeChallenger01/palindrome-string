import org.scalatest.flatspec.AnyFlatSpec

class PalindromeTest extends AnyFlatSpec{
  val obj=new StringPalindrome
  //Test case pass if we use false
  it should "match" in{
    assert(false==obj.isPalindrome("Manish"))
  }
  //Test case pass if we use true
  it should "match1" in {
    assert(true== obj.isPalindrome("aba"))
  }
}