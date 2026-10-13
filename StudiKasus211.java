import java.util.Scanner;
import java.util.Locale;

public class StudiKasus211 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = input.nextLine();

        System.out.print(
            "Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : "
        );
        String jenis = input.nextLine().trim().toUpperCase(Locale.ROOT);

        if (jenis.equals("BELMAWA")
                || jenis.equals("BAKORMA")
                || jenis.equals("MANDIRI")) {

            System.out.print("Peringkat juara (0 jika bukan juara) : ");
            int juara = Integer.parseInt(input.nextLine());

            if (juara >= 1 && juara <= 3) {
                System.out.print("Jumlah dokumen (0-4) : ");
                int dokumen = Integer.parseInt(input.nextLine());

                if (dokumen == 4) {
                    System.out.println(
                        "Status: Berhak memperoleh dana penghargaan."
                    );
                } else {
                    System.out.println(
                        "Status: Dokumen tidak lengkap (kurang "
                        + (4 - dokumen)
                        + " dokumen). Dana penghargaan tidak diberikan."
                    );
                }
            } else {
                System.out.println(
                    "Status: Tidak memperoleh dana penghargaan "
                    + "(hanya untuk Juara 1/2/3)."
                );
            }

        } else if (jenis.equals("PKM")) {

            System.out.print(
                "Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : "
            );
            int pendanaan = Integer.parseInt(input.nextLine());

            if (pendanaan == 1) {
                System.out.print("Jumlah dokumen (0-4) : ");
                int dokumen = Integer.parseInt(input.nextLine());

                if (dokumen == 4) {
                    System.out.println(
                        "Status: Berhak memperoleh dana penghargaan "
                        + "(PKM lolos pendanaan)."
                    );
                } else {
                    System.out.println(
                        "Status: Dokumen tidak lengkap (kurang "
                        + (4 - dokumen)
                        + " dokumen). Dana penghargaan tidak diberikan."
                    );
                }
            } else {
                System.out.println(
                    "Status: Tidak memperoleh dana penghargaan "
                    + "(PKM tidak lolos pendanaan)."
                );
            }

        } else {
            System.out.println(
                "Status: Tidak memperoleh dana penghargaan "
                + "(jenis kegiatan tidak termasuk ketentuan)."
            );
        }

        input.close();
    }
}