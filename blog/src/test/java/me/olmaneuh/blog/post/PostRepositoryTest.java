package me.olmaneuh.blog.post;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class PostRepositoryTest {

    @Autowired
    private PostRepository repository;

    @BeforeAll
    static void initAll() {

    }

    @Test
    void ShouldReturnAllPublicPosts() {
        List<Post> results = repository.findByIsPrivateFalse();
        assertEquals(0, results.size());
    }

}
