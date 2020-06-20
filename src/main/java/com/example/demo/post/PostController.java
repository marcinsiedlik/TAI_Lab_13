package com.example.demo.post;

import com.example.demo.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class PostController {

    private final PostRepository postRepository;
    private PostService postService;

    @Autowired
    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/api/posts")
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/api/posts/{id}")
    public Post get(@PathVariable long id) {
        return postRepository.findById(id).get();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/api/posts")
    public ResponseEntity<Void> createPost(@RequestBody Post post) {
        Post postUpdated = postRepository.save(post);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()

                .path("/{id").buildAndExpand(postUpdated.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }
}
