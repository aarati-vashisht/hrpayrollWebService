package com.example;

import com.example.ResponseData.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;


@RestController
public class Controller {
    @Autowired
    HrPayRollService hrPayRollService;


    //State Table//

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/AddState", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> AddState(@RequestBody HashMap<String, String> insertBody) {
        return hrPayRollService.AddState(
                insertBody.get("StateName"),
                insertBody.get("CreatedBy"),
                insertBody.get("UpdatedBy"),
                Integer.valueOf(insertBody.get("CountryID")),
                insertBody.get("Description"),
                Integer.valueOf(insertBody.get("userID")));


    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateState", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UpdateState(@RequestBody HashMap<String, String> updateBody) {
        return hrPayRollService.UpdateState(updateBody.get("StateName"),
                updateBody.get("CreatedBy"),
                updateBody.get("UpdatedBy"),
                Integer.valueOf(updateBody.get("CountryID")),
                Integer.valueOf(updateBody.get("StateID")),
                updateBody.get("Description"),
                Integer.valueOf(updateBody.get("userID")));
        //////new commit
///comitted by ankit
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteState", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteState(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.DeleteState(
                Integer.valueOf(deleteBody.get("StateID")),
                Integer.valueOf(deleteBody.get("userID")));

    }

    // City Table//

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/AddCity", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> AddCity(@RequestBody HashMap<String, String> insertCityBody) {
        return hrPayRollService.AddCity(
                insertCityBody.get("CityName"),
                insertCityBody.get("CreatedBy"),
                insertCityBody.get("UpdatedBy"),
                Integer.valueOf(insertCityBody.get("StateID")),
                insertCityBody.get("Description"),
                Integer.valueOf(insertCityBody.get("userID")));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateCity", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UpdateCity(@RequestBody HashMap<String, String> upadteCityBody) {
        return hrPayRollService.UpdateCity(
                upadteCityBody.get("CityName"),
                upadteCityBody.get("CreatedBy"),
                upadteCityBody.get("UpdatedBy"),
                Integer.valueOf(upadteCityBody.get("StateID")),
                Integer.valueOf(upadteCityBody.get("CityID")),
                upadteCityBody.get("Description"),
                Integer.valueOf(upadteCityBody.get("userID")));


    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteCity", produces = MediaType.APPLICATION_JSON_VALUE)

    public HashMap<String, String> DeleteCity(@RequestBody HashMap<String, String> deleteCityBody) {
        return hrPayRollService.DeleteCity(Integer.valueOf(deleteCityBody.get("CityID")),
                Integer.valueOf(deleteCityBody.get("userID")));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/AddPostalCode", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> AddPostalCode(@RequestBody HashMap<String, String> insertCityBody) {
        return hrPayRollService.AddPostalCode(
                Integer.valueOf(insertCityBody.get("postalCode")),
                insertCityBody.get("CreatedBy"),
                insertCityBody.get("UpdatedBy"),
                insertCityBody.get("Description"),
                Integer.valueOf(insertCityBody.get("CityID")),
                Integer.valueOf(insertCityBody.get("userID"))
                );
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdatePostalCode", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UpdatePostalCode(@RequestBody HashMap<String, String> upadteCityBody) {
        return hrPayRollService.UpdatePostalCode(
                Integer.valueOf(upadteCityBody.get("pid")),
                Integer.valueOf(upadteCityBody.get("postalCode")),
                upadteCityBody.get("CreatedBy"),
                upadteCityBody.get("UpdatedBy"),
                upadteCityBody.get("Description"),
                Integer.valueOf(upadteCityBody.get("CityID")),
                Integer.valueOf(upadteCityBody.get("userID")));


    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeletePostalCode", produces = MediaType.APPLICATION_JSON_VALUE)

    public HashMap<String, String> DeletePostalCode(@RequestBody HashMap<String, String> deletePostal) {
        return hrPayRollService.DeletePostalCode(Integer.valueOf(deletePostal.get("pid")),
                Integer.valueOf(deletePostal.get("userID")));

    }


    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/AddCountry")
    public HashMap<String, String> AddCountry(@RequestBody HashMap<String, String> loginBody) {
        return hrPayRollService.AddCountry(
                loginBody.get("CountryName"),
                loginBody.get("CountryCode"),
                loginBody.get("CreatedBy"),
                loginBody.get("UpdatedBy"),loginBody.get("Description"),
                Integer.valueOf(loginBody.get("userID")));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateCountry")
    public HashMap<String, String> UpdateCountry(@RequestBody HashMap<String, String> loginBody) {
        return hrPayRollService.UpdateCountry(
                Integer.valueOf(loginBody.get("CountryID")),
                loginBody.get("CountryName"),
                loginBody.get("CountryCode"),
                loginBody.get("CreatedBy"),
                loginBody.get("UpdatedBy"),
                loginBody.get("Description"),
                Integer.valueOf(loginBody.get("userID")));
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteCountry")
    public HashMap<String, String> DeleteCountry(@RequestBody HashMap<String, String> loginBody) {
        return hrPayRollService.DeleteCountry(
                Integer.valueOf(loginBody.get("CountryID")),
                Integer.valueOf(loginBody.get("userID")));

        ////Commit BY Lalit
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/AddEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> AddEmployee(@RequestBody HashMap<String, String> saveBody) throws ParseException {
        return hrPayRollService.AddEmployee(saveBody.get("StateName"),
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
                saveBody.get("UpdatedBy"),
                Integer.valueOf(saveBody.get("userID")));

    }
    ///Save Employee data////


    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/AddLocation")
    public HashMap<String, String> AddLocation(@RequestBody HashMap<String, String> loginBody) {
        return hrPayRollService.AddLocation(
                loginBody.get("LocationName"),
                loginBody.get("LocationCode"),
                loginBody.get("LocationDescription"),
                loginBody.get("CreatedBy"),
                loginBody.get("UpdatedBy"),
                Integer.valueOf(loginBody.get("userID"))
        );
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateLocation")
    public HashMap<String, String> UpdateLocation(@RequestBody HashMap<String, String> updateLocation) {
        return hrPayRollService.UpdateLocation(
                Integer.valueOf(updateLocation.get("LocationID")),
                updateLocation.get("LocationName"),
                updateLocation.get("LocationCode"),
                updateLocation.get("LocationDescription"),
                updateLocation.get("CreatedBy"),
                updateLocation.get("UpdatedBy"),
                Integer.valueOf(updateLocation.get("userID"))

        );
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteLocation")
    public HashMap<String, String> DeleteLocation(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.DeleteLocation(
                Integer.valueOf(deleteBody.get("LocationID")),
                Integer.valueOf(deleteBody.get("userID")));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(name = "/GetAllEmolyeeDetails")
    public List<EmployeeBasicDetails> GetAllEmolyeeDetails() {
        return hrPayRollService.GetAllEmolyeeDetails();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(name = "/GetEmolyeeDetail")
    public List<EmployeeBasicDetails> GetEmolyeeDetail(@RequestBody HashMap<String, String> Employee) {
        return hrPayRollService.GetEmolyeeDetail(
                Integer.valueOf(Employee.get("E_ID")),
                Integer.valueOf(Employee.get("userID")));
    }

    ///insert upadte and delete data for address book///
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/SaveAddress", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> SaveAddress(@RequestBody HashMap<String, String> saveBody) throws ParseException {
        return hrPayRollService.SaveAddress(
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
                Integer.valueOf(saveBody.get("userID")));

    }

    @CrossOrigin(origins = "http://localhost:4200")
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
                Integer.valueOf(updateBody.get("A_ID")),
                Integer.valueOf(updateBody.get("userID")));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteAddress", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteAddress(@RequestBody HashMap<String, String> deleteAddress) throws ParseException {
        return hrPayRollService.DeleteAddress(
                Integer.valueOf(deleteAddress.get("A_ID")),
                Integer.valueOf(deleteAddress.get("userID")));

    }

    //INSERT UPDATE AND DELETE DATA FOR PROFESSIONAL QUALIFICATION//

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/saveProfessionQualification", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> saveProfessionQualification(@RequestBody HashMap<String, String> saveProfessionalQualification) throws ParseException {
        return hrPayRollService.saveProfessionQualification(
                saveProfessionalQualification.get("Institute"),
                saveProfessionalQualification.get("Course"),
                saveProfessionalQualification.get("Start_Date"),
                saveProfessionalQualification.get("End_Date"),
                saveProfessionalQualification.get("CreateBy"),
                saveProfessionalQualification.get("UpadtedBy"),
                Integer.valueOf(saveProfessionalQualification.get("userID")));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/upadteProfessionQualification", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> upadteProfessionQualification(@RequestBody HashMap<String, String> saveProfessionalQualification) throws ParseException {
        return hrPayRollService.upadteProfessionQualification(
                saveProfessionalQualification.get("Institute"),
                saveProfessionalQualification.get("Course"),
                saveProfessionalQualification.get("Start_Date"),
                saveProfessionalQualification.get("End_Date"),
                Integer.valueOf(saveProfessionalQualification.get("Q_id")),
                saveProfessionalQualification.get("CreatedBy"),
                saveProfessionalQualification.get("UpdatedBy"),
                Integer.valueOf(saveProfessionalQualification.get("userID")));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteProfessionQualification", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteProfessionQualification(@RequestBody HashMap<String, String> saveProfessionalQualification) throws ParseException {
        return hrPayRollService.DeleteProfessionQualification(
                Integer.valueOf(saveProfessionalQualification.get("Q_id")),
                Integer.valueOf(saveProfessionalQualification.get("userID")));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/AddDepartment")
    public HashMap<String, String> AddDepartment(@RequestBody HashMap<String, String> saveBody) {
        return hrPayRollService.AddDepartment(
                Integer.valueOf(saveBody.get("LocationID")),
                saveBody.get("DepartmentName"),
                saveBody.get("DepartmentCode"),
                saveBody.get("Description"),
                saveBody.get("CreatedBy"),
                saveBody.get("UpdatedBy"),
                Integer.valueOf(saveBody.get("userID"))

        );
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateDepartment")
    public HashMap<String, String> UpdateDepartment(@RequestBody HashMap<String, String> updateBody) {
        return hrPayRollService.UpdateDepartment(
                Integer.valueOf(updateBody.get("DepartmentID")),
                Integer.valueOf(updateBody.get("LocationID")),
                updateBody.get("DepartmentName"),
                updateBody.get("DepartmentCode"),
                updateBody.get("Description"),
                updateBody.get("CreatedBy"),
                updateBody.get("UpdatedBy"),
                Integer.valueOf(updateBody.get("userID"))

        );
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteDepartment")
    public HashMap<String, String> DeleteDepartment(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.DeleteDepartment(
                Integer.valueOf(deleteBody.get("DepartmentID")),
                Integer.valueOf(deleteBody.get("userID")));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/AddDesignation")
    public HashMap<String, String> AddDesignation(@RequestBody HashMap<String, String> saveBody) {
        return hrPayRollService.AddDesignation(
                Integer.valueOf(saveBody.get("DepartmentID")),
                saveBody.get("DesignationName"),
                saveBody.get("DesignationCode"),
                saveBody.get("Description"),
                saveBody.get("CreatedBy"),
                saveBody.get("UpdatedBy"),
                Integer.valueOf(saveBody.get("userID")));
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateDesignation")
    public HashMap<String, String> UpdateDesignation(@RequestBody HashMap<String, String> updateBody) {
        return hrPayRollService.UpdateDesignation(
                Integer.valueOf(updateBody.get("DesignationID")),
                Integer.valueOf(updateBody.get("DepartmentID")),
                updateBody.get("DesignationName"),
                updateBody.get("DesignationCode"),
                updateBody.get("Description"),
                updateBody.get("CreatedBy"),
                updateBody.get("UpdatedBy"),
                Integer.valueOf(updateBody.get("userID")));
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteDesignation")
    public HashMap<String, String> DeleteDesignation(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.DeleteDesignation(
                Integer.valueOf(deleteBody.get("DepartmentID")),
                Integer.valueOf(deleteBody.get("userID")));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getDesignation")
    public List<DesignationData> getDesignation(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.getDesignation(
                deleteBody.get("UserID"));

    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getLocation")
    public List<LocationData> getLocation(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.getLocation(
                deleteBody.get("UserID"));

    }
   // @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getDepartment")
    public List<DepartmentData> getDepartment(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.getDepartment(
                deleteBody.get("UserID"),deleteBody.get("LocationID"));

    }
    //@CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getState")
    public List<StateData> getState(@RequestBody HashMap<String, String> getBody) {
        return hrPayRollService.getState(
                getBody.get("UserID"));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/AddSchool")
    public HashMap<String, String> AddSchool(@RequestBody HashMap<String, String> saveBody) throws ParseException {
        return hrPayRollService.AddSchool(
                saveBody.get("ClassName"),
                saveBody.get("BoardName"),
                saveBody.get("SchoolName"),
                saveBody.get("StartDate"),
                saveBody.get("EndDate"),
                saveBody.get("Percentage"),
                saveBody.get("CreatedBy"),
                saveBody.get("Updatedby"),
                Integer.valueOf(saveBody.get("userID")));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateSchool")
    public HashMap<String, String> UpdateSchool(@RequestBody HashMap<String, String> updateBody) throws ParseException {
        return hrPayRollService.UpdateSchool(
                Integer.valueOf(updateBody.get("SchoolID")),
                updateBody.get("ClassName"),
                updateBody.get("BoardName"),
                updateBody.get("SchoolName"),
                updateBody.get("StartDate"),
                updateBody.get("EndDate"),
                updateBody.get("Persentage"),
                updateBody.get("CreatedBy"),
                updateBody.get("UpdatedBy"),
                Integer.valueOf(updateBody.get("userID")));
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteSchool")
    public HashMap<String, String> DeleteSchool(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.DeleteSchool(
                Integer.valueOf(deleteBody.get("SchoolID")),
                Integer.valueOf(deleteBody.get("userID")));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/AddGraduation")
    public HashMap<String, String> AddGraduation(@RequestBody HashMap<String, String> saveBody) throws ParseException {
        return hrPayRollService.AddGraduation(saveBody.get("CourseName"),
                saveBody.get("UniversityName"),
                saveBody.get("CollegeName"),
                saveBody.get("StartDate"),
                saveBody.get("EndDate"),
                saveBody.get("Percentage"),
                saveBody.get("CreatedBy"),
                saveBody.get("UpdatedBy"),
                Integer.valueOf(saveBody.get("userID")));
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateGraduation")
    public HashMap<String, String> UpdateGraduation(@RequestBody HashMap<String, String> updateBody) throws ParseException {
        return hrPayRollService.UpdateGraduation(
                Integer.valueOf(updateBody.get("GraduationID")),
                updateBody.get("CourseName"),
                updateBody.get("UniversityName"),
                updateBody.get("CollegeName"),
                updateBody.get("StartDate"),
                updateBody.get("EndDate"),
                updateBody.get("Percentage"),
                updateBody.get("CreatedBy"),
                updateBody.get("UpdatedBy"),
                Integer.valueOf(updateBody.get("userID"))
        );
    }

    //@CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteGraduation")
    public HashMap<String, String> DeleteGraduation(@RequestBody HashMap<String, String> deleteBody) throws ParseException {
        return hrPayRollService.DeleteGraduation(
                Integer.valueOf(deleteBody.get("GraduationID")),
                Integer.valueOf(deleteBody.get("userID")));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/AddPostGraduation")
    public HashMap<String, String> AddPostGraduation(@RequestBody HashMap<String, String> saveBody) throws ParseException {
        return hrPayRollService.AddPostGraduation(
                saveBody.get("CourseName"),
                saveBody.get("UniversityName"),
                saveBody.get("CollegeName"),
                saveBody.get("StartDate"),
                saveBody.get("EndDate"),
                saveBody.get("Percentage"),
                saveBody.get("CreatedBy"),
                saveBody.get("UpdatedBy"),
                Integer.valueOf(saveBody.get("userID"))


        );
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdatePostGraduation")
    public HashMap<String, String> UpdatePostGraduation(@RequestBody HashMap<String, String> updateBody) throws ParseException {
        return hrPayRollService.UpdatePostGraduation(
                Integer.valueOf(updateBody.get("PostGraduationID")),
                updateBody.get("CourseName"),
                updateBody.get("UniversityName"),
                updateBody.get("CollegeName"),
                updateBody.get("StartDate"),
                updateBody.get("EndDate"),
                updateBody.get("Percentage"),
                updateBody.get("CreatedBy"),
                updateBody.get("UpdatedBy"),
                Integer.valueOf(updateBody.get("userID"))

        );
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeletePostGraduation")
    public HashMap<String, String> DeletePostGraduation(@RequestBody HashMap<String, String> deleteBody) throws ParseException {
        return hrPayRollService.DeletePostGraduation(
                Integer.valueOf(deleteBody.get("PostGraduationID")),
                Integer.valueOf(deleteBody.get("userID"))
        );

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/AddOtherEduQualifiaction")
    public HashMap<String, String> AddOtherEduQualifiaction(@RequestBody HashMap<String, String> saveBody) throws ParseException {
        return hrPayRollService.AddOtherEduQualifiaction(
                saveBody.get("CourseName"),
                saveBody.get("UniversityName"),
                saveBody.get("CollegeName"),
                saveBody.get("StartDate"),
                saveBody.get("EndDate"),
                saveBody.get("Percentage"),
                saveBody.get("CreatedBy"),
                saveBody.get("UpdatedBy"),
                Integer.valueOf(saveBody.get("userID"))
        );
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateOtherEduQualifiaction")
    public HashMap<String, String> UpdateOtherEduQualifiaction(@RequestBody HashMap<String, String> updateBody) throws ParseException {
        return hrPayRollService.UpdateOtherEduQualifiaction(
                Integer.valueOf(updateBody.get("otherEduQualificationTableID")),
                updateBody.get("CourseName"),
                updateBody.get("UniversityName"),
                updateBody.get("CollegeName"),
                updateBody.get("StartDate"),
                updateBody.get("EndDate"),
                updateBody.get("Percentage"),
                updateBody.get("CreatedBy"),
                updateBody.get("UpdatedBy"),
                Integer.valueOf(updateBody.get("userID"))
        );
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteOtherEduQualifiaction")
    public HashMap<String, String> DeleteOtherEduQualifiaction(@RequestBody HashMap<String, String> deleteBody) throws ParseException {
        return hrPayRollService.DeleteOtherEduQualifiaction(
                Integer.valueOf(deleteBody.get("otherEduQualificationTableID")),
                Integer.valueOf(deleteBody.get("userID"))
        );

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(name = "/GetCountryByUserID")
    public List<CountryData> GetCountryByUserID(@RequestBody HashMap<String, String> Country) {
        return hrPayRollService.GetCountryByUserID(Integer.valueOf(Country.get("userID")));
    }

}
