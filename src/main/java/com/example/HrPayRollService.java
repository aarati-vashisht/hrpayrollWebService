package com.example;

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

    public HashMap<String, String> AddState(String QueryType, String StateName, String CreatedBy, String UpdatedBy, Integer CountryID, String StateID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterState");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, StateName);
        storedProcedureQuery.setParameter(3, CreatedBy);
        storedProcedureQuery.setParameter(4, UpdatedBy);
        storedProcedureQuery.setParameter(5, CountryID);
        storedProcedureQuery.setParameter(6, "1");
        storedProcedureQuery.execute();
        String output = storedProcedureQuery.getOutputParameterValue(7).toString();
        map.put("STATUS", output);
        return map;
    }


    public HashMap<String, String> UpdateState(String QueryType, String StateName, String CreatedBy, String UpdatedBy, Integer CountryID, Integer StateID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterState");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "UPDATE");
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

    public HashMap<String, String> DeleteState(String QueryType, String StateName, String CreatedBy, String UpdatedBy, Integer CountryID, Integer StateID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterState");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "DELETE");
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




    public HashMap<String, String> AddCity(String QueryType, String CityName, String CreatedBy, String UpdatedBy, Integer StateID,String CityID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterCity");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, CityName);
        storedProcedureQuery.setParameter(3, CreatedBy);
        storedProcedureQuery.setParameter(4, UpdatedBy);
        storedProcedureQuery.setParameter(5, StateID);
        storedProcedureQuery.setParameter(6, "1");
        storedProcedureQuery.execute();
        String output = storedProcedureQuery.getOutputParameterValue(7).toString();
        map.put("STATUS", output);
        return map;
    }


    public HashMap<String, String> UpdateCity(String QueryType, String CityName, String CreatedBy, String UpdatedBy, Integer StateID, Integer CityID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterCity");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, CityName);
        storedProcedureQuery.setParameter(3, CreatedBy);
        storedProcedureQuery.setParameter(4, UpdatedBy);
        storedProcedureQuery.setParameter(5, StateID);
        storedProcedureQuery.setParameter(6, CityID);
        storedProcedureQuery.execute();
        String output = storedProcedureQuery.getOutputParameterValue(7).toString();
        map.put("STATUS", output);
        return map;
    }


    public HashMap<String, String> DeleteCity(String QueryType, String CityName, String CreatedBy, String UpdatedBy, Integer StateID, Integer CityID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterCity");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, CityName);
        storedProcedureQuery.setParameter(3, CreatedBy);
        storedProcedureQuery.setParameter(4, UpdatedBy);
        storedProcedureQuery.setParameter(5, StateID);
        storedProcedureQuery.setParameter(6, CityID);
        storedProcedureQuery.execute();
        String output = storedProcedureQuery.getOutputParameterValue(7).toString();
        map.put("STATUS", output);
        return map;

      
    }

    public HashMap<String,String> AddCountry(String QueryType,String CountryID ,String CountryName, String CountryCode, String CreatedBy,String UpdatedBy ) {


        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterCountry");
        try {
            storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT);

            storedProcedureQuery.setParameter(1, "INSERT");
            storedProcedureQuery.setParameter(2, "1");
            storedProcedureQuery.setParameter(3, CountryName);
            storedProcedureQuery.setParameter(4, CountryCode);
            storedProcedureQuery.setParameter(5, CreatedBy);
            storedProcedureQuery.setParameter(6, UpdatedBy);


            storedProcedureQuery.execute();
            String result = storedProcedureQuery.getOutputParameterValue(7).toString();

            map.put("Status", result);

            return map;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        map.put("Status", "Failure");
        return map;
    }


    public HashMap<String, String> UpdateCountry(String QueryType,Integer CountryID , String CountryName, String CountryCode, String CreatedBy, String UpdatedBy){
        StoredProcedureQuery storedProcedureQuery=  em.createStoredProcedureQuery("MasterCountry");
        try {
            storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT);

            storedProcedureQuery.setParameter(1, "UPDATE");
            storedProcedureQuery.setParameter(2, CountryID);
            storedProcedureQuery.setParameter(3, CountryName);
            storedProcedureQuery.setParameter(4, CountryCode);
            storedProcedureQuery.setParameter(5, CreatedBy);
            storedProcedureQuery.setParameter(6, UpdatedBy);


            storedProcedureQuery.execute();
            String result = storedProcedureQuery.getOutputParameterValue(7).toString();

            map.put("Status", result);

            return map;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        map.put("Status", "Failure");
        return map;
    }


    public HashMap<String, String> DeleteCountry( String QueryType,Integer CountryID, String CountryName, String CountryCode, String CreatedBy, String UpdatedBy)
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

            storedProcedureQuery.setParameter(1, "DELETE");
            storedProcedureQuery.setParameter(2, CountryID);
            storedProcedureQuery.setParameter(3, CountryName);
            storedProcedureQuery.setParameter(4, CountryCode);
            storedProcedureQuery.setParameter(5, CreatedBy);
            storedProcedureQuery.setParameter(6, UpdatedBy);

            storedProcedureQuery.execute();
            String result = storedProcedureQuery.getOutputParameterValue(7).toString();

            map.put("Status", result);

            return map;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        map.put("Status", "Failure");
        return map;
//Commit set default values QueryType and CountryID,StateID,CityID and set systematic method name
    }

    public HashMap<String,String> AddLocation(String QueryType,String LocationID ,String LocationName, String LocationCode,String LocationDescription) {

        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterLocation");
        try {
            storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.OUT);

            storedProcedureQuery.setParameter(1, "INSERT");
            storedProcedureQuery.setParameter(2, "1");
            storedProcedureQuery.setParameter(3, LocationName);
            storedProcedureQuery.setParameter(4, LocationCode);
            storedProcedureQuery.setParameter(5,LocationDescription);


            storedProcedureQuery.execute();
            String result = storedProcedureQuery.getOutputParameterValue(6).toString();

            map.put("Status", result);

            return map;

        }catch (Exception ex){
            ex.printStackTrace();
        }
        map.put("Status","Failure");
        return map;
    }

    public HashMap<String, String> UpdateLocation(String QueryType,Integer LocationID ,String LocationName, String LocationCode,String LocationDescription){
        StoredProcedureQuery storedProcedureQuery=  em.createStoredProcedureQuery("MasterLocation");
        try {
            storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.OUT);

            storedProcedureQuery.setParameter(1, "UPDATE");
            storedProcedureQuery.setParameter(2, LocationID);
            storedProcedureQuery.setParameter(3, LocationName);
            storedProcedureQuery.setParameter(4, LocationCode);
            storedProcedureQuery.setParameter(5, LocationDescription);


            storedProcedureQuery.execute();
            String result = storedProcedureQuery.getOutputParameterValue(6).toString();

            map.put("Status", result);

            return map;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        map.put("Status","Failure");
        return map;
    }

    public HashMap<String, String> DeleteLocation( String QueryType,Integer LocationID ,String LocationName, String LocationCode,String LocationDescription)
    {
        StoredProcedureQuery storedProcedureQuery=  em.createStoredProcedureQuery("MasterLocation");
        try {
            storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.OUT);

            storedProcedureQuery.setParameter(1, "DELETE");
            storedProcedureQuery.setParameter(2, LocationID);
            storedProcedureQuery.setParameter(3, LocationName);
            storedProcedureQuery.setParameter(4, LocationCode);
            storedProcedureQuery.setParameter(5, LocationDescription);

            storedProcedureQuery.execute();
            String result = storedProcedureQuery.getOutputParameterValue(6).toString();

            map.put("Status", result);

            return map;

        }catch (Exception ex){
            ex.printStackTrace();
        }
        map.put("Status","Failure");
        return map;

    }


    public HashMap<String, String> SaveEmployee(String QueryType, Integer E_Code, String E_FristName, String E_MiddleName, String E_LastName, Integer E_Designaton, String E_Gender, String E_Title, String E_DOB, String E_Dept, String E_MaritalStatus, String Anniversary, String E_Image, String E_EmployementType, String CreatedBy, String UpdatedBy) throws ParseException {
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
        storedProcedureQuery.registerStoredProcedureParameter(16, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(17, String.class, ParameterMode.OUT);
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(E_DOB);
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
        storedProcedureQuery.setParameter(13, E_Image);
        storedProcedureQuery.setParameter(14, E_EmployementType);
        storedProcedureQuery.setParameter(15, CreatedBy);
        storedProcedureQuery.setParameter(16, UpdatedBy);
        storedProcedureQuery.execute();
        String output = storedProcedureQuery.getOutputParameterValue(17).toString();
        map.put("STATUS", output);
        return map;
    }

    //get all employee details and get employee details by employee id//


    public List<EmployeeBasicDetails> GetAllEmolyeeDetails() {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getEmployeeDetails", "resultMapping");
        try {
            storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
            storedProcedureQuery.setParameter(1, "GetAllEmolyeeDetail");
            storedProcedureQuery.setParameter(2, 1);
            return storedProcedureQuery.getResultList();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    public List<EmployeeBasicDetails> GetEmolyeeDetail(String QueryType, Integer E_ID) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("getEmployeeDetails", "resultMapping");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
        storedProcedureQuery.setParameter(1, "GetEmolyeeDetail");
        storedProcedureQuery.setParameter(2, E_ID);
        return storedProcedureQuery.getResultList();
    }


}


