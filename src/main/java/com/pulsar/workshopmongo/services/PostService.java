package com.pulsar.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pulsar.workshopmongo.domain.Post;
import com.pulsar.workshopmongo.repository.PostRepository;
import com.pulsar.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired

	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
