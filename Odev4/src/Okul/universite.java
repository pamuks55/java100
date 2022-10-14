package Okul;

import java.sql.Time;
import java.util.LinkedList;

public class universite extends okul  {
	
	private LinkedList<String> klupler;
	private LinkedList<String> bolumler;

	public universite(String sinifismi, String siniftürü, Time girissaati, Time cikissaati, String sinifSayisi,LinkedList<String> bolumler) {
		super(sinifismi, siniftürü, girissaati, cikissaati, sinifSayisi);
		this.bolumler=bolumler;
	}

    public void klupkur(String klupismi) {
    	klupler.add(klupismi);
    }
	public void getklupler() {
		System.err.println(klupler);
	}
	public void getbolumler() {
		System.err.println(bolumler);
	}
	public void yemekhanedurumu() {
		int sayi=(int) (Math.random()*10);
		if(sayi<3) 
		{
		System.err.println("bomboş");	
		}
		else if(sayi>=3 && sayi<7) {
			System.err.println("masaların çoğu dolu");
		}
		else System.err.println("en iyisi şansını daha sonra dene boş masa yok");
		
		
	}
	

}
