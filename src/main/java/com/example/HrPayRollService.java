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

    public HashMap<String, String> Insert(String QueryType, String StateName, String CreatedBy, String UpdatedBy, Integer CountryID, Integer StateID) {
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
        map.put("Result", output);
        return map;
    }


    public HashMap<String, String> UPDATE(String QueryType, String StateName, String CreatedBy, String UpdatedBy, Integer CountryID,Integer StateID) {
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
        map.put("Result", output);
        return map;
    }



    public HashMap<String, String> MasterInsertUpdateDelete(String Status, String ColName, String colData, Integer StateID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterInsertUpdateDelete");
        storedProcedureQuery.registerStoredProcedureParameter("Status", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("ColName", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("colData", String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("StateID", Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("output", String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter("Status", Status);
        storedProcedureQuery.setParameter("ColName", ColName);
        storedProcedureQuery.setParameter("colData", colData);
        storedProcedureQuery.setParameter("StateID", StateID);
        storedProcedureQuery.execute();
        String output = storedProcedureQuery.getOutputParameterValue("output").toString();
        map.put("Result", output);
        return map;
    }

    public HashMap<String, String> insertDataForCity(String CityName, String CreatedBy, String UpdatedBy, Integer CountryID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("insertDataForCity");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, CityName);
        storedProcedureQuery.setParameter(2, CreatedBy);
        storedProcedureQuery.setParameter(3, UpdatedBy);
        storedProcedureQuery.setParameter(4, CountryID);
        storedProcedureQuery.execute();
        String output = storedProcedureQuery.getOutputParameterValue(5).toString();
        map.put("Result", output);
        return map; }
}