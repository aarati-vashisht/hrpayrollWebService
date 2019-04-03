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
        return hrPayRollService.AddCountry(
                loginBody.get("CountryName"),
                loginBody.get("CountryCode"),
                loginBody.get("CreatedBy"),
                loginBody.get("UpdatedBy"),loginBody.get("Description")

        );
    }


    @PostMapping(value = "/UpdateCountry")
    public HashMap<String, String> UpdateCountry(@RequestBody HashMap<String, String> loginBody) {
        return hrPayRollService.UpdateCountry(
                Integer.valueOf(loginBody.get("CountryID")),
                loginBody.get("CountryName"),
                loginBody.get("CountryCode"),
                loginBody.get("CreatedBy"),
                loginBody.get("UpdatedBy"),loginBody.get("Description")

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

        ////Commit BY Lalit
    }

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

    @PostMapping(value = "/AddDepartment")
    public HashMap<String, String> AddDepartment(@RequestBody HashMap<String, String> saveBody) {
        return hrPayRollService.AddDepartment(saveBody.get("QueryType"),
                saveBody.get("DepartmentID"),
                Integer.valueOf(saveBody.get("LocationID")),
                saveBody.get("DepartmentName"),
                saveBody.get("DepartmentCode"),
                saveBody.get("Description")

        );
    }

    @PostMapping(value = "/UpdateDepartment")
    public HashMap<String, String> UpdateDepartment(@RequestBody HashMap<String, String> updateBody) {
        return hrPayRollService.UpdateDepartment(updateBody.get("QueryType"),
                Integer.valueOf(updateBody.get("DepartmentID")),
                Integer.valueOf(updateBody.get("LocationID")),
                updateBody.get("DepartmentName"),
                updateBody.get("DepartmentCode"),
                updateBody.get("Description")

        );
    }

    @PostMapping(value = "/DeleteDepartment")
    public HashMap<String, String> DeleteDepartment(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.DeleteDepartment(deleteBody.get("QueryType"),
                Integer.valueOf(deleteBody.get("DepartmentID")),
                Integer.valueOf(deleteBody.get("LocationID")),
                deleteBody.get("DepartmentName"),
                deleteBody.get("DepartmentCode"),
                deleteBody.get("Description")

        );

    }

    @PostMapping(value = "/AddDesignation")
    public HashMap<String, String> AddDesignation(@RequestBody HashMap<String, String> saveBody) {
        return hrPayRollService.AddDesignation(saveBody.get("QueryType"),
                saveBody.get("DesignationID"),
                Integer.valueOf(saveBody.get("DepartmentID")),
                saveBody.get("DesignationName"),
                saveBody.get("DesignationCode"),
                saveBody.get("Description")

        );
    }

    @PostMapping(value = "/UpdateDesignation")
    public HashMap<String, String> UpdateDesignation(@RequestBody HashMap<String, String> updateBody) {
        return hrPayRollService.UpdateDesignation(updateBody.get("QueryType"),
                Integer.valueOf(updateBody.get("DesignationID")),
                Integer.valueOf(updateBody.get("DepartmentID")),
                updateBody.get("DesignationName"),
                updateBody.get("DesignationCode"),
                updateBody.get("Description")

        );
    }

    @PostMapping(value = "/DeleteDesignation")
    public HashMap<String, String> DeleteDesignation(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.DeleteDesignation(deleteBody.get("QueryType"),
                Integer.valueOf(deleteBody.get("DepartmentID")),
                Integer.valueOf(deleteBody.get("DepartmentID")),
                deleteBody.get("DesignationName"),
                deleteBody.get("DesignationCode"),
                deleteBody.get("Description")

        );

    }

    @PostMapping(value = "/AddSchool")
    public HashMap<String, String> AddSchool(@RequestBody HashMap<String, String> saveBody) {
        return hrPayRollService.AddSchool(saveBody.get("QueryType"),
                saveBody.get("SchoolID"),
                saveBody.get("ClassName"),
                saveBody.get("BoardName"),
                saveBody.get("SchoolName"),
                saveBody.get("StartDate"),
                saveBody.get("EndDate"),
                Float.valueOf(saveBody.get("Persentage"))


        );
    }

    @PostMapping(value = "/UpdateSchool")
    public HashMap<String, String> UpdateSchool(@RequestBody HashMap<String, String> updateBody) {
        return hrPayRollService.UpdateSchool(updateBody.get("QueryType"),
                Integer.valueOf(updateBody.get("SchoolID")),
                updateBody.get("ClassName"),
                updateBody.get("BoardName"),
                updateBody.get("SchoolName"),
                updateBody.get("StartDate"),
                updateBody.get("EndDate"),
                Float.valueOf(updateBody.get("Persentage"))

        );
    }

    @PostMapping(value = "/DeleteSchool")
    public HashMap<String, String> DeleteSchool(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.DeleteSchool(deleteBody.get("QueryType"),
                Integer.valueOf(deleteBody.get("SchoolID")),
                deleteBody.get("ClassName"),
                deleteBody.get("BoardName"),
                deleteBody.get("SchoolName"),
                deleteBody.get("StartDate"),
                deleteBody.get("EndDate"),
                Float.valueOf(deleteBody.get("Persentage"))

        );

    }

    @PostMapping(value = "/AddGraduation")
    public HashMap<String, String> AddGraduation(@RequestBody HashMap<String, String> saveBody) {
        return hrPayRollService.AddGraduation(saveBody.get("QueryType"),
                saveBody.get("GraduationID"),
                saveBody.get("CourseName"),
                saveBody.get("UniversityName"),
                saveBody.get("CollegeName"),
                saveBody.get("StartDate"),
                saveBody.get("EndDate"),
                Float.valueOf(saveBody.get("Persentage"))


        );
    }

    @PostMapping(value = "/UpdateGraduation")
    public HashMap<String, String> UpdateGraduation(@RequestBody HashMap<String, String> updateBody) {
        return hrPayRollService.UpdateGraduation(updateBody.get("QueryType"),
                Integer.valueOf(updateBody.get("GraduationID")),
                updateBody.get("CourseName"),
                updateBody.get("UniversityName"),
                updateBody.get("CollegeName"),
                updateBody.get("StartDate"),
                updateBody.get("EndDate"),
                Float.valueOf(updateBody.get("Persentage"))

        );
    }

    @PostMapping(value = "/DeleteGraduation")
    public HashMap<String, String> DeleteGraduation(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.DeleteGraduation(deleteBody.get("QueryType"),
                Integer.valueOf(deleteBody.get("GraduationID")),
                deleteBody.get("CourseName"),
                deleteBody.get("UniversityName"),
                deleteBody.get("CollegeName"),
                deleteBody.get("StartDate"),
                deleteBody.get("EndDate"),
                Float.valueOf(deleteBody.get("Persentage"))

        );

    }

    @PostMapping(value = "/AddPostGraduation")
    public HashMap<String, String> AddPostGraduation(@RequestBody HashMap<String, String> saveBody) {
        return hrPayRollService.AddPostGraduation(saveBody.get("QueryType"),
                saveBody.get("PostGraduationID"),
                saveBody.get("CourseName"),
                saveBody.get("UniversityName"),
                saveBody.get("CollegeName"),
                saveBody.get("StartDate"),
                saveBody.get("EndDate"),
                Float.valueOf(saveBody.get("Persentage"))


        );
    }

    @PostMapping(value = "/UpdatePostGraduation")
    public HashMap<String, String> UpdatePostGraduation(@RequestBody HashMap<String, String> updateBody) {
        return hrPayRollService.UpdatePostGraduation(updateBody.get("QueryType"),
                Integer.valueOf(updateBody.get("PostGraduationID")),
                updateBody.get("CourseName"),
                updateBody.get("UniversityName"),
                updateBody.get("CollegeName"),
                updateBody.get("StartDate"),
                updateBody.get("EndDate"),
                Float.valueOf(updateBody.get("Persentage"))

        );
    }

    @PostMapping(value = "/DeletePostGraduation")
    public HashMap<String, String> DeletePostGraduation(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.DeletePostGraduation(deleteBody.get("QueryType"),
                Integer.valueOf(deleteBody.get("PostGraduationID")),
                deleteBody.get("CourseName"),
                deleteBody.get("UniversityName"),
                deleteBody.get("CollegeName"),
                deleteBody.get("StartDate"),
                deleteBody.get("EndDate"),
                Float.valueOf(deleteBody.get("Persentage"))

        );

    }

    @PostMapping(value = "/AddOtherEduQualifiaction")
    public HashMap<String, String> AddOtherEduQualifiaction(@RequestBody HashMap<String, String> saveBody) {
        return hrPayRollService.AddOtherEduQualifiaction(saveBody.get("QueryType"),
                saveBody.get("otherEduQualificationTableID"),
                saveBody.get("CourseName"),
                saveBody.get("UniversityName"),
                saveBody.get("CollegeName"),
                saveBody.get("StartDate"),
                saveBody.get("EndDate"),
                Float.valueOf(saveBody.get("Persentage"))


        );
    }

    @PostMapping(value = "/UpdateOtherEduQualifiaction")
    public HashMap<String, String> UpdateOtherEduQualifiaction(@RequestBody HashMap<String, String> updateBody) {
        return hrPayRollService.UpdateOtherEduQualifiaction(updateBody.get("QueryType"),
                Integer.valueOf(updateBody.get("otherEduQualificationTableID")),
                updateBody.get("CourseName"),
                updateBody.get("UniversityName"),
                updateBody.get("CollegeName"),
                updateBody.get("StartDate"),
                updateBody.get("EndDate"),
                Float.valueOf(updateBody.get("Persentage"))

        );
    }

    @PostMapping(value = "/DeleteOtherEduQualifiaction")
    public HashMap<String, String> DeleteOtherEduQualifiaction(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.DeleteOtherEduQualifiaction(deleteBody.get("QueryType"),
                Integer.valueOf(deleteBody.get("otherEduQualificationTableID")),
                deleteBody.get("CourseName"),
                deleteBody.get("UniversityName"),
                deleteBody.get("CollegeName"),
                deleteBody.get("StartDate"),
                deleteBody.get("EndDate"),
                Float.valueOf(deleteBody.get("Persentage"))

        );

    }
}
