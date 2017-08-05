# Bits
import java.io.*;
import java.util.*;
class Bits
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of k");
		int k=sc.nextInt();
		int t=(int)(Math.pow(2,k));
		int[] a=new int[t];
		StringBuffer[] sb=new StringBuffer[t];
		for(int i=0;i<t;i++)
		{
			sb[i]=new StringBuffer(Integer.toBinaryString(i));	
			a[i]=Integer.bitCount(i);
		}
		for(int i=0;i<t;i++)
		{
			while(sb[i].length()!=k)
				sb[i].insert(0,0);		
		}
		for(int i=0;i<t;i++)
		{
			for(int j=i+1;j<t;j++)
			{
				if(a[i]>a[j])
					{
						StringBuffer temp=new StringBuffer(sb[i]);
						sb[i]=new StringBuffer(sb[j]);
						sb[j]=new StringBuffer(temp);
					}
			}
		}
		for(int i=0;i<t;i++)
		{
			System.out.print(sb[i]+" ");
		}
	}
}
