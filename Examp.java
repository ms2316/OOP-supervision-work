import java.util.Arrays;

public class Examples {
	
	char four = '4';
	
	int add(int a, int b){
		return a+b;
	 }
	 
	 public static int sum(int[] a){
		 int x = 0;
		 for(int i = 0; i<a.length; i++){
			 x=x+a[i];
		 }
		 return x;
	 }
	 public static int[] cumsum(int[] a){
		 for(int i=0; i<a.length-1; i++){
			 a[i+1]=a[i]+a[i+1];
		 }
		 
		 return a;
	 }
	 
	 static int[] positives(int[] a){	
		 for(int i = 0; i<a.length; i++){
			 if (a[i]<0){
				 a[i]=-a[i];
			 }
		 }
		 return a;
	 }
	 
	 public static int[][] matrix(int n){
		int[][] a = new int[n][n];
		 for(int i = 0; i<a.length; i++){
			 for(int j =0; j<a[i].length; j++){
				 a[i][j]=i*j;
			 }			 
		 }
		return a;
	 }
	 public static int[][] fillarray (int[][] a){

		 return a;
	 }

	 
	 public static void main(String[] args){
		int[] array={1,2,3,4,5,6};
		int[] narray={-1,-2,-3,4,5,6};
		int[] arraycum = cumsum(array);
		int[] parray = positives(narray);
		 System.out.println(sum(array));
		 System.out.println(Arrays.toString(arraycum));
		 System.out.println(Arrays.toString(parray));

		 
		 int[][] twoDarray = (matrix(10));
		 System.out.println(Arrays.deepToString(twoDarray));

	
	 
	 }
	 
	 
	 
}
