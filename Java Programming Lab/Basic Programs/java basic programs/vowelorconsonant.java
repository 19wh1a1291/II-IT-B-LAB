import java.util.Scanner;
public class vowelorconsonant{
public static void main(String[] args){
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("enter the alphabet:");
ch=sc.next().charAt(0);
if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
System.out.println("albhabet is vowel");
else
System.out.println("alphabet is consonant");
}} 