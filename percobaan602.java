import java.util.Scanner;

public class percobaan602 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int p,l,t,L,vol;
        
        System.out.println("Masukkan panjang");
        p=input.nextInt();
        System.out.println("Masukkan lebar");
        l=input.nextInt();
        System.out.println("Masukkan tinggi");
        t=input.nextInt();
        
        L=p*l;
        System.out.println("Luas persegi panjang adalah : " +L);
        vol = p*l*t;
        System.out.println("Volume persegi panjang adalah : " + vol);
    }
   