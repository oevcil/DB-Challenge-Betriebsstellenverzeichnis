package com.example.betriebsstellenverzeichnis.controller;

import com.example.betriebsstellenverzeichnis.Betriebsstellenverzeichnis;
import org.springframework.web.bind.annotation.*;

import java.io.*;
import java.util.ArrayList;


@RestController
public class BetriebsstellenverzeichnisController {

    //Betriebsstellenverzeichnis b = new Betriebsstellenverzeichnis();

    @GetMapping("/")
    public String endpoint(){
        return "{}";
    }

    @GetMapping("/betriebsstelle")
    public String ausgabe(){
        ArrayList<Betriebsstellenverzeichnis> arrayBSV = leseCVS();
        return arrayBSV.toString();
    }

    @GetMapping("/betriebsstelle/{id}")
    @ExceptionHandler(Exception.class)
    public Betriebsstellenverzeichnis ausgabe(@PathVariable String id){

        ArrayList<Betriebsstellenverzeichnis> arrayBSV = leseCVS();

        for (Betriebsstellenverzeichnis b: arrayBSV){
            String lowerCaseRL100Cod = b.getRL100Code().toLowerCase();
            if(lowerCaseRL100Cod.equals(id.toLowerCase())){
                return new Betriebsstellenverzeichnis(b);
            }
        }
        return null;
    }

    protected ArrayList<Betriebsstellenverzeichnis> leseCVS(){

        ArrayList<Betriebsstellenverzeichnis> arrayBSV = new ArrayList<>();
        String pfad = "DBNetz-Betriebsstellenverzeichnis-Stand2021-10.csv";

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


        /*try {
            List<String> alleZeilen = Files.readAllLines(Paths.get(pfad));
            for (String zeile : alleZeilen) {
                String[] aufteilung = zeile.split(";");
                for (int i = 0; i < aufteilung.length; i++){
                    if(aufteilung[i].equals("")){
                        aufteilung[i] = null;
                    }
                }
                Betriebsstellenverzeichnis bsv = new Betriebsstellenverzeichnis(aufteilung[0], aufteilung[1], aufteilung[2], aufteilung[3], aufteilung[4], aufteilung[5], aufteilung[6], aufteilung[7], aufteilung[8], aufteilung[9], aufteilung[10], aufteilung[11]);
                arrayBSV.add(bsv);
            }
        } catch (FileNotFoundException fnfex){
            System.out.println(fnfex.getMessage());
        } catch (IOException ioex){
            System.out.println(ioex.getMessage());
        }*/
        return arrayBSV;
    }
}
