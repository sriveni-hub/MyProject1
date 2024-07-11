import java.util.*;
class Avgoffive
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n1,n2,n3,n4,n5,sum;
float avg;
System.out.println("Enter five integers: ");
n1=sc.nextInt();
n2=sc.nextInt();
sum=n1+n2;
avg=sum/2;
System.out.println("avg of five integers is:" +avg);
}
}
