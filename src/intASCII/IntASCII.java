
package intASCII;

import java.util.Scanner;

public class IntASCII
{
    public static void main(String args[])
    {
        int mark[] = new int[3];
        int i;
        float sum=0, avg;
        Scanner scan = new Scanner(System.in);
		
        System.out.println("Enter Marks Obtained in 3 Subjects : ");
        for(i=0; i<3; i++)
        {
            mark[i] = scan.nextInt();
            sum = sum + mark[i];
        }
		
        avg = sum/3;
		
        System.out.println("Your Grade is ");
        if(avg>70)
        {
            System.out.println("A");
        }
        else if(avg>61 && avg<=70)
        {
            System.out.println("B");
        }
      
        else
        {
            System.out.println("C");
        }
        }
    }
