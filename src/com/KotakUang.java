package com;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class KotakUang {

    private int n100rb;
    private int n50rb;
    private int n20rb;
    private int n10rb;
    private int n5rb;
    private int n2rb;
    private int n1rb;
    private int n5rts;
    private int n2rts;
    private int n1rts;




    public KotakUang(){

    }

    public void setN100rb(int n100rb) {
        this.n100rb = n100rb;
    }

    public void setN50rb(int n50rb) {
        this.n50rb = n50rb;
    }

    public void setN20rb(int n20rb) {
        this.n20rb = n20rb;
    }

    public void setN10rb(int n10rb) {
        this.n10rb = n10rb;
    }

    public void setN5rb(int n5rb) {
        this.n5rb = n5rb;
    }

    public void setN2rb(int n2rb) {
        this.n2rb = n2rb;
    }

    public void setN1rb(int n1rb) {
        this.n1rb = n1rb;
    }

    public void setN5rts(int n5rts) {
        this.n5rts = n5rts;
    }

    public void setN2rts(int n2rts) {
        this.n2rts = n2rts;
    }

    public void setN1rts(int n1rts) {
        this.n1rts = n1rts;
    }

    public int getN100rb() {
        return n100rb;
    }

    public int getN50rb() {
        return n50rb;
    }

    public int getN20rb() {
        return n20rb;
    }

    public int getN10rb() {
        return n10rb;
    }

    public int getN5rb() {
        return n5rb;
    }

    public int getN2rb() {
        return n2rb;
    }

    public int getN1rb() {
        return n1rb;
    }

    public int getN5rts() {
        return n5rts;
    }

    public int getN2rts() {
        return n2rts;
    }

    public int getN1rts() {
        return n1rts;
    }

    public BigDecimal calc100rb() {


        return new BigDecimal("100000").multiply(BigDecimal.valueOf(n100rb));
    }

    public BigDecimal calc50rb() {
        return new BigDecimal("50000").multiply(BigDecimal.valueOf(n50rb));
    }

    public BigDecimal calc20rb() {
        return new BigDecimal("20000").multiply(BigDecimal.valueOf(n20rb).setScale(0, RoundingMode.HALF_EVEN));
    }

    public BigDecimal calc10rb() {
        return new BigDecimal("").multiply(BigDecimal.valueOf(n10rb));
    }

    public BigDecimal calc5rb() {
        return new BigDecimal("5000").multiply(BigDecimal.valueOf(n5rb));
    }

    public BigDecimal calc2rb() {
        return new BigDecimal("2000").multiply(BigDecimal.valueOf(n2rb));
    }

    public BigDecimal calc1rb() {
        return new BigDecimal("1000").multiply(BigDecimal.valueOf(n1rb));
    }

    public BigDecimal calc5rts() {
        return new BigDecimal("500").multiply(BigDecimal.valueOf(n5rts));    }

    public BigDecimal calc2rts() {
        return new BigDecimal("200").multiply(BigDecimal.valueOf(n2rts));
    }

    public BigDecimal calc1rts() {
        return new BigDecimal("100").multiply(BigDecimal.valueOf(n1rts));
    }


    public BigDecimal total() {
       BigDecimal total =
            calc100rb()
               .add(calc50rb())
                    .add(calc20rb())
//                        .add(calc10rb())
//                            .add(calc5rb())
//            .add(calc2rb())
//                .add(calc1rb())
//                    .add(calc5rts())
//                        .add(calc2rts())
//                            .add(calc1rts())
 ;
       return total;
    }
}
