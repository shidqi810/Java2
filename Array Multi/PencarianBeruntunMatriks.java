import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PencarianBeruntunMatriks
{
	static int[][] Matriks = new int[25][25];
	static int ukuranBaris;
	static int ukuranKolom;
	static int nilaiX;
	
	public static void main(String[] args){
		System.out.print("Input jumlah n Baris = ");
		ukuranBaris = inputData();
		
		System.out.print("Input jumlah n Kolom = ");
		ukuranKolom = inputData();
		
		bacaMatriks();
		
		System.out.println("Hasil cetak adalah di bawah ini = ");
		
		cetakMatriks();
		
		System.out.print("Input nilai X yang di cari = ");
		nilaiX = inputData();
		
		cariIndeks();
		
	}
	
	private static int inputData(){
	BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
	
	String angkaInput = null;
	try{
		angkaInput = dataIn.readLine();
	} catch(IOException e){
		e.printStackTrace(); 
	}
	
	int Data = Integer.valueOf(angkaInput).intValue();
	return Data;
}

private static void bacaMatriks(){
	for(int i=0; i<ukuranBaris; i++){	
		for(int j=0; j<ukuranKolom; j++){	
		System.out.print("Masukkan isi indeks baris ke "+ (i+1) + "kolom ke " + (j+1) + ":");
			Matriks[i][j] = inputData();
	}
}
}

private static void cetakMatriks(){
	for(int i=0; i<ukuranBaris; i++){
		for(int j=0; j<ukuranKolom; j++){
		System.out.print(Matriks[i][j] + " ");
		}
	System.out.println();
	}
}

private static void cariIndeks(){
	int i = 0;
	int j = 0;
	boolean ketemu = false;
	
	while ((i<ukuranBaris)&&(!ketemu)){
		while ((j<ukuranKolom)&&(!ketemu)){
		if (Matriks[i][j] == nilaiX){
				ketemu = true;
			}
			else{
				j = j + 1;
			}
		}
		if (Matriks[i][j] == nilaiX){
				ketemu = true;
			}
		else{
				i = i + 1;
				j = 0;
			}
	}
	
	if(ketemu == true){
		System.out.println("data ditemukan");
	}
	else{
		System.out.println("data tidak ditemukan");
	}
}
}