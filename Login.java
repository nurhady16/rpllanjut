import java.io.*;
	public class Login
{
	public static void main (String args []){
	String username, password;
	Login Sc = new Login ();
		Sc.DisplayHotel(); 
	}
		
		public Login(String u, String p){
			this.username=u;
			this.password=p;
		}
		
		public void DisplayLogin(){
		System.out.print("Masukkan Username: ");
		BufferedReader u=new BufferedReader(new InputStreamReader (System.in));
		System.out.print("Masukkan Password: ");
		BufferedReader p=new BufferedReader (new InputStreamReader (System.in));
		if(u="user" && p="user")
			system.out.println("Login Berhasil");
		else
			system.out.println("Login Gagal");
		}
	}		
}