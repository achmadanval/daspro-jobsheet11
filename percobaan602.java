import java.util.Scanner;

public class percobaan602 {

    static int hitungLuas (int pjg, int lb){// fungsi hitung luas
        int Luas = pjg*lb;
        return Luas;
    }
    static int hitungVolume (int a, int b,int tinggi){// fungsi hitung luas
        int Volume = hitungLuas(a, b) * tinggi;
        return Volume;
    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int p,l,t,L,vol;
        
        System.out.println("Masukkan panjang");
        p=input.nextInt();
        System.out.println("Masukkan lebar");
        l=input.nextInt();
        System.out.println("Masukkan tinggi");
        t=input.nextInt();
        
        L=hitungLuas(p, L);
        System.out.println("Luas persegi panjang adalah : " +L);
        vol= hitungVolume(L, vol, t)
        System.out.println("Luas persegi panjang adalah : " +vol);
    }
}