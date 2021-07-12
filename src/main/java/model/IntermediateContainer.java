package model;

public abstract class IntermediateContainer<T extends AbstractChild> extends AbstractContainer<T> {

      @Override
      public T getChild(){
        return this.child;
      }
      @Override
      public void setChild(T child) {
        this.child = child;
      }
}
