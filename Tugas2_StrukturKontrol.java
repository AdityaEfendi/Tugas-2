import java.util.Scanner;

//Nama   : Aditya Yusup Efendi 
//Nim    : 13020200030
//Tanggal: 23 Maret 2022
//Kelas  : A1

public class Tugas2_StrukturKontrol {
    public static void main(String[] args) {
        //deklarasi variabel
        int umur;
        //membuat scanner baru
        Scanner input = new Scanner(System.in);
        //menampilkan output ke user
        System.out.print("Masukkan Umur Anda : ");
        // menggunakan scanner dan menyimpan apa yang diketik di variabel umur
        umur = input.nextInt();
        // jika di masukkan umur kurang dari 18 maka yang akan tampil Anda belum dewasa
        // karena syarat untuk menampilkan Anda sudah Dewasa adalah 18 atau lebih
        if (umur >= 18){
            System.out.println("Anda Sudah Dewasa");
        }else{
            System.out.println("Anda Belum Dewasa");
        }
    }
    
}
