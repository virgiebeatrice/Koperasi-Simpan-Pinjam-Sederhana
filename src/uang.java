/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class uang {
    public String nl, al, pkj, tgl, np, ang;
    public double jml, bln, str, sal, uy, sal12;

    public String getNl() {
        return nl;
    }

    public void setNl(String val) {
        this.nl = val;
    }

    public String getAl() {
        return al;
    }

    public void setAl(String val) {
        this.al = val;
    }

    public String getPkj() {
        return pkj;
    }

    public void setPkj(String val) {
        this.pkj = val;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String val) {
        this.tgl = val;
    }

    public String getNp() {
        return np;
    }

    public void setNp(String val) {
        this.np = val;
    }

    public String getAng() {
        return ang;
    }

    public void setAng(String val) {
        this.ang = val;
    }

    public double getJml() {
        return jml;
    }

    public double getBln() {
        return bln;
    }

    public void setBln(double val) {
        this.bln = val;
    }

    public double getStr() {
        return str;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double val) {
        this.sal = val;
    }

    public double getUy() {
        return uy;
    }

    public void setUy(double val) {
        this.uy = val;
    }

    public double getSal12() {
        return sal12;
    }
    
    public void setSeleksiAngsuran() {
        if(ang.equalsIgnoreCase("1")) {
            bln = 1;
        }
        else if(ang.equalsIgnoreCase("6")) {
            bln = 6;
        }
        else if(ang.equalsIgnoreCase("12")) {
            bln = 12;
        }
        else if(ang.equalsIgnoreCase("18")) {
            bln = 18;
        }
        else {
            bln = 0;
        }
    }
}
