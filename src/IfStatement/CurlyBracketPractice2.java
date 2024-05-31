package IfStatement;

public class CurlyBracketPractice2 {
    public static void main(String[] args) {
        int k = 9, m= 4 , t=k + ++m + --k;
        if(k>m)m++;
        m++;
        ++m;
        k=m+10;
        System.out.println("Value of m " + m);
        System.out.println("Value of k " + k);
        System.out.println("Value of t " + t);








    }
}
