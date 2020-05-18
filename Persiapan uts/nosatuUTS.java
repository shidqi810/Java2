import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class nosatuUTS
{
	static int [] Larik = new int [25];
	static int ukuranLarik;
	static int nilaiX;
	
	public static void main(String[] args){
		System.out.print("Input jumlah n Larik = ");
		ukuranLarik = inputData();
		
		bacaLarik();
		
		System.out.print("inputkan nilai x yang dicari = ");
		
		nilaiX = inputData();
		
		cariindeks();
		
		
	}
	
	private static int inputData(){
		BufferedReader bfr = new BufferedReader
		( new InputStreamReader(System.in));
		
		String angkaInput = null;
		try {
			angkaInput = bfr.readLine();
		} catch (IOException e){
			e.printStackTrace();
		}
		
		int Data = Integer.valueOf(angkaInput).intValue();
		return Data;
		}
	
	private static void bacaLarik(){
		for(int j=0; j < ukuranLarik; j++){
			System.out.print("Masukan Larik ke - " + (j+1) +" = ");
				Larik[j] = inputData();
				
		}
		}
	
	private static void cariindeks (){
		int i = 0;
		int indeks = 0;
		while (i < ukuranLarik){
			if (Larik[i] == nilaiX){
				indeks = indeks + 1;
			}
			else {
				indeks = indeks;
			
			}
			i++;
			}
		System.out.println(" Indeks " +  nilaiX + " Yang dicari, muncul = " + indeks + " kali ");
		}
	}


	