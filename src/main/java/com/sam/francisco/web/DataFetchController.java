package com.sam.francisco.web;

import com.sam.francisco.entity.Food;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataFetchController {


  @RequestMapping(path = {"/fetch_francisco"})
  public String fetchFrancisco() {
    System.out.println("hello francisco");

    return "hello francisco";
  }

  @RequestMapping(path = {"/fetch_francisco_data"})
  public List<Food> fetchFranciscoData() {
    System.out.println("hello francisco data");

    List<Food> list = new ArrayList<>();

    Food food = new Food();
    food.setId(1);
    food.setName("hello francisco");
    list.add(food);

    return list;
  }

}
