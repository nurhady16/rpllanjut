class LaluLintas 
{
	private String NamaJalan;
	private String Jarak;
	private String Kondisi;
		public LaluLintas(String n, String j, String k){
		this.NamaJalan = n;
		this.Jarak = j;
		this.Kondisi = k;
	}
	public void DisplayLaluLintas(){
		System.out.println("Nama Jalan : " +this.NamaJalan);
		System.out.println("Jarak : "+this.Jarak);
		System.out.println("Kondisi : "+this.Kondisi);
	}

	public static void main(String[] args) {
		LaluLintas Sc = new LaluLintas (" Jl. Malioboro, Yogyakarta, Indonesia ", " 2 Kilometer", "Padat Merayap");
		Sc.DisplayLaluLintas(); 
	}
}
