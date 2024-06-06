package com.jaction.app.servises;

import java.util.List;
import com.jaction.app.Model.student;

public class dao {
    
    public String getNames(List<student> stds) {
        String allstds = "=>[ ";
        for(student s: stds) {
            allstds += s.getName() + " ] , [";
        }
        return allstds;
    }
}
