package ru.marinin.blog.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.marinin.blog.models.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}
