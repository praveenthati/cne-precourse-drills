package com.galvanize;

import java.util.*;

public class Business implements Addressable {

  private String name;
  private List<Address> addresses;

  public Business(String name) 
  {
     this.name = name;     
  }

  public String getName()
  {
      return this.name;
  }

  public List<Address>  getAddresses()
  {
      return this.addresses;
  }

  public void addAddress (Address address)
  {
      if(this.addresses == null)
      {
        this.addresses = new ArrayList<Address>();
      }

      this.addresses.add(address);
  }

}