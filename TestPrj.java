package testprj;


import java.io.*;
import java.util.*;

public class TestPrj
{
    public static void main(String[] argv)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String str;
        while(t-->0)
        {
            str=sc.nextLine().trim().replaceAll("\\s+", " ").toLowerCase();
            
            for(int i=0;i<str.length();i++)
            {
            }
            System.out.println(str);
            
        }
    }
}