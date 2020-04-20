
public class Test1 {
	public static void main(String[] args) {
		int total;
		for(int i=2;i<=8;i=i+2){
			for(int j=1;j<=i;j++) {
				total = i * j;
				System.out.println(i+" X "+j+" = "+total);
				
			}
		}
	}
}
