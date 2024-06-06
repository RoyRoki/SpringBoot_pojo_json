package com.jaction.app.servises;

import java.util.List;

import com.jaction.app.Model.info;
import com.jaction.app.Model.student;

public interface  allService {
    String getData(String q);
    List<student> getstds();
    List<info> jsonData();
    String getJson();
}
