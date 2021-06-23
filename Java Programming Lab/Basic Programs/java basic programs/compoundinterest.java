import java.util.Scanner;
public class compoundinterest{
public static void main(String[] args){
double ci,p,r,t;
Scanner sc=new Scanner(System.in);
System.out.println("Enter p:");
p=sc.nextDouble();
System.out.println("Enter r:");
r=sc.nextDouble();
System.out.println("Enter t:");
t=sc.nextDouble();
ci=p*(Math.pow((1+r/100),t));
System.out.println("compoundinterest is:"+ci);
}}