package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.lang.String;
import java.util.Scanner;
//kelas mahasiswa
   class Mahasiswa {
    String npm;
    String nama;
    String angkatan;
    String nomorHp;
    String prodi;
    String jurusan;
//konstruktor untuk mahasiswa
    Mahasiswa(String npm, String nama, String angkatan,String nomorHp, String prodi, String jurusan){
        this.npm = npm;
        this.nama = nama;
        this.angkatan = angkatan;
        this.nomorHp = nomorHp;
        this.prodi = prodi;
        this.jurusan = jurusan;
    }
    //Method yang digunakan untuk absensi
   void absen(){
       Scanner inputMahasiswa = new Scanner(System.in);
       System.out.print("Masukkan Npm :");
       String inputNpm = inputMahasiswa.next();
       if(inputNpm.equals(this.npm)){
           System.out.println("Absensi Berhasil !!");
           System.out.println("===================");
           cetakData();
       }else {
           System.out.println("NPM yang Anda masukkan salah !!");
       }
   }
   //Method verifikasi kecocokan npm

     void cetakData(){
         System.out.println("Keterangan Absen Berhasil");
         System.out.println("Pada : ");
         // kelas untuk mengambil tanggal dan waktu terkini
         LocalDateTime localDate = LocalDateTime.now();
         // kelas untuk ubah format data tanggal dan waktu
         DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("EEEE, dd-MM-yyy HH:mm:ss");
         String formattedDate = localDate.format(dateFormatter);
         System.out.println(formattedDate);
         //untuk menampilkan data
         System.out.println("Npm        : "+ npm);
         System.out.println("Nama       : "+ nama);
         System.out.println("Angkatan   : "+angkatan);
         System.out.println("Nomor Hp   : "+nomorHp);
         System.out.println("Prodi      : "+prodi);
         System.out.println("Jurusan    : "+jurusan);
         System.out.println("=======================");
     }
}
//Kelas dosen
class Dosen {
    String nip;
    String namaDos;
    String nomorHpDos;
    String jurusanDos;
    //method dosen
     Dosen(String nip, String namaDos, String nomorHpDos, String jurusanDos) {
        this.nip = nip;
        this.namaDos = namaDos;
        this.nomorHpDos = nomorHpDos;
        this.jurusanDos = jurusanDos;
    }
    void absenDosen(){
        Scanner inputDosen = new Scanner(System.in);
        System.out.print("Masukkan Npm :");
        String inputNip= inputDosen.next();
        if(inputNip.equals(this.nip)){
            System.out.println("Absensi Berhasil !!");
            System.out.println("===================");
            cetakDataDosen();
        }else {
            System.out.println("NPM yang Anda masukkan salah !!");
        }
    }
    void cetakDataDosen(){
        System.out.println("Keterangan Absen Berhasil");
        System.out.println("Pada : ");
        // kelas untuk mengambil tanggal dan waktu terkini
        LocalDateTime localDate = LocalDateTime.now();
        // kelas untuk ubah format data tanggal dan waktu
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("EEEE, dd-MM-yyy HH:mm:ss");
        String formattedDate = localDate.format(dateFormatter);
        System.out.println(formattedDate);
        //untuk menampilkan data
        System.out.println("Nip        : "+ nip);
        System.out.println("Nama       : "+ namaDos);
        System.out.println("Nomor Hp   : "+nomorHpDos);
        System.out.println("Jurusan    : "+jurusanDos);
        System.out.println("=======================");
    }
}


public class Main {

    public static void main(String[] args) {
	Mahasiswa edu = new Mahasiswa("2015061011","Yohanes Edu Parlaungan Ritonga","2020","081272015821","Teknik Informatika","Teknik Elektro");
    Mahasiswa aldo = new Mahasiswa("2015061012","Aldo Wijaya","2020","081278053185","Teknik Informatika","Teknik Elektro");
    Mahasiswa lazim = new Mahasiswa("2015061082","Muhammad Lazim Hasan","2020","085758887944","Teknik Informatika","Teknik Elektro");
    Dosen yessi = new Dosen("197312262000122001","Yessi Mulyani","081377607837","Teknik Informatika");
    Dosen ana = new Dosen("197203161999032002","Mardiana","08117232132","Teknik Informatika");
    Dosen puput = new Dosen("198410312019031004","Puput Budi Wintoro","081279891857","Teknik Informatika");
        int menu;
        System.out.println("============================");
        // kelas untuk mengambil tanggal dan waktu terkini
        LocalDateTime localDate = LocalDateTime.now();
        // kelas untuk ubah format data tanggal dan waktu
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("EEEE, dd-MM-yyy HH:mm:ss");
        String formattedDate = localDate.format(dateFormatter);
        System.out.println(formattedDate);
        System.out.println("Program Absensi Perpustakaan");
        System.out.println("============================");
        System.out.println("1. Absensi Mahasiswa ");
        System.out.println("2. Absensi Dosen ");
        System.out.println("3. Exit ");
        System.out.print("Masukkan Pilihan Anda = ");
        Scanner inputUser = new Scanner(System.in);
        menu = inputUser.nextInt();

        switch (menu) {
            case 1 -> {
                int pilihanMahasiswa;
                System.out.println("Mahasiswa");
                System.out.println("1.Yohanes Edu Parlaungan Ritonga");
                System.out.println("2.Aldo Wijaya ");
                System.out.println("3.Muhammad Lazim Hasan ");
                System.out.println("Masukkan angka sesuai dengan nama Anda = ");
                pilihanMahasiswa = inputUser.nextInt();
                if (pilihanMahasiswa == 1) {
                    edu.absen();
                }else if(pilihanMahasiswa == 2){
                    aldo.absen();
                }else if(pilihanMahasiswa == 3){
                    lazim.absen();
                }else{
                    System.out.println("Masukkan yang Anda berikan salah");
                }
            }
            case 2 -> {
                System.out.println("Dosen");
                int pilihanDosen;
                System.out.println("1.Yessi Mulyani");
                System.out.println("2.Mardiana");
                System.out.println("3.Puput Budi Wintoro ");
                System.out.println("Masukkan angka sesuai dengan nama Anda = ");
                pilihanDosen = inputUser.nextInt();
            }
            case 3 -> {
                System.out.println("keluar");
                System.out.println("======");
            }
            default -> {
                System.out.println("eroor");
                System.out.println("======");}
        }


    }
}
