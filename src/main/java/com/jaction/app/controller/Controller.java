package com.jaction.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jaction.app.servises.allService;
import com.jaction.app.servises.allServiceImp;
import com.jaction.app.servises.dao;
import com.jaction.app.Model.student;
import com.jaction.app.Model.writedata;


import com.jaction.app.Model.info;


@RestController
public class Controller {
    
    
    allService service = new allServiceImp();
    
    @GetMapping("")
    public String error() {
        return "HellO WorlD";
    }
    @GetMapping("/{q}")
    public String getQ(@PathVariable("q") String key) {
        return service.getData(key);
    }

    @GetMapping("/std")
    public List<student>  getStudent() {
        writedata wt = new writedata();
        return wt.write();
    }
    
    @GetMapping("/names")
    public String getNames() {
        dao mydao = new dao();
        return mydao.getNames(service.getstds());
    }
    @GetMapping("/data")
    public List<info> getdata() {
        return service.jsonData();
    }
    
    @GetMapping("/json")
    public String getjson() {
        return service.getJson();
    }
    
    
}
