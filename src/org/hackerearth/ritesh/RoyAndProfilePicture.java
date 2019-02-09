package org.hackerearth.ritesh;
import java.util.Scanner;

class RoyAndProfilePicture
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int L=0,N=0;

L=sc.nextInt();
if(L<=10000 && L>=1)
{
//System.out.println("Number of pictures");	 
N=sc.nextInt();
if(N>=1 && N<=1000)
{
for(int i=0;i<N;i++)
{
int W=sc.nextInt();
int H=sc.nextInt();
if((W>=1 && W<=10000) && (H>=1 && H<=10000))
{
if(W<L || H<L)
System.out.println("UPLOAD ANOTHER");
else if(W>=L && H>=L)
{
if(W==H)
System.out.println("ACCEPTED");
else
System.out.println("CROP IT");
}
}
}
}
 }sc.close();
}

}
