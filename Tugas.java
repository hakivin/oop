//Hakikid Amana
//M0517019
//Informatika 2017

public class Tugas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hitung test = new Hitung();
		test.hitungLuas(new Lingkaran(14));
		test.hitungKeliling(new Persegi(20));
		test.hitungLuas(new PersegiPanjang(10,20));
	}

}

abstract class BangunDatar{
	abstract double luas();
	abstract double keliling();
}

class Persegi extends BangunDatar{
	double sisi;
	public Persegi(double sisi) {
		this.sisi = sisi;
	}
	@Override
	double luas() {
		// TODO Auto-generated method stub	
		return sisi*sisi;
	}

	@Override
	double keliling() {
		// TODO Auto-generated method stub
		return sisi*4;
	}
	
}

class PersegiPanjang extends BangunDatar{
	double lebar, panjang;
	public PersegiPanjang(double l, double p){
		this.lebar = l;
		this.panjang = p;
	}

	@Override
	double luas() {
		// TODO Auto-generated method stub
		return lebar*panjang;
	}

	@Override
	double keliling() {
		// TODO Auto-generated method stub
		return 2*lebar + 2*panjang;
	}
	
}

class Lingkaran extends BangunDatar{
	static double phi = 3.14;
	double jarijari;
	public Lingkaran(double r) {
		this.jarijari = r;
	}
	@Override
	double luas() {
		// TODO Auto-generated method stub
		return phi * jarijari * jarijari;
	}

	@Override
	double keliling() {
		// TODO Auto-generated method stub
		return phi * 2 * jarijari;
	}
	
}

class Hitung{
	void hitungLuas(BangunDatar a) {
		System.out.println("Luas = " + a.luas());
	}
	void hitungKeliling(BangunDatar a) {
		System.out.println("Keliling = "+ a.keliling());
	}
}
