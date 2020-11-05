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
 * Deskripsi Program : Program ini berisi user login dengan metode pendekatan objek 
 */
import java.util.Scanner;
public class Login {

    private static String userName, passWord;
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Username = ");
        userName = input.next ();
        
        System.out.print("Masukkan Password = ");
        passWord = input.next();
        System.out.println();
        User login = new User();
        login.pengecekanLogin(userName, passWord);
    }
    
}
