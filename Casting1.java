//6. Kode Program  
 
/*Casting menggunakan tipe data primitif*/ 

public class Casting1 { 
 
	/**   
	* @param args   
	*/  
	
	public static void main(String[] args) {   
	// TODO Auto-generated method stub   
	int a=5,b=6;   
	float d=2.f,e=3.2f;   
	char g='5';   
	double k=3.14;      
	
	System.out.println((float)a);  // int   <-- float 
	System.out.println((double)b); // int   <-- double   
	System.out.println((int)d);    // float <-- int   
	System.out.println((double)e); // float <-- double   
	System.out.println((int)g);    // char  <-- int      (ASCII)   
	System.out.println((float)g);  // char  <-- float    (ASCII)   
	System.out.println((double)g); // char  <-- double   (ASCII)   
	System.out.println((int)k);    // double   <-- int   
	System.out.println((float)k);  // double   <-- float  
  
	} 
} 

/*
output:
5.0
6.0
2
3.200000047683716
53
53.0
53.0
3
3.14

penjelasan:
bila type-casting/mengubah nilai dengan tipe data tertentu.
int ke fload dan double, yang mana float dan double untuk 
bilangan yg desimal atau pecahan sementara int untuk bilangan 
bulat jadi angkah yang dihasilkan nantinya akan pecahan 5,0 dan 6,0.
dari float atau double ke int pun angkanya berupa bilangan bulat.
jika pecahan desimal maka angka yang diambil hanya angka 
depannya saja. dari float ke double, panjang double lebih panjang 
dari pada fload, maka bilangan yang dihasilkan 3.200000047683716.
bila char ke int maka char itu akan diterjemahkan ke ascii dan 
angka bulat yang di tampilkan. dan bila double dan float ke char
maka akan pula di terjemahkan ke ascii dan angka bulat yang tampil
akan ditambahi ,0 karena tipe data tersebuat adalah untuk desimal.
*/