package com.example.betriebsstellenverzeichnis.controller;

import com.example.betriebsstellenverzeichnis.Betriebsstellenverzeichnis;
import com.example.betriebsstellenverzeichnis.BetriebsstellenverzeichnisApplication;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

/**
 * Dies ist die Klasse BetriebsstellenverzeichnisController, welche den RestController abbildet.
 * Diese Klasse stellt die Endpoints für die Abfrage bereit.
 */
@RestController
public class BetriebsstellenverzeichnisController {

    /*@GetMapping("/betriebsstelle")
    public String endpoint(){
        ArrayList<Betriebsstellenverzeichnis> arrayBSV = BetriebsstellenverzeichnisApplication.leseCVS();
        return arrayBSV.toString();
    }*/

    /**
     * Endpoint für URI /betriebsstelle/{id}
     * Nimmt die GET Anfragen für /betriebsstelle/{id} entgegen und prüft ob {id} vorhanden ist.
     * Falls dem so ist, wird ein JSON-Objekt zurückgegeben.
     * @param id Dynamischer Wert der sich aus der URI ergibt.
     * @return Gibt das Objekt im Responcebody mit allen Attributen im JSON-Format wieder.
     */
    @GetMapping("/betriebsstelle/{id}")
    @ExceptionHandler(Exception.class)
    public Betriebsstellenverzeichnis endpoint(@PathVariable String id){
        String lowerCaseRL100Code;
        ArrayList<Betriebsstellenverzeichnis> arrayBSV = BetriebsstellenverzeichnisApplication.leseCVS();

        for (Betriebsstellenverzeichnis b: arrayBSV){
            lowerCaseRL100Code = b.getRL100Code().toLowerCase();
            if(lowerCaseRL100Code.equals(id.toLowerCase())){
                return new Betriebsstellenverzeichnis(b);
            }
        }
        return null; //Besser wäre es hier eine Fehlermeldung zurückzugeben.
    }
}
