package com.yusufceylan.proje.spring_boot_proje;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ogrenci")
public class OgrenciApi {
	
	@GetMapping("/listele")
	public List<Ogrenci> listele() {
		List<Ogrenci> ogrenciler = new ArrayList<>();
		return OgrenciVeriServisi.ogrencileriGetir();
		
	}
	@PostMapping("/ekle")
	public Ogrenci ekle(@RequestBody Ogrenci ogrenci) {
		OgrenciVeriServisi.ogrenciEkle(ogrenci);
		return ogrenci;
	}
	
	@GetMapping("/ekle2")
	public Ogrenci ogrenciEkle(@RequestParam String isim,@RequestParam String numara) {
		Ogrenci ogrenci = new Ogrenci(isim,numara);
		OgrenciVeriServisi.ogrenciEkle(ogrenci);
		return ogrenci;
	}
}
