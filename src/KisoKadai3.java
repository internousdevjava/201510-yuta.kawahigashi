import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 */
public class KisoKadai3 {
	public static void main(String[] args) throws IOException {
					BufferedReader mozi = new BufferedReader(new InputStreamReader(System.in));
					

					while(true){
						System.out.println("1:ファイル書き込み");
						System.out.println("2:ファイル読み込み");
						System.out.println("3:ファイルの追記");
						System.out.println("4:新規ファイル作成");
						System.out.println("5:プログラムの終了");
						System.out.println("1～5を選んでください");
						String m=mozi.readLine();
					
						int k = 0;
						try{
							k = Integer.parseInt(m);
						}catch(NumberFormatException e){ 
							System.out.println("選択できませんでした");  
							System.out.println("1~5の数字を入力してください");  
					   		System.out.println();  
					   		continue;
						}		
						
						if(k<=0||k>=6){
						   System.out.println("１～５までの文字を入力してください");
						   continue;
							
						}
						
						
						if(k==5){
							System.out.println("プログラムを終了します");
							break;
							
					
						}else if(k==1){
							System.out.println("ファイル書き込み");
							System.out.println("ファイル名＝ディレクトリの位置＋ファイル名で、入力してください");
							System.out.println("￥は2つ表示してください");
							System.out.println("例：c:¥¥tmp¥¥test.txt");
							String m2=mozi.readLine();
							File f= new File(m2);
							System.out.println("ファイル内容を記述してください");
						
								try{
									String m3=mozi.readLine();
									FileWriter w20 = new FileWriter(f);
									BufferedWriter a = new BufferedWriter(w20);

									a.write(m3);
									a.newLine();
									a.close();
								}catch(IOException e){}
									char[] e = null;
									System.out.println(e);
								
								}else if(k==2){
									System.out.println("ファイル読み込み");
									System.out.println("ファイル名＝ディレクトリの位置＋ファイル名で、入力してください");
									System.out.println("￥は2つ表示してください");
									System.out.println("例：c:¥¥tmp¥¥test.txt");
							
										try{
											String m4=mozi.readLine();
											File f = new File(m4);  
											FileReader r = new FileReader(f);
											int c;
											while((c = r.read()) != -1){
												System.out.print((char)c);
											}
											System.out.println(" ");
								

											r.close();
										}catch(FileNotFoundException e){
											System.out.println(e);
										}catch(IOException e){
											System.out.println(e);
										}

							

							    
								}else if(k==3){
									System.out.println("ファイルの追記");
									System.out.println("ファイル名＝ディレクトリの位置＋ファイル名で、入力してください");
									System.out.println("￥は2つ表示してください");
									System.out.println("例：c:¥¥tmp¥¥test.txt");
							
									String m5=mozi.readLine();
									File f = new File(m5);  
								
									System.out.println("ファイル内容を記述してください");
							
									try{
										String m6=mozi.readLine();
										FileWriter w2 = new FileWriter(f, true);
										BufferedWriter b = new BufferedWriter(w2);
								
										b.newLine();
										b.write(m6);
										b.newLine();
										b.close();
									}catch(IOException e){
										System.out.println(e);
									}
						
						
									}else if(k==4){
										System.out.println("新規ファイル作成");
										System.out.println("ファイル書き込み");
										System.out.println("ファイル名＝ディレクトリの位置＋ファイル名で、入力してください");
										System.out.println("￥は2つ表示してください");
										System.out.println("例：c:¥¥tmp¥¥test.txt");
							
										String m7=mozi.readLine();
										File f = new File(m7);
										if (f.createNewFile()){
											System.out.println("ファイルの作成に成功しました");
										}else{
											System.out.println("ファイルの作成に失敗しました");
										}

									}
						}
					}

	}

