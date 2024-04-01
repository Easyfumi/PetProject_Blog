package ru.marinin.blog.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.marinin.blog.models.Author;

import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    @Query(nativeQuery = true, value = "SELECT a.* FROM Author a where a.name = ?1")
    Optional<Author> findAuthorByName(String name);
}

