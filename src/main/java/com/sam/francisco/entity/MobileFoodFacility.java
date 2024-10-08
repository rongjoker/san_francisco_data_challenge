package com.sam.francisco.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class MobileFoodFacility {

  @ExcelProperty("locationid")
  private Integer locationId;

  @ExcelProperty("Applicant")
  private String applicant;

  @ExcelProperty("FacilityType")
  private String facilityType;
  @ExcelProperty("cnn")
  private Integer cnn;
  @ExcelProperty("LocationDescription")
  private String locationDescription;
  @ExcelProperty("Address")
  private String address;
  @ExcelProperty("blocklot")
  private String blocklot;
  @ExcelProperty("block")
  private String block;
  @ExcelProperty("lot")
  private String lot;
  @ExcelProperty("permit")
  private String permit;
  @ExcelProperty("Status")
  private String status;
  @ExcelProperty("FoodItems")
  private String foodItems;
  @ExcelProperty("X")
  private String x;
  @ExcelProperty("Y")
  private String y;
  @ExcelProperty("Latitude")
  private String latitude;
  @ExcelProperty("Longitude")
  private String longitude;
  @ExcelProperty("Schedule")
  private String Schedule;
  @ExcelProperty("dayshours")
  private String daysHours;
  @ExcelProperty("NOISent")
  private String noiSent;
  @ExcelProperty("Approved")
  private String approved;
  @ExcelProperty("Received")
  private String received;
  @ExcelProperty("PriorPermit")
  private String priorPermit;
  @ExcelProperty("ExpirationDate")
  private String expirationDate;
  @ExcelProperty("Location")
  private String location;
  @ExcelProperty("Fire Prevention Districts")
  private String firePreventionDistricts;
  @ExcelProperty("Police Districts")
  private String policeDistricts;
  @ExcelProperty("Supervisor Districts")
  private String supervisorDistricts;
  @ExcelProperty("Zip Codes")
  private String zipCodes;
  @ExcelProperty("Neighborhoods (old)")
  private String neighborhoods;


}
