package me.gogohigh.springbootdeveloper.repository;

import me.gogohigh.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
