package com.example.inshur_java_task_hani_sefein;

import java.util.List;

public class WeatherModel {
  
  private Long appid;
  private Double lat;
  private Double lon;
  private List exclude;
  
  public WeatherModel(Long appid, Double lat, Double lon, String timezone, Integer timezone_offset, List current) {
    this.appid = appid;
    this.lat = lat;
    this.lon = lon;
    this.exclude = current;
  }
  
  public Long getAppid() {
    return appid;
  }
  
  public void setAppid(Long appid) {
    this.appid = appid;
  }
  
  public Double getLat() {
    return lat;
  }
  
  public void setLat(Double lat) {
    this.lat = lat;
  }
  
  public Double getLon() {
    return lon;
  }
  
  public void setLon(Double lon) {
    this.lon = lon;
  }
  
  public List getCurrent() {
    return exclude;
  }
  
  public void setCurrent(List current) {
    this.exclude = current;
  }
  
  public WeatherModel() {
    super();
  }
  
  @Override
  public int hashCode() {
    return super.hashCode();
  }
  
  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }
  
  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
  
  @Override
  public String toString() {
    return super.toString();
  }
  
  @Override
  protected void finalize() throws Throwable {
    super.finalize();
  }
  
}
