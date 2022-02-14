package com.yusufceylan.proje.spring_boot_proje;

import java.util.ArrayList;
import java.util.List;

public class OgrenciVeriServisi {
	
	private static final List<Ogrenci> ogrenciler = new ArrayList<>();
	static {
		ogrenciler.add(new Ogrenci("Muhammed Yusuf Ceylan","H5200051"));
		ogrenciler.add(new Ogrenci("Ali Veli","H5204950"));
		ogrenciler.add(new Ogrenci("Mahmut Gümüş","H5455793"));
		ogrenciler.add(new Ogrenci("Yasin Balcı","H5626455"));
		ogrenciler.add(new Ogrenci("Yunus Altıncıoğlu","H4677556"));
		ogrenciler.add(new Ogrenci("Gürbüz Kılıç","H4556337"));
		ogrenciler.add(new Ogrenci("Erdal Deviren","H5637434"));
	}
	
	public static List<Ogrenci> ogrencileriGetir(){
		return ogrenciler;
	}

	public static void ogrenciEkle(Ogrenci ogrenci) {
		ogrenciler.add(ogrenci);
	}
	
	


}
