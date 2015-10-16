
	import java.io.BufferedReader;
	import java.io.InputStreamReader;

	public class KisoKadai1
	{
		  public static void main(String args[]) 
		  {
			    System.out.println("‹ã‹ã‚Ì•\");

			    int x;
	            int y;
	            System.out.print("x‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢: ");
	            InputStreamReader isrx = new InputStreamReader(System.in);
	            BufferedReader brx = new BufferedReader(isrx);
	            try{
	                    String bufx = brx.readLine();
	                    x = Integer.parseInt(bufx);
	            }catch(Exception e){
	                    x = 0;
	            }
	            System.out.print("y‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢: ");
	            InputStreamReader isry = new InputStreamReader(System.in);
	            BufferedReader bry = new BufferedReader(isry);
	            try{
	                String bufy = bry.readLine();
	                y = Integer.parseInt(bufy);
	            }catch(Exception e){
	                y = 0;
	            }
			    int kuku[][] = new int[x][y];
			    for( int i=0; i<x; i++ ) {
			      for( int j=0; j<y; j++ ){
			    	  kuku[i][j] = (i+1) * (j+1);
			      }
			    }
			    for( int i=0; i<x; i++ ) {
			      for( int j=0; j<y; j++ ) { 
			    	  System.out.print(kuku[i][j] + " "); 
			      }
			      	  System.out.println(); 
			    }
		  }
	}

