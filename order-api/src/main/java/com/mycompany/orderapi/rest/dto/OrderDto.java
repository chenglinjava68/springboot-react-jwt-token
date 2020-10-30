package com.mycompany.orderapi.rest.dto;

import java.time.ZonedDateTime;

import lombok.Data;

@Data
public class OrderDto {
  
  private String id;
  private String description;
  private UserDto user;
  private ZonedDateTime createdAt;

  @Data
  public static final class UserDto {
    private String username;
  }

}