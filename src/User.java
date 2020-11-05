/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * Nama  : Diva Sabila Ramadhan 
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : Program berisi class User
 */
public class User {
    private final String USERNAME = "DivaSabilaRamadhan";
    private final String PASSWORD = "terbaikselalu";
    private boolean statusAkun;
    
    private boolean cekAkun(String parUserName, String parPassword){
        if(USERNAME.equals(parUserName) && PASSWORD.equals(parPassword)){
            statusAkun = true;
        } else {
            statusAkun = false;
        }
        return statusAkun;
    }
    
    private void hasilLogin(boolean status, String parUserName){
        if(status){
            System.out.println("******HALLO".concat(parUserName.toUpperCase()).concat("******"));
            System.out.println("Selamat Datang Di Aplikasi Ini.");
        } else {
            System.out.println("Ooops, Userame atau Password Anda Salah.");
        }
    }
    
    public void pengecekanLogin(String parUserName, String parPassword){
        cekAkun(parUserName, parPassword);
        hasilLogin(statusAkun, parUserName);
    }
}


