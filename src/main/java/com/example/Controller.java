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
    public HashMap<String, String> AddState(@RequestBody HashMap<String, String> insertBody) {
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
    public HashMap<String, String> DeleteState(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.DeleteState(deleteBody.get("QueryType"),
                deleteBody.get("StateName"),
                deleteBody.get("CreatedBy"),
                deleteBody.get("UpdatedBy"),
                Integer.valueOf(deleteBody.get("CountryID")),
                Integer.valueOf(deleteBody.get("StateID")));

    }

    // City Table//
    @PostMapping(value = "/AddCity", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> AddCity(@RequestBody HashMap<String, String> insertCityBody) {
        return hrPayRollService.AddCity(insertCityBody.get("QueryType"),
                insertCityBody.get("CityName"),
                insertCityBody.get("CreatedBy"),
                insertCityBody.get("UpdatedBy"),
                Integer.valueOf(insertCityBody.get("StateID")),
                insertCityBody.get("CityID"));

    }

    @PostMapping(value = "/UpdateCity", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UpdateCity(@RequestBody HashMap<String, String> upadteCityBody) {
        return hrPayRollService.UpdateCity(upadteCityBody.get("QueryType"),
                upadteCityBody.get("CityName"),
                upadteCityBody.get("CreatedBy"),
                upadteCityBody.get("UpdatedBy"),
                Integer.valueOf(upadteCityBody.get("StateID")),
                Integer.valueOf(upadteCityBody.get("StateID")));

    }

    @PostMapping(value = "/DeleteCity", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteCity(@RequestBody HashMap<String, String> upadteCityBody) {
        return hrPayRollService.DeleteCity(upadteCityBody.get("QueryType"),
                upadteCityBody.get("CityName"),
                upadteCityBody.get("CreatedBy"),
                upadteCityBody.get("UpdatedBy"),
                Integer.valueOf(upadteCityBody.get("StateID")),
                Integer.valueOf(upadteCityBody.get("StateID")));

    }

    @PostMapping(value = "/AddCountry")
    public HashMap<String, String> AddCountry(@RequestBody HashMap<String, String> loginBody) {
        return hrPayRollService.AddCountry(loginBody.get("QueryType"),
                loginBody.get("CountryID"),
                loginBody.get("CountryName"),
                loginBody.get("CountryCode"),
                loginBody.get("CreatedBy"),
                loginBody.get("UpdatedBy")

        );
    }

    @PostMapping(value = "/UpdateCountry")
    public HashMap<String, String> UpdateCountry(@RequestBody HashMap<String, String> loginBody) {
        return hrPayRollService.UpdateCountry(loginBody.get("QueryType"),
                Integer.valueOf(loginBody.get("CountryID")),
                loginBody.get("CountryName"),
                loginBody.get("CountryCode"),
                loginBody.get("CreatedBy"),
                loginBody.get("UpdatedBy")

        );
    }

    @PostMapping(value = "/DeleteCountry")
    public HashMap<String, String> DeleteCountry(@RequestBody HashMap<String, String> loginBody) {
        return hrPayRollService.DeleteCountry(loginBody.get("QueryType"),
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


    @PostMapping(value = "/AddLocation")
    public HashMap<String, String> AddLocation(@RequestBody HashMap<String, String> loginBody) {
        return hrPayRollService.AddLocation(loginBody.get("QueryType"),
                loginBody.get("LocationID"),
                loginBody.get("LocationName"),
                loginBody.get("LocationCode"),
                loginBody.get("LocationDescription")


        );
    }

    @PostMapping(value = "/UpdateLocation")
    public HashMap<String, String> UpdateLocation(@RequestBody HashMap<String, String> loginBody) {
        return hrPayRollService.UpdateLocation(loginBody.get("QueryType"),
                Integer.valueOf(loginBody.get("LocationID")),
                loginBody.get("LocationName"),
                loginBody.get("LocationCode"),
                loginBody.get("LocationDescription")

        );
    }

    @PostMapping(value = "/DeleteLocation")
    public HashMap<String, String> DeleteLocation(@RequestBody HashMap<String, String> loginBody) {
        return hrPayRollService.DeleteLocation(loginBody.get("QueryType"),
                Integer.valueOf(loginBody.get("LocationID")),
                loginBody.get("LocationName"),
                loginBody.get("LocationCode"),
                loginBody.get("LocationDescription"));

    }

    @GetMapping(name = "/GetAllEmolyeeDetails")
    public List<EmployeeBasicDetails> GetAllEmolyeeDetails() {
        return hrPayRollService.GetAllEmolyeeDetails();
    }

    @RequestMapping(name = "/GetEmolyeeDetail")
    public List<EmployeeBasicDetails> GetEmolyeeDetail(@RequestBody HashMap<String, String> Employee) {
        return hrPayRollService.GetEmolyeeDetail(Employee.get("QueryType"),
                Integer.valueOf(Employee.get("E_ID")));
    }

    ///insert upadte and delete data for address book///

    @PostMapping(value = "/SaveAddress", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> SaveAddress(@RequestBody HashMap<String, String> saveBody) throws ParseException {
        return hrPayRollService.SaveAddress(saveBody.get("QueryType"),
                saveBody.get("Address"),
                saveBody.get("City"),
                saveBody.get("State"),
                saveBody.get("Country"),
                saveBody.get("Pin_code"),
                saveBody.get("Address_Status"),
                saveBody.get("Contact_No"),
                saveBody.get("Email_ID"),
                saveBody.get("Emergency_contact_person"),
                saveBody.get("Emergency_contact_number"),
                Integer.valueOf(saveBody.get("eid")),
                Integer.valueOf(saveBody.get("A_ID")));

    }

    @PostMapping(value = "/UpdateAddress", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UpdateAddress(@RequestBody HashMap<String, String> updateBody) throws ParseException {
        return hrPayRollService.UpdateAddress(updateBody.get("QueryType"),
                updateBody.get("Address"),
                updateBody.get("City"),
                updateBody.get("State"),
                updateBody.get("Country"),
                updateBody.get("Pin_code"),
                updateBody.get("Address_Status"),
                updateBody.get("Contact_No"),
                updateBody.get("Email_ID"),
                updateBody.get("Emergency_contact_person"),
                updateBody.get("Emergency_contact_number"),
                Integer.valueOf(updateBody.get("eid")),
                Integer.valueOf(updateBody.get("A_ID")));

    }

    @PostMapping(value = "/DeleteAddress", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteAddress(@RequestBody HashMap<String, String> deleteAddress) throws ParseException {
        return hrPayRollService.DeleteAddress(deleteAddress.get("QueryType"),
                deleteAddress.get("Address"),
                deleteAddress.get("City"),
                deleteAddress.get("State"),
                deleteAddress.get("Country"),
                deleteAddress.get("Pin_code"),
                deleteAddress.get("Address_Status"),
                deleteAddress.get("Contact_No"),
                deleteAddress.get("Email_ID"),
                deleteAddress.get("Emergency_contact_person"),
                deleteAddress.get("Emergency_contact_number"),
                Integer.valueOf(deleteAddress.get("eid")),
                Integer.valueOf(deleteAddress.get("A_ID")));

    }

    //INSERT UPDATE AND DELETE DATA FOR PROFESSIONAL QUALIFICATION//

    @PostMapping(value = "/saveProfessionQualification", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> saveProfessionQualification(@RequestBody HashMap<String, String> saveProfessionalQualification) throws ParseException {
        return hrPayRollService.saveProfessionQualification(saveProfessionalQualification.get("QueryType"),
                saveProfessionalQualification.get("Institute"),
                saveProfessionalQualification.get("Course"),
                saveProfessionalQualification.get("Start_Date"),
                saveProfessionalQualification.get("End_Date"),
                Integer.valueOf(saveProfessionalQualification.get("Q_id")));

    }

    @PostMapping(value = "/upadteProfessionQualification", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> upadteProfessionQualification(@RequestBody HashMap<String, String> saveProfessionalQualification) throws ParseException {
        return hrPayRollService.upadteProfessionQualification(saveProfessionalQualification.get("QueryType"),
                saveProfessionalQualification.get("Institute"),
                saveProfessionalQualification.get("Course"),
                saveProfessionalQualification.get("Start_Date"),
                saveProfessionalQualification.get("End_Date"),
                Integer.valueOf(saveProfessionalQualification.get("Q_id")));

    }


    @PostMapping(value = "/DeleteProfessionQualification", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteProfessionQualification(@RequestBody HashMap<String, String> saveProfessionalQualification) throws ParseException {
        return hrPayRollService.DeleteProfessionQualification(saveProfessionalQualification.get("QueryType"),
                saveProfessionalQualification.get("Institute"),
                saveProfessionalQualification.get("Course"),
                saveProfessionalQualification.get("Start_Date"),
                saveProfessionalQualification.get("End_Date"),
                Integer.valueOf(saveProfessionalQualification.get("Q_id")));

    }
}
