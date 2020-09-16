package com.byxm.SpringBootByxm.modules.account.entity;


public class Course {

  private int cId;
  private String cName;
  private int tId;
  private String cPlace;
  private String cTime;
  private int sysId;
  private int credits;
  private String semester;
  private System system;
  private Teachers teachers;

  public System getSystem() {
    return system;
  }

  public void setSystem(System system) {
    this.system = system;
  }

  public Teachers getTeachers() {
    return teachers;
  }

  public void setTeachers(Teachers teachers) {
    this.teachers = teachers;
  }

  public int getcId() {
    return cId;
  }

  public void setcId(int cId) {
    this.cId = cId;
  }

  public String getcName() {
    return cName;
  }

  public void setcName(String cName) {
    this.cName = cName;
  }

  public int gettId() {
    return tId;
  }

  public void settId(int tId) {
    this.tId = tId;
  }

  public String getcPlace() {
    return cPlace;
  }

  public void setcPlace(String cPlace) {
    this.cPlace = cPlace;
  }

  public String getcTime() {
    return cTime;
  }

  public void setcTime(String cTime) {
    this.cTime = cTime;
  }

  public int getSysId() {
    return sysId;
  }

  public void setSysId(int sysId) {
    this.sysId = sysId;
  }

  public int getCredits() {
    return credits;
  }

  public void setCredits(int credits) {
    this.credits = credits;
  }

  public String getSemester() {
    return semester;
  }

  public void setSemester(String semester) {
    this.semester = semester;
  }
}
