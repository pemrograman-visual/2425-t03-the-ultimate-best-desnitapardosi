// 12S24043 - Desnita Pardosi
// 12S24018 - Kelvin Yohanes Putra

import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String kodeisbn, judul, penulis, penerbit, formatbuku, jenisdiskon, conclusion;
        String keterangan;
        int tahunterbit, stok;
        double hargapembelian, minimummargin, rating;

        kodeisbn = input.nextLine();
        while (!kodeisbn.equals("---")) {
            judul = input.nextLine();
            penulis = input.nextLine();
            tahunterbit = Integer.parseInt(input.nextLine());
            penerbit = input.nextLine();
            formatbuku = input.nextLine();
            hargapembelian = Double.parseDouble(input.nextLine());
            minimummargin = Double.parseDouble(input.nextLine());
            if (-(minimummargin / hargapembelian) > 0.4) {
                jenisdiskon = "Once in a lifetime";
            } else {
                if (0.2 < -(minimummargin / hargapembelian) && minimummargin / hargapembelian < 0.4) {
                    jenisdiskon = "Never come twice";
                } else {
                    if (-(minimummargin / hargapembelian) <= 0.2 && -minimummargin / hargapembelian > 0) {
                        jenisdiskon = "No regret";
                    } else {
                        jenisdiskon = "---";
                    }
                }
            }
            stok = Integer.parseInt(input.nextLine());
            rating = Double.parseDouble(input.nextLine());
            if (rating >= 4.7) {
                keterangan = "Best Pick";
            } else {
                if (rating >= 4.5) {
                    keterangan = "Must Read";
                } else {
                    if (rating >= 4.0) {
                        keterangan = "Recommended";
                    } else {
                        if (rating >= 3.0) {
                            keterangan = "Average";
                        } else {
                            keterangan = "Low";
                        }
                    }
                }
            }
            if (jenisdiskon.equals("Once in a lifetime") && keterangan.equals("Best Pick")) {
                conclusion = "The ultimate best";
            } else {
                conclusion = "---";
            }
            System.out.println(kodeisbn + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbuku + "|" + hargapembelian + "|" + minimummargin + "|" + stok + "|" + toFixed(rating,1) + "|" + keterangan + "|" + jenisdiskon + "|" + conclusion);
            kodeisbn = input.nextLine();
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
