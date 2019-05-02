package com.mduran.videoservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class VideoLoader implements ApplicationRunner {
    @Autowired
    private VideoRepository repository;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Video v = new Video(null, "sample_video.mp4");
        repository.save(v);
    }
}
