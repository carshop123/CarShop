package com.td.pojo.pojos;


public class PaymentInformationTable {

  private Integer id;
  private Integer payType;
  private Integer oid;
  private double allGoodsPrice;
  private double preferentialPrice;
  private double amountPayable;
  private double freightPrice;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getPayType() {
    return payType;
  }

  public void setPayType(Integer payType) {
    this.payType = payType;
  }


  public Integer getOid() {
    return oid;
  }

  public void setOid(Integer oid) {
    this.oid = oid;
  }


  public double getAllGoodsPrice() {
    return allGoodsPrice;
  }

  public void setAllGoodsPrice(double allGoodsPrice) {
    this.allGoodsPrice = allGoodsPrice;
  }


  public double getPreferentialPrice() {
    return preferentialPrice;
  }

  public void setPreferentialPrice(double preferentialPrice) {
    this.preferentialPrice = preferentialPrice;
  }


  public double getAmountPayable() {
    return amountPayable;
  }

  public void setAmountPayable(double amountPayable) {
    this.amountPayable = amountPayable;
  }


  public double getFreightPrice() {
    return freightPrice;
  }

  public void setFreightPrice(double freightPrice) {
    this.freightPrice = freightPrice;
  }

}
