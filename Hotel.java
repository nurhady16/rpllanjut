public class Hotel {
	private String Nama_Hotel;
	private String Alamat;
	private String Jenis_Hotel;
	private String No_Tlp;
	public Hotel(String n, String a, String j, String t ){
		this.Nama_Hotel = n;
		this.Alamat = a;
		this.Jenis_Hotel = j;
		this.No_Tlp = t;
	}
	public void DisplayHotel(){
		System.out.println("Nama Hotel : " +this.Nama_Hotel);
		System.out.println("Alamat : "+this.Alamat);
		System.out.println("Jenis Hotel : "+this.Jenis_Hotel);
		System.out.println("No Telepon : "+this.No_Tlp);
	}

	public static void main(String[] args) {
		Hotel Sc = new Hotel (" NENDRA HOTEL ", " Jl. Dr. Sutomo 20, Yogyakarta 55225, Indonesia", "One Star", " (0274) 512 839, (0274) 586 196");
		Sc.DisplayHotel(); 
	}
}
