//3. Kode Program 

//NIM			:	13020180091
//Nama			:	FADHILAH RIFQI
//Hari, tanggal	:	Rabu, 18-09-2020          

/* Deskripsi :   */ 
/* Program ini berisi contoh sederhana untuk mendefinisikan */ 
/* variabel-variabel bilangan bulat (short int, int, long int), */ 
/* karakter, bilangan riil, */  
 
public class ASIGNi { 
 
	/**   
	* @param args   
	*/  
	
	public static void main(String[] args){   
	// TODO Auto-generated method stub   
	/* KAMUS */      
	short ks = 1; 
	int ki = 1;      
	long kl = 10000;      
	char c = 65;  
	
	/* inisialisasi karakter dengan integer */   
	char c1 = 'Z'; 
	
	/* inisialisasi karakter dengan karakter */   
	double x = 50.2f;  // double hanya untuk 64 bit
	float y = 50.2f; // fload hanya untuk 32 bit 
	
	/* Algoritma */ 
 
	/* penulisan karakter sebagai karakter */    
	System.out.println  ("Karakter = "+ c); //klu ASCII 65 itu sama dengan huruh A besar   
	System.out.println  ("Karakter = "+ c1); 
 
	System.out.println  ("Bilangan integer (short) = "+ ks);   
	System.out.println  ("\t(int) = "+ ki);    
	System.out.println  ("\t(long)= "+ kl);    
	System.out.println  ("Bilangan Real x = "+ x);    
	System.out.println  ("Bilangan Real y = "+ y);  
 
	} 
} 

/*
output:
Karakter = A
Karakter = Z
Bilangan integer (short) = 1
        (int) = 1
        (long)= 10000
Bilangan Real x = 50.20000076293945
Bilangan Real y = 50.2

penjelasan:
Short : Memiliki nilai integer dari -32768 sampai 32767 dan menempati 2 bytes ( 16 bits ) di memori.
Int   : Memiliki nilai integer dari -2147483648 sampai 2147483647 dan menempati 4 bytes ( 32 bits ) di memori.
Long  : Memiliki nilai dari -9223372036854775808 sampai 9223372036854775807 dan menempati 8 bytes ( 64 bits ) di memori.
Char  : karakter tunggal yang didefinisikan dengan diawali dan diakhiri dengan tanda ‘ ( petik tunggal ).

pada output karakter yang memanggil variabel c dan sementara variabel c di berikan terlebih dahulu nilainya dengan 65
dan komputer menerjemahkan angka 65 ke ASCII yang mana bila angka 65 itu adalah huruf A.
pada variabel x pun pada output yang tampil menghasilkan 50.20000076293945 sementara nilai yang diberikan terlebih dahulu
adalah 50.2, itu karena tipe data double menmpung 64 bit banyaknya.
*/