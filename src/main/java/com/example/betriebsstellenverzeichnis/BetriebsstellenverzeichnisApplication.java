package com.example.betriebsstellenverzeichnis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* TODO:
* - Kommentieren
* - Optik
* - Git pushen
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
    /**
     * Das Programm BetriebsstellenverzeichnisApplication.
     * @param args Es werden keine weiteren Argumente eingelesen.
     */
    public static void main(String[] args) {
        SpringApplication.run(BetriebsstellenverzeichnisApplication.class, args);
    }


}
