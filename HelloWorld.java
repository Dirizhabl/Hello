import java.util.Scanner;
public class HelloWorld {
	public static int[][] generateSubArray (int ma[][], int n){
		int i;
		int re[][]=new int [n-1][];
		for(i=0;i<n-1;i++){
			ma[i]=re[i];
		}
		return re;
	}
	void Transpose(double ma[][],int n)
	{
	   int i,j;
	   double tmp;

	   for (i=1;i<n;i++) {
	      for (j=0;j<i;j++) {
	         tmp = ma[i][j];
	         ma[i][j] = ma[j][i];
	         ma[j][i] = tmp;
	      }
	   }
	}
	public static int Det(int ma[][], int n, int m){
		int d=0;
		if(m==n && m==2){
			return ma[0][0]*ma[1][1]-ma[1][0]*ma[0][1];
		}
		if(m!=2 || n!=2)
		d+= Det(generateSubArray(ma, n), n-1, m-1);
		return d;
	}
	public static float[][] Invert(int ma[][], int n, int m){
		float in[][]=new float [n][m];
		int det= Det(ma, n, m);
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				in[i][j]=(1/det)*ma[i][j];
			}
		}
		return in;
	}
	public static void main(String[] args) {
		int  i, j, n, m, d;
		
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		m = s.nextInt();
		int mat[][]= new int[n][m];
		float in[][]= new float[n][m];
		for(i=0; i < n ;i++){
			for(j=0;j<m;j++){
		mat[i][j] = s.nextInt();
		}
		}
		in=Invert(mat, n, m);
		for(i=0; i < n ;i++){
			System.out.print("\n"+(i+1)+". ");
			for(j=0;j<m;j++){
		System.out.print(in[i][j]+" ");
			}
		}

	}

}
