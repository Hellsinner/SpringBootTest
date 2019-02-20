package com.hellsinner.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Part;
import java.io.IOException;

@RestController
public class UploadController {

    @PostMapping("/upload")
    public String upload(Part file){
        String fileName = file.getSubmittedFileName();

        try {
            file.write(fileName);
        } catch (IOException e) {
            return "upload fail";
        }
        return fileName;
    }
}
