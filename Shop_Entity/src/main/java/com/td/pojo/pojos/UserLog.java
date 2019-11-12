package com.td.pojo.pojos;


public class UserLog {

  private Integer id;
  private Integer uid;
  private String logDetail;
  private java.sql.Date createTime;
  private Integer flag;
  private String ipAddr;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getUid() {
    return uid;
  }

  public void setUid(Integer uid) {
    this.uid = uid;
  }


  public String getLogDetail() {
    return logDetail;
  }

  public void setLogDetail(String logDetail) {
    this.logDetail = logDetail;
  }


  public java.sql.Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Date createTime) {
    this.createTime = createTime;
  }


  public Integer getFlag() {
    return flag;
  }

  public void setFlag(Integer flag) {
    this.flag = flag;
  }


  public String getIpAddr() {
    return ipAddr;
  }

  public void setIpAddr(String ipAddr) {
    this.ipAddr = ipAddr;
  }

}
