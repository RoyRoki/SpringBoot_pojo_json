package com.jaction.app.Model;

import java.util.ArrayList;
import java.util.List;

public class writedata {
    
    public List<student> write() {
        List<student> students = new ArrayList<>();

        students.add(new student("Roki", "8653458679", "rokiro775@gamil.com"));
        students.add(new student("Rii", "8653465679", "rini365@gamil.com"));
        students.add(new student("Rakesh", "8654878679", "rajbonshi@gamil.com"));
        students.add(new student("Koushik", "8787958679", "rsuccess@gamil.com"));
        students.add(new student("Briaj", "86564654679", "briajmunda@gamil.com"));

        return students;
    }
}
