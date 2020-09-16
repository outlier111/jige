package com.byxm.SpringBootByxm.modules.account.entity;


public class Teachers {

  private int tId;
  private String tNumber;
  private String password;
  private String tName;
  private int hId;
  private int sysId;
  private int rId;


  public int gettId() {
    return tId;
  }

  public void settId(int tId) {
    this.tId = tId;
  }

  public String gettNumber() {
    return tNumber;
  }

  public void settNumber(String tNumber) {
    this.tNumber = tNumber;
  }

  public String gettName() {
    return tName;
  }

  public void settName(String tName) {
    this.tName = tName;
  }

  public int gethId() {
    return hId;
  }

  public void sethId(int hId) {
    this.hId = hId;
  }

  public int getrId() {
    return rId;
  }

  public void setrId(int rId) {
    this.rId = rId;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public int getSysId() {
    return sysId;
  }

  public void setSysId(int sysId) {
    this.sysId = sysId;
  }


}
