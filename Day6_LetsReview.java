import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution
	{
	
		public static void main(String[] args)
		{
        Scanner scan = new Scanner(System.in);
		int T=scan.nextInt();
            scan.nextLine();
		String strEven="",strOdd="";
		
		for(int i = 0; i < T; i++)
			{
				String S=scan.next();
				char[] myCharArray = S.toCharArray();
				for(int a = 0; a < S.length(); a++)
				{
					if (a%2==0)
					{
						strEven= strEven+myCharArray[a];
					}
					else
					{
						strOdd= strOdd+myCharArray[a];
					}			
				}
				
				System.out.println(strEven+" "+strOdd);
                strOdd=strEven="";
		
			}	
		
		scan.close();
		}
	}