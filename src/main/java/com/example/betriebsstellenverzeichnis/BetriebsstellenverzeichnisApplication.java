package com.example.betriebsstellenverzeichnis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.util.ArrayList;

/*
* TODO:
* - Kommentieren
* - Code cleanen
* Optional:
* -Logging integrieren
* -Exception hinzufügen.
* -Datum formatieren.
* -Sonderzeichen
* */

/**
 *Diese Klasse stellt den Einstiegspunkt in das Programm dar.
 *Die Klasse beinhaltet die main-Methode, mit der das Programm gestartet wird.
 */
@SpringBootApplication
public class BetriebsstellenverzeichnisApplication {
    public static String PATH;
    /**
     * Das Programm BetriebsstellenverzeichnisApplication.
     * @param args Es werden keine weiteren Argumente eingelesen.
     */
    public static void main(String[] args) {
        PATH = args[0];
        SpringApplication.run(BetriebsstellenverzeichnisApplication.class, args);
    }

    /**
     * Die Methode leseCVS liest eine CVS Datei ein und erstellt ein Objekt.
     * Die Methode leseCVS liest eine CVS Datei ein.
     * Daraufhin wird ein Objekt erstellt vom Typ Betriebsstellenverzeichnis. Alle Felder die leer sind, in der CVS Datei, werden mit dem Wert null aufgefüllt.
     * Das generierte Objekt wird in eine ArrayList gespeichert, welche zurückgegeben wird.
     * @return arrayBSV
     */
    public static ArrayList<Betriebsstellenverzeichnis> leseCVS(){

        ArrayList<Betriebsstellenverzeichnis> arrayBSV = new ArrayList<>();
        String pfad = BetriebsstellenverzeichnisApplication.PATH;

        File datei = new File(pfad);

        try{
            FileReader fileReader = new FileReader(datei);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            for(String zeile = bufferedReader.readLine(); zeile != null; zeile = bufferedReader.readLine()){
                String[] zeilenZuWerte = zeile.split(";");
                for (int i = 0; i < zeilenZuWerte.length; i++){
                    if(zeilenZuWerte[i].equals("")){
                        zeilenZuWerte[i] = null;
                    }
                }
                Betriebsstellenverzeichnis bsv = new Betriebsstellenverzeichnis(zeilenZuWerte[0], zeilenZuWerte[1], zeilenZuWerte[2], zeilenZuWerte[3], zeilenZuWerte[4], zeilenZuWerte[5], zeilenZuWerte[6], zeilenZuWerte[7], zeilenZuWerte[8], zeilenZuWerte[9], zeilenZuWerte[10], zeilenZuWerte[11]);
                arrayBSV.add(bsv);
            }

            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return arrayBSV;
    }


}
