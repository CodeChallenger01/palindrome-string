import scala.io.StdIn.readLine
class StringPalindrome{
    //To check the string is palindrome or not and return the value
    def isPalindrome(inputString:String): Boolean= {
        var lastIndex= inputString.length - 1
        for (index <- 0 to inputString.length - 1) {
            if (inputString.charAt(index) != inputString.charAt(lastIndex)) {
                return false
            }
            lastIndex-=1
        }
        return true
    }

    //Method to print the string is palindrome or not
    def printResult(result: Boolean): Unit = {
        if (result==false)
            print("No, It is not Palindrome")
        else
            print("Yes, It is Palindrome")
    }
}
//singleton object
object Main extends App{
    val obj=new StringPalindrome
    try{
        val inputString=readLine("Enter the String  :")
        val result = obj.isPalindrome(inputString)
        obj.printResult(result)
    }
    catch{
        case input: StringIndexOutOfBoundsException =>{
            print("String Overflow")
        }
    }
}