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

    @PostMapping(value = "/Insert", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> Insert(@RequestBody HashMap<String, String> loginBody)  {
        return hrPayRollService.Insert(loginBody.get("QueryType"),
                loginBody.get("StateName"),
                loginBody.get("CreatedBy"),
                loginBody.get("UpdatedBy"),
                Integer.valueOf(loginBody.get("CountryID")),
                Integer.valueOf(loginBody.get("StateID")));

    }

    @PostMapping(value = "/UPDATE", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UPDATE(@RequestBody HashMap<String, String> loginBody) {
        return hrPayRollService.UPDATE(loginBody.get("QueryType"),
                loginBody.get("StateName"),
                loginBody.get("CreatedBy"),
                loginBody.get("UpdatedBy"),
                Integer.valueOf(loginBody.get("CountryID")),
                Integer.valueOf(loginBody.get("StateID")));
        //////new commit
///comitted by ankit
    }


    @PostMapping(value = "/insertDataForCity", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> insertDataForCity(@RequestBody HashMap<String, String> loginBody)  {
        return hrPayRollService.insertDataForCity(loginBody.get("CityName"),
                loginBody.get("CreatedBy"),
                loginBody.get("UpdatedBy"),
                Integer.valueOf(loginBody.get("StateID")));

    }
    @PostMapping(value="/insertCountryData")
    public HashMap<String, String> insertCountryData(@RequestBody HashMap<String,String> loginBody)
    {
        return  hrPayRollService.insertCountryData(Integer.valueOf(loginBody.get("CountryID")),
                loginBody.get("CountryName"),
                loginBody.get("CountryCode"),
                loginBody.get("CreatedBy"),
                loginBody.get("UpdatedBy"),
                loginBody.get("QueryType"));
    }

    @PostMapping(value="/updateCountryData")
    public HashMap<String, String> updateCountryData(@RequestBody HashMap<String,String> loginBody)
    {
        return  hrPayRollService.updateCountryData(Integer.valueOf(loginBody.get("CountryID")),
                loginBody.get("CountryName"),
                loginBody.get("CountryCode"),
                loginBody.get("CreatedBy"),
                loginBody.get("UpdatedBy"),
                loginBody.get("QueryType")
        );
    }

    @PostMapping(value="/deleteCountryData")
    public HashMap<String, String> deleteCountryData(@RequestBody HashMap<String,String> loginBody)
    {
        return  hrPayRollService.updateCountryData(Integer.valueOf(loginBody.get("CountryID")),
                loginBody.get("CountryName"),
                loginBody.get("CountryCode"),
                loginBody.get("CreatedBy"),
                loginBody.get("UpdatedBy"),
                loginBody.get("QueryType")
        );
        ////Commit BY Lalit
    }

}
