package com.example;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import java.util.HashMap;

@Service
public class HrPayRollService {

    @PersistenceContext
    EntityManager em;

    HashMap<String, String> map = new HashMap<>();

    public HashMap<String, String> InsertState(String QueryType, String StateName, String CreatedBy, String UpdatedBy, Integer CountryID, Integer StateID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterState");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, QueryType);
        storedProcedureQuery.setParameter(2, StateName);
        storedProcedureQuery.setParameter(3, CreatedBy);
        storedProcedureQuery.setParameter(4, UpdatedBy);
        storedProcedureQuery.setParameter(5, CountryID);
        storedProcedureQuery.setParameter(6, StateID);
        storedProcedureQuery.execute();
        String output = storedProcedureQuery.getOutputParameterValue(7).toString();
        map.put("STATUS", output);
        return map;
    }


    public HashMap<String, String> UpdateState(String QueryType, String StateName, String CreatedBy, String UpdatedBy, Integer CountryID,Integer StateID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterState");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, QueryType);
        storedProcedureQuery.setParameter(2, StateName);
        storedProcedureQuery.setParameter(3, CreatedBy);
        storedProcedureQuery.setParameter(4, UpdatedBy);
        storedProcedureQuery.setParameter(5, CountryID);
        storedProcedureQuery.setParameter(6, StateID);
        storedProcedureQuery.execute();
        String output = storedProcedureQuery.getOutputParameterValue(7).toString();
        map.put("STATUS", output);
        return map;
    }

    public HashMap<String, String> DeleteState(String QueryType, String StateName, String CreatedBy, String UpdatedBy, Integer CountryID,Integer StateID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterState");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, QueryType);
        storedProcedureQuery.setParameter(2, StateName);
        storedProcedureQuery.setParameter(3, CreatedBy);
        storedProcedureQuery.setParameter(4, UpdatedBy);
        storedProcedureQuery.setParameter(5, CountryID);
        storedProcedureQuery.setParameter(6, StateID);
        storedProcedureQuery.execute();
        String output = storedProcedureQuery.getOutputParameterValue(7).toString();
        map.put("STATUS", output);
        return map;
    }



    public HashMap<String, String> InsertCity(String QueryType, String CityName, String CreatedBy, String UpdatedBy, Integer StateID,Integer CityID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterCity");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, QueryType);
        storedProcedureQuery.setParameter(2, CityName);
        storedProcedureQuery.setParameter(3, CreatedBy);
        storedProcedureQuery.setParameter(4, UpdatedBy);
        storedProcedureQuery.setParameter(5, StateID);
        storedProcedureQuery.setParameter(6, CityID);
        storedProcedureQuery.execute();
        String output = storedProcedureQuery.getOutputParameterValue(7).toString();
        map.put("STATUS", output);
        return map; }


    public HashMap<String, String> UpdateCity(String QueryType, String CityName, String CreatedBy, String UpdatedBy, Integer StateID,Integer CityID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterCity");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, QueryType);
        storedProcedureQuery.setParameter(2, CityName);
        storedProcedureQuery.setParameter(3, CreatedBy);
        storedProcedureQuery.setParameter(4, UpdatedBy);
        storedProcedureQuery.setParameter(5, StateID);
        storedProcedureQuery.setParameter(6, CityID);
        storedProcedureQuery.execute();
        String output = storedProcedureQuery.getOutputParameterValue(7).toString();
        map.put("STATUS", output);
        return map; }


    public HashMap<String, String> DeleteCity(String QueryType, String CityName, String CreatedBy, String UpdatedBy, Integer StateID, Integer CityID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterCity");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, QueryType);
        storedProcedureQuery.setParameter(2, CityName);
        storedProcedureQuery.setParameter(3, CreatedBy);
        storedProcedureQuery.setParameter(4, UpdatedBy);
        storedProcedureQuery.setParameter(5, StateID);
        storedProcedureQuery.setParameter(6, CityID);
        storedProcedureQuery.execute();
        String output = storedProcedureQuery.getOutputParameterValue(7).toString();
        map.put("STATUS", output);
        return map; }
      
    }

    public HashMap<String,String> insertCountryData(String QueryType,Integer CountryID ,String CountryName, String CountryCode, String CreatedBy,String UpdatedBy ) {

        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterCountry");
        try {
            storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT);

            storedProcedureQuery.setParameter(1, QueryType);
            storedProcedureQuery.setParameter(2, CountryID);
            storedProcedureQuery.setParameter(3, CountryName);
            storedProcedureQuery.setParameter(4, CountryCode);
            storedProcedureQuery.setParameter(5,CreatedBy);
            storedProcedureQuery.setParameter(6,UpdatedBy);


            storedProcedureQuery.execute();
            String result = storedProcedureQuery.getOutputParameterValue(7).toString();

            map.put("Status", result);

            return map;

        }catch (Exception ex){
            ex.printStackTrace();
        }
        map.put("Status","Failure");
        return map;
    }

    public HashMap<String, String> updateCountryData(String QueryType,Integer CountryID , String CountryName, String CountryCode, String CreatedBy, String UpdatedBy){
        StoredProcedureQuery storedProcedureQuery=  em.createStoredProcedureQuery("MasterCountry");
        try {
            storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT);

            storedProcedureQuery.setParameter(1, QueryType);
            storedProcedureQuery.setParameter(2, CountryID);
            storedProcedureQuery.setParameter(3, CountryName);
            storedProcedureQuery.setParameter(4, CountryCode);
            storedProcedureQuery.setParameter(5, CreatedBy);
            storedProcedureQuery.setParameter(6, UpdatedBy);


            storedProcedureQuery.execute();
            String result = storedProcedureQuery.getOutputParameterValue(7).toString();

            map.put("Status", result);

            return map;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        map.put("Status","Failure");
        return map;
    }

    public HashMap<String, String> deleteCountryData( String QueryType,Integer CountryID, String CountryName, String CountryCode, String CreatedBy, String UpdatedBy)
    {
        StoredProcedureQuery storedProcedureQuery=  em.createStoredProcedureQuery("MasterCountry");
        try {
            storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT);

            storedProcedureQuery.setParameter(1, QueryType);
            storedProcedureQuery.setParameter(2, CountryID);
            storedProcedureQuery.setParameter(3, CountryName);
            storedProcedureQuery.setParameter(4, CountryCode);
            storedProcedureQuery.setParameter(5, CreatedBy);
            storedProcedureQuery.setParameter(6, UpdatedBy);

            storedProcedureQuery.execute();
            String result = storedProcedureQuery.getOutputParameterValue(7).toString();

            map.put("Status", result);

            return map;

        }catch (Exception ex){
            ex.printStackTrace();
        }
        map.put("Status","Failure");
        return map;

    }
}