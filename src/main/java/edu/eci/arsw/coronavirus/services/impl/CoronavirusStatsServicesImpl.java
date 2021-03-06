package edu.eci.arsw.coronavirus.services.impl;

import java.io.IOException;

import com.mashape.unirest.http.exceptions.UnirestException;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.eci.arsw.coronavirus.services.CoronavirusStatsServices;
import edu.eci.arsw.coronavirus.services.HttpConnectionService;

/**
 * @author Luis Amaya
 */
@Service
public class CoronavirusStatsServicesImpl implements CoronavirusStatsServices {

    @Autowired
    HttpConnectionService httpService;

    /**
     * 
     */
    public CoronavirusStatsServicesImpl() {
    }

    /**
     * @param country
     * @return JSONObject
     * @throws UnirestException
     * @throws IOException
     */
    @Override
    public JSONObject getCasesByCountry(String country) throws UnirestException, IOException {
        JSONObject countryCases = httpService.connection(country);
        return countryCases;
    }

}
