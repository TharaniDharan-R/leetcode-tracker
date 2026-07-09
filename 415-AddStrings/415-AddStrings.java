// Last updated: 7/9/2026, 9:49:27 AM
import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
      BigInteger a=new BigInteger(num1);
      BigInteger b=new BigInteger(num2);
      BigInteger c=a.add(b);
      return c.toString();
    }
}