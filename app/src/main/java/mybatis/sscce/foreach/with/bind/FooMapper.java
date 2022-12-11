package mybatis.sscce.foreach.with.bind;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

public interface FooMapper {
  Integer countBar(@Param("query") List<BarId> query);
}
