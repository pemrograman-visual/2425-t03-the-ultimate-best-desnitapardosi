// 12S24043 - desnita pardosi
// 12S24018 - kelvin yohannes

import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String kodeisbn, judul, penulis, penerbit, formatbuku, diskon, tub;
        String keterangan;
        int tahunterbit, stok;
        double hargapembelian, minimummargin, rating, kategoridiskon;

        do {
            kodeisbn = input.nextLine();
            if (kodeisbn.equals("---")) {
            } else {
                judul = input.nextLine();
                penulis = input.nextLine();
                tahunterbit = Integer.parseInt(input.nextLine());
                penerbit = input.nextLine();
                formatbuku = input.nextLine();
                hargapembelian = Double.parseDouble(input.nextLine());
                minimummargin = Double.parseDouble(input.nextLine());
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
                                keterangan = "low";
                            }
                        }
                    }
                }
                kategoridiskon = minimummargin / hargapembelian * -1;
                if (kategoridiskon >= (double) 40 / 100) {
                    diskon = "Once in a lifetime";
                } else {
                    if (kategoridiskon >= (double) 20 / 100) {
                        diskon = "Never come twice";
                    } else {
                        if (kategoridiskon >= 0) {
                            diskon = "No regret";
                        } else {
                            diskon = "---";
                        }
                    }
                }
                if (kategoridiskon == "Best Pick" && diskon.equals("Once in a lifetime")) {
                    tub = "The ultimate best";
                } else {
                    tub = "---";
                }
                System.out.println(kodeisbn + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbuku + "|" + hargapembelian + "|" + minimummargin + "|" + stok + "|" + toFixed(rating,1) + "|" + keterangan + "|" + kategoridiskon + "|" + diskon + "|" + tub);
            }
        } while (!kodeisbn.equals("---"));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
