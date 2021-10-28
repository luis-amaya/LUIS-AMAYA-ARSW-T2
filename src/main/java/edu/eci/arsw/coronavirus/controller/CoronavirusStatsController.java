package edu.eci.arsw.coronavirus.controller;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;

import edu.eci.arsw.coronavirus.services.CoronavirusStatsServices;

/**
 * @author Luis Amaya
 */
@RestController
public class CoronavirusStatsController {

    @Autowired
    CoronavirusStatsServices coronavirusStatsServices;

    /**
     * @param country Country to search Covid-19 cases
     * @return ResponseEntity<?>
     */
    @RequestMapping(value = "/cases/{country}", method = RequestMethod.GET)
    public ResponseEntity<?> getCasesByCountry(@PathVariable(name = "country") String country) {
        try {
            return new ResponseEntity<>(coronavirusStatsServices.getCasesByCountry(country), HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al buscar los casos en: " + country, HttpStatus.BAD_REQUEST);
        }
    }
}
