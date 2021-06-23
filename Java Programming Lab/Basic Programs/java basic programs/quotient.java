import java.util.Scanner;
public class quotient{
public static void main(String[] args){
int quo,rem,p,q;
Scanner sc=new Scanner(System.in);
System.out.println("Enter p:");
p=sc.nextInt();
System.out.println("Enter q:");
q=sc.nextInt();
rem=p%q;
quo=p/q;
System.out.println("remainder is:"+rem);
System.out.println("quotient is:"+quo);
}}