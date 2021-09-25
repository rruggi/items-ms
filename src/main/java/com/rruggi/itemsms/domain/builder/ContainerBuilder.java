package com.rruggi.itemsms.domain.builder;

import com.rruggi.itemsms.domain.Container;

public class ContainerBuilder {

  private String name;
  private String state;
  private String unitOfMeasurement;
  private String amount;

  public ContainerBuilder setName(final String name) {
    this.name = name;
    return this;
  }

  public ContainerBuilder setState(final String state) {
    this.state = state;
    return this;
  }

  public ContainerBuilder setUnitOfMeasurement(final String unitOfMeasurement) {
    this.unitOfMeasurement = unitOfMeasurement;
    return this;
  }

  public ContainerBuilder setAmount(final String amount) {
    this.amount = amount;
    return this;
  }

  public Container createContainer() {
    Container container = new Container();
    container.setName(name);
    container.setState(state);
    container.setUnitOfMeasurement(unitOfMeasurement);
    container.setAmount(amount);

    return container;
  }
}