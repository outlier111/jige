package com.byxm.SpringBootByxm.modules.account.entity;


public class Managers {

  private int mId;
  private String mNumber;
  private String password;
  private int rId;


  public int getmId() {
    return mId;
  }

  public void setmId(int mId) {
    this.mId = mId;
  }

  public String getmNumber() {
    return mNumber;
  }

  public void setmNumber(String mNumber) {
    this.mNumber = mNumber;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public int getrId() {
    return rId;
  }

  public void setrId(int rId) {
    this.rId = rId;
  }
}
