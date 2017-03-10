package com.galvanize;

public class Address {
 
  // variables
  private String street, city, state, zip;

  // constructor
  public Address(String street,String city, String state, String zip)
  {
      this.street = street;
      this.city = city;
      this.state = state;
      this.zip = zip;
  }

  // getters
  public String getState()
  {
     return this.state;
  }

  public String getCity()
  {
      return this.city;
  }

  public String getZip()
  {
      return this.zip;
  }

  public String getStreet()
  {
      return this.street;
  }
  

  //setters
  public void setStreet(String street)
  {
      if(street != null && !street.isEmpty())
      {
        this.street = street.trim();
      }
      else
      {
          this.street = street;
      }
      
  }

  // store state in uppercase
  public void setState(String state)
  {
      if(state != null && !state.isEmpty())
      {
        this.state = state.trim().toUpperCase();
      }
      else
      {
          this.state = state;
      }
  }

  // do we need any validation for Zip ?
  public void setZip(String zip)
  {
      if(zip != null && !zip.isEmpty())
      {
        this.zip = zip.trim();
      }
      else
      {
         this.zip = zip;
      }
      
  }

  public void setCity(String city)
  {
      if(city != null && !city.isEmpty())
      {
        this.city = city.trim();
      }
      else
      {
         this.city = city;
      }
      
  }

  // Override the  toString  method to return the address in the format  <street>, <city>, <state> <zip> 
  // Add first letter capitalise code
  public String toString()
  {
      StringBuilder addressString = new StringBuilder();
      
      if(getStreet() != null && !getStreet().isEmpty())
      {
           addressString.append(getStreet());
      }

      if(getCity() != null && !getCity().isEmpty())
      {
           addressString.append(", ");
           addressString.append(getCity());
      }

      if(getState() != null && !getState().isEmpty())
      {
           addressString.append(", ");
           addressString.append(getState());
      }

      if(getZip() != null && !getZip().isEmpty())
      {
           addressString.append(" ");
           addressString.append(getZip());
      }

      return addressString.toString();
  }

}