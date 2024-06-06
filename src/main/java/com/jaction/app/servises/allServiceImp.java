package com.jaction.app.servises;

import java.io.IOException;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jaction.app.Model.info;
import com.jaction.app.Model.student;
import com.jaction.app.Model.writedata;

public class allServiceImp implements allService {

    private final RestTemplate temp = new RestTemplate();
    private final ObjectMapper objectMapper = new ObjectMapper();
    
    @Override
    public String getData(String q) {
        return  "Data = "+q;
    }

    @Override
    public List<student> getstds() {
        String url = "http://localhost:8080/rok/std";
        
        String json = temp.getForObject(url, String.class);

        
        
        try {
            List<student> students = objectMapper.readValue(json, new TypeReference<List<student> >(){});
             return students;
        } catch(IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<info> jsonData() {
        String url = "http://localhost:8080/std";
        String json = temp.getForObject(url, String.class);

        try {
            List<info> infos = objectMapper.readValue(json, new TypeReference<List<info> >(){});
            return infos;
        } catch (JsonProcessingException e) {
            System.out.println("Error in catch during json convert:"+e.getMessage());
        }
        System.out.println("nehi huya");
        return null;

    }
    @Override
    public String getJson() {
        writedata wt = new writedata();
        List<student> pojo = wt.write();

        String json="error";
        try {
            json = objectMapper.writeValueAsString(pojo);
        } catch (JsonProcessingException ex) {
            System.out.println("error converting to json "+ex.getMessage());
        }
        return json;
    }

}
