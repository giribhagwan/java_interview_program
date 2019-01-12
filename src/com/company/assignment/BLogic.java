package com.company.assignment;

import java.util.*;
import java.util.HashMap;

public class BLogic {
    public void display(ArrayList<Student> list){

//        roll:101,
//        name:"name",
//                subject:[{
//                    subject:"java",
//                    marks:20,
//                },{
//                   subject:"java",
//                    marks:20,
//               }]
        Map<Map<Integer,String>, List<Subjects>> map=new HashMap<>();

        for (Student student:list){

            Subjects subjects=new Subjects(student.getSubject(),student.getMarks());
            Map<Integer,String> id=new HashMap<>();
            id.put(student.getRoll(),student.getName());
            if (!map.containsKey(id)){
                List<Subjects> subjectsList=new ArrayList<>();
                subjectsList.add(subjects);
                map.put(id,subjectsList);
            }
            else{
                List<Subjects> subjectsList=map.get(id);
                subjectsList.add(subjects);
//                map.put(id,subjectsList);
            }
        }
        System.out.println(map.size());
            Set<Map<Integer,String>> set=map.keySet();
            for (Map<Integer,String> en:set){
                List<Subjects> subjectsList=map.get(en);
                System.out.println(en.keySet()+","+ en.values()+" Subjects"+subjectsList.toString());
            }


    }
}
