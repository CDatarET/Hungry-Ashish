import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		for(int c = 0; c < cases; c++){
		    int mon = scan.nextInt();
		    int piz = scan.nextInt();
		    int burg = scan.nextInt();
		    
		    if(piz <= mon){
		        System.out.println("pizza");
		    }
		    else{
		        if(burg <= mon){
		            System.out.println("burger");
		        }
		        else{
		            System.out.println("nothing");
		        }
		    }
		}
	}
}
