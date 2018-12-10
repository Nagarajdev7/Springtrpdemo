package com.example.demo.controller;

import com.example.demo.model.TidmAgrBnf;
import com.example.demo.service.TidmAgrBnfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TidmAgrBnfController {

    @Autowired
    private TidmAgrBnfService tidmAgrBnfService;

    @RequestMapping("/test/")
    public String test(Model model){
        List<TidmAgrBnf> tidmAgrBnf = tidmAgrBnfService.getAll();
        model.addAllAttributes(tidmAgrBnf);
        return tidmAgrBnf.toString();
    }

    @RequestMapping(value = "/get/",method = RequestMethod.GET)
    public List<TidmAgrBnf> getAll(){
        return tidmAgrBnfService.getAll();
    }

    @RequestMapping(value = "/get/{agrId}",method = RequestMethod.GET)
    public TidmAgrBnf getById(@PathVariable(value="agrId") long agrId){
        return tidmAgrBnfService.getById(agrId);
    }

    @RequestMapping(value = "/put/", method = RequestMethod.POST)
    public String put(@RequestBody TidmAgrBnf tidmAgrBnf){
        tidmAgrBnfService.put(tidmAgrBnf);
        return "Record Inserted Sucessfully...";
    }

    @RequestMapping(value = "/putall/", method = RequestMethod.POST)
    public String putAll(@RequestBody List<TidmAgrBnf> tidmAgrBnfs){
        tidmAgrBnfService.putAll(tidmAgrBnfs);
        return "Records inserted Successfully...";
    }

    @RequestMapping(value = "/update/", method = RequestMethod.PUT)
    public String update(@RequestBody TidmAgrBnf tidmAgrBnf){
        tidmAgrBnfService.update(tidmAgrBnf);
        return "Record updated successfully";
    }

    @RequestMapping(value = "/delete/{agrId}", method = RequestMethod.DELETE)
    public String delete(@PathVariable(value="agrId") long agrId){
        tidmAgrBnfService.delete(agrId);
        return "Record deleted successfully";
    }
}
