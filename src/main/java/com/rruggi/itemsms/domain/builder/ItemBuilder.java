package com.rruggi.itemsms.domain.builder;

import com.rruggi.itemsms.domain.Container;
import com.rruggi.itemsms.domain.Item;
import java.math.BigDecimal;

public class ItemBuilder {

  private String id;
  private String name;
  private String size;
  private String brandName;
  private Container container;
  private BigDecimal price;

  public ItemBuilder setId(String id) {
    this.id = id;
    return this;
  }

  public ItemBuilder setName(String name) {
    this.name = name;
    return this;
  }

  public ItemBuilder setSize(String size) {
    this.size = size;
    return this;
  }

  public ItemBuilder setBrandName(String brandName) {
    this.brandName = brandName;
    return this;
  }

  public ItemBuilder setContainer(Container container) {
    this.container = container;
    return this;
  }

  public ItemBuilder setPrice(BigDecimal price) {
    this.price = price;
    return this;
  }

  public Item createItem() {
    Item item = new Item();
    item.setId(id);
    item.setName(name);
    item.setSize(size);
    item.setBrandName(brandName);
    item.setContainer(container);
    item.setPrice(price);
    return item;
  }
}