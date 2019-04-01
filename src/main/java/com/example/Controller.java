package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class Controller {
    @Autowired
    HrPayRollService hrPayRollService;


    //State Table//
    @PostMapping(value = "/AddState", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> AddState(@RequestBody HashMap<String, String> insertBody)  {
        return hrPayRollService.AddState(insertBody.get("QueryType"),
                insertBody.get("StateName"),
                insertBody.get("CreatedBy"),
                insertBody.get("UpdatedBy"),
                Integer.valueOf(insertBody.get("CountryID")),
                insertBody.get("StateID"));

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
    @PostMapping(value = "/AddCity", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> AddCity(@RequestBody HashMap<String, String> insertCityBody)  {
        return hrPayRollService.AddCity(insertCityBody.get("QueryType"),
                insertCityBody.get("CityName"),
                insertCityBody.get("CreatedBy"),
                insertCityBody.get("UpdatedBy"),
                Integer.valueOf(insertCityBody.get("StateID")),
                insertCityBody.get("CityID"));

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

    }
    @PostMapping(value="/AddCountry")
    public HashMap<String, String> AddCountry(@RequestBody HashMap<String,String> loginBody)
    {
        return  hrPayRollService.AddCountry( loginBody.get("QueryType"),
                loginBody.get("CountryID"),
                loginBody.get("CountryName"),
                loginBody.get("CountryCode"),
                loginBody.get("CreatedBy"),
                loginBody.get("UpdatedBy")

        );
    }

    @PostMapping(value="/UpdateCountry")
    public HashMap<String, String> UpdateCountry(@RequestBody HashMap<String,String> loginBody)
    {
        return  hrPayRollService.UpdateCountry( loginBody.get("QueryType"),
                Integer.valueOf(loginBody.get("CountryID")),
                loginBody.get("CountryName"),
                loginBody.get("CountryCode"),
                loginBody.get("CreatedBy"),
                loginBody.get("UpdatedBy")

        );
    }

    @PostMapping(value="/DeleteCountry")
    public HashMap<String, String> DeleteCountry(@RequestBody HashMap<String,String> loginBody)
    {
        return  hrPayRollService.DeleteCountry( loginBody.get("QueryType"),
                Integer.valueOf(loginBody.get("CountryID")),
                loginBody.get("CountryName"),
                loginBody.get("CountryCode"),
                loginBody.get("CreatedBy"),
                loginBody.get("UpdatedBy")

        );
        ///hgcfghgh
        ////Commit BY Lalit
    }

    @PostMapping(value = "/SaveEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> SaveEmployee(@RequestBody HashMap<String, String> saveBody) throws ParseException {
        return hrPayRollService.SaveEmployee(saveBody.get("StateName"),
                Integer.valueOf(saveBody.get("E_Code")),
                saveBody.get("E_FristName"),
                saveBody.get("E_MiddleName"),
                saveBody.get("E_LastName"),
                Integer.valueOf(saveBody.get("E_Designaton")),
                saveBody.get("E_Gender"),
                saveBody.get("E_Title"),
                saveBody.get("E_DOB"),
                saveBody.get("E_Dept"),
                saveBody.get("E_MaritalStatus"),
                saveBody.get("Anniversary"),
                saveBody.get("E_Image"),
                saveBody.get("E_EmployementType"),
                saveBody.get("CreatedBy"),
                saveBody.get("UpdatedBy"));

    }
    ///Save Employee data////



    @PostMapping(value="/AddLocation")
    public HashMap<String, String> AddLocation(@RequestBody HashMap<String,String> loginBody)
    {
        return  hrPayRollService.AddLocation( loginBody.get("QueryType"),
                loginBody.get("LocationID"),
                loginBody.get("LocationName"),
                loginBody.get("LocationCode"),
                loginBody.get("LocationDescription")


        );
    }

    @PostMapping(value="/UpdateLocation")
    public HashMap<String, String> UpdateLocation(@RequestBody HashMap<String,String> loginBody)
    {
        return  hrPayRollService.UpdateLocation( loginBody.get("QueryType"),
                Integer.valueOf(loginBody.get("LocationID")),
                loginBody.get("LocationName"),
                loginBody.get("LocationCode"),
                loginBody.get("LocationDescription")

        );
    }

    @PostMapping(value="/DeleteLocation")
    public HashMap<String, String> DeleteLocation(@RequestBody HashMap<String,String> loginBody) {
        return hrPayRollService.DeleteLocation(loginBody.get("QueryType"),
                Integer.valueOf(loginBody.get("LocationID")),
                loginBody.get("LocationName"),
                loginBody.get("LocationCode"),
                loginBody.get("LocationDescription"));

    }
    @GetMapping(name = "/GetAllEmolyeeDetails")
    public List<EmployeeBasicDetails> GetAllEmolyeeDetails(){
//        return hrPayRollService.GetAllEmolyeeDetails(Employee.get("QueryType"),
//                Integer.valueOf(Employee.get("E_ID")));
        return hrPayRollService.GetAllEmolyeeDetails();
    }

    @RequestMapping(name = "/GetEmolyeeDetail")
    public List<EmployeeBasicDetails> GetEmolyeeDetail(@RequestBody HashMap<String, String> Employee){
        return hrPayRollService.GetEmolyeeDetail( Employee.get("QueryType"),
                Integer.valueOf(Employee.get("E_ID")));
    }


}
