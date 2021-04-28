package top.suransea.blogserver.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import top.suransea.blogserver.pojo.Article;

import java.util.List;

@Mapper
public interface ArticleMapper {

    @Select("SELECT a.id, a.title, a.summary, a.ctime, a.utime, c.content " +
            "FROM article AS a LEFT JOIN content AS c ON a.content_id=c.id")
    List<Article> selectAll();
}
