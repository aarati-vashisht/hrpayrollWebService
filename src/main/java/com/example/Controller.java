package com.example;

import com.example.ResponseData.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


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
                insertBody.get("UpdatedBy"),
                Integer.valueOf(insertBody.get("CountryID")),
                insertBody.get("Description"),
                Integer.valueOf(insertBody.get("userID")));


    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateState", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UpdateState(@RequestBody HashMap<String, String> updateBody) {
        return hrPayRollService.UpdateState(updateBody.get("StateName"),
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
                upadteCityBody.get("UpdatedBy"),
                Integer.valueOf(upadteCityBody.get("StateID")),
                Integer.valueOf(upadteCityBody.get("CityID")),
                upadteCityBody.get("Description"),
                Integer.valueOf(upadteCityBody.get("userID")));


    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteCity", produces = MediaType.APPLICATION_JSON_VALUE)

    public HashMap<String, String> DeleteCity(@RequestBody HashMap<String, String> deleteCityBody) {
        return hrPayRollService.DeleteCity(
                Integer.valueOf(deleteCityBody.get("CityID")),
                Integer.valueOf(deleteCityBody.get("userID")));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/AddPostalCode", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> AddPostalCode(@RequestBody HashMap<String, String> insertCityBody) {
        return hrPayRollService.AddPostalCode(
                Integer.valueOf(insertCityBody.get("postalCode")),
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
                loginBody.get("UpdatedBy"), loginBody.get("Description"),
                Integer.valueOf(loginBody.get("userID")));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateCountry")
    public HashMap<String, String> UpdateCountry(@RequestBody HashMap<String, String> loginBody) {
        return hrPayRollService.UpdateCountry(
                Integer.valueOf(loginBody.get("CountryID")),
                loginBody.get("CountryName"),
                loginBody.get("CountryCode"),
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
        return hrPayRollService.AddEmployee(
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
                saveBody.get("UpdatedBy"),
                Integer.valueOf(saveBody.get("userID")),
                saveBody.get("E_Location"));

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
                saveBody.get("address"),
                saveBody.get("city"),
                saveBody.get("state"),
                saveBody.get("country"),
                saveBody.get("pin_code"),
                saveBody.get("address_Status"),
                saveBody.get("contact_No"),
                saveBody.get("email_ID"),
                saveBody.get("emergency_contact_person"),
                saveBody.get("emergency_contact_number"),
                Integer.valueOf(saveBody.get("eid")),
                saveBody.get("userID"),
                saveBody.get("updatedBy"));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateAddress", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UpdateAddress(@RequestBody HashMap<String, String> updateBody) throws ParseException {
        return hrPayRollService.UpdateAddress(updateBody.get("QueryType"),
                updateBody.get("address"),
                updateBody.get("city"),
                updateBody.get("state"),
                updateBody.get("country"),
                updateBody.get("pin_code"),
                updateBody.get("address_Status"),
                updateBody.get("contact_No"),
                updateBody.get("email_ID"),
                updateBody.get("emergency_contact_person"),
                updateBody.get("emergency_contact_number"),
                Integer.valueOf(updateBody.get("eid")),
                Integer.valueOf(updateBody.get("a_ID")),
                updateBody.get("userID"),
                updateBody.get("updatedBy"));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteAddress", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteAddress(@RequestBody HashMap<String, String> deleteAddress) throws ParseException {
        return hrPayRollService.DeleteAddress(
                Integer.valueOf(deleteAddress.get("a_ID")),
                deleteAddress.get("userID"));

    }

    //INSERT UPDATE AND DELETE DATA FOR PROFESSIONAL QUALIFICATION//


    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/saveProfessionQualification", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> saveProfessionQualification(@RequestBody HashMap<String, String> saveProfessionalQualification) throws ParseException {
        return hrPayRollService.saveProfessionQualification(
                saveProfessionalQualification.get("institute"),
                saveProfessionalQualification.get("course"),
                saveProfessionalQualification.get("startDate"),
                saveProfessionalQualification.get("endDate"),
                saveProfessionalQualification.get("updatedBy"),
                Integer.valueOf(saveProfessionalQualification.get("userId")));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/upadteProfessionQualification", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> upadteProfessionQualification(@RequestBody HashMap<String, String> saveProfessionalQualification) throws ParseException {
        return hrPayRollService.upadteProfessionQualification(
                saveProfessionalQualification.get("institute"),
                saveProfessionalQualification.get("course"),
                saveProfessionalQualification.get("startDate"),
                saveProfessionalQualification.get("endDate"),
                saveProfessionalQualification.get("updatedBy"),
                Integer.valueOf(saveProfessionalQualification.get("qId")),
                Integer.valueOf(saveProfessionalQualification.get("userId")));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteProfessionQualification", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteProfessionQualification(@RequestBody HashMap<String, String> saveProfessionalQualification) throws ParseException {
        return hrPayRollService.DeleteProfessionQualification(
                saveProfessionalQualification.get("qId"),
                Integer.valueOf(saveProfessionalQualification.get("userId")));

    }


    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/AddEmployeeExperience", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> AddEmployeeExperience(@RequestBody HashMap<String, String> saveProfessionalQualification) throws ParseException {
        return hrPayRollService.AddEmployeeExperience(
                saveProfessionalQualification.get("companyName"),
                saveProfessionalQualification.get("designation"),
                saveProfessionalQualification.get("department"),
                saveProfessionalQualification.get("joiningDate"),
                saveProfessionalQualification.get("exitDate"),
                saveProfessionalQualification.get("experience"),
                saveProfessionalQualification.get("location"),
                Integer.valueOf(saveProfessionalQualification.get("employeeId")),
                Integer.valueOf(saveProfessionalQualification.get("userId"))

        );
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateEmployeeExperience", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UpdateEmployeeExperience(@RequestBody HashMap<String, String> saveProfessionalQualification) throws ParseException {
        return hrPayRollService.UpdateEmployeeExperience(
                saveProfessionalQualification.get("companyName"),
                saveProfessionalQualification.get("designation"),
                saveProfessionalQualification.get("department"),
                saveProfessionalQualification.get("joiningDate"),
                saveProfessionalQualification.get("exitDate"),
                saveProfessionalQualification.get("experience"),
                saveProfessionalQualification.get("location"),
                Integer.valueOf(saveProfessionalQualification.get("employeeId")),
                Integer.valueOf(saveProfessionalQualification.get("expId")),
                Integer.valueOf(saveProfessionalQualification.get("userId"))

        );
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteEmployeeExperience", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteEmployeeExperience(@RequestBody HashMap<String, String> saveProfessionalQualification) throws ParseException {
        return hrPayRollService.DeleteEmployeeExperience(
                Integer.valueOf(saveProfessionalQualification.get("expId")),
                Integer.valueOf(saveProfessionalQualification.get("userId"))
        );
    }





    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/AddSkills", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> AddSkills(@RequestBody HashMap<String, String> saveSkills) throws ParseException {
        return hrPayRollService.AddSkills(
                saveSkills.get("Skills"),
                saveSkills.get("userID"),
                saveSkills.get("UpdatedBy"));
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateSkills", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UpdateSkills(@RequestBody HashMap<String, String> updateSkills) throws ParseException {
        return hrPayRollService.UpdateSkills(
                Integer.valueOf(updateSkills.get("SId")),
                updateSkills.get("Skills"),
                updateSkills.get("userID"),
                Integer.valueOf(updateSkills.get("EId")),
                updateSkills.get("UpdatedBy"));
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteSkills", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteSkills(@RequestBody HashMap<String, String> deleteSkills) throws ParseException {
        return hrPayRollService.DeleteSkills(
                Integer.valueOf(deleteSkills.get("SId")),
                deleteSkills.get("userID"));

    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/AddAchievements", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> AddAchievements(@RequestBody HashMap<String, String> addCertification) throws ParseException {
        return hrPayRollService.AddAchievements(
                addCertification.get("CertificateName"),
                addCertification.get("StartDate"),
                addCertification.get("EndDate"),
                addCertification.get("userID"),
                Integer.valueOf(addCertification.get("Eid")),
                addCertification.get("UpdatedBy"));
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateAchievements", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UpdateAchievements(@RequestBody HashMap<String, String> addCertification) throws ParseException {
        return hrPayRollService.UpdateAchievements(
                Integer.valueOf(addCertification.get("CId")),
                addCertification.get("CertificateName"),
                addCertification.get("StartDate"),
                addCertification.get("EndDate"),
                addCertification.get("userID"),
                Integer.valueOf(addCertification.get("Eid")),
                addCertification.get("UpdatedBy"));
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteAchievements", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteAchievements(@RequestBody HashMap<String, String> addCertification) throws ParseException {
        return hrPayRollService.DeleteAchievements(
                Integer.valueOf(addCertification.get("CId")),
                addCertification.get("userID"));
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/AddBankDetails", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> AddBankDetails(@RequestBody HashMap<String, String> addBank) throws ParseException {
        return hrPayRollService.AddBankDetails(
                addBank.get("AccountType"),
                addBank.get("AccountHolderName"),
                addBank.get("AccountNumber"),
                addBank.get("IFSCCode"),
                addBank.get("BranchName"),
                addBank.get("PrimaryType"),
                addBank.get("userID"),
                Integer.valueOf(addBank.get("EId")),
                addBank.get("UpdatedBy")
        );
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateBankDetails", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UpdateBankDetails(@RequestBody HashMap<String, String> addBank) throws ParseException {
        return hrPayRollService.UpdateBankDetails(
                Integer.valueOf(addBank.get("BId")),
                addBank.get("AccountType"),
                addBank.get("AccountHolderName"),
                addBank.get("AccountNumber"),
                addBank.get("IFSCCode"),
                addBank.get("BranchName"),
                addBank.get("PrimaryType"),
                addBank.get("userID"),
                Integer.valueOf(addBank.get("EId")),
                addBank.get("UpdatedBy")
        );
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteBankDetails", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteBankDetails(@RequestBody HashMap<String, String> addBank) throws ParseException {
        return hrPayRollService.DeleteBankDetails(
                Integer.valueOf(addBank.get("BId")),
                addBank.get("userID")

        );
    }






    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/AddDepartment")
    public HashMap<String, String> AddDepartment(@RequestBody HashMap<String, String> saveBody) {
        return hrPayRollService.AddDepartment(
                Integer.valueOf(saveBody.get("LocationID")),
                saveBody.get("DepartmentCode"),
                saveBody.get("DepartmentName"),
                saveBody.get("Description"),
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
                saveBody.get("DesignationCode"),
                saveBody.get("DesignationName"),
                saveBody.get("Description"),
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
                updateBody.get("UpdatedBy"),
                Integer.valueOf(updateBody.get("userID")));
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteDesignation")
    public HashMap<String, String> DeleteDesignation(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.DeleteDesignation(
                Integer.valueOf(deleteBody.get("DesignationID")),
                Integer.valueOf(deleteBody.get("userID")));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/AddSchool")
    public HashMap<String, String> AddSchool(@RequestBody HashMap<String, String> saveBody) throws ParseException {
        return hrPayRollService.AddSchool(
                saveBody.get("className"),
                saveBody.get("boardName"),
                saveBody.get("schoolName"),
                saveBody.get("startDate"),
                saveBody.get("endDate"),
                saveBody.get("percentage"),
                Integer.valueOf(saveBody.get("userID")));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateSchool")
    public HashMap<String, String> UpdateSchool(@RequestBody HashMap<String, String> updateBody) throws ParseException {
        return hrPayRollService.UpdateSchool(
                Integer.valueOf(updateBody.get("SchoolID")),
                updateBody.get("className"),
                updateBody.get("boardName"),
                updateBody.get("schoolName"),
                updateBody.get("startDate"),
                updateBody.get("endDate"),
                updateBody.get("persentage"),
                updateBody.get("updatedBy"),
                Integer.valueOf(updateBody.get("userID")));
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteSchool")
    public HashMap<String, String> DeleteSchool(@RequestBody HashMap<String, String> deleteBody) throws ParseException {
        return hrPayRollService.DeleteSchool(
                Integer.valueOf(deleteBody.get("SchoolID")),
                Integer.valueOf(deleteBody.get("userID")));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/AddGraduation")
    public HashMap<String, String> AddGraduation(@RequestBody HashMap<String, String> saveBody) throws ParseException {
        return hrPayRollService.AddGraduation(saveBody.get("degree"),
                saveBody.get("specialization"),
                saveBody.get("university"),
                saveBody.get("startdate"),
                saveBody.get("enddate"),
                saveBody.get("percentage"),
                saveBody.get("updatedby"),
                Integer.valueOf(saveBody.get("useriD")));
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateGraduation")
    public HashMap<String, String> UpdateGraduation(@RequestBody HashMap<String, String> updateBody) throws ParseException {
        return hrPayRollService.UpdateGraduation(
                Integer.valueOf(updateBody.get("graduationID")),
                updateBody.get("degree"),
                updateBody.get("specialization"),
                updateBody.get("university"),
                updateBody.get("startDate"),
                updateBody.get("endDate"),
                updateBody.get("percentage"),
                updateBody.get("updatedBy"),
                Integer.valueOf(updateBody.get("userID"))
        );
    }

    @CrossOrigin(origins = "http://localhost:4200")
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
                saveBody.get("degree"),
                saveBody.get("specialization"),
                saveBody.get("university"),
                saveBody.get("startDate"),
                saveBody.get("endDate"),
                saveBody.get("percentage"),
                saveBody.get("updatedBy"),
                Integer.valueOf(saveBody.get("userId")));
    }

     @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdatePostGraduation")
    public HashMap<String, String> UpdatePostGraduation(@RequestBody HashMap<String, String> updateBody) throws ParseException {
        return hrPayRollService.UpdatePostGraduation(
                Integer.valueOf(updateBody.get("postGraduationID")),
                updateBody.get("degree"),
                updateBody.get("specialization"),
                updateBody.get("university"),
                updateBody.get("startDate"),
                updateBody.get("endDate"),
                updateBody.get("percentage"),
                updateBody.get("updatedBy"),
                Integer.valueOf(updateBody.get("userId"))
        );
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeletePostGraduation")
    public HashMap<String, String> DeletePostGraduation(@RequestBody HashMap<String, String> deleteBody) throws ParseException {
        return hrPayRollService.DeletePostGraduation(
                Integer.valueOf(deleteBody.get("postGraduationId")),
                Integer.valueOf(deleteBody.get("userId"))
        );

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/AddOtherEduQualifiaction")
    public HashMap<String, String> AddOtherEduQualifiaction(@RequestBody HashMap<String, String> saveBody) throws ParseException {
        return hrPayRollService.AddOtherEduQualifiaction(
                saveBody.get("degree"),
                saveBody.get("specialization"),
                saveBody.get("university"),
                saveBody.get("startDate"),
                saveBody.get("endDate"),
                saveBody.get("percentage"),
                saveBody.get("updatedBy"),
                Integer.valueOf(saveBody.get("userId")));
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateOtherEduQualifiaction")
    public HashMap<String, String> UpdateOtherEduQualifiaction(@RequestBody HashMap<String, String> updateBody) throws ParseException {
        return hrPayRollService.UpdateOtherEduQualifiaction(
                Integer.valueOf(updateBody.get("otherEduQualificationTableID")),
                updateBody.get("degree"),
                updateBody.get("specialization"),
                updateBody.get("university"),
                updateBody.get("startDate"),
                updateBody.get("endDate"),
                updateBody.get("percentage"),
                updateBody.get("updatedBy"),
                Integer.valueOf(updateBody.get("userId"))
        );
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteOtherEduQualifiaction")
    public HashMap<String, String> DeleteOtherEduQualifiaction(@RequestBody HashMap<String, String> deleteBody) throws ParseException {
        return hrPayRollService.DeleteOtherEduQualifiaction(
                Integer.valueOf(deleteBody.get("otherEduQualificationTableID")),
                Integer.valueOf(deleteBody.get("userId"))
        );

    }



    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/SavePassportData", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> SavePassportData(@RequestBody HashMap<String, String> saveBody) throws ParseException {
        return hrPayRollService.SavePassportData(
                saveBody.get("passportNumber"),
                saveBody.get("expiryDate"),
                saveBody.get("uploadDocument"),
                saveBody.get("timeDuration"),
                Integer.valueOf(saveBody.get("empId")),
                saveBody.get("userId"));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdatePassportData", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UpdatePassportData(@RequestBody HashMap<String, String> saveBody) throws ParseException {
        return hrPayRollService.UpdatePassportData(
                saveBody.get("passportNumber"),
                saveBody.get("expiryDate"),
                saveBody.get("uploadDocument"),
                saveBody.get("timeDuration"),
                Integer.valueOf(saveBody.get("empId")),
                saveBody.get("userId"),
                Integer.valueOf(saveBody.get("pId")));

    }

     @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeletePassportData", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeletePassportData(@RequestBody HashMap<String, String> saveBody) throws ParseException {
        return hrPayRollService.DeletePassportData(
                saveBody.get("userId"),
                Integer.valueOf(saveBody.get("pId")));

    }
//
//    @CrossOrigin(origins = "http://localhost:4200")
//    @PostMapping(name = "/getPassportData")
//    public List<PassportData> getPassportData(@RequestBody HashMap<String, String> getBody) {
//        return hrPayRollService.getPassportData(getBody.get("userID"));
//    }












    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(name = "/GetCountryByUserID")
    public List<CountryData> GetCountryByUserID(@RequestBody HashMap<String, String> Country) {
        return hrPayRollService.GetCountryByUserID(Integer.valueOf(Country.get("userID")));
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getDesignation")
    public List<DesignationData> getDesignation(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.getDesignation(
                deleteBody.get("userID"),
                deleteBody.get("DepartmentID")
        );
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getLocation", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<LocationData> getLocation(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.getLocation(
                deleteBody.get("userID"));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getDepartment", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<DepartmentData> getDepartment(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.getDepartment(
                deleteBody.get("userID"), deleteBody.get("LocationID"));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getState")
    public List<StateData> getState(@RequestBody HashMap<String, String> getBody) {
        return hrPayRollService.getState(
                getBody.get("userID"));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getCity")
    public List<CityData> getCity(@RequestBody HashMap<String, String> getBody) {
        return hrPayRollService.getCity(
                getBody.get("userID"));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getSchool")
    public List<SchoolData> getSchool(@RequestBody HashMap<String, String> getBody) {
//        List<SchoolData> obj = new ArrayList<>();
//        obj = hrPayRollService.getSchool(getBody.get("userID"));
//        for (int i = 0; i < obj.size(); i++) {
//            try {
//
//                String splitStartDate = obj.get(i).getStartDate().toString();
//                String breakst[] = splitStartDate.split("\\s+");
//
//                String splitEndDate = obj.get(i).getEndDate().toString();
//                String asbreakst[] = splitEndDate.split("\\s+");
//
//                String Staart = breakst[0];
//                String End = asbreakst[0];
//                DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//                Date startdate = format.parse(Staart);
//                Date enddate = format.parse(End);
//                DateFormat outputformat = new SimpleDateFormat("dd/MM/yyyy");
//
//                obj.get(i).setStartDate(startdate);
//                obj.get(i).setEndDate(enddate);
//
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        return obj;
         return hrPayRollService.getSchool(getBody.get("userID"));



    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getPostalCode")
    public List<PostalCodeData> getPostalCode(@RequestBody HashMap<String, String> getBody) {
        return hrPayRollService.getPostalCode(
                getBody.get("userID"));

    }


    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getGraduationDetails")
    public List<GraduationData> getGraduationDetails(@RequestBody HashMap<String, String> getBody) {
        return hrPayRollService.getGraduationDetails(
                getBody.get("userID"));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/GetPostGraduationDetail")
    public List<PostGraduationData> GetPostGraduationDetail(@RequestBody HashMap<String, String> getBody) {
        return hrPayRollService.GetPostGraduationDetail(
                getBody.get("userID"));

    }


    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getOtherQualificationDetails")
    public List<OtherQualificationData> getOtherQualificationDetails(@RequestBody HashMap<String, String> getBody) {
        return hrPayRollService.getOtherQualificationDetails(
                getBody.get("userID"));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getAddressBook")
    public List<AddressBookData> getAddressBook(@RequestBody HashMap<String, String> getBody) {
        return hrPayRollService.getAddressBook(
                getBody.get("userID"));

    }
   @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getCountryDropDown")
    public List<CountryDropDown> getCountryDropDown(@RequestBody HashMap<String, String> getBody) {
        return hrPayRollService.getCountryDropDown(
                getBody.get("userID"));

    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getStateDropDown")
    public List<StateDropDown> getStateDropDown(@RequestBody HashMap<String, String> getBody) {
        return hrPayRollService.getStateDropDown(
                getBody.get("userID"));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getCityDropDown")
    public List<CityDropDown> getCityDropDown(@RequestBody HashMap<String, String> getBody) {
        return hrPayRollService.getCityDropDown(
                getBody.get("userID"));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getDeptByUser")
    public List<DeptByUser> getDeptByUser(@RequestBody HashMap<String, String> getBody) {
        return hrPayRollService.getDeptByUser(
                getBody.get("userID"));

    }




    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getProfessionalQualificationData")
    public List<ProfessionalQualificationData> getProfessionalQualificationData(@RequestBody HashMap<String, String> getBody) {
        return hrPayRollService.getProfessionalQualificationData(
                getBody.get("userID"));
    }






    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getEmployeeExperienceData")
    public List<EmployeeExperienceData> getEmployeeExperienceData(@RequestBody HashMap<String, String> getBody) {
        return hrPayRollService.getEmployeeExperienceData(
                getBody.get("userID"));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getDesignationDataByUser")
    public List<DesignationDataByUser> getDesignationDataByUser(@RequestBody HashMap<String, String> getBody) {
        return hrPayRollService.getDesignationDataByUser(
                getBody.get("userID"));

    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getBanksDetailsData")
    public List<BanksDetailsData> getBanksDetailsData(@RequestBody HashMap<String, String> getBody) {
        return hrPayRollService.getBanksDetailsData(
                getBody.get("userID"));

    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getSkillsData")
    public List<SkillsData> getSkillsData(@RequestBody HashMap<String, String> getBody) {
        return hrPayRollService.getSkillsData(
                getBody.get("userID"));

    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getAchiementsData")
    public List<AchiementsData> getAchiementsData(@RequestBody HashMap<String, String> getBody) {
        return hrPayRollService.getAchiementsData(
                getBody.get("userID"));

    }


}
