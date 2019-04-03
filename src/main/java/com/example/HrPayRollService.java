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

import static com.oracle.jrockit.jfr.ContentType.Address;

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


    public HashMap<String, String> AddCity(String QueryType, String CityName, String CreatedBy, String UpdatedBy, Integer StateID, String CityID) {
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

    public HashMap<String, String> AddCountry(String CountryName, String CountryCode, String CreatedBy, String UpdatedBy,String Description) {


        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterCountry");
        try {
            storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.OUT);

            storedProcedureQuery.setParameter(1, "INSERT");
            storedProcedureQuery.setParameter(2, "1");
            storedProcedureQuery.setParameter(3, CountryName);
            storedProcedureQuery.setParameter(4, CountryCode);
            storedProcedureQuery.setParameter(5, CreatedBy);
            storedProcedureQuery.setParameter(6, UpdatedBy);
            storedProcedureQuery.setParameter(7, Description);


            storedProcedureQuery.execute();
            String result = storedProcedureQuery.getOutputParameterValue(8).toString();

            map.put("Status", result);

            return map;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        map.put("Status", "Failure");
        return map;
    }


    public HashMap<String, String> UpdateCountry( Integer CountryID, String CountryName, String CountryCode, String CreatedBy, String UpdatedBy,String Description) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterCountry");
        try {
            storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(8, String.class, ParameterMode.OUT);

            storedProcedureQuery.setParameter(1, "UPDATE");
            storedProcedureQuery.setParameter(2, CountryID);
            storedProcedureQuery.setParameter(3, CountryName);
            storedProcedureQuery.setParameter(4, CountryCode);
            storedProcedureQuery.setParameter(5, CreatedBy);
            storedProcedureQuery.setParameter(6, UpdatedBy);
            storedProcedureQuery.setParameter(7, Description);


            storedProcedureQuery.execute();
            String result = storedProcedureQuery.getOutputParameterValue(8).toString();

            map.put("Status", result);

            return map;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        map.put("Status", "Failure");
        return map;
    }


    public HashMap<String, String> DeleteCountry(String QueryType, Integer CountryID, String CountryName, String CountryCode, String CreatedBy, String UpdatedBy) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterCountry");
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

    public HashMap<String, String> AddLocation(String QueryType, String LocationID, String LocationName, String LocationCode, String LocationDescription) {

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
            storedProcedureQuery.setParameter(5, LocationDescription);


            storedProcedureQuery.execute();
            String result = storedProcedureQuery.getOutputParameterValue(6).toString();

            map.put("Status", result);

            return map;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        map.put("Status", "Failure");
        return map;
    }

    public HashMap<String, String> UpdateLocation(String QueryType, Integer LocationID, String LocationName, String LocationCode, String LocationDescription) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterLocation");
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
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        map.put("Status", "Failure");
        return map;
    }

    public HashMap<String, String> DeleteLocation(String QueryType, Integer LocationID, String LocationName, String LocationCode, String LocationDescription) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterLocation");
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

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        map.put("Status", "Failure");
        return map;

    }


    public HashMap<String, String> AddEmployee(String QueryType, Integer E_Code, String E_FristName, String E_MiddleName, String E_LastName, Integer E_Designaton, String E_Gender, String E_Title, String E_DOB, String E_Dept, String E_MaritalStatus, String Anniversary, String E_Image, String E_EmployementType, String CreatedBy, String UpdatedBy) throws ParseException {
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

    public HashMap<String, String> AddDepartment(String QueryType, String DepartmentID, Integer LocationID, String DepartmentName, String DepartmentCode, String Description) {


        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterDepartment");
        try {
            storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(3, Integer.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT);

            storedProcedureQuery.setParameter(1, "INSERT");
            storedProcedureQuery.setParameter(2, "1");
            storedProcedureQuery.setParameter(3, LocationID);
            storedProcedureQuery.setParameter(4, DepartmentName);
            storedProcedureQuery.setParameter(5, DepartmentCode);
            storedProcedureQuery.setParameter(6, Description);


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


    public HashMap<String, String> UpdateDepartment(String QueryType, Integer DepartmentID, Integer LocationID, String DepartmentName, String DepartmentCode, String Description) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterDepartment");
        try {
            storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(3, Integer.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT);

            storedProcedureQuery.setParameter(1, "UPDATE");
            storedProcedureQuery.setParameter(2, DepartmentID);
            storedProcedureQuery.setParameter(3, LocationID);
            storedProcedureQuery.setParameter(4, DepartmentName);
            storedProcedureQuery.setParameter(5, DepartmentCode);
            storedProcedureQuery.setParameter(6, Description);


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


    public HashMap<String, String> DeleteDepartment(String QueryType, Integer DepartmentID, Integer LocationID, String DepartmentName, String DepartmentCode, String Description) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterDepartment");
        try {
            storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(3, Integer.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT);

            storedProcedureQuery.setParameter(1, "DELETE");
            storedProcedureQuery.setParameter(2, DepartmentID);
            storedProcedureQuery.setParameter(3, LocationID);
            storedProcedureQuery.setParameter(4, DepartmentName);
            storedProcedureQuery.setParameter(5, DepartmentCode);
            storedProcedureQuery.setParameter(6, Description);

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

    public HashMap<String, String> AddDesignation(String QueryType, String DesignationID, Integer DepartmentID, String DesignationName, String DesignationCode, String Description) {


        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterDesignation");
        try {
            storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(3, Integer.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT);

            storedProcedureQuery.setParameter(1, "INSERT");
            storedProcedureQuery.setParameter(2, "1");
            storedProcedureQuery.setParameter(3, DepartmentID);
            storedProcedureQuery.setParameter(4, DesignationName);
            storedProcedureQuery.setParameter(5, DesignationCode);
            storedProcedureQuery.setParameter(6, Description);


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


    public HashMap<String, String> UpdateDesignation(String QueryType, Integer DesignationID, Integer DepartmentID, String DesignationName, String DesignationCode, String Description) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterDesignation");
        try {
            storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(3, Integer.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT);

            storedProcedureQuery.setParameter(1, "UPDATE");
            storedProcedureQuery.setParameter(2, DesignationID);
            storedProcedureQuery.setParameter(3, DepartmentID);
            storedProcedureQuery.setParameter(4, DesignationName);
            storedProcedureQuery.setParameter(5, DesignationCode);
            storedProcedureQuery.setParameter(6, Description);


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


    public HashMap<String, String> DeleteDesignation(String QueryType, Integer DesignationID, Integer DepartmentID, String DesignationName, String DesignationCode, String Description) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("MasterDesignation");
        try {
            storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(3, Integer.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT);

            storedProcedureQuery.setParameter(1, "DELETE");
            storedProcedureQuery.setParameter(2, DesignationID);
            storedProcedureQuery.setParameter(3, DepartmentID);
            storedProcedureQuery.setParameter(4, DesignationName);
            storedProcedureQuery.setParameter(5, DesignationCode);
            storedProcedureQuery.setParameter(6, Description);

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

    public HashMap<String, String> AddSchool(String QueryType, String SchoolID, String ClassName, String BoardName, String SchoolName, String StartDate, String EndDate, Float Persentage) {


        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("schoolprocedure");
        try {
            storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(8, Float.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);

            storedProcedureQuery.setParameter(1, "INSERT");
            storedProcedureQuery.setParameter(2, "1");
            storedProcedureQuery.setParameter(3, ClassName);
            storedProcedureQuery.setParameter(4, BoardName);
            storedProcedureQuery.setParameter(5, SchoolName);
            storedProcedureQuery.setParameter(6, StartDate);
            storedProcedureQuery.setParameter(7, EndDate);
            storedProcedureQuery.setParameter(8, Persentage);


            storedProcedureQuery.execute();
            String result = storedProcedureQuery.getOutputParameterValue(9).toString();

            map.put("Status", result);

            return map;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        map.put("Status", "Failure");
        return map;
    }


    public HashMap<String, String> UpdateSchool(String QueryType, Integer SchoolID, String ClassName, String BoardName, String SchoolName, String StartDate, String EndDate, Float Persentage) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("schoolprocedure");
        try {
            storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(8, Float.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);

            storedProcedureQuery.setParameter(1, "UPDATE");
            storedProcedureQuery.setParameter(2, SchoolID);
            storedProcedureQuery.setParameter(3, ClassName);
            storedProcedureQuery.setParameter(4, BoardName);
            storedProcedureQuery.setParameter(5, SchoolName);
            storedProcedureQuery.setParameter(6, StartDate);
            storedProcedureQuery.setParameter(7, EndDate);
            storedProcedureQuery.setParameter(8, Persentage);


            storedProcedureQuery.execute();
            String result = storedProcedureQuery.getOutputParameterValue(9).toString();

            map.put("Status", result);

            return map;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        map.put("Status", "Failure");
        return map;
    }


    public HashMap<String, String> DeleteSchool(String QueryType, Integer SchoolID, String ClassName, String BoardName, String SchoolName, String StartDate, String EndDate, Float Persentage) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("schoolprocedure");
        try {
            storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(8, Float.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);

            storedProcedureQuery.setParameter(1, "DELETE");
            storedProcedureQuery.setParameter(2, SchoolID);
            storedProcedureQuery.setParameter(3, ClassName);
            storedProcedureQuery.setParameter(4, BoardName);
            storedProcedureQuery.setParameter(5, SchoolName);
            storedProcedureQuery.setParameter(6, StartDate);
            storedProcedureQuery.setParameter(7, EndDate);
            storedProcedureQuery.setParameter(8, Persentage);

            storedProcedureQuery.execute();
            String result = storedProcedureQuery.getOutputParameterValue(9).toString();

            map.put("Status", result);

            return map;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        map.put("Status", "Failure");
        return map;
    }

    public HashMap<String, String> AddGraduation(String QueryType, String GraduationID, String CourseName, String UniversityName, String CollegeName, String StartDate, String EndDate, Float Persentage) {


        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("graduationprocedure");
        try {
            storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(8, Float.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);

            storedProcedureQuery.setParameter(1, "INSERT");
            storedProcedureQuery.setParameter(2, "1");
            storedProcedureQuery.setParameter(3, CourseName);
            storedProcedureQuery.setParameter(4, UniversityName);
            storedProcedureQuery.setParameter(5, CollegeName);
            storedProcedureQuery.setParameter(6, StartDate);
            storedProcedureQuery.setParameter(7, EndDate);
            storedProcedureQuery.setParameter(8, Persentage);


            storedProcedureQuery.execute();
            String result = storedProcedureQuery.getOutputParameterValue(9).toString();

            map.put("Status", result);

            return map;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        map.put("Status", "Failure");
        return map;
    }


    public HashMap<String, String> UpdateGraduation(String QueryType, Integer GraduationID, String CourseName, String UniversityName, String CollegeName, String StartDate, String EndDate, Float Persentage) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("graduationprocedure");
        try {
            storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(8, Float.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);

            storedProcedureQuery.setParameter(1, "UPDATE");
            storedProcedureQuery.setParameter(2, GraduationID);
            storedProcedureQuery.setParameter(3, CourseName);
            storedProcedureQuery.setParameter(4, UniversityName);
            storedProcedureQuery.setParameter(5, CollegeName);
            storedProcedureQuery.setParameter(6, StartDate);
            storedProcedureQuery.setParameter(7, EndDate);
            storedProcedureQuery.setParameter(8, Persentage);


            storedProcedureQuery.execute();
            String result = storedProcedureQuery.getOutputParameterValue(9).toString();

            map.put("Status", result);

            return map;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        map.put("Status", "Failure");
        return map;
    }


    public HashMap<String, String> DeleteGraduation(String QueryType, Integer GraduationID, String CourseName, String UniversityName, String CollegeName, String StartDate, String EndDate, Float Persentage) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("graduationprocedure");
        try {
            storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(8, Float.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);

            storedProcedureQuery.setParameter(1, "DELETE");
            storedProcedureQuery.setParameter(2, GraduationID);
            storedProcedureQuery.setParameter(3, CourseName);
            storedProcedureQuery.setParameter(4, UniversityName);
            storedProcedureQuery.setParameter(5, CollegeName);
            storedProcedureQuery.setParameter(6, StartDate);
            storedProcedureQuery.setParameter(7, EndDate);
            storedProcedureQuery.setParameter(8, Persentage);

            storedProcedureQuery.execute();
            String result = storedProcedureQuery.getOutputParameterValue(9).toString();

            map.put("Status", result);

            return map;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        map.put("Status", "Failure");
        return map;
    }


    public HashMap<String, String> AddPostGraduation(String QueryType, String GraduationID, String CourseName, String UniversityName, String CollegeName, String StartDate, String EndDate, Float Persentage) {


        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("postGraduationprocedure");
        try {
            storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(8, Float.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);

            storedProcedureQuery.setParameter(1, "INSERT");
            storedProcedureQuery.setParameter(2, "1");
            storedProcedureQuery.setParameter(3, CourseName);
            storedProcedureQuery.setParameter(4, UniversityName);
            storedProcedureQuery.setParameter(5, CollegeName);
            storedProcedureQuery.setParameter(6, StartDate);
            storedProcedureQuery.setParameter(7, EndDate);
            storedProcedureQuery.setParameter(8, Persentage);


            storedProcedureQuery.execute();
            String result = storedProcedureQuery.getOutputParameterValue(9).toString();

            map.put("Status", result);

            return map;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        map.put("Status", "Failure");
        return map;
    }


    public HashMap<String, String> UpdatePostGraduation(String QueryType, Integer PostGraduationID, String CourseName, String UniversityName, String CollegeName, String StartDate, String EndDate, Float Persentage) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("postGraduationprocedure");
        try {
            storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(8, Float.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);

            storedProcedureQuery.setParameter(1, "UPDATE");
            storedProcedureQuery.setParameter(2, PostGraduationID);
            storedProcedureQuery.setParameter(3, CourseName);
            storedProcedureQuery.setParameter(4, UniversityName);
            storedProcedureQuery.setParameter(5, CollegeName);
            storedProcedureQuery.setParameter(6, StartDate);
            storedProcedureQuery.setParameter(7, EndDate);
            storedProcedureQuery.setParameter(8, Persentage);


            storedProcedureQuery.execute();
            String result = storedProcedureQuery.getOutputParameterValue(9).toString();

            map.put("Status", result);

            return map;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        map.put("Status", "Failure");
        return map;
    }


    public HashMap<String, String> DeletePostGraduation(String QueryType, Integer PostGraduationID, String CourseName, String UniversityName, String CollegeName, String StartDate, String EndDate, Float Persentage) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("postGraduationprocedure");
        try {
            storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(8, Float.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);

            storedProcedureQuery.setParameter(1, "DELETE");
            storedProcedureQuery.setParameter(2, PostGraduationID);
            storedProcedureQuery.setParameter(3, CourseName);
            storedProcedureQuery.setParameter(4, UniversityName);
            storedProcedureQuery.setParameter(5, CollegeName);
            storedProcedureQuery.setParameter(6, StartDate);
            storedProcedureQuery.setParameter(7, EndDate);
            storedProcedureQuery.setParameter(8, Persentage);

            storedProcedureQuery.execute();
            String result = storedProcedureQuery.getOutputParameterValue(9).toString();

            map.put("Status", result);

            return map;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        map.put("Status", "Failure");
        return map;
    }


    public HashMap<String, String> AddOtherEduQualifiaction(String QueryType, String otherEduQualificationTableID, String CourseName, String UniversityName, String CollegeName, String StartDate, String EndDate, Float Persentage) {


        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("otherEduprocedure");
        try {
            storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(8, Float.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);

            storedProcedureQuery.setParameter(1, "INSERT");
            storedProcedureQuery.setParameter(2, "1");
            storedProcedureQuery.setParameter(3, CourseName);
            storedProcedureQuery.setParameter(4, UniversityName);
            storedProcedureQuery.setParameter(5, CollegeName);
            storedProcedureQuery.setParameter(6, StartDate);
            storedProcedureQuery.setParameter(7, EndDate);
            storedProcedureQuery.setParameter(8, Persentage);


            storedProcedureQuery.execute();
            String result = storedProcedureQuery.getOutputParameterValue(9).toString();

            map.put("Status", result);

            return map;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        map.put("Status", "Failure");
        return map;
    }


    public HashMap<String, String> UpdateOtherEduQualifiaction(String QueryType, Integer otherEduQualificationTableID, String CourseName, String UniversityName, String CollegeName, String StartDate, String EndDate, Float Persentage) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("otherEduprocedure");
        try {
            storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(8, Float.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);

            storedProcedureQuery.setParameter(1, "UPDATE");
            storedProcedureQuery.setParameter(2, otherEduQualificationTableID);
            storedProcedureQuery.setParameter(3, CourseName);
            storedProcedureQuery.setParameter(4, UniversityName);
            storedProcedureQuery.setParameter(5, CollegeName);
            storedProcedureQuery.setParameter(6, StartDate);
            storedProcedureQuery.setParameter(7, EndDate);
            storedProcedureQuery.setParameter(8, Persentage);


            storedProcedureQuery.execute();
            String result = storedProcedureQuery.getOutputParameterValue(9).toString();

            map.put("Status", result);

            return map;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        map.put("Status", "Failure");
        return map;
    }


    public HashMap<String, String> DeleteOtherEduQualifiaction(String QueryType, Integer otherEduQualificationTableID, String CourseName, String UniversityName, String CollegeName, String StartDate, String EndDate, Float Persentage) {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("otherEduprocedure");
        try {
            storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(2, Integer.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(4, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(8, Float.class, ParameterMode.IN);
            storedProcedureQuery.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);

            storedProcedureQuery.setParameter(1, "DELETE");
            storedProcedureQuery.setParameter(2, otherEduQualificationTableID);
            storedProcedureQuery.setParameter(3, CourseName);
            storedProcedureQuery.setParameter(4, UniversityName);
            storedProcedureQuery.setParameter(5, CollegeName);
            storedProcedureQuery.setParameter(6, StartDate);
            storedProcedureQuery.setParameter(7, EndDate);
            storedProcedureQuery.setParameter(8, Persentage);

            storedProcedureQuery.execute();
            String result = storedProcedureQuery.getOutputParameterValue(9).toString();

            map.put("Status", result);

            return map;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        map.put("Status", "Failure");
        return map;

    }

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


    public HashMap<String, String> SaveAddress(String QueryType, String Address, String City, String State, String
            Country, String Pin_code, String Address_Status,
                                               String Contact_No, String Email_ID, String Emergency_contact_person, String
                                                       Emergency_contact_number, Integer eid, Integer A_ID) {
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
        storedProcedureQuery.registerStoredProcedureParameter(14, String.class, ParameterMode.OUT);

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
        storedProcedureQuery.setParameter(13, A_ID);
        storedProcedureQuery.execute();
        String output = storedProcedureQuery.getOutputParameterValue(14).toString();
        map.put("STATUS", output);
        return map;
    }

    public HashMap<String, String> UpdateAddress(String QueryType, String Address, String City, String
            State, String Country, String Pin_code, String Address_Status,
                                                 String Contact_No, String Email_ID, String Emergency_contact_person, String
                                                         Emergency_contact_number, Integer eid, Integer A_ID) {
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
        storedProcedureQuery.registerStoredProcedureParameter(14, String.class, ParameterMode.OUT);

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
        storedProcedureQuery.execute();
        String output = storedProcedureQuery.getOutputParameterValue(14).toString();
        map.put("STATUS", output);
        return map;
    }

    public HashMap<String, String> DeleteAddress(String QueryType, String Address, String City, String
            State, String Country, String Pin_code, String Address_Status,
                                                 String Contact_No, String Email_ID, String Emergency_contact_person, String
                                                         Emergency_contact_number, Integer eid, Integer A_ID) {
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
        storedProcedureQuery.registerStoredProcedureParameter(14, String.class, ParameterMode.OUT);

        storedProcedureQuery.setParameter(1, "DELETE");
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
        storedProcedureQuery.execute();
        String output = storedProcedureQuery.getOutputParameterValue(14).toString();
        map.put("STATUS", output);
        return map;
    }


    public HashMap<String, String> saveProfessionQualification(String QueryType, String Institute, String
            Course, String Start_Date, String End_Date, Integer Q_id) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("ProfessionalQualification");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT);

        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(Start_Date);
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(End_Date);

        storedProcedureQuery.setParameter(1, "INSERT");
        storedProcedureQuery.setParameter(2, Institute);
        storedProcedureQuery.setParameter(3, Course);
        storedProcedureQuery.setParameter(4, date1);
        storedProcedureQuery.setParameter(5, date2);
        storedProcedureQuery.setParameter(6, Q_id);

        storedProcedureQuery.execute();
        String output = storedProcedureQuery.getOutputParameterValue(7).toString();
        map.put("STATUS", output);
        return map;
    }

    public HashMap<String, String> upadteProfessionQualification(String QueryType, String Institute, String
            Course, String Start_Date, String End_Date, Integer Q_id) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("ProfessionalQualification");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT);

        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(Start_Date);
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(End_Date);

        storedProcedureQuery.setParameter(1, "UPDATE");
        storedProcedureQuery.setParameter(2, Institute);
        storedProcedureQuery.setParameter(3, Course);
        storedProcedureQuery.setParameter(4, date1);
        storedProcedureQuery.setParameter(5, date2);
        storedProcedureQuery.setParameter(6, Q_id);

        storedProcedureQuery.execute();
        String output = storedProcedureQuery.getOutputParameterValue(7).toString();
        map.put("STATUS", output);
        return map;
    }

    public HashMap<String, String> DeleteProfessionQualification(String QueryType, String Institute, String
            Course, String Start_Date, String End_Date, Integer Q_id) throws ParseException {
        StoredProcedureQuery storedProcedureQuery = em.createStoredProcedureQuery("ProfessionalQualification");
        storedProcedureQuery.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(4, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(5, Date.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(6, Integer.class, ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT);

        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(Start_Date);
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(End_Date);

        storedProcedureQuery.setParameter(1, "DELETE");
        storedProcedureQuery.setParameter(2, Institute);
        storedProcedureQuery.setParameter(3, Course);
        storedProcedureQuery.setParameter(4, date1);
        storedProcedureQuery.setParameter(5, date2);
        storedProcedureQuery.setParameter(6, Q_id);

        storedProcedureQuery.execute();
        String output = storedProcedureQuery.getOutputParameterValue(7).toString();
        map.put("STATUS", output);
        return map;
    }


}


