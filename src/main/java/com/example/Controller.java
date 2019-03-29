package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class Controller {
    @Autowired
    HrPayRollService hrPayRollService;

    //State Table//
    @PostMapping(value = "/InsertState", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> Insert(@RequestBody HashMap<String, String> insertBody)  {
        return hrPayRollService.InsertState(insertBody.get("QueryType"),
                insertBody.get("StateName"),
                insertBody.get("CreatedBy"),
                insertBody.get("UpdatedBy"),
                Integer.valueOf(insertBody.get("CountryID")),
                Integer.valueOf(insertBody.get("StateID")));

    }

    @PostMapping(value = "/UpdateState", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UpdateState(@RequestBody HashMap<String, String> updateBody) {
        return hrPayRollService.UpdateState(updateBody.get("QueryType"),
                updateBody.get("StateName"),
                updateBody.get("CreatedBy"),
                updateBody.get("UpdatedBy"),
                Integer.valueOf(updateBody.get("CountryID")),
                Integer.valueOf(updateBody.get("StateID")));
        //////new commit
///comitted by ankit
    }
    @PostMapping(value = "/DeleteState", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteState(@RequestBody HashMap<String, String> deleteBody)  {
        return hrPayRollService.DeleteState(deleteBody.get("QueryType"),
                deleteBody.get("StateName"),
                deleteBody.get("CreatedBy"),
                deleteBody.get("UpdatedBy"),
                Integer.valueOf(deleteBody.get("CountryID")),
                Integer.valueOf(deleteBody.get("StateID")));

    }

// City Table//
    @PostMapping(value = "/InsertCity", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> InsertCity(@RequestBody HashMap<String, String> insertCityBody)  {
        return hrPayRollService.InsertCity(insertCityBody.get("QueryType"),
                insertCityBody.get("CityName"),
                insertCityBody.get("CreatedBy"),
                insertCityBody.get("UpdatedBy"),
                Integer.valueOf(insertCityBody.get("StateID")),
                Integer.valueOf(insertCityBody.get("CityID")));

    }
    @PostMapping(value = "/UpdateCity", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UpdateCity(@RequestBody HashMap<String, String> upadteCityBody)  {
        return hrPayRollService.UpdateCity(upadteCityBody.get("QueryType"),
                upadteCityBody.get("CityName"),
                upadteCityBody.get("CreatedBy"),
                upadteCityBody.get("UpdatedBy"),
                Integer.valueOf(upadteCityBody.get("StateID")),
                Integer.valueOf(upadteCityBody.get("StateID")));

    }
    @PostMapping(value = "/DeleteCity", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteCity(@RequestBody HashMap<String, String> upadteCityBody)  {
        return hrPayRollService.DeleteCity(upadteCityBody.get("QueryType"),
                upadteCityBody.get("CityName"),
                upadteCityBody.get("CreatedBy"),
                upadteCityBody.get("UpdatedBy"),
                Integer.valueOf(upadteCityBody.get("StateID")),
                Integer.valueOf(upadteCityBody.get("StateID")));
    @PostMapping(value="/insertCountryData")
    public HashMap<String, String> insertCountryData(@RequestBody HashMap<String,String> loginBody)
    {
        return  hrPayRollService.insertCountryData( loginBody.get("QueryType"),
                Integer.valueOf(loginBody.get("CountryID")),
                loginBody.get("CountryName"),
                loginBody.get("CountryCode"),
                loginBody.get("CreatedBy"),
                loginBody.get("UpdatedBy")

        );
    }

    @PostMapping(value="/updateCountryData")
    public HashMap<String, String> updateCountryData(@RequestBody HashMap<String,String> loginBody)
    {
        return  hrPayRollService.updateCountryData( loginBody.get("QueryType"),
                Integer.valueOf(loginBody.get("CountryID")),
                loginBody.get("CountryName"),
                loginBody.get("CountryCode"),
                loginBody.get("CreatedBy"),
                loginBody.get("UpdatedBy")

        );
    }

    @PostMapping(value="/deleteCountryData")
    public HashMap<String, String> deleteCountryData(@RequestBody HashMap<String,String> loginBody)
    {
        return  hrPayRollService.updateCountryData( loginBody.get("QueryType"),
                Integer.valueOf(loginBody.get("CountryID")),
                loginBody.get("CountryName"),
                loginBody.get("CountryCode"),
                loginBody.get("CreatedBy"),
                loginBody.get("UpdatedBy")

        );
        ////Commit BY Lalit
    }

    }
//////new commit
///comitted by ankit
}
