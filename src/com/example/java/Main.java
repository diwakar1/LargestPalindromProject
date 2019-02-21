//A palindromic number reads the same both ways.
// The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//Find the largest palindrome made from the product of two 3-digit numbers
package com.example.java;
import java.lang.String;
import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
       //calls the method which gives the largest palindrome made from the product of entered digits.
        getMaxPalindromNumber(4);

    }


    //checks if the number is palindrom or not
    public static boolean isPalindrom(int n)
    {
        String st = String.valueOf(n);
        String string = "";
        for (int i = st.length() - 1; i >= 0; i--)
        {
            char c = st.charAt(i);
            string += c;
        }
        int num = Integer.parseInt(string);
        if (num == n)
            return true;
        else
            return false;
    }


    //provides the maximum in the array.
    public static int isMaximum(ArrayList<Integer> s)
    {

        int max = s.get(0);
        for (int i = 1; i < s.size(); i++) {
            if (s.get(i) > max) {
                max = s.get(i);

            }
        }
        return max;
    }


    //find out the products according to digits and use above methods to find out maximum palindrome product.
    //finds out the digit numbers which make the largest palindrome project.
    public static void getMaxPalindromNumber(int digit)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int numb1 =0;
        int numb2 =0;

        for (int i = (int) Math.pow(9, digit)-9 ; i <= Math.pow(10, digit)-1 ; i++)
        {
            for (int j = (int) Math.pow(9, digit)-9; j <= Math.pow(10, digit)-1 ; j++)
            {
                if (isPalindrom(i * j))
                {
                    arrayList.add(i * j);
                    numb1 =j;
                    numb2 =i;
                }

            }
        }
        //System.out.println(isMaximum(arrayList));
        //System.out.println(numb1+ " "+ numb2);
        System.out.printf("The largest palindrome product of %s digit is: %d",digit, isMaximum(arrayList));
        System.out.printf(" and the %s digit numbers are: %d  %d ",digit,numb1,numb2);
    }
}














