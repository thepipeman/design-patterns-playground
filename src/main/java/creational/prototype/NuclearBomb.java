package creational.prototype;

import lombok.Data;

@Data
public abstract class NuclearBomb implements Cloneable {

  int disasterLevel;
  int radius;
  String name;

  public abstract void assemble();

  public Object clone() {
    Object clone = null;
    try {
      clone = super.clone();

    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }

    return clone;
  }

}
