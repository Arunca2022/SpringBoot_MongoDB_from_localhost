package com.codeworld.springbootmongodb.service;

import org.springframework.web.multipart.MultipartFile;

import com.codeworld.springbootmongodb.collection.Photo;

import java.io.IOException;

public interface PhotoService {
    String addPhoto(String originalFilename, MultipartFile image) throws IOException;

    Photo getPhoto(String id);
}
