package com.td.pojo.pojos;


public class UserOrder {

  private Integer id;
  private Integer uid;
  private String orderId;
  private Integer orderStatus;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp endTime;
  private Integer goodsListId;
  private Integer receiverId;
  private Integer playType;


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


  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public Integer getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(Integer orderStatus) {
    this.orderStatus = orderStatus;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getEndTime() {
    return endTime;
  }

  public void setEndTime(java.sql.Timestamp endTime) {
    this.endTime = endTime;
  }


  public Integer getGoodsListId() {
    return goodsListId;
  }

  public void setGoodsListId(Integer goodsListId) {
    this.goodsListId = goodsListId;
  }


  public Integer getReceiverId() {
    return receiverId;
  }

  public void setReceiverId(Integer receiverId) {
    this.receiverId = receiverId;
  }


  public Integer getPlayType() {
    return playType;
  }

  public void setPlayType(Integer playType) {
    this.playType = playType;
  }

}
