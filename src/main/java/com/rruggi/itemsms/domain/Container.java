package com.rruggi.itemsms.domain;

public class Container {

  private String name;
  private String state;
  private String unitOfMeasurement;
  private String amount;

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public String getState() {
    return state;
  }

  public void setState(final String state) {
    this.state = state;
  }

  public String getUnitOfMeasurement() {
    return unitOfMeasurement;
  }

  public void setUnitOfMeasurement(final String unitOfMeasurement) {
    this.unitOfMeasurement = unitOfMeasurement;
  }

  public String getAmount() {
    return amount;
  }

  public void setAmount(final String amount) {
    this.amount = amount;
  }
}
