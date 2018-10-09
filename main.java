package tugas;

public class main {

	public static void main(final String[] args) {
	System.out.println("*******Object Kelas Kotak*******");
	// membuat object dari class kotak
	Kotak main = new Kotak();
		
	// method setter kotak
	main.setpanjang(200.1);
	main.setlebar(50.1);
		
	// method getter kotak
	System.out.println("panjang : " + main.getpanjang());
	System.out.println("lebar : " + main.getlebar());
	System.out.println("luas : " + main.getpanjang()*main.getlebar());
	System.out.println("keliling : " + main.getlebar()*main.getpanjang()*main.getlebar()*main.getpanjang());
	
	System.out.println("*******Object Kelas Kotak*******");
	//membuat object dari class mahasiswa
	mahasiswa mahasiswa = new mahasiswa();
	
	//method setter mahasiswa
	mahasiswa.nama = "ramlah";
	mahasiswa.nim = "D0217029";
	mahasiswa.alamat = "sendana";
	mahasiswa.golonganDarah = "__";
	mahasiswa.status = "Mahasiswi";
	mahasiswa.tinggiBadan = "135";
	mahasiswa.beratBadan = "42";
	mahasiswa.agama = "Islam";
	
	//method getter mahasiswa
	System.out.println("nama : " + mahasiswa.getnama());
	System.out.println("nim : " + mahasiswa.getnim());
	System.out.println("alamat : " + mahasiswa.getalamat());
	System.out.println("golongan Darah : " + mahasiswa.getgolongnDarah());
	System.out.println("Status : " + mahasiswa.getstatus());
	System.out.println("tinggi badan : " + mahasiswa.getberatBadan());
	System.out.println("berat badan : " + mahasiswa.getberatBadan());

	
	System.out.println("*******Object Kelas Kotak*******");
	//membuat object dari kelas node
	node Node = new node();
	
	//method setter node
	Node.label = "INFORMATIKA";
	Node.Value = 1;
	
	//method getter node
	System.out.println("Nama Label : " + Node.getlabel());
	System.out.println("jumlah label : " + Node.getValue());

	System.out.println("------Object Kelas stack------");
	//membuat object dari kelas stack
	stack stack = new stack();
	
	stack.value[0] = "Wahab";
	stack.value[1] = "Hasman";
	stack.value[2]= "Fatma";
	stack.value[3]= "Ramlah";
	stack.value[4] = "Rusman";
	stack.value[5] = "Ainun";
	stack.value[6]= "Abay";
	stack.value[7]= "Iqram";
	stack.value[8] = "Mumu";
	stack.value[9] = "Ira";
	stack.value[10]= "Icca";
	stack.value[11]= "Aulia";
	stack.value[12] = "Gazali";
	stack.value[13] = "Wira";
	stack.value[14]= "Liska";
	stack.value[15]= "Fahmi";
	stack.value[16] = "DZ";
	stack.value[17] = "Rahma";
	stack.value[18]= "Nisma";
	stack.value[19]= "Dila";
	stack.value[20] = "Dina";
	stack.value[21] = "Indah";
	stack.value[22]= "Zulin";
	stack.value[23]= "Mufli";
	stack.value[24] = "Aqil";
	stack.value[25] = "Hasbi";
	stack.value[26]= "Anto";
	stack.value[27]= "Iccang";

	stack.setvalueAt(4 ,"Meydina");

	//menampilkan stack
	for(int i=0;i<stack.value.length;i++){System.out.println(stack.value[i]);};

	
	}
}

