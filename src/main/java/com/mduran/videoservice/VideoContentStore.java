package com.mduran.videoservice;

import org.springframework.content.commons.repository.ContentStore;
import org.springframework.content.rest.StoreRestResource;

@StoreRestResource(path="videocontent")
public interface VideoContentStore extends ContentStore<Video, Long> {
}
