import java.util.Scanner;

public class program1 {
public static void main(String arg[]) {
  Scanner sc= new Scanner(System.in);
  int a[]= new int[6];
  for(int i=0;i<a.length;i++){
	 System.out.println("Enter "+(i+1)+" element:");
	 a[i]=sc.nextInt();
	 if(i==a.length) {
		 System.out.println("Array is full");
	 }
  }
  
  System.out.println("Enter any index out of 0-"+(a.length-1));
    int index=sc.nextInt();
    
  
	  if(a[index]%2==0) {
		  System.out.println((a[index]*a[index])+ " Square will be printed");
	  }
	  else{
		System.out.println(a[index]+ " number itself will be printed");  
	  }
  
}
}
