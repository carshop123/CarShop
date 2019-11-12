package com.td.pojo.pojos;

import lombok.Data;

@Data
public class MoreUserInfo {

  private Integer id;
  private Integer uid;
  private String nickName;
  private Integer sex;
  private java.sql.Date birthday;
  private Integer maritalStatus;
  private String profession;
  private Integer educationLevel;

}
