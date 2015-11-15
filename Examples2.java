
public class Examples2 {
	
	private static int x;
	private static int y;
	
	public static void setx (int a){
		x=a;
	}
	public static void sety (int b){
		y=b;
	}
	public static int getx (){
		return x;
	}
	public static int gety(){
		return y;
	}
	
	 public static void vectorAdd(int x,int y,int dx, int dy) {
		 x=x+dx;
		 y=y+dy;	 
		 setx(x);
		 sety(y);
}
	 
	 
	 public static void main(String[] args){
		 int a = 0;
		 int b = 2;
		 
		 vectorAdd(a,b,1,1);
		 System.out.println(getx());
		 System.out.println(gety());
		 
	 }
	 
	 
}
