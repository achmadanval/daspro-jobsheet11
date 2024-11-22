import java.util.Scanner;

public class cafeMariana2 {

    static int [][] penjualan = new int [7][5];
    static String [] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
    
        public static void dataPenjualan(){
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 7; i++) {
                System.out.println("Masukkan data yang ingin di input hari ke "+(i+1)+ " : ");
                for (int j = 0; j < 5 ; j++) {
                    System.out.print("Jumlah penjualan "+ menu[j]+ " :");
                    penjualan[i][j] = sc.nextInt();
                }
            }
        }
        public static void rekapPenjualan(){
            System.out.println("Rekap penjualan dari hai ke 1 sampai hari ke 7 : ");
            for (int i = 0; i < 7; i++) {
                System.out.print("\nHari ke -" + (i+1) + " = ");
                for (int j = 0; j < 5; j++) {
                    System.out.print(menu[j]+" : " + penjualan[i][j]+ "       ");
                }
            }
        }
        public static void menuTertinggi(){
            int[] totalPenjualan = new int[5];
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 5; j++) {
                    totalPenjualan[j] += penjualan[i][j];
                }
            }
            int menuTertinggi1 = 0;
            for (int j = 0; j < totalPenjualan.length; j++) {
                if (totalPenjualan[j] > totalPenjualan[menuTertinggi1] ) {
                    menuTertinggi1 = j;
                }
            }
            System.out.println("\nMenu dengan penjualan tertinggi  :  " + menu[menuTertinggi1] + " dengan total penjualan = " + totalPenjualan[menuTertinggi1]);
        }
        public static void rata2Penjualan(){
            for (int i = 0; i < 5; i++) {
                int totalPenjualanPerMenu=0;
                for (int j = 0; j < 7; j++) {
                    totalPenjualanPerMenu += penjualan[j][i];
                }
                double rata2 = totalPenjualanPerMenu / 7;
                System.out.println("Rata rata penjualan " + menu[i]+ " :" + rata2);
            }
        }
    public static void main (String[]args){
        dataPenjualan();
        rekapPenjualan();
        menuTertinggi();
        rata2Penjualan();
    }
}