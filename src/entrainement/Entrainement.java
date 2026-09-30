/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entrainement;

/**
 * @author mfontaine5
 */
import java.util.Scanner;
public class Entrainement {
    
    public static void main(String[] args) {
        /* Exo 2
        
        System.out.println("Message ligne 1");
        System.out.println("Message ligne 2"); */
        /* Exo 4 
        
        Scanner wp = new Scanner(System.in);
        System.out.println("Saisir x :");
        int x = wp.nextInt() ;
        System.out.println("Saisir y :");
        int y = wp.nextInt() ;
        int temp = y ;
        System.out.println("Avant permutation : x="+x+" y="+y);
        y = x ;
        x = temp ;
        System.out.println("Apres permutation : x="+x+" y="+y); */
        /* EXO 5
        Scanner wp = new Scanner(System.in);
        System.out.println("Saisir a :");
        int a = wp.nextInt() ;
        System.out.println("Saisir b :");
        int b = wp.nextInt() ;
        int temp = (a*b)*2 ; 
        System.out.println(temp); */
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir le mot de passe : ");
        String texte = sc.nextLine();
        String mdp = "admin123" ;
        while (!texte.equals(mdp))
        {
            System.out.print("Mot de passe incorrect "); 
            System.out.print("Mot de passe : ");
            texte = sc.nextLine();
        }

        
        
        
        
        
        
        
    }
    
}
