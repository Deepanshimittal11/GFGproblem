// User function Template for Java
// import java.math.BigInteger;
class Solution {
    String findSum(String s1, String s2) {
        // code here
        // BigInteger a = new BigInteger(s1);
        // BigInteger b = new BigInteger(s2);
        // BigInteger res = a.add(b);
        // return res.toString();
        
        StringBuilder str = new StringBuilder();
        int carry = 0;
        if(s2.length() > s1.length())
        {
            String temp = s2;
            s2 = s1;
            s1 = temp;
        }
        int n1 = s1.length()-1;
        int n2 = s2.length()-1;
        while(n1>=0 || n2>=0 || carry!=0){
            int x = n1>=0 ? s1.charAt(n1)-'0' : 0;
            int y = n2>=0 ? s2.charAt(n2)-'0' : 0;
            
            int sum = x+y+carry;
            str.append(sum%10);
            carry = sum/10;
            
            n1--;
            n2--;
        }
        
        String res = str.reverse().toString();
        //remove the leading zeros
        int i=0;
        while(i<res.length()-1 && res.charAt(i)=='0'){
            i++;
        }
        res = res.substring(i);
        return res;
    }
}