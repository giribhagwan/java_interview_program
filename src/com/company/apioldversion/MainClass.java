package com.company.apioldversion;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class MainClass {

    public static void main(String[] args)  {
        String numLines = null;
        List<AppApiData> appApiDataList=new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get("input.txt"))) {
            stream.forEach(e->{
                    String[] line=e.split(",");
                    appApiDataList.add(new AppApiData(line[0].trim(),line[1].trim(),line[2].trim()));

            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<ApiTable> apiTableList=new ArrayList<>();

        appApiDataList.forEach(e->{
            int v= Integer.parseInt(e.getApiVersion().substring(1));
            if(!apiTableList.stream().filter(o -> o.getApiName().equals(e.getApiName())).findFirst().isPresent())
            {
                Set<Integer> list=new TreeSet<>();
                list.add(v);
                apiTableList.add(new ApiTable(e.getApiName(),list));
            }else {
                ApiTable existMap=apiTableList.stream().
                        filter(p -> p.getApiName().equals(e.getApiName())).
                        findAny().orElse(null);
                Set<Integer> list= existMap.getVersion();
                list.add(v);
                existMap.setVersion(list);
            }
        });

        for(ApiTable e:apiTableList){

            if(e.getVersion().size()>1){
                AppApiData data= appApiDataList.stream().
                        filter(p -> (p.getApiName().equals(e.getApiName()) && p.getApiVersion().equals("v"+e.getVersion().iterator().next()))).
                        findAny().orElse(null);
                numLines=data.getAppName();
                break;
            }
        }
        PrintWriter output = null;
        try {
            output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        output.println("" + numLines);
        output.close();
    }
}
