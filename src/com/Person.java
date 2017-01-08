package com;

public class Person {
    private String firsName;
    private String lastName;
    private Person ibu;
    private Person bapak;

    public Person getBapak() {
        return bapak;
    }

    public void setBapak(Person bapak) {
        this.bapak = bapak;
    }

    public Person getIbu() {
        return ibu;
    }

    public void setIbu(Person ibu) {
        this.ibu = ibu;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullname() {
        return firsName+ " " +lastName;
    }
}
