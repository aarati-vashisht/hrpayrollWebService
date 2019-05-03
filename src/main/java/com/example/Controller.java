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

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/SaveMultipleCountry", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> SaveMultipleCountry(@RequestBody HashMap<String, String> insertBody) {
        return hrPayRollService.SaveMultipleCountry(
                insertBody.get("jsonData"));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateMultipleCountry", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UpdateMultipleCountry(@RequestBody HashMap<String, String> insertBody) {
        return hrPayRollService.UpdateMultipleCountry(
                insertBody.get("jsonData"));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteMultipleCountry", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteMultipleCountry(@RequestBody HashMap<String, String> insertBody) {
        return hrPayRollService.DeleteMultipleCountry(
                insertBody.get("jsonData"));

    }





    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/SaveMultipleState", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> SaveMultipleState(@RequestBody HashMap<String, String> insertBody) {
        return hrPayRollService.SaveMultipleState(
                insertBody.get("jsonData"));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateMultipleState", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UpdateMultipleState(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.UpdateMultipleState(
                deleteBody.get("jsonData"));

    }



    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteMultipleState", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteMultipleState(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.DeleteMultipleState(
                deleteBody.get("jsonData"));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/SaveMultipleCity", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> SaveMultipleCity(@RequestBody HashMap<String, String> insertBody) {
        return hrPayRollService.SaveMultipleCity(
                insertBody.get("jsonData"));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateMultipleCity", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UpdateMultipleCity(@RequestBody HashMap<String, String> insertBody) {
        return hrPayRollService.UpdateMultipleCity(
                insertBody.get("jsonData"));

    }


    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteMultipleCity", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteMultipleCity(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.DeleteMultipleCity(
                deleteBody.get("jsonData"));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/SaveMultiplePostalCode", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> SaveMultiplePostalCode(@RequestBody HashMap<String, String> insertBody) {
        return hrPayRollService.SaveMultiplePostalCode(
                insertBody.get("jsonData"));

    }



    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateMultiplePostalCode", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UpdateMultiplePostalCode(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.UpdateMultiplePostalCode(
                deleteBody.get("jsonData"));

    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteMultiplePostalCode", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteMultiplePostalCode(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.DeleteMultiplePostalCode(
                deleteBody.get("jsonData"));

    }


    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/SaveMultipleEmployeeDetails", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> SaveMultipleEmployeeDetails(@RequestBody HashMap<String, String> insertBody) {
        return hrPayRollService.SaveMultipleEmployeeDetails(
                insertBody.get("jsonData"));

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


    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getEmployeeDashBoard", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EmployeeDashBoard> getEmployeeDashBoard(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.getEmployeeDashBoard(
                deleteBody.get("userId"));

    }

    ///Save Employee data////
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteMultipleEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteMultipleEmployee(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.DeleteMultipleEmployee(
                deleteBody.get("jsonData"));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/SaveMultipleLocation", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> SaveMultipleLocation(@RequestBody HashMap<String, String> insertBody) {
        return hrPayRollService.SaveMultipleLocation(
                insertBody.get("jsonData"));

    }


    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateMultipleLocation", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UpdateMultipleLocation(@RequestBody HashMap<String, String> insertBody) {
        return hrPayRollService.UpdateMultipleLocation(
                insertBody.get("jsonData"));

    }



    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteMultipleLocation", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteMultipleLocation(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.DeleteMultipleLocation(
                deleteBody.get("jsonData"));

    }


    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getLocationDropDown", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<LocationDropDown> getLocationDropDown(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.getLocationDropDown(
                deleteBody.get("userID"));

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


    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/SaveMultipleeAddress", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> SaveMultipleeAddress(@RequestBody HashMap<String, String> insertBody) {
        return hrPayRollService.SaveMultipleeAddress(
                insertBody.get("jsonData"));

    }


    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateMultipleAddress", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UpdateMultipleAddress(@RequestBody HashMap<String, String> insertBody) {
        return hrPayRollService.UpdateMultipleAddress(
                insertBody.get("jsonData"));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteMultipleAddress", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteMultipleAddress(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.DeleteMultipleAddress(
                deleteBody.get("jsonData"));

    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/SaveMultipleProfessionalQualification", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> SaveMultipleProfessionalQualification(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.SaveMultipleProfessionalQualification(
                deleteBody.get("jsonData"));

    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateMultipleProfessionalQualification", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UpdateMultipleProfessionalQualification(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.UpdateMultipleProfessionalQualification(
                deleteBody.get("jsonData"));

    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteMultipleProfessionalQualification", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteMultipleProfessionalQualification(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.DeleteMultipleProfessionalQualification(
                deleteBody.get("jsonData"));

    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/SaveMultipleEmpExperience", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> SaveMultipleEmpExperience(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.SaveMultipleEmpExperience(
                deleteBody.get("jsonData"));

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
    @PostMapping(value = "/UpdateMultipleEmpExperience", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UpdateMultipleEmpExperience(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.UpdateMultipleEmpExperience(
                deleteBody.get("jsonData"));

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
    @PostMapping(value = "/DeleteMultipleEmpExperience", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteMultipleEmpExperience(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.DeleteMultipleEmpExperience(
                deleteBody.get("jsonData"));

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
    @PostMapping(value = "/SaveMultipleAchievements", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> SaveMultipleAchievements(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.SaveMultipleAchievements(
                deleteBody.get("jsonData"));

    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/AddAchievements", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> AddAchievements(@RequestBody HashMap<String, String> addCertification) throws ParseException {
        return hrPayRollService.AddAchievements(
                addCertification.get("certificateName"),
                addCertification.get("startDate"),
                addCertification.get("endDate"),
                addCertification.get("userID"),
                Integer.valueOf(addCertification.get("eid")),
                addCertification.get("updatedBy"));
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateMultipleAchievements", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UpdateMultipleAchievements(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.UpdateMultipleAchievements(
                deleteBody.get("jsonData"));
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateAchievements", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UpdateAchievements(@RequestBody HashMap<String, String> addCertification) throws ParseException {
        return hrPayRollService.UpdateAchievements(
                Integer.valueOf(addCertification.get("cId")),
                addCertification.get("certificateName"),
                addCertification.get("startDate"),
                addCertification.get("endDate"),
                addCertification.get("userID"),
                Integer.valueOf(addCertification.get("eid")),
                addCertification.get("updatedBy"));
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteMultipleAchievements", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteMultipleAchievements(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.DeleteMultipleAchievements(
                deleteBody.get("jsonData"));
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteAchievements", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteAchievements(@RequestBody HashMap<String, String> addCertification) throws ParseException {
        return hrPayRollService.DeleteAchievements(
                Integer.valueOf(addCertification.get("cId")),
                addCertification.get("userID"));
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/SaveMultipleBankDetails", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> SaveMultipleBankDetails(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.SaveMultipleBankDetails(
                deleteBody.get("jsonData"));
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/AddBankDetails", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> AddBankDetails(@RequestBody HashMap<String, String> addBank) throws ParseException {
        return hrPayRollService.AddBankDetails(
                addBank.get("accountType"),
                addBank.get("accountHolderName"),
                addBank.get("accountNumber"),
                addBank.get("iFSCCode"),
                addBank.get("branchName"),
                addBank.get("primaryType"),
                addBank.get("userID"),
                Integer.valueOf(addBank.get("eId")),
                addBank.get("updatedBy")
        );
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateMultipleBankDetails", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UpdateMultipleBankDetails(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.UpdateMultipleBankDetails(
                deleteBody.get("jsonData"));
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateBankDetails", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UpdateBankDetails(@RequestBody HashMap<String, String> addBank) throws ParseException {
        return hrPayRollService.UpdateBankDetails(
                Integer.valueOf(addBank.get("bId")),
                addBank.get("accountType"),
                addBank.get("accountHolderName"),
                addBank.get("accountNumber"),
                addBank.get("iFSCCode"),
                addBank.get("branchName"),
                addBank.get("primaryType"),
                addBank.get("userID"),
                Integer.valueOf(addBank.get("eId")),
                addBank.get("updatedBy")
        );
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteMultipleBankDetails", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteMultipleBankDetails(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.DeleteMultipleBankDetails(
                deleteBody.get("jsonData"));
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteBankDetails", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteBankDetails(@RequestBody HashMap<String, String> addBank) throws ParseException {
        return hrPayRollService.DeleteBankDetails(
                Integer.valueOf(addBank.get("bId")),
                addBank.get("userID")

        );
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/SaveMultipleDepartment", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> SaveMultipleDepartment(@RequestBody HashMap<String, String> insertBody) {
        return hrPayRollService.SaveMultipleDepartment(
                insertBody.get("jsonData"));

    }



    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateMultipleDepartment", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UpdateMultipleDepartment(@RequestBody HashMap<String, String> insertBody) {
        return hrPayRollService.UpdateMultipleDepartment(
                insertBody.get("jsonData"));


    }


    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteMultipleDepartment", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteMultipleDepartment(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.DeleteMultipleDepartment(
                deleteBody.get("jsonData"));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getDepartmentDropDown", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<DepartmentDropDown> getDepartmentDropDown(@RequestBody HashMap<String, String> getBody) {
        return hrPayRollService.getDepartmentDropDown(
                getBody.get("userID"),
                Integer.valueOf(getBody.get("locationID")));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/SaveMultipleDesignation", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> SaveMultipleDesignation(@RequestBody HashMap<String, String> insertBody) {
        return hrPayRollService.SaveMultipleDesignation(
                insertBody.get("jsonData"));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateMultipleDesignation", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UpdateMultipleDesignation(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.UpdateMultipleDesignation(
                deleteBody.get("jsonData"));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteMultipleDesignation", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteMultipleDesignation(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.DeleteMultipleDesignation(
                deleteBody.get("jsonData"));

    }



     @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/SaveMultipleSchool", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> SaveMultipleSchool(@RequestBody HashMap<String, String> insertBody) {
        return hrPayRollService.SaveMultipleSchool(
                insertBody.get("jsonData"));

    }


    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateMultipleSchool", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UpdateMultipleSchool(@RequestBody HashMap<String, String> insertBody) {
        return hrPayRollService.UpdateMultipleSchool(
                insertBody.get("jsonData"));

    }

    // @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteMultipleSchool", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteMultipleSchool(@RequestBody HashMap<String, String> insertBody) {
        return hrPayRollService.DeleteMultipleSchool(
                insertBody.get("jsonData"));
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/SaveMultipleGraduation", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> SaveMultipleGraduation(@RequestBody HashMap<String, String> insertBody) {
        return hrPayRollService.SaveMultipleGraduation(
                insertBody.get("jsonData"));

    }



    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateMultipleGraduation", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UpdateMultipleGraduation(@RequestBody HashMap<String, String> insertBody) {
        return hrPayRollService.UpdateMultipleGraduation(
                insertBody.get("jsonData"));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteMultipleGraduation", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteMultipleGraduation(@RequestBody HashMap<String, String> insertBody) {
        return hrPayRollService.DeleteMultipleGraduation(
                insertBody.get("jsonData"));
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/SaveMultiplePG", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> SaveMultiplePG(@RequestBody HashMap<String, String> insertBody) {
        return hrPayRollService.SaveMultiplePG(
                insertBody.get("jsonData"));

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
    @PostMapping(value = "/UpdateMultiplePG", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UpdateMultiplePG(@RequestBody HashMap<String, String> insertBody) {
        return hrPayRollService.UpdateMultiplePG(
                insertBody.get("jsonData"));
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
    @PostMapping(value = "/DeleteMultiplePG", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteMultiplePG(@RequestBody HashMap<String, String> insertBody) {
        return hrPayRollService.DeleteMultiplePG(
                insertBody.get("jsonData"));
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
    @PostMapping(value = "/SaveMultipleOtherQualification", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> SaveMultipleOtherQualification(@RequestBody HashMap<String, String> insertBody) {
        return hrPayRollService.SaveMultipleOtherQualification(
                insertBody.get("jsonData"));

    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateMultipleOtherQualification", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UpdateMultipleOtherQualification(@RequestBody HashMap<String, String> insertBody) {
        return hrPayRollService.UpdateMultipleOtherQualification(
                insertBody.get("jsonData"));

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
    @PostMapping(value = "/DeleteMultipleOtherQualification", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteMultipleOtherQualification(@RequestBody HashMap<String, String> insertBody) {
        return hrPayRollService.DeleteMultipleOtherQualification(
                insertBody.get("jsonData"));
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

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getPassportData")
    public List<PassportData> getPassportData(@RequestBody HashMap<String, String> getBody) {
        return hrPayRollService.getPassportData(getBody.get("userID"));
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/SaveVisaData", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> SaveVisaData(@RequestBody HashMap<String, String> saveBody) throws ParseException {
        return hrPayRollService.SaveVisaData(
                saveBody.get("country"),
                saveBody.get("expiryDate"),
                saveBody.get("uploadDocument"),
                saveBody.get("timeDuration"),
                Integer.valueOf(saveBody.get("empId")),
                saveBody.get("userId"));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateVisaData", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UpdateVisaData(@RequestBody HashMap<String, String> updateBody) throws ParseException {
        return hrPayRollService.UpdateVisaData(
                updateBody.get("country"),
                updateBody.get("expiryDate"),
                updateBody.get("uploadDocument"),
                updateBody.get("timeDuration"),
                Integer.valueOf(updateBody.get("empId")),
                updateBody.get("userId"),
                Integer.valueOf(updateBody.get("visaId")));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteVisaData", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteVisaData(@RequestBody HashMap<String, String> deleteBody) throws ParseException {
        return hrPayRollService.DeleteVisaData(
                deleteBody.get("userId"),
                Integer.valueOf(deleteBody.get("visaId")));

    }
    //@CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getVisaData")
    public List<VisaData> getVisaData(@RequestBody HashMap<String, String> getVisaBody) {
        return hrPayRollService.getVisaData(getVisaBody.get("userID"));
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/AddDrivingLicence")
    public HashMap<String, String> AddDrivingLicence(@RequestBody HashMap<String, String> saveBody) throws ParseException {
        return hrPayRollService.AddDrivingLicence(
                saveBody.get("dLNumber"),
                saveBody.get("expiryDate"),
                saveBody.get("uploadDocument"),
                saveBody.get("timeDuration"),
                Integer.valueOf(saveBody.get("eID")),
                saveBody.get("userID"));
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateDrivingLicence")
    public HashMap<String, String> UpdateDrivingLicence(@RequestBody HashMap<String, String> updateBody) throws ParseException {
        return hrPayRollService.UpdateDrivingLicence(
                Integer.valueOf(updateBody.get("dLID")),
                updateBody.get("dLNumber"),
                updateBody.get("expiryDate"),
                updateBody.get("uploadDocument"),
                updateBody.get("timeDuration"),
                Integer.valueOf(updateBody.get("eID")),
                Integer.valueOf(updateBody.get("userID"))
        );
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteDrivingLicence")
    public HashMap<String, String> DeleteDrivingLicence(@RequestBody HashMap<String, String> deleteBody) throws ParseException {
        return hrPayRollService.DeleteDrivingLicence(
                Integer.valueOf(deleteBody.get("dLID")),
                Integer.valueOf(deleteBody.get("userID"))
        );

    }
    //@CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getDrivingLicence")
    public List<DrivingLicenceData> getDrivingLicence(@RequestBody HashMap<String, String> getLicenceBody) {
        return hrPayRollService.getDrivingLicence(getLicenceBody.get("userID"));
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/AddMedicalCertification")
    public HashMap<String, String> AddMedicalCertification(@RequestBody HashMap<String, String> saveBody) throws ParseException {
        return hrPayRollService.AddMedicalCertification(
                saveBody.get("mCertificateNumber"),
                saveBody.get("expiryDate"),
                saveBody.get("uploadDocument"),
                saveBody.get("timeDuration"),
                Integer.valueOf(saveBody.get("eID")),
                saveBody.get("userID"));
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateMedicalCertification")
    public HashMap<String, String> UpdateMedicalCertification(@RequestBody HashMap<String, String> updateBody) throws ParseException {
        return hrPayRollService.UpdateMedicalCertification(
                Integer.valueOf(updateBody.get("medicalID")),
                updateBody.get("mCertificateNumber"),
                updateBody.get("expiryDate"),
                updateBody.get("uploadDocument"),
                updateBody.get("timeDuration"),
                Integer.valueOf(updateBody.get("eID")),
                Integer.valueOf(updateBody.get("userID"))
        );
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteMedicalCertification")
    public HashMap<String, String> DeleteMedicalCertification(@RequestBody HashMap<String, String> deleteBody) throws ParseException {
        return hrPayRollService.DeleteMedicalCertification(
                Integer.valueOf(deleteBody.get("medicalID")),
                Integer.valueOf(deleteBody.get("userID"))
        );

    }

    //@CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/AddEducationalCertificate")
    public HashMap<String, String> AddEducationalCertificate(@RequestBody HashMap<String, String> saveBody) throws ParseException {
        return hrPayRollService.AddEducationalCertificate(
                saveBody.get("degree"),
                saveBody.get("University"),
                saveBody.get("startDate"),
                saveBody.get("endDate"),
                saveBody.get("document"),
                saveBody.get("userID"),
                Integer.valueOf(saveBody.get("empId")));
    }
    //@CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/UpdateEducationalCertificate")
    public HashMap<String, String> UpdateEducationalCertificate(@RequestBody HashMap<String, String> saveBody) throws ParseException {
        return hrPayRollService.UpdateEducationalCertificate(
                Integer.valueOf(saveBody.get("eduId")),
                saveBody.get("degree"),
                saveBody.get("University"),
                saveBody.get("startDate"),
                saveBody.get("endDate"),
                saveBody.get("document"),
                saveBody.get("userID"),
                Integer.valueOf(saveBody.get("empId")));
    }
    //@CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/DeleteEducationalCertificate")
    public HashMap<String, String> DeleteEducationalCertificate(@RequestBody HashMap<String, String> saveBody) throws ParseException {
        return hrPayRollService.DeleteEducationalCertificate(
                Integer.valueOf(saveBody.get("eduId")),
                saveBody.get("userID"));
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getEducationalcertificatesData")
    public List<EducationalCertificateData> getEducationalcertificatesData(@RequestBody HashMap<String, String> getData) {
        return hrPayRollService.getEducationalcertificatesData(
                getData.get("userId"));
    }








    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getMedicalCertification")
    public List<MedicalCertificateData> getMedicalCertification(@RequestBody HashMap<String, String> getBody) {
        return hrPayRollService.getMedicalCertification(getBody.get("userID"));
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/GetCountryByUserID")
    public List<CountryData> GetCountryByUserID(@RequestBody HashMap<String, String> Country) {
        return hrPayRollService.GetCountryByUserID(Integer.valueOf(Country.get("userID")));
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getDesignation")
    public List<DesignationData> getDesignation(@RequestBody HashMap<String, String> getBody) {
        return hrPayRollService.getDesignation(
                getBody.get("userId"),
                Integer.valueOf(getBody.get("departmentId")));

    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getDesignationDropDown")
    public List<DesignationDropDown> getDesignationDropDown(@RequestBody HashMap<String, String> getBody) {
        return hrPayRollService.getDesignationDropDown(
                getBody.get("userID"),
                Integer.valueOf(getBody.get("departmentID")));

    }


    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getLocation", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<LocationData> getLocation(@RequestBody HashMap<String, String> deleteBody) {
        return hrPayRollService.getLocation(
                deleteBody.get("userID"));

    }


    //@CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getDepartment", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<DepartmentData> getDepartment(@RequestBody HashMap<String, String> getBody) {
        return hrPayRollService.getDepartment(
                getBody.get("userId"),
                Integer.valueOf(getBody.get("locationId")));

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
                getBody.get("userID"),getBody.get("countryID"));

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(value = "/getCityDropDown")
    public List<CityDropDown> getCityDropDown(@RequestBody HashMap<String, String> getBody) {
        return hrPayRollService.getCityDropDown(
                getBody.get("userID"),getBody.get("stateID"));

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
