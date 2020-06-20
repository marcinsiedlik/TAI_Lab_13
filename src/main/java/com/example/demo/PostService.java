package com.example.demo;

import com.example.demo.post.Post;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private final List<Post> posts = List.of(
            new Post(1,
                    "Post 1",
                    "https://s.ftcdn.net/v2013/pics/all/curated/RKyaEDwp8J7JKeZWQPuOVWvkUjGQfpCx_cover_580.jpg?r=1a0fc22192d0c808b8bb2b9bcfbf4a45b1793687",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut justo erat, vehicula non leo quis, maximus varius lectus. Sed placerat bibendum est, eu tincidunt nisl sodales nec. Cras sed nibh tellus."
            ),
            new Post(2,
                    "Post 2",
                    "https://s.ftcdn.net/v2013/pics/all/curated/RKyaEDwp8J7JKeZWQPuOVWvkUjGQfpCx_cover_580.jpg?r=1a0fc22192d0c808b8bb2b9bcfbf4a45b1793687",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut justo erat, vehicula non leo quis, maximus varius lectus. Sed placerat bibendum est, eu tincidunt nisl sodales nec. Cras sed nibh tellus."
            ),
            new Post(3,
                    "Post 3",
                    "https://s.ftcdn.net/v2013/pics/all/curated/RKyaEDwp8J7JKeZWQPuOVWvkUjGQfpCx_cover_580.jpg?r=1a0fc22192d0c808b8bb2b9bcfbf4a45b1793687",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut justo erat, vehicula non leo quis, maximus varius lectus. Sed placerat bibendum est, eu tincidunt nisl sodales nec. Cras sed nibh tellus."
            )
    );

    public List<Post> getAll() {
        return posts;
    }

    public Optional<Post> get(int id) {
        return posts
                .stream()
                .filter(e -> e.getId() == id)
                .findFirst();
    }
}
