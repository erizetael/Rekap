package com;


import java.math.BigDecimal;

public class KotakUang2 {
    public KotakUang2() {

    }

    private BigDecimal n100rb = new BigDecimal("100000");
    private BigDecimal n50rb = new BigDecimal("50000");
    private BigDecimal n20rb = new BigDecimal("20000");
    private BigDecimal n10rb = new BigDecimal("10000");
    private BigDecimal n5rb = new BigDecimal("5000");
    private BigDecimal n2rb = new BigDecimal("2000");
    private BigDecimal n1rb = new BigDecimal("1000");
    private BigDecimal n5rts = new BigDecimal("500");
    private BigDecimal n2rts = new BigDecimal("200");
    private BigDecimal n1rts = new BigDecimal("100");

    private int jml100rb = 0;
    private int jml50rb = 0;




/** ini pengali*/

    public int getJml100rb() {
        return jml100rb;
    }

    public void setJml100rb(int jml100rb) {
        this.jml100rb = jml100rb;
    }

    public int getJml50rb() {
        return jml50rb;
    }

    public void setJml50rb(int jml50rb) {
        this.jml50rb = jml50rb;
    }

    /** method jumlah total*/

    public BigDecimal calc100rb() {
        return n100rb.multiply(BigDecimal.valueOf(jml100rb));
    }

    public BigDecimal calc50rb() {
        return n50rb.multiply(BigDecimal.valueOf(jml50rb));
    }

    public BigDecimal total() {
        return calcTotal();
    }

    private BigDecimal calcTotal() {
        return calc100rb().add(calc50rb());

    }
}

