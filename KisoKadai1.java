package 九九表01;
	import java.io.BufferedReader;
	import java.io.InputStreamReader;

	public class KisoKadai1
	{
		  public static void main(String args[]) 
		  {
			    System.out.println("九九の表");

			    int x;
	            int y;
	            
	            // x入力
	            System.out.print("xを入力してください: ");
	            InputStreamReader isrx = new InputStreamReader(System.in);
	            BufferedReader brx = new BufferedReader(isrx);
	            try{
	                    String bufx = brx.readLine();
	                    x = Integer.parseInt(bufx);
	            }catch(Exception e){
	                    x = 0;
	            }
	         
	            //　y入力
	            System.out.print("yを入力してください: ");
	            InputStreamReader isry = new InputStreamReader(System.in);
	            BufferedReader bry = new BufferedReader(isry);
	            try{
	                String bufy = bry.readLine();
	                y = Integer.parseInt(bufy);
	            }catch(Exception e){
	                y = 0;
	            }
	            
			    // 配列の宣言。
			    int kuku[][] = new int[x][y];

			    // 九九の結果を配列に保存。
			    for( int i=0; i<x; i++ ) {
			      for( int j=0; j<y; j++ ){
			    	  kuku[i][j] = (i+1) * (j+1);
			      }
			    }

			    // 九九の結果を表示。
			    for( int i=0; i<x; i++ ) {
			      for( int j=0; j<y; j++ ) { 
			    	  System.out.print(kuku[i][j] + " "); 
			      }
			      	  System.out.println(); 
			    }
		  }
	}

