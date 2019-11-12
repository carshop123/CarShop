package com.td.pojo.pojos;


public class ReceiverAddr {

  private Integer id;
  private Integer uid;
  private String receiverName;
  private Integer addrType;
  private Integer isTop;
  private String addrDetial;
  private String receiverPhone;
  private String receiverEmail;
  private java.sql.Timestamp createTime;


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


  public String getReceiverName() {
    return receiverName;
  }

  public void setReceiverName(String receiverName) {
    this.receiverName = receiverName;
  }


  public Integer getAddrType() {
    return addrType;
  }

  public void setAddrType(Integer addrType) {
    this.addrType = addrType;
  }


  public Integer getIsTop() {
    return isTop;
  }

  public void setIsTop(Integer isTop) {
    this.isTop = isTop;
  }


  public String getAddrDetial() {
    return addrDetial;
  }

  public void setAddrDetial(String addrDetial) {
    this.addrDetial = addrDetial;
  }


  public String getReceiverPhone() {
    return receiverPhone;
  }

  public void setReceiverPhone(String receiverPhone) {
    this.receiverPhone = receiverPhone;
  }


  public String getReceiverEmail() {
    return receiverEmail;
  }

  public void setReceiverEmail(String receiverEmail) {
    this.receiverEmail = receiverEmail;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }

}
