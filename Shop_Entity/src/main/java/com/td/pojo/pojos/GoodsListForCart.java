package com.td.pojo.pojos;


public class GoodsListForCart {

  private Integer id;
  private Integer goodsId;
  private Integer purchasedNum;
  private Integer cartId;
  private String goodsName;
  private double goodsPrice;
  private Integer backCarIntegral;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public Integer getGoodsId() {
    return goodsId;
  }

  public void setGoodsId(Integer goodsId) {
    this.goodsId = goodsId;
  }


  public Integer getPurchasedNum() {
    return purchasedNum;
  }

  public void setPurchasedNum(Integer purchasedNum) {
    this.purchasedNum = purchasedNum;
  }


  public Integer getCartId() {
    return cartId;
  }

  public void setCartId(Integer cartId) {
    this.cartId = cartId;
  }


  public String getGoodsName() {
    return goodsName;
  }

  public void setGoodsName(String goodsName) {
    this.goodsName = goodsName;
  }


  public double getGoodsPrice() {
    return goodsPrice;
  }

  public void setGoodsPrice(double goodsPrice) {
    this.goodsPrice = goodsPrice;
  }


  public Integer getBackCarIntegral() {
    return backCarIntegral;
  }

  public void setBackCarIntegral(Integer backCarIntegral) {
    this.backCarIntegral = backCarIntegral;
  }

}
