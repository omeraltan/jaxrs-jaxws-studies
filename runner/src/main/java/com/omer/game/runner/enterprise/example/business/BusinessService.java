package com.omer.game.runner.enterprise.example.business;

import com.omer.game.runner.enterprise.example.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BusinessService{

    // Field injection : Over here, dependency injection is done using reflection.
    @Autowired
    private DataService dataService;

//    // Setter injection
//    @Autowired
//    public void setDataService(DataService dataService) {
//        System.out.println("Setter injection");
//        this.dataService = dataService;
//    }

    public long calculateSum(){
        List<Integer> data = dataService.getData();
        return data.stream().reduce(Integer::sum).get();
    }
}
