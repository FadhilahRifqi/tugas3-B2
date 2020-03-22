//5. Kode Program  

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
 
 
//import javax.swing.*; 
 
public class Bacakar { 
 
	/**   
	* @param args   
	* @throws IOException    
	*/  
	
	public static void main(String[] args) throws IOException {   
	// TODO Auto-generated method stub   
	/* Kamus */    
	char cc;   
	int bil;   
	InputStreamReader isr = new InputStreamReader(System.in);   
	BufferedReader dataIn = new BufferedReader(isr);   
	// atau   BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));   
	
	/* Algoritma */   
	System.out.print ("hello\n");      
	System.out.print("baca 1 karakter : ");   
	//perintah baca karakter cc    
	cc =dataIn.readLine().charAt(0); 
	System.out.print("baca 1 bilangan : ");   
	//perintah baca bil    
	bil =Integer.parseInt(dataIn.readLine());   
	/*String kar = JOptionPane.showInputDialog("Karakter 1 : ");    
	System.out.println(kar);*/   
	//JOptionPane.showMessageDialog(null, "hello");   
	System.out.print (+cc +"\n" +bil+"\n");   
	System.out.print ("bye \n");   
	
	} 
}

/*
output:
hello
baca 1 karakter : e
baca 1 bilangan : 2
101
2
bye

penjelasan:
BufferedReader  adalah class yang berada pada paket java.io, 
io adalah singkatan dari input ouput. Class BufferedReader 
juga mampu menerima input dari file dan dari sebuah jaringan. 
Sehingga untuk penggunaan BufferedReader di java harus mengimportkan 
3 class pada paket java.io sekaligus, yaitu
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

pada karakter dia menerjemahkan pengimputen karakter ke ascii.
*/