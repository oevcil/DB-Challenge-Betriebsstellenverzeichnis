package com.example.betriebsstellenverzeichnis;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Die Klasse Betriebsstellenverzeichnis.
 * Stellt alle notwendigen Methoden, wie Setter und Getter bereit.
 */
public class Betriebsstellenverzeichnis {

    private String plc;
    private String rL100_Code;
    private String rL100_Langname;
    private String rL100_Kurzname;
    private String typKurz;
    private String typLang;
    private String betriebszustand;
    private String datumAb;
    private String datumBis;
    private String niederlassung;
    private String regionalbereich;
    private String letzteAEnderung;


    public Betriebsstellenverzeichnis(Betriebsstellenverzeichnis b){
        this.plc = b.plc;
        this.rL100_Code = b.rL100_Code;
        this.rL100_Langname = b.rL100_Langname;
        this.rL100_Kurzname = b.rL100_Kurzname;
        this.typKurz = b.typKurz;
        this.typLang = b.typLang;
        this.betriebszustand = b.betriebszustand;
        this.datumAb = b.datumAb;
        this.datumBis = b.datumBis;
        this.niederlassung = b.niederlassung;
        this.regionalbereich = b.regionalbereich;
        this.letzteAEnderung = b.letzteAEnderung;
    }
    public Betriebsstellenverzeichnis(String s, String s0, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s10) {
        this.plc = s;
        this.rL100_Code = s0;
        this.rL100_Langname = s1;
        this.rL100_Kurzname = s2;
        this.typKurz = s3;
        this.typLang = s4;
        this.betriebszustand = s5;
        this.datumAb = s6;
        this.datumBis = s7;
        this.niederlassung = s8;
        this.regionalbereich = s9;
        this.letzteAEnderung = s10;
    }

    @JsonProperty("PLC")
    public String getPlc() {
        return plc;
    }
    @JsonProperty("PLC")
    public void setPlc(String plc) {
        this.plc = plc;
    }
    @JsonProperty("RL100_Code")
    public String getRL100Code() {
        return rL100_Code;
    }
    @JsonProperty("RL100_Code")
    public void setRL100Code(String rL100Code) {
        this.rL100_Code = rL100Code;
    }
    @JsonProperty("RL100_Langname")
    public String getRL100Langname() {
        return rL100_Langname;
    }
    @JsonProperty("RL100_Langname")
    public void setRL100Langname(String rL100Langname) {
        this.rL100_Langname = rL100Langname;
    }
    @JsonProperty("RL100_Kurzname")
    public String getRL100Kurzname() {
        return rL100_Kurzname;
    }
    @JsonProperty("RL100_Kurzname")
    public void setRL100Kurzname(String rL100Kurzname) {
        this.rL100_Kurzname = rL100Kurzname;
    }
    @JsonProperty("Typ Kurz")
    public String getTypKurz() {
        return typKurz;
    }
    @JsonProperty("Typ Kurz")
    public void setTypKurz(String typKurz) {
        this.typKurz = typKurz;
    }
    @JsonProperty("Typ Lang")
    public String getTypLang() {
        return typLang;
    }
    @JsonProperty("Typ Lang")
    public void setTypLang(String typLang) {
        this.typLang = typLang;
    }
    @JsonProperty("Betriebszustand")
    public String getBetriebszustand() {
        return betriebszustand;
    }
    @JsonProperty("Betriebszustand")
    public void setBetriebszustand(String betriebszustand) {
        this.betriebszustand = betriebszustand;
    }
    @JsonProperty("Datum ab")
    public String getDatumAb() {
        return datumAb;
    }
    @JsonProperty("Datum ab")
    public void setDatumAb(String datumAb) {
        this.datumAb = datumAb;
    }
    @JsonProperty("Datum bis")
    public String getDatumBis() {
        return datumBis;
    }
    @JsonProperty("Datum bis")
    public void setDatumBis(String datumBis) {
        this.datumBis = datumBis;
    }
    @JsonProperty("Niederlassung")
    public String getNiederlassung() {
        return niederlassung;
    }
    @JsonProperty("Niederlassung")
    public void setNiederlassung(String niederlassung) {
        this.niederlassung = niederlassung;
    }
    @JsonProperty("Regionalbereich")
    public String getRegionalbereich() {
        return regionalbereich;
    }
    @JsonProperty("Regionalbereich")
    public void setRegionalbereich(String regionalbereich) {
        this.regionalbereich = regionalbereich;
    }
    @JsonProperty("letzte Änderung")
    public String getLetzteAEnderung() {
        return letzteAEnderung;
    }
    @JsonProperty("letzte Änderung")
    public void setLetzteAEnderung(String letzteAEnderung) {
        this.letzteAEnderung = letzteAEnderung;
    }
}
