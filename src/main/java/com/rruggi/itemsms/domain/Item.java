package com.rruggi.itemsms.domain;

import java.math.BigDecimal;

public class Item {

  private String id;
  private String name;
  private String size;
  private String brandName;
  private Container container;
  private BigDecimal price;

  public String getId() {
    return id;
  }

  public void setId(final String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public String getSize() {
    return size;
  }

  public void setSize(final String size) {
    this.size = size;
  }

  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(final String brandName) {
    this.brandName = brandName;
  }

  public Container getContainer() {
    return container;
  }

  public void setContainer(final Container container) {
    this.container = container;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(final BigDecimal price) {
    this.price = price;
  }
}
