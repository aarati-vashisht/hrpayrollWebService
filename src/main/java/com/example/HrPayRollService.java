package com.example;

import com.example.ResponseData.*;
import org.apache.commons.logging.Log;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.criteria.CriteriaBuilder;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class HrPayRollService {

    @PersistenceContext
    EntityManager em;

    HashMap<String, String> map = new HashMap<>();

    public HashMap<String, String> AddState(String StateName, String UpdatedBy, Integer CountryID, String Description, Integer userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterState");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, StateName);
        storedProcedureQuery.setParameter(3, UpdatedBy);
        storedProcedureQuery.setParameter(4, CountryID);
        storedProcedureQuery.setParameter(5, 1);
        storedProcedureQuery.setParameter(6, Description);
        storedProcedureQuery.setParameter(7, userID);

        storedProcedureQuery.execute();
        String message = storedProcedureQuery.getOutputParameterValue(8).toString();
        String output = storedProcedureQuery.getOutputParameterValue(9).toString();
        map.put("STATUS", message);
        map.put("MESSAGE", output);
        return map;
    }


    public HashMap<String, String> UpdateState(String StateName, String UpdatedBy, Integer CountryID, Integer StateID, String Description, Integer userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterState");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, StateName);
        storedProcedureQuery.setParameter(3, UpdatedBy);
        storedProcedureQuery.setParameter(4, CountryID);
        storedProcedureQuery.setParameter(5, StateID);
        storedProcedureQuery.setParameter(6, Description);
        storedProcedureQuery.setParameter(7, userID);
        storedProcedureQuery.execute();
        String message = storedProcedureQuery.getOutputParameterValue(8).toString();
        String output = storedProcedureQuery.getOutputParameterValue(9).toString();
        map.put("MESSAGE", output);
        map.put("STATUS", message);
        return map;
    }

    public HashMap<String, String> DeleteState(Integer StateID, Integer userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterState");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, "");
        storedProcedureQuery.setParameter(3, "");
        storedProcedureQuery.setParameter(4, 1);
        storedProcedureQuery.setParameter(5, StateID);
        storedProcedureQuery.setParameter(6, "");
        storedProcedureQuery.setParameter(7, userID);
        storedProcedureQuery.execute();

        String message = storedProcedureQuery.getOutputParameterValue(8).toString();
        String output = storedProcedureQuery.getOutputParameterValue(9).toString();
        map.put("MESSAGE", output);
        map.put("STATUS", message);
        return map;
    }


    public HashMap<String, String> AddCity(String CityName, String UpdatedBy, Integer StateID, String Dercription, Integer userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterCity");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, CityName);
        storedProcedureQuery.setParameter(3, UpdatedBy);
        storedProcedureQuery.setParameter(4, StateID);
        storedProcedureQuery.setParameter(5, "1");
        storedProcedureQuery.setParameter(6, Dercription);
        storedProcedureQuery.setParameter(7, userID);

        storedProcedureQuery.execute();
        String message = storedProcedureQuery.getOutputParameterValue(8).toString();
        String output = storedProcedureQuery.getOutputParameterValue(9).toString();
        map.put("STATUS", message);
        map.put("MESSAGE", output);
        return map;
    }


    public HashMap<String, String> UpdateCity(String CityName, String UpdatedBy, Integer StateID, Integer CityID, String Description, Integer userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterCity");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);


        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, CityName);
        storedProcedureQuery.setParameter(3, UpdatedBy);
        storedProcedureQuery.setParameter(4, StateID);
        storedProcedureQuery.setParameter(5, CityID);
        storedProcedureQuery.setParameter(6, Description);
        storedProcedureQuery.setParameter(7, userID);

        storedProcedureQuery.execute();
        String message = storedProcedureQuery.getOutputParameterValue(8).toString();
        String output = storedProcedureQuery.getOutputParameterValue(9).toString();
        map.put("STATUS", message);
        map.put("MESSAGE", output);
        return map;
    }


    public HashMap<String, String> DeleteCity(Integer CityID, Integer userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterCity");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, "");
        storedProcedureQuery.setParameter(3, "");
        storedProcedureQuery.setParameter(4, 1);
        storedProcedureQuery.setParameter(5, CityID);
        storedProcedureQuery.setParameter(6, "");
        storedProcedureQuery.setParameter(7, userID);

        storedProcedureQuery.execute();
        String message = storedProcedureQuery.getOutputParameterValue(8).toString();
        String output = storedProcedureQuery.getOutputParameterValue(9).toString();
        map.put("STATUS", message);
        map.put("MESSAGE", output);
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


    public HashMap<String, String> AddCountry(String CountryName, String CountryCode, String UpdatedBy, String Description, Integer userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterCountry");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, "1");
        storedProcedureQuery.setParameter(3, CountryName);
        storedProcedureQuery.setParameter(4, CountryCode);
        storedProcedureQuery.setParameter(5, UpdatedBy);
        storedProcedureQuery.setParameter(6, Description);
        storedProcedureQuery.setParameter(7, userID);


        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(8).toString();
        String message = storedProcedureQuery.getOutputParameterValue(9).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        return map;

    }


    public HashMap<String, String> UpdateCountry(Integer CountryID, String CountryName, String CountryCode, String UpdatedBy, String Description, Integer userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterCountry");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, CountryID);
        storedProcedureQuery.setParameter(3, CountryName);
        storedProcedureQuery.setParameter(4, CountryCode);
        storedProcedureQuery.setParameter(5, UpdatedBy);
        storedProcedureQuery.setParameter(6, Description);
        storedProcedureQuery.setParameter(7, userID);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(8).toString();
        String message = storedProcedureQuery.getOutputParameterValue(9).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        return map;
    }

    public HashMap<String, String> DeleteCountry(Integer CountryID, Integer userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterCountry");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, CountryID);
        storedProcedureQuery.setParameter(3, "");
        storedProcedureQuery.setParameter(4, "");
        storedProcedureQuery.setParameter(5, "");
        storedProcedureQuery.setParameter(6, "");
        storedProcedureQuery.setParameter(7, userID);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(8).toString();
        String message = storedProcedureQuery.getOutputParameterValue(9).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        return map;

//Commit set default values QueryType and CountryID,StateID,CityID and set systematic method name
    }

    public HashMap<String, String> AddLocation(String LocationName, String LocationCode, String LocationDescription, String CreatedBy, String UpdatedBy, Integer userID) {

        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterLocation");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, "1");
        storedProcedureQuery.setParameter(3, LocationName);
        storedProcedureQuery.setParameter(4, LocationCode);
        storedProcedureQuery.setParameter(5, LocationDescription);
        storedProcedureQuery.setParameter(6, CreatedBy);
        storedProcedureQuery.setParameter(7, UpdatedBy);
        storedProcedureQuery.setParameter(8, userID);
        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(9).toString();
        String message = storedProcedureQuery.getOutputParameterValue(10).toString();

        map.put("STATUS", result);
        map.put("MESSAGE", message);
        return map;

    }

    public HashMap<String, String> UpdateLocation(Integer LocationID, String LocationName, String LocationCode, String LocationDescription, String CreatedBy, String UpdatedBy, Integer userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterLocation");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, LocationID);
        storedProcedureQuery.setParameter(3, LocationName);
        storedProcedureQuery.setParameter(4, LocationCode);
        storedProcedureQuery.setParameter(5, LocationDescription);
        storedProcedureQuery.setParameter(6, CreatedBy);
        storedProcedureQuery.setParameter(7, UpdatedBy);
        storedProcedureQuery.setParameter(8, userID);
        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(9).toString();
        String message = storedProcedureQuery.getOutputParameterValue(10).toString();

        map.put("STATUS", result);
        map.put("MESSAGE", message);

        return map;

    }

    public HashMap<String, String> DeleteLocation(Integer LocationID, Integer userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterLocation");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, LocationID);
        storedProcedureQuery.setParameter(3, "");
        storedProcedureQuery.setParameter(4, "");
        storedProcedureQuery.setParameter(5, "");
        storedProcedureQuery.setParameter(6, "");
        storedProcedureQuery.setParameter(7, "");
        storedProcedureQuery.setParameter(8, userID);
        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(9).toString();
        String message = storedProcedureQuery.getOutputParameterValue(10).toString();

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

    public HashMap<String, String> AddDepartment(Integer LocationID, String DepartmentCode, String DepartmentName, String Description, String UpdatedBy, Integer userID) {

        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterDepartment");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, "1");
        storedProcedureQuery.setParameter(3, LocationID);
        storedProcedureQuery.setParameter(4, DepartmentCode);
        storedProcedureQuery.setParameter(5, DepartmentName);
        storedProcedureQuery.setParameter(6, Description);
        storedProcedureQuery.setParameter(7, UpdatedBy);
        storedProcedureQuery.setParameter(8, userID);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(9).toString();
        String message = storedProcedureQuery.getOutputParameterValue(10).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);

        return map;

    }


    public HashMap<String, String> UpdateDepartment(Integer DepartmentID, Integer LocationID, String DepartmentName, String DepartmentCode, String Description, String UpdatedBy, Integer userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterDepartment");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, DepartmentID);
        storedProcedureQuery.setParameter(3, LocationID);
        storedProcedureQuery.setParameter(4, DepartmentName);
        storedProcedureQuery.setParameter(5, DepartmentCode);
        storedProcedureQuery.setParameter(6, Description);
        storedProcedureQuery.setParameter(7, UpdatedBy);
        storedProcedureQuery.setParameter(8, userID);
        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(9).toString();
        String message = storedProcedureQuery.getOutputParameterValue(10).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);

        return map;
    }


    public HashMap<String, String> DeleteDepartment(Integer DepartmentID, Integer userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterDepartment");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, DepartmentID);
        storedProcedureQuery.setParameter(3, 1);
        storedProcedureQuery.setParameter(4, "");
        storedProcedureQuery.setParameter(5, "");
        storedProcedureQuery.setParameter(6, "");
        storedProcedureQuery.setParameter(7, "");
        storedProcedureQuery.setParameter(8, userID);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(9).toString();
        String message = storedProcedureQuery.getOutputParameterValue(10).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);

        return map;

    }

    public HashMap<String, String> AddDesignation(Integer DepartmentID, String DesignationCode, String DesignationName, String Description, String UpdatedBy, Integer userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterDesignation");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, "1");
        storedProcedureQuery.setParameter(3, DepartmentID);
        storedProcedureQuery.setParameter(4, DesignationCode);
        storedProcedureQuery.setParameter(5, DesignationName);
        storedProcedureQuery.setParameter(6, Description);
        storedProcedureQuery.setParameter(7, UpdatedBy);
        storedProcedureQuery.setParameter(8, userID);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(9).toString();
        String message = storedProcedureQuery.getOutputParameterValue(10).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);

        return map;

    }


    public HashMap<String, String> UpdateDesignation(Integer DesignationID, Integer DepartmentID, String DesignationName, String DesignationCode, String Description, String UpdatedBy, Integer userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterDesignation");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.OUT);


        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, DesignationID);
        storedProcedureQuery.setParameter(3, DepartmentID);
        storedProcedureQuery.setParameter(4, DesignationName);
        storedProcedureQuery.setParameter(5, DesignationCode);
        storedProcedureQuery.setParameter(6, Description);
        storedProcedureQuery.setParameter(7, UpdatedBy);
        storedProcedureQuery.setParameter(8, userID);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(9).toString();
        String message = storedProcedureQuery.getOutputParameterValue(10).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);

        return map;
    }


    public HashMap<String, String> DeleteDesignation(Integer DesignationID, Integer userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterDesignation");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(8, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);
        storedProcedureQuery.registerStoredProcedureParameter(10, String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, DesignationID);
        storedProcedureQuery.setParameter(3, 1);
        storedProcedureQuery.setParameter(4, "");
        storedProcedureQuery.setParameter(5, "");
        storedProcedureQuery.setParameter(6, "");
        storedProcedureQuery.setParameter(7, "");
        storedProcedureQuery.setParameter(8, userID);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(9).toString();
        String message = storedProcedureQuery.getOutputParameterValue(10).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);

        return map;

    }

    public HashMap<String, String> AddSchool(String ClassName, String BoardName, String SchoolName, String StartDate, String EndDate, String Percentage, Integer userID) throws ParseException {

        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("schoolprocedure");
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
        storedProcedureQuery.setParameter(3, ClassName);
        storedProcedureQuery.setParameter(4, BoardName);
        storedProcedureQuery.setParameter(5, SchoolName);
        storedProcedureQuery.setParameter(6, date1);
        storedProcedureQuery.setParameter(7, date2);
        storedProcedureQuery.setParameter(8, percentage);
        storedProcedureQuery.setParameter(9, "1");
        storedProcedureQuery.setParameter(10, userID);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(11).toString();
        String message = storedProcedureQuery.getOutputParameterValue(12).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);
        return map;
    }

    public HashMap<String, String> UpdateSchool(Integer SchoolID, String ClassName, String BoardName, String SchoolName, String StartDate, String EndDate, String Percentage, String UpdatedBy, Integer userID) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("schoolprocedure");
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
        storedProcedureQuery.setParameter(2, SchoolID);
        storedProcedureQuery.setParameter(3, ClassName);
        storedProcedureQuery.setParameter(4, BoardName);
        storedProcedureQuery.setParameter(5, SchoolName);
        storedProcedureQuery.setParameter(6, date1);
        storedProcedureQuery.setParameter(7, date2);
        storedProcedureQuery.setParameter(8, percentage);
        storedProcedureQuery.setParameter(9, UpdatedBy);
        storedProcedureQuery.setParameter(10, userID);

        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(11).toString();
        String message = storedProcedureQuery.getOutputParameterValue(123).toString();
        map.put("STATUS", result);
        map.put("MESSAGE", message);

        return map;
    }


    public HashMap<String, String> DeleteSchool(Integer SchoolID, Integer userID) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("schoolprocedure");
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
        storedProcedureQuery.setParameter(2, SchoolID);
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

    public HashMap<String, String> AddGraduation(String Degree, String Specialization, String University, String StartDate, String EndDate, String Percentage, String UpdatedBy, Integer userID) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("graduationprocedure");
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


    public HashMap<String, String> UpdateGraduation(Integer GraduationID, String Degree, String Specialization, String University, String StartDate, String EndDate, String Percentage, String UpdatedBy, Integer userID) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("graduationprocedure");
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
        storedProcedureQuery.setParameter(2, GraduationID);
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


    public HashMap<String, String> DeleteGraduation(Integer GraduationID, Integer userID) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("graduationprocedure");
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
        storedProcedureQuery.setParameter(2, GraduationID);
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


    public HashMap<String, String> SaveAddress(String Address, String City, String State, String
            Country, String Pin_code, String Address_Status, String Contact_No, String Email_ID, String Emergency_contact_person, String
                                                       Emergency_contact_number, Integer eid, String userID, String UpdatedBy) {
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
        storedProcedureQuery.execute();
        String result = storedProcedureQuery.getOutputParameterValue(16).toString();
        String output = storedProcedureQuery.getOutputParameterValue(17).toString();
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

    public HashMap<String, String> saveProfessionQualification(String Institute, String
            Course, String StartDate, String EndDate, String UpdatedBy, Integer userID) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("InsertDataOfProfessionalQualification");
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

    public HashMap<String, String> UpdateDrivingLicence(Integer DLID,String DLNumber, String ExpiryDate, String UploadDocument, String TimeDuration, Integer EID, Integer userID) throws ParseException {
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
        storedProcedureQuery.setParameter(2,DLID);
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
    public List<DesignationData> getDrivingLicence(String userID, String DLID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("DrivingLicence", "designationMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userID);
        storedProcedureQuery.setParameter(2, DLID);
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

    public HashMap<String, String> UpdateMedicalCertification(Integer MedicalID,String DLNumber, String ExpiryDate, String UploadDocument, String TimeDuration, Integer EID, Integer userID) throws ParseException {
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
        storedProcedureQuery.setParameter(2,MedicalID);
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

    public List<CountryData> GetCountryByUserID(Integer userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getCountry", "countryMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, Integer.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userID);
        return storedProcedureQuery.getResultList();
    }


    public List<DesignationData> getDesignation(String userID, String DepartmentID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getDesignation", "designationMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userID);
        storedProcedureQuery.setParameter(2, DepartmentID);
        return storedProcedureQuery.getResultList();
    }

    public List<DepartmentData> getDepartment(String userID, String LocationID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getDepartment", "DepartmentMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userID);
        storedProcedureQuery.setParameter(2, LocationID);
        return storedProcedureQuery.getResultList();
    }

    public List<LocationData> getLocation(String userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getLocation", "locationMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userID);
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

    public List<StateDropDown> getStateDropDown(String userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getStateDropDown", "StateDropDownMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userID);
        return storedProcedureQuery.getResultList();
    }

    public List<CityDropDown> getCityDropDown(String userID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getCityDropDown", "CityDropDownMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, userID);
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

