package mybatis.sscce.foreach.with.bind;

import java.util.UUID;

public class BarId {
  private final String id;

  public BarId(String id) {
    this.id = id;
  }

  public String asText() {
    return id;
  }

  public String getText() {
    return asText();
  }
}
