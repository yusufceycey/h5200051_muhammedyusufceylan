package com.yusufceylan.proje.spring_boot_proje;

public class Ogrenci {
     
	private String isim;
	private String numara;
	
	public Ogrenci(String isim, String numara) {
		super();
		this.isim = isim;
		this.numara = numara;
	}

	public String getIsim() {
		return isim;
	}

	public String getNumara() {
		return numara;
	}
	
	
}
