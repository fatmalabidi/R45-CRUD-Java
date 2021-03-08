/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuration;

/**
 *
 * @author Rasyid Rafi
 */
public class Configure {
    public static String namaDatabase = "db_pbo";
    
    // == LOGIN ==
    // Masukkan nama tabel untuk login
    public static String namaTabel = "login";
    public static String namaTabelUsername = "username";
    public static String namaTabelPassword = "password";
    // == End of LOGIN ==
    
    // == BIODATA ==
    // Masukkan nama tabel untuk Biodata
    public static String namaTabelData = "siswa";
    //Masukkan nama kolom di dalam tabel Biodata
    public static String namaNis = "nis";
    public static String namaNama = "nama";
    public static String namaJurusan = "jurusan";
    public static String namaAlamat = "alamat";
    public static String namaNomor = "nomor";
    // == End of BIODATA ==
}
