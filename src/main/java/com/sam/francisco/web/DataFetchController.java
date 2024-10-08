package com.sam.francisco.web;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.listener.PageReadListener;
import com.sam.francisco.entity.MobileFoodFacility;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class DataFetchController {


  @RequestMapping(path = {"/fetch_francisco"})
  public String fetchFrancisco() {
    System.out.println("hello francisco");

    return "hello francisco";
  }

  @RequestMapping(path = {"/fetch_francisco_data"})
  public List<MobileFoodFacility> fetchFranciscoData() throws IOException {
    return readCsv();
  }

  public List<MobileFoodFacility> readCsv() throws IOException {

    ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
    Resource resource = resolver.getResource("classpath:Mobile_Food_Facility_Permit.csv");

    List<MobileFoodFacility> list = new ArrayList<>();

    EasyExcel.read(resource.getInputStream(), MobileFoodFacility.class,
        new PageReadListener<MobileFoodFacility>(dataList -> {
          for (MobileFoodFacility foodFacility : dataList) {
            list.add(foodFacility);
          }
        })).sheet().doRead();

    return list;

  }
}
