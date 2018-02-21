
public class program2 {
	
public static void main(String arg[]){
	int a[]= new int[5];
	int sum=0;
	for(int i=0;i<5;i++) {
		a[i]=Integer.parseInt(arg[i]);
	}
	for(int i=0;i<4;i++) {
	  sum=a[i]+a[i+1];
	}
	System.out.println(sum);
}
}
