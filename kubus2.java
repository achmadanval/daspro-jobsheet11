import java.util.Scanner;

public class kubus2 {

    static int hitungVol(int s){
        int Vol = s*s*s;
        return Vol;
    }
    static int hitungluarpermukaan (int s){
        int LP = (s*s)*6;
        return LP;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s,lper,vol ;
        System.out.println("Masukkan panjang sisi : ");
        s = sc.nextInt();
        lper = hitungluarpermukaan(s);
        System.out.println("Luas permukaan kubus adalah : " + lper);
        vol = hitungVol(s);
        System.out.println("Volume kubus adalah  : " + vol);


    }
}