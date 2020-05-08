import java.util.*;
public class Solution {
	public static void main(String[] args) {
		//Your code goes here
        
        
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        char ss='A';
        int i=1;
        if(n>=0 && n<=26)
        {
           if(n>0)
           {
               ss=(char)(ss+n-1);
           }
        while(i<=n)
        {
            char ch=(char) (ss+1-i);
        int j=1;
           
            
            while(j<=i)
            {
                System.out.print(ch);
                ch=(char)(ch+1);
                j++;
            }
            i++;
            System.out.println();
        }
	}}
    
    
}