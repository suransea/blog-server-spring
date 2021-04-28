package top.suransea.blogserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.suransea.blogserver.mapper.ArticleMapper;

@RestController
@RequestMapping("/articles")
public class ArticleController {
    private final ArticleMapper articleMapper;

    public ArticleController(ArticleMapper articleMapper) {
        this.articleMapper = articleMapper;
    }

    @GetMapping
    public Object allArticles() {
        return articleMapper.selectAll();
    }
}
