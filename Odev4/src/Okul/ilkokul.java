package Okul;

import java.sql.Date;
import java.sql.Time;

public class ilkokul extends okul
{
	private Date tatiller;
	private String nobOgretmen;
	private boolean tenefus;
	
	public ilkokul(String sinifismi, String siniftürü, Time girissaati, Time cikissaati, String sinifSayisi) {
		super(sinifismi, siniftürü, girissaati, cikissaati, sinifSayisi);
	}
	public Date getTatiller() {
		return tatiller;
	}
	public void setTatiller(Date tatiller) {
		this.tatiller = tatiller;
	}
	
	public String getNobOgretmen() {
		return nobOgretmen;
	}
	public void setNobOgretmen(String nobOgretmen) {
		this.nobOgretmen = nobOgretmen;
	}
	public void tenefuszili() {
		System.err.println("Tenefüs zili çaldı");
		tenefus=true;
	}
	public void derszili() {
		System.err.println("Ders zili çaldı");
	}
	public void istiklalmarsi() 
	{
		tenefuszili();
		System.err.println("Öğrenciler bahçeye toplandı");
		System.err.println("Korkma sönmez bu şafaklarda yüzen alsancak..");
		derszili();
	}
	
	
	
	
}
