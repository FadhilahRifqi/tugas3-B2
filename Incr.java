//11. Kode Program 
 
/* Effek dari operator ++ */  
public class Incr { 
 
	/**   
	* @param args   
	*/  
	
	public static void main(String[] args) {   
	// TODO Auto-generated method stub   
	/* Kamus */    
	
	int i, j; 
 
	/* Program */    
	i = 3;   j = i++; 
	//Pada post-increment, variabel j akan mengambil nilai i 
	//lalu variabel i ditambah 1. Sedangkan pada pre-increment 
	//variabel i akan ditambah satu terlebih dahulu, 
	//kemudian diisi ke variabel a.
	System.out.println ("Nilai i : " + (++i) +        "\nNilai j : " + j);   
	
	} 
 
} 
 
 /*
 output:
 Nilai i : 5
 Nilai j : 3
 penjelasan:
 nilai awal i adalah 3, kemudian di pre-increment kan maka 
 nilai i=3 itu di tambah lagi dan lagi sehingga hasilnya 5.
 kemudian j=i++ yang artian post-increment yang mana nilai j 
 akan mengambil nilai dari i nya terlebih dahulu.
 */