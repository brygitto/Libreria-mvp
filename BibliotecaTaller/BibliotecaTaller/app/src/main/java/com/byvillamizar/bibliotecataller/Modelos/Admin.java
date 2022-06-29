package com.byvillamizar.bibliotecataller.Modelos;


public class Admin {
    String id;
    String correodmin = "admin@wposs.com";
    String claveadmin = "123456";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCorreodmin() {
        return correodmin;
    }

    public void setCorreodmin(String correodmin) {
        this.correodmin = correodmin;
    }

    public String getClaveadmin() {
        return claveadmin;
    }

    public void setClaveadmin(String claveadmin) {
        this.claveadmin = claveadmin;
    }
}