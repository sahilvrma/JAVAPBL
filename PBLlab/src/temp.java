
public class temp {
	int x=9;
	public void methodOne(){
	   final	int y=89;
		class inner{
			public void methodTwo(){
				System.out.println(x);
				System.out.println(y);
			}
		}
		inner in = new inner();
		in.methodTwo();
	}
	public static void main(String arg[]) {
	  new temp().methodOne();
	}
}
