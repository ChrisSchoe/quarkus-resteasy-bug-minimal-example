package model;

public class ConcreteChild extends AbstractChild {
  String nickname;

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }
}
