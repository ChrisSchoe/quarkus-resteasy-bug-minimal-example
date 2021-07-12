package model;

public abstract class AbstractContainer<T extends AbstractChild> {

  T child;

  public T getChild() {
    return child;
  }

  public void setChild(T child) {
    this.child = child;
  }

}
