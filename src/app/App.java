package app;


import com.KotakUang;
import com.KotakUang2;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class App {

    public static void main(String[] args) {
        App a = new App();
        a.run();
    }

    private void run() {
        KotakUang k = new KotakUang();
        DecimalFormat kursIndo = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndo.setDecimalFormatSymbols(formatRp);

//        k.setN100rb(34);
//        System.out.println(k.getN100rb());
//        System.out.println("Jumlahan pecahan Rp. 100.000 sebanyak  " + k.getN100rb() +
//                " lembar. Maka total uang Rp. 100.000 adalah "+ kursIndo.format(k.calc100rb()));
//        k.setN50rb(1);
//        System.out.println("Jumlahan pecahan Rp. 50.000 adalah : " + kursIndo.format(k.calc50rb()));
//        k.setN20rb(2);
//        System.out.println("Jumlah pecahan Rp. 20.000 adalah : " + kursIndo.format(k.calc20rb()));
//        System.out.println(kursIndo.format(k.total()));

        KotakUang2 k2 = new KotakUang2();
        k2.setJml100rb(524245222);
        k2.setJml50rb(15);
        System.out.println(kursIndo.format(k2.total()));



    }
}
