package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.HashMap;
//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class Controller {
    @Autowired
    HrPayRollService hrPayRollService;


    //State Table//
    @PostMapping(value = "/AddState", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> AddState(@RequestBody HashMap<String, String> saveBody)  {
        return hrPayRollService.AddState(saveBody.get("QueryType"),
                saveBody.get("StateName"),
                saveBody.get("CreatedBy"),
                saveBody.get("UpdatedBy"),
                Integer.valueOf(saveBody.get("CountryID")),
                saveBody.get("StateID"));

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
    public HashMap<String, String> AddCity(@RequestBody HashMap<String, String> saveBody)  {
        return hrPayRollService.AddCity(saveBody.get("QueryType"),
                saveBody.get("CityName"),
                saveBody.get("CreatedBy"),
                saveBody.get("UpdatedBy"),
                Integer.valueOf(saveBody.get("StateID")),
                saveBody.get("CityID"));

    }
    @PostMapping(value = "/UpdateCity", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> UpdateCity(@RequestBody HashMap<String, String> upadteBody)  {
        return hrPayRollService.UpdateCity(upadteBody.get("QueryType"),
                upadteBody.get("CityName"),
                upadteBody.get("CreatedBy"),
                upadteBody.get("UpdatedBy"),
                Integer.valueOf(upadteBody.get("StateID")),
                Integer.valueOf(upadteBody.get("StateID")));

    }
    @PostMapping(value = "/DeleteCity", produces = MediaType.APPLICATION_JSON_VALUE)
    public HashMap<String, String> DeleteCity(@RequestBody HashMap<String, String> deleteBody)  {
        return hrPayRollService.DeleteCity(deleteBody.get("QueryType"),
                deleteBody.get("CityName"),
                deleteBody.get("CreatedBy"),
                deleteBody.get("UpdatedBy"),
                Integer.valueOf(deleteBody.get("StateID")),
                Integer.valueOf(deleteBody.get("StateID")));

    }
    @PostMapping(value="/AddCountry")
    public HashMap<String, String> AddCountry(@RequestBody HashMap<String,String> saveBody)
    {
        return  hrPayRollService.AddCountry( saveBody.get("QueryType"),
                saveBody.get("CountryID"),
                saveBody.get("CountryName"),
                saveBody.get("CountryCode"),
                saveBody.get("CreatedBy"),
                saveBody.get("UpdatedBy")

        );
    }

    @PostMapping(value="/UpdateCountry")
    public HashMap<String, String> UpdateCountry(@RequestBody HashMap<String,String> updateBody)
    {
        return  hrPayRollService.UpdateCountry( updateBody.get("QueryType"),
                Integer.valueOf(updateBody.get("CountryID")),
                updateBody.get("CountryName"),
                updateBody.get("CountryCode"),
                updateBody.get("CreatedBy"),
                updateBody.get("UpdatedBy")

        );
    }

    @PostMapping(value="/DeleteCountry")
    public HashMap<String, String> DeleteCountry(@RequestBody HashMap<String,String> deleteBody)
    {
        return  hrPayRollService.DeleteCountry( deleteBody.get("QueryType"),
                Integer.valueOf(deleteBody.get("CountryID")),
                deleteBody.get("CountryName"),
                deleteBody.get("CountryCode"),
                deleteBody.get("CreatedBy"),
                deleteBody.get("UpdatedBy")

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



    @PostMapping(value="/AddLocation")
    public HashMap<String, String> AddLocation(@RequestBody HashMap<String,String> saveBody)
    {
        return  hrPayRollService.AddLocation( saveBody.get("QueryType"),
                saveBody.get("LocationID"),
                saveBody.get("LocationName"),
                saveBody.get("LocationCode"),
                saveBody.get("LocationDescription")


        );
    }

    @PostMapping(value="/UpdateLocation")
    public HashMap<String, String> UpdateLocation(@RequestBody HashMap<String,String> updateBody)
    {
        return  hrPayRollService.UpdateLocation( updateBody.get("QueryType"),
                Integer.valueOf(updateBody.get("LocationID")),
                updateBody.get("LocationName"),
                updateBody.get("LocationCode"),
                updateBody.get("LocationDescription")

        );
    }

    @PostMapping(value="/DeleteLocation")
    public HashMap<String, String> DeleteLocation(@RequestBody HashMap<String,String> loginBody) {
        return hrPayRollService.DeleteLocation(loginBody.get("QueryType"),
                Integer.valueOf(loginBody.get("LocationID")),
                loginBody.get("LocationName"),
                loginBody.get("LocationCode"),
                loginBody.get("LocationDescription")


        );

    }

    @PostMapping(value="/AddDepartment")
    public HashMap<String, String> AddDepartment(@RequestBody HashMap<String,String> saveBody)
    {
        return  hrPayRollService.AddDepartment( saveBody.get("QueryType"),
                saveBody.get("DepartmentID"),
                Integer.valueOf(saveBody.get("LocationID")),
                saveBody.get("DepartmentName"),
                saveBody.get("DepartmentCode"),
                saveBody.get("Description")

        );
    }

    @PostMapping(value="/UpdateDepartment")
    public HashMap<String, String> UpdateDepartment(@RequestBody HashMap<String,String> updateBody)
    {
        return  hrPayRollService.UpdateDepartment( updateBody.get("QueryType"),
                Integer.valueOf(updateBody.get("DepartmentID")),
                Integer.valueOf(updateBody.get("LocationID")),
                updateBody.get("DepartmentName"),
                updateBody.get("DepartmentCode"),
                updateBody.get("Description")

        );
    }

    @PostMapping(value="/DeleteDepartment")
    public HashMap<String, String> DeleteDepartment(@RequestBody HashMap<String,String> deleteBody)
    {
        return  hrPayRollService.DeleteDepartment( deleteBody.get("QueryType"),
                Integer.valueOf(deleteBody.get("DepartmentID")),
                Integer.valueOf(deleteBody.get("LocationID")),
                deleteBody.get("DepartmentName"),
                deleteBody.get("DepartmentCode"),
                deleteBody.get("Description")

        );

    }

    @PostMapping(value="/AddDesignation")
    public HashMap<String, String> AddDesignation(@RequestBody HashMap<String,String> saveBody)
    {
        return  hrPayRollService.AddDesignation( saveBody.get("QueryType"),
                saveBody.get("DesignationID"),
                Integer.valueOf(saveBody.get("DepartmentID")),
                saveBody.get("DesignationName"),
                saveBody.get("DesignationCode"),
                saveBody.get("Description")

        );
    }

    @PostMapping(value="/UpdateDesignation")
    public HashMap<String, String> UpdateDesignation(@RequestBody HashMap<String,String> updateBody)
    {
        return  hrPayRollService.UpdateDesignation( updateBody.get("QueryType"),
                Integer.valueOf(updateBody.get("DesignationID")),
                Integer.valueOf(updateBody.get("DepartmentID")),
                updateBody.get("DesignationName"),
                updateBody.get("DesignationCode"),
                updateBody.get("Description")

        );
    }

    @PostMapping(value="/DeleteDesignation")
    public HashMap<String, String> DeleteDesignation(@RequestBody HashMap<String,String> deleteBody)
    {
        return  hrPayRollService.DeleteDesignation( deleteBody.get("QueryType"),
                Integer.valueOf(deleteBody.get("DepartmentID")),
                Integer.valueOf(deleteBody.get("DepartmentID")),
                deleteBody.get("DesignationName"),
                deleteBody.get("DesignationCode"),
                deleteBody.get("Description")

        );

    }

    @PostMapping(value="/AddSchool")
    public HashMap<String, String> AddSchool(@RequestBody HashMap<String,String> saveBody)
    {
        return  hrPayRollService.AddSchool( saveBody.get("QueryType"),
                saveBody.get("SchoolID"),
                saveBody.get("ClassName"),
                saveBody.get("BoardName"),
                saveBody.get("SchoolName"),
                saveBody.get("StartDate"),
                saveBody.get("EndDate"),
                Float.valueOf(saveBody.get("Persentage"))


        );
    }

    @PostMapping(value="/UpdateSchool")
    public HashMap<String, String> UpdateSchool(@RequestBody HashMap<String,String> updateBody)
    {
        return  hrPayRollService.UpdateSchool( updateBody.get("QueryType"),
                Integer.valueOf(updateBody.get("SchoolID")),
                updateBody.get("ClassName"),
                updateBody.get("BoardName"),
                updateBody.get("SchoolName"),
                updateBody.get("StartDate"),
                updateBody.get("EndDate"),
                Float.valueOf(updateBody.get("Persentage"))

        );
    }

    @PostMapping(value="/DeleteSchool")
    public HashMap<String, String> DeleteSchool(@RequestBody HashMap<String,String> deleteBody)
    {
        return  hrPayRollService.DeleteSchool( deleteBody.get("QueryType"),
                Integer.valueOf(deleteBody.get("SchoolID")),
                deleteBody.get("ClassName"),
                deleteBody.get("BoardName"),
                deleteBody.get("SchoolName"),
                deleteBody.get("StartDate"),
                deleteBody.get("EndDate"),
                Float.valueOf(deleteBody.get("Persentage"))

        );

    }

    @PostMapping(value="/AddGraduation")
    public HashMap<String, String> AddGraduation(@RequestBody HashMap<String,String> saveBody)
    {
        return  hrPayRollService.AddGraduation( saveBody.get("QueryType"),
                saveBody.get("GraduationID"),
                saveBody.get("CourseName"),
                saveBody.get("UniversityName"),
                saveBody.get("CollegeName"),
                saveBody.get("StartDate"),
                saveBody.get("EndDate"),
                Float.valueOf(saveBody.get("Persentage"))


        );
    }

    @PostMapping(value="/UpdateGraduation")
    public HashMap<String, String> UpdateGraduation(@RequestBody HashMap<String,String> updateBody)
    {
        return  hrPayRollService.UpdateGraduation( updateBody.get("QueryType"),
                Integer.valueOf(updateBody.get("GraduationID")),
                updateBody.get("CourseName"),
                updateBody.get("UniversityName"),
                updateBody.get("CollegeName"),
                updateBody.get("StartDate"),
                updateBody.get("EndDate"),
                Float.valueOf(updateBody.get("Persentage"))

        );
    }

    @PostMapping(value="/DeleteGraduation")
    public HashMap<String, String> DeleteGraduation(@RequestBody HashMap<String,String> deleteBody)
    {
        return  hrPayRollService.DeleteGraduation( deleteBody.get("QueryType"),
                Integer.valueOf(deleteBody.get("GraduationID")),
                deleteBody.get("CourseName"),
                deleteBody.get("UniversityName"),
                deleteBody.get("CollegeName"),
                deleteBody.get("StartDate"),
                deleteBody.get("EndDate"),
                Float.valueOf(deleteBody.get("Persentage"))

        );

    }

    @PostMapping(value="/AddPostGraduation")
    public HashMap<String, String> AddPostGraduation(@RequestBody HashMap<String,String> saveBody)
    {
        return  hrPayRollService.AddPostGraduation( saveBody.get("QueryType"),
                saveBody.get("PostGraduationID"),
                saveBody.get("CourseName"),
                saveBody.get("UniversityName"),
                saveBody.get("CollegeName"),
                saveBody.get("StartDate"),
                saveBody.get("EndDate"),
                Float.valueOf(saveBody.get("Persentage"))


        );
    }

    @PostMapping(value="/UpdatePostGraduation")
    public HashMap<String, String> UpdatePostGraduation(@RequestBody HashMap<String,String> updateBody)
    {
        return  hrPayRollService.UpdatePostGraduation( updateBody.get("QueryType"),
                Integer.valueOf(updateBody.get("PostGraduationID")),
                updateBody.get("CourseName"),
                updateBody.get("UniversityName"),
                updateBody.get("CollegeName"),
                updateBody.get("StartDate"),
                updateBody.get("EndDate"),
                Float.valueOf(updateBody.get("Persentage"))

        );
    }

    @PostMapping(value="/DeletePostGraduation")
    public HashMap<String, String> DeletePostGraduation(@RequestBody HashMap<String,String> deleteBody)
    {
        return  hrPayRollService.DeletePostGraduation( deleteBody.get("QueryType"),
                Integer.valueOf(deleteBody.get("PostGraduationID")),
                deleteBody.get("CourseName"),
                deleteBody.get("UniversityName"),
                deleteBody.get("CollegeName"),
                deleteBody.get("StartDate"),
                deleteBody.get("EndDate"),
                Float.valueOf(deleteBody.get("Persentage"))

        );

    }

    @PostMapping(value="/AddOtherEduQualifiaction")
    public HashMap<String, String> AddOtherEduQualifiaction(@RequestBody HashMap<String,String> saveBody)
    {
        return  hrPayRollService.AddOtherEduQualifiaction( saveBody.get("QueryType"),
                saveBody.get("otherEduQualificationTableID"),
                saveBody.get("CourseName"),
                saveBody.get("UniversityName"),
                saveBody.get("CollegeName"),
                saveBody.get("StartDate"),
                saveBody.get("EndDate"),
                Float.valueOf(saveBody.get("Persentage"))


        );
    }

    @PostMapping(value="/UpdateOtherEduQualifiaction")
    public HashMap<String, String> UpdateOtherEduQualifiaction(@RequestBody HashMap<String,String> updateBody)
    {
        return  hrPayRollService.UpdateOtherEduQualifiaction( updateBody.get("QueryType"),
                Integer.valueOf(updateBody.get("otherEduQualificationTableID")),
                updateBody.get("CourseName"),
                updateBody.get("UniversityName"),
                updateBody.get("CollegeName"),
                updateBody.get("StartDate"),
                updateBody.get("EndDate"),
                Float.valueOf(updateBody.get("Persentage"))

        );
    }

    @PostMapping(value="/DeleteOtherEduQualifiaction")
    public HashMap<String, String> DeleteOtherEduQualifiaction(@RequestBody HashMap<String,String> deleteBody)
    {
        return  hrPayRollService.DeleteOtherEduQualifiaction( deleteBody.get("QueryType"),
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
