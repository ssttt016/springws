package com.kbstar.controller;

import com.kbstar.dto.Marker;
import com.kbstar.service.MarkerService;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MarkerImplController {
    @Autowired
    MarkerService service;
    @RequestMapping("/markers")
    public Object markers(String loc){
        List<Marker> list = null;
        try {
            list = service.get();
        }catch(Exception e){
            e.printStackTrace();
        }

        JSONArray ja = new JSONArray();
        for(Marker obj:list){
            JSONObject jo = new JSONObject();
            jo.put("id",obj.getId());
            jo.put("title",obj.getTitle());
            jo.put("target",obj.getTarget());
            jo.put("lat",obj.getLat());
            jo.put("lng",obj.getLng());
            jo.put("img",obj.getImg());
            jo.put("loc",obj.getLoc());
            ja.add(jo);
        }
        return ja;
    }
}
