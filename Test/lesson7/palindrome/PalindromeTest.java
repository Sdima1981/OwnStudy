package lesson7.palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test

    public void test(){
        Palindrome test = new Palindrome ();
          test.setWord ("level");
          assertTrue (test.isPalindrome ());
    }
}