package com.mduran.videoservice;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "videos")
public interface VideoRepository extends CrudRepository<Video, Long> {
}
