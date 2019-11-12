package com.td.pojo.pojos;


public class OrderTrackTable {

  private Integer id;
  private Integer oid;
  private java.sql.Timestamp createTime;
  private String message;
  private Integer operator;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getOid() {
    return oid;
  }

  public void setOid(Integer oid) {
    this.oid = oid;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public Integer getOperator() {
    return operator;
  }

  public void setOperator(Integer operator) {
    this.operator = operator;
  }

}
