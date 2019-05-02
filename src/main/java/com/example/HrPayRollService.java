package com.example;

import com.example.ResponseData.*;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class HrPayRollService {

    @PersistenceContext
    EntityManager em;

    HashMap<String, String> map = new HashMap<>();

    public HashMap<String, String> SaveMultipleCountry(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterCountryProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }


    public HashMap<String, String> UpdateMultipleCountry(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterCountryProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }




    public HashMap<String, String> DeleteMultipleCountry(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterCountryProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }

    public HashMap<String, String> SaveMultipleState(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterStateProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }

    public HashMap<String, String> UpdateMultipleState(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterStateProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }



    public HashMap<String, String> DeleteMultipleState(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterStateProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }

    public HashMap<String, String> SaveMultipleCity(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterCityProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }

    public HashMap<String, String> UpdateMultipleCity(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterCityProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }


    public HashMap<String, String> DeleteMultipleCity(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterCityProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }

    public HashMap<String, String> SaveMultiplePostalCode(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterPostalCodeProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }


    public HashMap<String, String> AddPostalCode(Integer postalCode, String UpdatedBy, String Description, Integer CityID, Integer userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("PostalCode");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, 1);
        storedProcedureQuery.setParameter(3, postalCode);
        storedProcedureQuery.setParameter(4, UpdatedBy);
        storedProcedureQuery.setParameter(5, Description);
        storedProcedureQuery.setParameter(6, CityID);
        storedProcedureQuery.setParameter(7, userID);

        storedProcedureQuery.execute();
        String message = storedProcedureQuery.getOutputParameterValue(8).toString();
        String output = storedProcedureQuery.getOutputParameterValue(9).toString();
        map.put("STATUS", message);
        map.put("MESSAGE", output);
        return map;
    }
    public HashMap<String, String> UpdateMultiplePostalCode(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterPostalCodeProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }

    public HashMap<String, String> UpdatePostalCode(Integer pID, Integer postalCode, String UpdatedBy, String Description, Integer CityID, Integer userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("PostalCode");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, pID);
        storedProcedureQuery.setParameter(3, postalCode);
        storedProcedureQuery.setParameter(4, UpdatedBy);
        storedProcedureQuery.setParameter(5, Description);
        storedProcedureQuery.setParameter(6, CityID);
        storedProcedureQuery.setParameter(7, userID);

        storedProcedureQuery.execute();
        String message = storedProcedureQuery.getOutputParameterValue(8).toString();
        String output = storedProcedureQuery.getOutputParameterValue(9).toString();
        map.put("STATUS", message);
        map.put("MESSAGE", output);
        return map;
    }

    public HashMap<String, String> DeletePostalCode(Integer pid, Integer userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("PostalCode");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, pid);
        storedProcedureQuery.setParameter(3, 1);
        storedProcedureQuery.setParameter(4, 1);
        storedProcedureQuery.setParameter(5, "");
        storedProcedureQuery.setParameter(6, 1);
        storedProcedureQuery.setParameter(7, userID);
        storedProcedureQuery.execute();
        String message = storedProcedureQuery.getOutputParameterValue(8).toString();
        String output = storedProcedureQuery.getOutputParameterValue(9).toString();
        map.put("STATUS", message);
        map.put("MESSAGE", output);
        return map;


    }

    public HashMap<String, String> DeleteMultiplePostalCode(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterPostalCodeProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }




    public HashMap<String, String> SaveMultipleEmployeeDetails(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterEmployeeDetailsProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        return map;
    }


    public HashMap<String, String> AddEmployee(Integer E_Code, String E_FristName, String E_MiddleName, String E_LastName, Integer E_Designaton, String E_Gender, String E_Title, String E_DOB, String E_Dept, String E_MaritalStatus, String Anniversary, String E_Image, String E_EmployementType, String UpdatedBy, Integer userID, String E_Location) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterEmployee");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(11, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(12, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(13, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(14, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(15, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(16, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(17, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(18, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(19, String.class, ParameterMode.OUT);
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(E_DOB);
        System.out.println(E_Image);
        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, E_Code);
        storedProcedureQuery.setParameter(3, E_FristName);
        storedProcedureQuery.setParameter(4, E_MiddleName);
        storedProcedureQuery.setParameter(5, E_LastName);
        storedProcedureQuery.setParameter(6, E_Designaton);
        storedProcedureQuery.setParameter(7, E_Gender);
        storedProcedureQuery.setParameter(8, E_Title);
        storedProcedureQuery.setParameter(9, date1);
        storedProcedureQuery.setParameter(10, E_Dept);
        storedProcedureQuery.setParameter(11, E_MaritalStatus);
        storedProcedureQuery.setParameter(12, Anniversary);
        storedProcedureQuery.setParameter(13, "hghjgvhjb");
        storedProcedureQuery.setParameter(14, E_EmployementType);
        storedProcedureQuery.setParameter(15, UpdatedBy);
        storedProcedureQuery.setParameter(16, userID);
        storedProcedureQuery.setParameter(17, E_Location);
        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(18).toString();
        String output = storedProcedureQuery.getOutputParameterValue(19).toString();

        map.put("STATUS", result);
        map.put("MESSAGE", output);
        return map;
    }

    public List<EmployeeDashBoard> getEmployeeDashBoard(String userId) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getEmployeeDashBoard", "EmployeeDashBoardMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userId);
        return storedProcedureQuery.getResultList();
    }







    public HashMap<String, String> SaveMultipleLocation(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterLocationProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }



    public HashMap<String, String> UpdateMultipleLocation(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterLocationProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }


    public HashMap<String, String> DeleteMultipleLocation(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterLocationProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }

    public List<LocationDropDown> getLocationDropDown(String userId) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getLocation", "locationDropDownMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userId);
        return storedProcedureQuery.getResultList();
    }


    public HashMap<String, String> DeleteMultipleEmployee(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterEmployeeDetails");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        return map;
    }



    public HashMap<String, String> SaveMultipleDepartment(String JSON ) {
        JSON=JSON.replace("\'","\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterDepartmentProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result );
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }

    public HashMap<String, String> UpdateMultipleDepartment(String JSON ) {
        JSON=JSON.replace("\'","\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterDepartmentProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result );
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }

    public HashMap<String, String> DeleteMultipleDepartment(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterDepartmentProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result );
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }


    public HashMap<String, String> SaveMultipleDesignation(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterDesignationProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }


    public HashMap<String, String> UpdateMultipleDesignation(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterDesignationProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }


    public HashMap<String, String> DeleteMultipleDesignation(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterDesignationProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }


    public HashMap<String, String> SaveMultipleSchool(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterSchoolProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }


    public HashMap<String, String> UpdateMultipleSchool(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterSchoolProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }
    public HashMap<String, String> DeleteMultipleSchool(String JSON ) {
        JSON=JSON.replace("\'","\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterSchoolProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }


    public HashMap<String, String> SaveMultipleGraduation(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterGraduationProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }


    public HashMap<String, String> UpdateMultipleGraduation(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterGraduationProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }


    public HashMap<String, String> DeleteMultipleGraduation(String JSON ) {
        JSON=JSON.replace("\'","\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterGraduationProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }
    public HashMap<String, String> SaveMultiplePG(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterPostGraduationProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }


    public HashMap<String, String> AddPostGraduation(String Degree, String Specialization, String University, String StartDate, String EndDate, String Percentage, String UpdatedBy, Integer userID) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("postGraduationprocedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, Float.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(10, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(11, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(12, String.class, ParameterMode.OUT);

        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(StartDate);
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(EndDate);
        float percentage = Float.parseFloat(Percentage);
        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, 1);
        storedProcedureQuery.setParameter(3, Degree);
        storedProcedureQuery.setParameter(4, Specialization);
        storedProcedureQuery.setParameter(5, University);
        storedProcedureQuery.setParameter(6, date1);
        storedProcedureQuery.setParameter(7, date2);
        storedProcedureQuery.setParameter(8, percentage);
        storedProcedureQuery.setParameter(9, UpdatedBy);
        storedProcedureQuery.setParameter(10, userID);
        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(11).toString();
        String message = storedProcedureQuery.getOutputParameterValue(12).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        return map;

    }
    public HashMap<String, String> UpdateMultiplePG(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterPostGraduationProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }

    public HashMap<String, String> UpdatePostGraduation(Integer PostGraduationID, String Degree, String Specialization, String University, String StartDate, String EndDate, String Percentage, String UpdatedBy, Integer userID) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("postGraduationprocedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, Float.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(10, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(11, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(12, String.class, ParameterMode.OUT);

        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(StartDate);
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(EndDate);
        float percentage = Float.parseFloat(Percentage);
        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, PostGraduationID);
        storedProcedureQuery.setParameter(3, Degree);
        storedProcedureQuery.setParameter(4, Specialization);
        storedProcedureQuery.setParameter(5, University);
        storedProcedureQuery.setParameter(6, date1);
        storedProcedureQuery.setParameter(7, date2);
        storedProcedureQuery.setParameter(8, percentage);
        storedProcedureQuery.setParameter(9, UpdatedBy);
        storedProcedureQuery.setParameter(10, userID);
        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(11).toString();
        String message = storedProcedureQuery.getOutputParameterValue(12).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        return map;

    }
    public HashMap<String, String> DeleteMultiplePG(String JSON ) {
        JSON=JSON.replace("\'","\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterPostGraduationProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result );
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }

    public HashMap<String, String> DeletePostGraduation(Integer PostGraduationID, Integer userID) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("postGraduationprocedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, Float.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(10, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(11, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(12, String.class, ParameterMode.OUT);

        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2018");
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2018");
        float percentage = Float.parseFloat("70.1");

        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, PostGraduationID);
        storedProcedureQuery.setParameter(3, "");
        storedProcedureQuery.setParameter(4, "");
        storedProcedureQuery.setParameter(5, "");
        storedProcedureQuery.setParameter(6, date1);
        storedProcedureQuery.setParameter(7, date2);
        storedProcedureQuery.setParameter(8, percentage);
        storedProcedureQuery.setParameter(9, "");
        storedProcedureQuery.setParameter(10, userID);
        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(11).toString();
        String message = storedProcedureQuery.getOutputParameterValue(12).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        return map;

    }

    public HashMap<String, String> SaveMultipleOtherQualification(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterOtherQualificationProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }


    public HashMap<String, String> AddOtherEduQualifiaction(String Degree, String Specialization, String University, String StartDate, String EndDate, String Percentage, String UpdatedBy, Integer userID) throws ParseException {

        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("otherEduprocedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, Float.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(10, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(11, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(12, String.class, ParameterMode.OUT);

        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(StartDate);
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(EndDate);
        float percentage = Float.parseFloat(Percentage);
        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, "1");
        storedProcedureQuery.setParameter(3, Degree);
        storedProcedureQuery.setParameter(4, Specialization);
        storedProcedureQuery.setParameter(5, University);
        storedProcedureQuery.setParameter(6, date1);
        storedProcedureQuery.setParameter(7, date2);
        storedProcedureQuery.setParameter(8, percentage);
        storedProcedureQuery.setParameter(9, UpdatedBy);
        storedProcedureQuery.setParameter(10, userID);
        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(11).toString();
        String message = storedProcedureQuery.getOutputParameterValue(12).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        return map;

    }
    public HashMap<String, String> UpdateMultipleOtherQualification(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterOtherQualificationProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }

    public HashMap<String, String> UpdateOtherEduQualifiaction(Integer otherEduQualificationTableID, String Degree, String Specialization, String University, String StartDate, String EndDate, String Percentage, String UpdatedBy, Integer userID) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("otherEduprocedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, Float.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(10, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(11, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(12, String.class, ParameterMode.OUT);

        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(StartDate);
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(EndDate);
        float percentage = Float.parseFloat(Percentage);
        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, otherEduQualificationTableID);
        storedProcedureQuery.setParameter(3, Degree);
        storedProcedureQuery.setParameter(4, Specialization);
        storedProcedureQuery.setParameter(5, University);
        storedProcedureQuery.setParameter(6, date1);
        storedProcedureQuery.setParameter(7, date2);
        storedProcedureQuery.setParameter(8, percentage);
        storedProcedureQuery.setParameter(9, UpdatedBy);
        storedProcedureQuery.setParameter(10, userID);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(11).toString();
        String message = storedProcedureQuery.getOutputParameterValue(12).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        return map;
    }
    public HashMap<String, String> DeleteMultipleOtherQualification(String JSON ) {
        JSON=JSON.replace("\'","\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterOtherQualificationProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result );
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }

    public HashMap<String, String> DeleteOtherEduQualifiaction(Integer otherEduQualificationTableID, Integer userID) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("otherEduprocedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, Float.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(10, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(11, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(12, String.class, ParameterMode.OUT);


        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2018");
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2018");
        float percentage = Float.parseFloat("70.1");
        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, otherEduQualificationTableID);
        storedProcedureQuery.setParameter(3, "");
        storedProcedureQuery.setParameter(4, "");
        storedProcedureQuery.setParameter(5, "");
        storedProcedureQuery.setParameter(6, date1);
        storedProcedureQuery.setParameter(7, date2);
        storedProcedureQuery.setParameter(8, percentage);
        storedProcedureQuery.setParameter(9, "");
        storedProcedureQuery.setParameter(10, userID);
        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(11).toString();
        String message = storedProcedureQuery.getOutputParameterValue(12).toString();

        map.put("STATUS", result);
        map.put("MESSAGE", message);
        return map;
    }


    public HashMap<String, String> SavePassportData(String PassportNumber, String ExpiryDate, String UploadDucument, String TimeDuration, Integer EmpId, String userId) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterPassport");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.OUT);

        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(ExpiryDate);

        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, PassportNumber);
        storedProcedureQuery.setParameter(3, date1);
        storedProcedureQuery.setParameter(4, UploadDucument);
        storedProcedureQuery.setParameter(5, TimeDuration);
        storedProcedureQuery.setParameter(6, EmpId);
        storedProcedureQuery.setParameter(7, userId);
        storedProcedureQuery.setParameter(8, 1);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(9).toString();
        String output = storedProcedureQuery.getOutputParameterValue(10).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", output);
        return map;
    }


    public HashMap<String, String> UpdatePassportData(String PassportNumber, String ExpiryDate, String UploadDucument,
                                                      String TimeDuration, Integer EmpId, String userId, Integer pId) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterPassport");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.OUT);

        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(ExpiryDate);

        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, PassportNumber);
        storedProcedureQuery.setParameter(3, date1);
        storedProcedureQuery.setParameter(4, UploadDucument);
        storedProcedureQuery.setParameter(5, TimeDuration);
        storedProcedureQuery.setParameter(6, EmpId);
        storedProcedureQuery.setParameter(7, userId);
        storedProcedureQuery.setParameter(8, pId);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(9).toString();
        String output = storedProcedureQuery.getOutputParameterValue(10).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", output);
        return map;
    }


    public HashMap<String, String> DeletePassportData(String userId, Integer pId) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterPassport");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.OUT);

        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2014");

        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, "");
        storedProcedureQuery.setParameter(3, date1);
        storedProcedureQuery.setParameter(4, "");
        storedProcedureQuery.setParameter(5, "");
        storedProcedureQuery.setParameter(6, 1);
        storedProcedureQuery.setParameter(7, userId);
        storedProcedureQuery.setParameter(8, pId);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(9).toString();
        String output = storedProcedureQuery.getOutputParameterValue(10).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", output);
        return map;
    }

    public List<PassportData> getPassportData(String userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getPassportData", "PassportDataMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userID);
        return storedProcedureQuery.getResultList();
    }

    public HashMap<String, String> SaveVisaData(String Country, String ExpiryDate, String UploadDucument, String TimeDuration, Integer EmpId, String userId) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterVisa");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.OUT);

        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(ExpiryDate);

        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, Country);
        storedProcedureQuery.setParameter(3, date1);
        storedProcedureQuery.setParameter(4, UploadDucument);
        storedProcedureQuery.setParameter(5, TimeDuration);
        storedProcedureQuery.setParameter(6, EmpId);
        storedProcedureQuery.setParameter(7, userId);
        storedProcedureQuery.setParameter(8, 1);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(9).toString();
        String output = storedProcedureQuery.getOutputParameterValue(10).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", output);
        return map;
    }


    public HashMap<String, String> UpdateVisaData(String Country, String ExpiryDate, String UploadDucument,
                                                  String TimeDuration, Integer EmpId, String userId, Integer VisaId) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterVisa");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.OUT);

        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(ExpiryDate);

        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, Country);
        storedProcedureQuery.setParameter(3, date1);
        storedProcedureQuery.setParameter(4, UploadDucument);
        storedProcedureQuery.setParameter(5, TimeDuration);
        storedProcedureQuery.setParameter(6, EmpId);
        storedProcedureQuery.setParameter(7, userId);
        storedProcedureQuery.setParameter(8, VisaId);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(9).toString();
        String output = storedProcedureQuery.getOutputParameterValue(10).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", output);
        return map;
    }


    public HashMap<String, String> DeleteVisaData(String userId, Integer VisaId) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterVisa");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.OUT);

        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2014");

        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, "");
        storedProcedureQuery.setParameter(3, date1);
        storedProcedureQuery.setParameter(4, "");
        storedProcedureQuery.setParameter(5, "");
        storedProcedureQuery.setParameter(6, 1);
        storedProcedureQuery.setParameter(7, userId);
        storedProcedureQuery.setParameter(8, VisaId);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(9).toString();
        String output = storedProcedureQuery.getOutputParameterValue(10).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", output);
        return map;
    }


    public List<VisaData> getVisaData(String userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getVisaData", "VisaDataMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userID);
        return storedProcedureQuery.getResultList();
    }


    public List<EmployeeBasicDetails> GetAllEmolyeeDetails() {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getEmployeeDetails", "resultMapping");
        try {
            storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(3, Integer.class, ParameterMode.IN);
            storedProcedureQuery.setParameter(1, "GetAllEmolyeeDetail");
            storedProcedureQuery.setParameter(2, 1);
            storedProcedureQuery.setParameter(3, 1);
            return storedProcedureQuery.getResultList();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public List<EmployeeBasicDetails> GetEmolyeeDetail(Integer E_ID, Integer userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getEmployeeDetails", "resultMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, Integer.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, "GetEmolyeeDetail");
        storedProcedureQuery.setParameter(2, E_ID);
        storedProcedureQuery.setParameter(3, userID);
        return storedProcedureQuery.getResultList();
    }


    public HashMap<String, String> SaveMultipleeAddress(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasteraddressBookProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }


    public HashMap<String, String> SaveAddress(String Address, String City, String State, String
            Country, String Pin_code, String Address_Status, String Contact_No, String Email_ID, String Emergency_contact_person, String
                                                       Emergency_contact_number, Integer eid, String userID, String UpdatedBy, Integer cityfkId, Integer statefkId, Integer countryfkId) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterAddressBook");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(11, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(12, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(13, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(14, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(15, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(16, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(17, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(18, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(19, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(20, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, Address);
        storedProcedureQuery.setParameter(3, City);
        storedProcedureQuery.setParameter(4, State);
        storedProcedureQuery.setParameter(5, Country);
        storedProcedureQuery.setParameter(6, Pin_code);
        storedProcedureQuery.setParameter(7, Address_Status);
        storedProcedureQuery.setParameter(8, Contact_No);
        storedProcedureQuery.setParameter(9, Email_ID);
        storedProcedureQuery.setParameter(10, Emergency_contact_person);
        storedProcedureQuery.setParameter(11, Emergency_contact_number);
        storedProcedureQuery.setParameter(12, eid);
        storedProcedureQuery.setParameter(13, 1);
        storedProcedureQuery.setParameter(14, userID);
        storedProcedureQuery.setParameter(15, UpdatedBy);
        storedProcedureQuery.setParameter(16, cityfkId);
        storedProcedureQuery.setParameter(17, statefkId);
        storedProcedureQuery.setParameter(18, countryfkId);
        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(19).toString();
        String output = storedProcedureQuery.getOutputParameterValue(20).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", output);
        return map;
    }

    public HashMap<String, String> UpdateAddress(String QueryType, String Address, String City, String
            State, String Country, String Pin_code, String Address_Status, String Contact_No, String Email_ID, String Emergency_contact_person, String
                                                         Emergency_contact_number, Integer eid, Integer A_ID, String userID, String UpdatedBy) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterAddressBook");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(11, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(12, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(13, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(14, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(15, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(16, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(17, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, Address);
        storedProcedureQuery.setParameter(3, City);
        storedProcedureQuery.setParameter(4, State);
        storedProcedureQuery.setParameter(5, Country);
        storedProcedureQuery.setParameter(6, Pin_code);
        storedProcedureQuery.setParameter(7, Address_Status);
        storedProcedureQuery.setParameter(8, Contact_No);
        storedProcedureQuery.setParameter(9, Email_ID);
        storedProcedureQuery.setParameter(10, Emergency_contact_person);
        storedProcedureQuery.setParameter(11, Emergency_contact_number);
        storedProcedureQuery.setParameter(12, eid);
        storedProcedureQuery.setParameter(13, A_ID);
        storedProcedureQuery.setParameter(14, userID);
        storedProcedureQuery.setParameter(15, UpdatedBy);
        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(16).toString();
        String output = storedProcedureQuery.getOutputParameterValue(17).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", output);
        return map;
    }
    public HashMap<String, String> UpdateMultipleAddress(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasteraddressBookProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }

    public HashMap<String, String> DeleteAddress(String A_ID, String userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterAddressBook");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(11, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(12, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(13, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(14, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(15, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(16, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(17, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, "");
        storedProcedureQuery.setParameter(3, "");
        storedProcedureQuery.setParameter(4, "");
        storedProcedureQuery.setParameter(5, "");
        storedProcedureQuery.setParameter(6, "");
        storedProcedureQuery.setParameter(7, "");
        storedProcedureQuery.setParameter(8, "");
        storedProcedureQuery.setParameter(9, "");
        storedProcedureQuery.setParameter(10, "");
        storedProcedureQuery.setParameter(11, "");
        storedProcedureQuery.setParameter(12, 1);
        storedProcedureQuery.setParameter(13, A_ID);
        storedProcedureQuery.setParameter(14, userID);
        storedProcedureQuery.setParameter(15, "");
        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(16).toString();
        String output = storedProcedureQuery.getOutputParameterValue(17).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", output);
        return map;
    }

    public HashMap<String, String> DeleteMultipleAddress(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasteraddressBookProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }

    public HashMap<String, String> saveProfessionQualification(String Institute, String
            Course, String StartDate, String EndDate, String UpdatedBy, Integer userID) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("ProfessionalQualification");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.OUT);

        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(StartDate);
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(EndDate);

        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, Institute);
        storedProcedureQuery.setParameter(3, Course);
        storedProcedureQuery.setParameter(4, date1);
        storedProcedureQuery.setParameter(5, date2);
        storedProcedureQuery.setParameter(6, UpdatedBy);
        storedProcedureQuery.setParameter(7, 1);
        storedProcedureQuery.setParameter(8, userID);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(9).toString();
        String output = storedProcedureQuery.getOutputParameterValue(10).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", output);
        return map;
    }

    public HashMap<String, String> upadteProfessionQualification(String Institute, String
            Course, String StartDate, String EndDate, String UpdatedBy, Integer Q_id, Integer userID) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("ProfessionalQualification");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.OUT);


        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(StartDate);
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(EndDate);

        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, Institute);
        storedProcedureQuery.setParameter(3, Course);
        storedProcedureQuery.setParameter(4, date1);
        storedProcedureQuery.setParameter(5, date2);
        storedProcedureQuery.setParameter(6, UpdatedBy);
        storedProcedureQuery.setParameter(7, Q_id);
        storedProcedureQuery.setParameter(8, userID);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(9).toString();
        String output = storedProcedureQuery.getOutputParameterValue(10).toString();

        map.put("STATUS", result);
        map.put("MESSAGE", output);
        return map;
    }

    public HashMap<String, String> DeleteProfessionQualification(String qId, Integer userID) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("ProfessionalQualification");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.OUT);

        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2018");
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2018");

        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, "");
        storedProcedureQuery.setParameter(3, "");
        storedProcedureQuery.setParameter(4, date1);
        storedProcedureQuery.setParameter(5, date2);
        storedProcedureQuery.setParameter(6, "");
        storedProcedureQuery.setParameter(7, qId);
        storedProcedureQuery.setParameter(8, userID);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(9).toString();
        String output = storedProcedureQuery.getOutputParameterValue(10).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", output);
        return map;
    }
    public HashMap<String, String> SaveMultipleEmpExperience(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterEmployeeExperienceProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }
    public HashMap<String, String> AddEmployeeExperience(String CompanyName, String Designation, String Department,
                                                         String JoiningDate, String ExitDate, String Experience, String Location,
                                                         Integer EmployeeID, Integer userId) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterEmployeeExperience");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, Float.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(10, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(11, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(12, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(13, String.class, ParameterMode.OUT);

        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(JoiningDate);
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(ExitDate);
        float experience = Float.parseFloat(Experience);

        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, CompanyName);
        storedProcedureQuery.setParameter(3, Designation);
        storedProcedureQuery.setParameter(4, Department);
        storedProcedureQuery.setParameter(5, date1);
        storedProcedureQuery.setParameter(6, date2);
        storedProcedureQuery.setParameter(7, experience);
        storedProcedureQuery.setParameter(8, Location);
        storedProcedureQuery.setParameter(9, EmployeeID);
        storedProcedureQuery.setParameter(10, 1);
        storedProcedureQuery.setParameter(11, userId);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(12).toString();
        String output = storedProcedureQuery.getOutputParameterValue(13).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", output);
        return map;
    }
    public HashMap<String, String> UpdateMultipleEmpExperience(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterEmployeeExperienceProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }

    public HashMap<String, String> UpdateEmployeeExperience(String CompanyName, String Designation, String Department,
                                                            String JoiningDate, String ExitDate, String Experience, String Location,
                                                            Integer EmployeeID, Integer ExpId, Integer userId) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterEmployeeExperience");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, Float.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(10, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(11, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(12, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(13, String.class, ParameterMode.OUT);

        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(JoiningDate);
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(ExitDate);
        float experience = Float.parseFloat(Experience);

        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, CompanyName);
        storedProcedureQuery.setParameter(3, Designation);
        storedProcedureQuery.setParameter(4, Department);
        storedProcedureQuery.setParameter(5, date1);
        storedProcedureQuery.setParameter(6, date2);
        storedProcedureQuery.setParameter(7, experience);
        storedProcedureQuery.setParameter(8, Location);
        storedProcedureQuery.setParameter(9, EmployeeID);
        storedProcedureQuery.setParameter(10, ExpId);
        storedProcedureQuery.setParameter(11, userId);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(12).toString();
        String output = storedProcedureQuery.getOutputParameterValue(13).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", output);
        return map;
    }
    public HashMap<String, String> DeleteMultipleEmpExperience(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterEmployeeExperienceProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }
    public HashMap<String, String> DeleteEmployeeExperience(Integer ExpId, Integer userId) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterEmployeeExperience");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, Float.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(10, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(11, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(12, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(13, String.class, ParameterMode.OUT);

        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2018");
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2018");
        float experience = Float.parseFloat("77.5");

        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, "");
        storedProcedureQuery.setParameter(3, "");
        storedProcedureQuery.setParameter(4, "");
        storedProcedureQuery.setParameter(5, date1);
        storedProcedureQuery.setParameter(6, date2);
        storedProcedureQuery.setParameter(7, experience);
        storedProcedureQuery.setParameter(8, "");
        storedProcedureQuery.setParameter(9, 1);
        storedProcedureQuery.setParameter(10, ExpId);
        storedProcedureQuery.setParameter(11, userId);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(12).toString();
        String output = storedProcedureQuery.getOutputParameterValue(13).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", output);
        return map;
    }


    public HashMap<String, String> AddSkills(String Skills, String userID, String UpdatedBy) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterSkills");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, 1);
        storedProcedureQuery.setParameter(3, Skills);
        storedProcedureQuery.setParameter(4, userID);
        storedProcedureQuery.setParameter(5, 1);
        storedProcedureQuery.setParameter(6, UpdatedBy);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(7).toString();
        String message = storedProcedureQuery.getOutputParameterValue(8).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        return map;

    }

    public HashMap<String, String> UpdateSkills(Integer SId, String Skills, String userID, Integer EId, String UpdatedBy) {

        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterSkills");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, SId);
        storedProcedureQuery.setParameter(3, Skills);
        storedProcedureQuery.setParameter(4, userID);
        storedProcedureQuery.setParameter(5, EId);
        storedProcedureQuery.setParameter(6, UpdatedBy);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(7).toString();
        String message = storedProcedureQuery.getOutputParameterValue(8).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        return map;

    }

    public HashMap<String, String> DeleteSkills(Integer SId, String userID) {

        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterSkills");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, SId);
        storedProcedureQuery.setParameter(3, "");
        storedProcedureQuery.setParameter(4, userID);
        storedProcedureQuery.setParameter(5, 1);
        storedProcedureQuery.setParameter(6, "");
        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(7).toString();
        String message = storedProcedureQuery.getOutputParameterValue(8).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        return map;

    }
    public HashMap<String, String> SaveMultipleAchievements(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterAchievementsProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }
    public HashMap<String, String> AddAchievements(String CertificateName, String StartDate, String EndDate, String userID, Integer EId, String UpdatedBy) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterAchievements");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.OUT);

        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(StartDate);
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(EndDate);

        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, 1);
        storedProcedureQuery.setParameter(3, CertificateName);
        storedProcedureQuery.setParameter(4, date1);
        storedProcedureQuery.setParameter(5, date2);
        storedProcedureQuery.setParameter(6, userID);
        storedProcedureQuery.setParameter(7, EId);
        storedProcedureQuery.setParameter(8, UpdatedBy);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(9).toString();
        String message = storedProcedureQuery.getOutputParameterValue(10).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        return map;
    }
    public HashMap<String, String> UpdateMultipleAchievements(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterAchievementsProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }
    public HashMap<String, String> UpdateAchievements(Integer CId, String Certififation, String StartDate, String EndDate, String userID, Integer EId, String UpdatedBy) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterAchievements");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.OUT);

        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(StartDate);
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(EndDate);

        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, CId);
        storedProcedureQuery.setParameter(3, Certififation);
        storedProcedureQuery.setParameter(4, date1);
        storedProcedureQuery.setParameter(5, date2);
        storedProcedureQuery.setParameter(6, userID);
        storedProcedureQuery.setParameter(7, EId);
        storedProcedureQuery.setParameter(8, UpdatedBy);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(9).toString();
        String message = storedProcedureQuery.getOutputParameterValue(10).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        return map;
    }
    public HashMap<String, String> DeleteMultipleAchievements(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterAchievementsProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }
    public HashMap<String, String> DeleteAchievements(Integer CId, String userID) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterAchievements");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.OUT);


        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2018");
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2018");

        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, CId);
        storedProcedureQuery.setParameter(3, "");
        storedProcedureQuery.setParameter(4, date1);
        storedProcedureQuery.setParameter(5, date2);
        storedProcedureQuery.setParameter(6, userID);
        storedProcedureQuery.setParameter(7, 1);
        storedProcedureQuery.setParameter(8, "");

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(9).toString();
        String message = storedProcedureQuery.getOutputParameterValue(10).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        return map;
    }
    public HashMap<String, String> SaveMultipleBankDetails(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterBankDetailProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }
    public HashMap<String, String> AddBankDetails(String AccountType, String AccountHolderName, String AccountNumber, String IFSCCode, String BranchName, String PrimaryType, String userID, Integer EId, String UpdatedBy) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterBankDetails");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(10, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(11, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(12, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(13, String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, 1);
        storedProcedureQuery.setParameter(3, AccountType);
        storedProcedureQuery.setParameter(4, AccountHolderName);
        storedProcedureQuery.setParameter(5, AccountNumber);
        storedProcedureQuery.setParameter(6, IFSCCode);
        storedProcedureQuery.setParameter(7, BranchName);
        storedProcedureQuery.setParameter(8, PrimaryType);
        storedProcedureQuery.setParameter(9, userID);
        storedProcedureQuery.setParameter(10, EId);
        storedProcedureQuery.setParameter(11, UpdatedBy);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(12).toString();
        String message = storedProcedureQuery.getOutputParameterValue(13).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        return map;
    }
    public HashMap<String, String> UpdateMultipleBankDetails(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterBankDetailProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }
    public HashMap<String, String> UpdateBankDetails(Integer BId, String AccountType, String AccountHolderName, String AccountNumber, String IFSCCode, String BranchName, String PrimaryType, String userID, Integer EId, String UpdatedBy) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterBankDetails");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(10, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(11, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(12, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(13, String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, BId);
        storedProcedureQuery.setParameter(3, AccountType);
        storedProcedureQuery.setParameter(4, AccountHolderName);
        storedProcedureQuery.setParameter(5, AccountNumber);
        storedProcedureQuery.setParameter(6, IFSCCode);
        storedProcedureQuery.setParameter(7, BranchName);
        storedProcedureQuery.setParameter(8, PrimaryType);
        storedProcedureQuery.setParameter(9, userID);
        storedProcedureQuery.setParameter(10, EId);
        storedProcedureQuery.setParameter(11, UpdatedBy);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(12).toString();
        String message = storedProcedureQuery.getOutputParameterValue(13).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        return map;
    }
    public HashMap<String, String> DeleteMultipleBankDetails(String JSON) {
        JSON = JSON.replace("\'", "\"");
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterBankDetailProcedure");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, JSON);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(3).toString();
        String message = storedProcedureQuery.getOutputParameterValue(4).toString();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        map.put("OUTPUT", output);
        return map;
    }
    public HashMap<String, String> DeleteBankDetails(Integer BId, String userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterBankDetails");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(10, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(11, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(12, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(13, String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, BId);
        storedProcedureQuery.setParameter(3, "");
        storedProcedureQuery.setParameter(4, "");
        storedProcedureQuery.setParameter(5, "");
        storedProcedureQuery.setParameter(6, "");
        storedProcedureQuery.setParameter(7, "");
        storedProcedureQuery.setParameter(8, "");
        storedProcedureQuery.setParameter(9, userID);
        storedProcedureQuery.setParameter(10, 1);
        storedProcedureQuery.setParameter(11, "");

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(12).toString();
        String message = storedProcedureQuery.getOutputParameterValue(13).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        return map;
    }

    public HashMap<String, String> AddDrivingLicence(String DLNumber, String ExpiryDate, String UploadDocument, String TimeDuration, Integer EID, String userID) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("DrivingLicence");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.OUT);

        Date expiryDate = new SimpleDateFormat("dd/MM/yyyy").parse(ExpiryDate);
        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, 1);
        storedProcedureQuery.setParameter(3, DLNumber);
        storedProcedureQuery.setParameter(4, expiryDate);
        storedProcedureQuery.setParameter(5, UploadDocument);
        storedProcedureQuery.setParameter(6, TimeDuration);
        storedProcedureQuery.setParameter(7, EID);
        storedProcedureQuery.setParameter(8, userID);
        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(9).toString();
        String message = storedProcedureQuery.getOutputParameterValue(10).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        return map;

    }

    public HashMap<String, String> UpdateDrivingLicence(Integer DLID, String DLNumber, String ExpiryDate, String UploadDocument, String TimeDuration, Integer EID, Integer userID) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("DrivingLicence");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.OUT);

        Date expiryDate = new SimpleDateFormat("dd/MM/yyyy").parse(ExpiryDate);
        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, DLID);
        storedProcedureQuery.setParameter(3, DLNumber);
        storedProcedureQuery.setParameter(4, expiryDate);
        storedProcedureQuery.setParameter(5, UploadDocument);
        storedProcedureQuery.setParameter(6, TimeDuration);
        storedProcedureQuery.setParameter(7, EID);
        storedProcedureQuery.setParameter(8, userID);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(9).toString();
        String message = storedProcedureQuery.getOutputParameterValue(10).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        return map;

    }


    public HashMap<String, String> DeleteDrivingLicence(Integer DLID, Integer userID) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("DrivingLicence");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.OUT);

        Date expiryDate = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2018");

        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, DLID);
        storedProcedureQuery.setParameter(3, "");
        storedProcedureQuery.setParameter(4, expiryDate);
        storedProcedureQuery.setParameter(5, "");
        storedProcedureQuery.setParameter(6, "");
        storedProcedureQuery.setParameter(7, 1);
        storedProcedureQuery.setParameter(8, userID);
        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(9).toString();
        String message = storedProcedureQuery.getOutputParameterValue(10).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        return map;

    }

    public List<DrivingLicenceData> getDrivingLicence(String userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getDrivingLicenceData", "DLDataMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userID);
        return storedProcedureQuery.getResultList();
    }

    public HashMap<String, String> AddMedicalCertification(String MCertificateNumber, String ExpiryDate, String UploadDocument, String TimeDuration, Integer EID, String userID) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MedicalCertificate");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.OUT);

        Date expiryDate = new SimpleDateFormat("dd/MM/yyyy").parse(ExpiryDate);
        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, 1);
        storedProcedureQuery.setParameter(3, MCertificateNumber);
        storedProcedureQuery.setParameter(4, expiryDate);
        storedProcedureQuery.setParameter(5, UploadDocument);
        storedProcedureQuery.setParameter(6, TimeDuration);
        storedProcedureQuery.setParameter(7, EID);
        storedProcedureQuery.setParameter(8, userID);
        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(9).toString();
        String message = storedProcedureQuery.getOutputParameterValue(10).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        return map;

    }

    public HashMap<String, String> UpdateMedicalCertification(Integer MedicalID, String DLNumber, String ExpiryDate, String UploadDocument, String TimeDuration, Integer EID, Integer userID) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MedicalCertificate");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.OUT);

        Date expiryDate = new SimpleDateFormat("dd/MM/yyyy").parse(ExpiryDate);
        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, MedicalID);
        storedProcedureQuery.setParameter(3, DLNumber);
        storedProcedureQuery.setParameter(4, expiryDate);
        storedProcedureQuery.setParameter(5, UploadDocument);
        storedProcedureQuery.setParameter(6, TimeDuration);
        storedProcedureQuery.setParameter(7, EID);
        storedProcedureQuery.setParameter(8, userID);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(9).toString();
        String message = storedProcedureQuery.getOutputParameterValue(10).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        return map;

    }


    public HashMap<String, String> DeleteMedicalCertification(Integer MedicalID, Integer userID) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MedicalCertificate");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.OUT);

        Date expiryDate = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2018");

        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, MedicalID);
        storedProcedureQuery.setParameter(3, "");
        storedProcedureQuery.setParameter(4, expiryDate);
        storedProcedureQuery.setParameter(5, "");
        storedProcedureQuery.setParameter(6, "");
        storedProcedureQuery.setParameter(7, 1);
        storedProcedureQuery.setParameter(8, userID);
        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(9).toString();
        String message = storedProcedureQuery.getOutputParameterValue(10).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        return map;

    }

    public List<MedicalCertificateData> getMedicalCertification(String userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getMedicalCertificateData", "MedicalDataMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userID);
        return storedProcedureQuery.getResultList();
    }


    public HashMap<String, String> AddEducationalCertificate(String Degree, String University, String StartDate, String EndDate, String UploadDocument, String userId, Integer empId) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterEducationalCertificate");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(11, String.class, ParameterMode.OUT);

        Date startDate = new SimpleDateFormat("dd/MM/yyyy").parse(StartDate);
        Date endDate = new SimpleDateFormat("dd/MM/yyyy").parse(EndDate);

        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, 1);
        storedProcedureQuery.setParameter(3, Degree);
        storedProcedureQuery.setParameter(4, University);
        storedProcedureQuery.setParameter(5, startDate);
        storedProcedureQuery.setParameter(6, endDate);
        storedProcedureQuery.setParameter(7, UploadDocument);
        storedProcedureQuery.setParameter(8, userId);
        storedProcedureQuery.setParameter(9, empId);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(10).toString();
        String message = storedProcedureQuery.getOutputParameterValue(11).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        return map;

    }

    public HashMap<String, String> UpdateEducationalCertificate(Integer eduId, String Degree, String University, String StartDate, String EndDate, String UploadDocument, String userId, Integer empId) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterEducationalCertificate");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(11, String.class, ParameterMode.OUT);

        Date startDate = new SimpleDateFormat("dd/MM/yyyy").parse(StartDate);
        Date endDate = new SimpleDateFormat("dd/MM/yyyy").parse(EndDate);

        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, eduId);
        storedProcedureQuery.setParameter(3, Degree);
        storedProcedureQuery.setParameter(4, University);
        storedProcedureQuery.setParameter(5, startDate);
        storedProcedureQuery.setParameter(6, endDate);
        storedProcedureQuery.setParameter(7, UploadDocument);
        storedProcedureQuery.setParameter(8, userId);
        storedProcedureQuery.setParameter(9, empId);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(10).toString();
        String message = storedProcedureQuery.getOutputParameterValue(11).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        return map;

    }


    public HashMap<String, String> DeleteEducationalCertificate(Integer eduId, String userId) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterEducationalCertificate");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(11, String.class, ParameterMode.OUT);

        Date startDate = new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2014");
        Date endDate = new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2015");

        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, eduId);
        storedProcedureQuery.setParameter(3, "");
        storedProcedureQuery.setParameter(4, "");
        storedProcedureQuery.setParameter(5, startDate);
        storedProcedureQuery.setParameter(6, endDate);
        storedProcedureQuery.setParameter(7, "");
        storedProcedureQuery.setParameter(8, userId);
        storedProcedureQuery.setParameter(9, 1);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(10).toString();
        String message = storedProcedureQuery.getOutputParameterValue(11).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        return map;

    }

    public List<EducationalCertificateData> getEducationalcertificatesData(String userId) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getEducationalcertificates", "EducationalCertificateDataMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userId);
        return storedProcedureQuery.getResultList();
    }


    public List<CountryData> GetCountryByUserID(Integer userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getCountry", "countryMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, Integer.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userID);
        return storedProcedureQuery.getResultList();
    }


    public List<DesignationData> getDesignation(String userId, Integer departmentId) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getDesignation", "designationMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userId);
        storedProcedureQuery.setParameter(2, departmentId);
        return storedProcedureQuery.getResultList();
    }
    public List<DesignationDropDown> getDesignationDropDown(String userId, Integer departmentId) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getDesignation", "designationDropDownMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userId);
        storedProcedureQuery.setParameter(2, departmentId);
        return storedProcedureQuery.getResultList();
    }

    public List<DepartmentData> getDepartment(String userId, Integer locationId) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getDepartment", "DepartmentMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userId);
        storedProcedureQuery.setParameter(2, locationId);
        return storedProcedureQuery.getResultList();
    }
    public List<DepartmentDropDown> getDepartmentDropDown(String userId, Integer locationId) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getDepartment", "departmentDropDownMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userId);
        storedProcedureQuery.setParameter(2, locationId);
        return storedProcedureQuery.getResultList();
    }

    public List<LocationData> getLocation(String userId) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getLocation", "locationMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userId);
        return storedProcedureQuery.getResultList();
    }

    public List<StateData> getState(String userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getState", "StateMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userID);
        return storedProcedureQuery.getResultList();
    }

    public List<CityData> getCity(String userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getCity", "CityMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userID);
        return storedProcedureQuery.getResultList();
    }

    public List<SchoolData> getSchool(String userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getSchool", "SchoolMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userID);
        return storedProcedureQuery.getResultList();
    }

    public List<PostalCodeData> getPostalCode(String userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getPostalCode", "PostalCodeMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userID);
        return storedProcedureQuery.getResultList();
    }


    public List<GraduationData> getGraduationDetails(String userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getGraduationdetails", "graduationDataMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userID);
        return storedProcedureQuery.getResultList();
    }


    public List<PostGraduationData> GetPostGraduationDetail(String userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getPostGraduationDetails", "PostGraduationDataMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userID);
        return storedProcedureQuery.getResultList();
    }


    public List<OtherQualificationData> getOtherQualificationDetails(String userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getOtherQualificationDetails", "OtherQualificationMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userID);
        return storedProcedureQuery.getResultList();
    }

    public List<AddressBookData> getAddressBook(String userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getAddressBook", "AddressBookMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userID);
        return storedProcedureQuery.getResultList();
    }

    public List<CountryDropDown> getCountryDropDown(String userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getCountryDropDown", "countryDropDownMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userID);
        return storedProcedureQuery.getResultList();
    }

    public List<StateDropDown> getStateDropDown(String userID, String countryID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getStateDropDown", "StateDropDownMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userID);
        storedProcedureQuery.setParameter(2, countryID);

        return storedProcedureQuery.getResultList();
    }

    public List<CityDropDown> getCityDropDown(String userID,String stateID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getCityDropDown", "CityDropDownMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userID);
        storedProcedureQuery.setParameter(2, stateID);
        return storedProcedureQuery.getResultList();
    }

    public List<DeptByUser> getDeptByUser(String userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getDeptByUser", "getDeptByUserMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userID);
        return storedProcedureQuery.getResultList();
    }

    public List<ProfessionalQualificationData> getProfessionalQualificationData(String userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getProfessionalQualification", "ProQualificationMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userID);
        return storedProcedureQuery.getResultList();
    }


    public List<EmployeeExperienceData> getEmployeeExperienceData(String userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getEmployeeExperience", "EmployeeExperienceMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userID);
        return storedProcedureQuery.getResultList();
    }

    public List<DesignationDataByUser> getDesignationDataByUser(String userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getDesignationByUser", "DesignationDataByMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userID);
        return storedProcedureQuery.getResultList();
    }

    public List<BanksDetailsData> getBanksDetailsData(String userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("BankDetailsMapping", "getBankDetails");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userID);
        return storedProcedureQuery.getResultList();
    }

    public List<SkillsData> getSkillsData(String userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getSkillsData", "SkillsMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userID);
        return storedProcedureQuery.getResultList();
    }

    public List<AchiementsData> getAchiementsData(String userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getAchiementsData", "AchiementsDataMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userID);
        return storedProcedureQuery.getResultList();
    }

}

