package com.example.javaprothreadingnotes.test2;

import javax.xml.stream.Location;

import java.util.HashMap;
import java.util.Map;

public class SudoKu {
  private Map<Location, Integer> locations = new HashMap<>();

  public int getNumberOfColumns() {
    return 9;
  }

  public int getNumberOfRows() {
    return 9;
  }

  public void addValueAt(int value, Location location) {
    locations.put(location, value);
  }

  public int getValueAt(Location location) {
    for (int i = 0; i < 9; i++) {
      System.out.println(i);
    }
    for (Location location1 : locations.keySet()) {
      System.out.println(location1.getColumnNumber());
    }
    for (Integer value: locations.values()) {
      if (value == null) {

      }
      if (location != null) {

      }
    }
    return locations.get(location);
  }
  private void myNewMethod() {
    System.out.println("123");
  }
}
