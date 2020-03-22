//4. Kode Program 
 
import java.util.Scanner; 
import java.io.IOException;
 
/* contoh membaca integer menggunakan Class Scanner*/ 

public class BacaData { 
 
	/**   
	* @param args   
	*/  
	
	public static void main(String[] args) throws IOException{   
	// TODO Auto-generated method stub   
	/* Kamus */    
	int a;   
	
	Scanner masukan;   
	/* Program */   
	System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");   
	masukan = new Scanner(System.in);   
	a = masukan.nextInt(); 
	
	/* coba ketik : masukan.nextInt(); ; Apa akibatnya ?*/    
	System.out.print ("Nilai yang dibaca : "+ a); 
	
	} 
} 

/*
output:
Contoh membaca dan menulis, ketik nilai integer:
8
Nilai yang dibaca : 8

penjelasan:
import java.util.scanner = guna nya adalah untuk mengambil fungsi scanner pada java.
Scanner masukan = new Scanner (System.in);  = fungsi dari code ini adalah untuk 
pendeklarasian variable Scanner (variabel nya adalah "masukan" terserah anda 
bila ingin diganti tidak apa - apa). a = masukan.nextInt(); = memasukan nilai 
variabel "x" dari scanner.
pada programa ini adalah program masukan pada java dimana key yang digunakan adalah
scanner. dan ada pula throws IOException untuk  jadi blok ini akan mencegah kesalahan 
yang berhubungan dengan IO. Misalnya kita akan input dari keyboard berupa angka 
tapi kita salah menginputkannya yang harusnya angka kita masukkan string. 

*/