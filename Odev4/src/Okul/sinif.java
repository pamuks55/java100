package Okul;

import java.util.LinkedList;

public class sinif {
	private final String sinifismi;
	private final String siniftürü;
	private int ogrenciSayisi;
	private LinkedList<String> ogrencilistesi;
	private LinkedList<String> sinifEkipmanlari;
	
	
	public sinif(String sinifismi, String siniftürü) 
	{
		this.sinifismi = sinifismi;
		this.siniftürü = siniftürü;
	}
	
	public int getOgrenciSayisi() 
	{
		return ogrenciSayisi;
	}
	
	public void setOgrenciSayisi(int ogrenciSayisi) 
	{
		this.ogrenciSayisi = ogrenciSayisi;
	}
	
	public String getSinifismi() 
	{
		return sinifismi;
	}
	
	public void ogrencilistesi() 
	{
	System.err.println(ogrencilistesi);	
	}
	
	public void ogrenciekle(String isim,String soyisim) {
		ogrencilistesi.add(isim+" "+soyisim);
	}
	
	public String getSiniftürü() 
	{
		return siniftürü;
	}
	
	public void ekipmanEkle(String ekipman) 
	{
		sinifEkipmanlari.add(ekipman);
	}
	
}
