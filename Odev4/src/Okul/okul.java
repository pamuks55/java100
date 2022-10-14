package Okul;

import java.sql.Time;

public class okul extends sinif{
	private final Time girissaati;
	private final Time cikissaati;
	private String egitimalani;
	private String sinifSayisi;
	
	


	public okul(String sinifismi, String siniftürü, Time girissaati, Time cikissaati,String sinifSayisi) 
	{
		super(sinifismi, siniftürü);
		this.girissaati = girissaati;
		this.cikissaati = cikissaati;
		this.sinifSayisi = sinifSayisi;
	}

	public Time getGirissaati() {
		return girissaati;
	}

	public Time getCikissaati() {
		return cikissaati;
	}

	public String getEgitimalani() {
		return egitimalani;
	}

	public void setEgitimalani(String egitimalani) {
		this.egitimalani = egitimalani;
	}
	
	public String getSinifSayisi() {
		return sinifSayisi;
	}

	public void setSinifSayisi(String sinifSayisi) {
		this.sinifSayisi = sinifSayisi;
	}
	
}
