import java.util.Scanner;
public class simpleinterest{
public static void main(String[] args){
int p,t,r;
float si;
Scanner sc=new Scanner(System.in);
System.out.println("Enter p:");
p=sc.nextInt();
System.out.println("Enter t");
t=sc.nextInt();
System.out.println("Enter r:");
r=sc.nextInt();
si=(p*r*t)/100;
System.out.println("simple interest is:"+si);
}}