package testDemo;
import java.util.*;
import java.util.Scanner;

public class TestDemo
{
	public static void main(String[] args){

	        Integer n1 = Integer.parseInt(args[0]);
			if(n1 == 0)
				System.out.println("You have entered ZERO ");
			else if (n1 < 0)
				System.out.println("You have entered Negetive value ");
			else 
				System.out.println("You have entered positive value ");
		}
	}