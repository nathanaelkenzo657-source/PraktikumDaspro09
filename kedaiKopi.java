import java.util.Scanner;
public class kedaiKopi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("Jumlah cup yang dibeli :");
        jumlahCup = sc.nextInt();
        System.out.print("Uang yang di bayar :");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup*hargaPerCup;
        diskon = 0;

        if (totalHarga >= 100000){
            diskon = totalHarga*10/100;
        }
        totalBayar = totalHarga - diskon;

        System.out.print("Total harga :"+ totalHarga);
        System.out.print("Total diskon :"+ diskon);
        System.out.print("Total bayar :"+ totalBayar);

        if (uangBayar >= totalBayar){
            kembalian = uangBayar - totalBayar;
            System.out.print("Kembalian :"+ kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.print("Uang tidak cukup, kurang Rp."+ kurang);
        }




    }
}
