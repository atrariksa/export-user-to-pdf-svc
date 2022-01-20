package com.example.UserExportPDF;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

@RestController
class UserController {

    private final GithubClient githubClient;

    public UserController() {
        this.githubClient = new GithubClient("https://api.github.com");
    }

    @GetMapping("/user/export/{numberOfUsers}")
    ResponseEntity<byte[]> findAndExportUser(@PathVariable Integer numberOfUsers) {
        ByteArrayOutputStream pdfOutputStream = null;
        try {
            List<User> githubUsers = githubClient.getGithubUsers(numberOfUsers);
            pdfOutputStream = PDFExporter.buildPDF(githubUsers);
        } catch (Exception e) {
            e.printStackTrace();
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);

        byte[] contents = pdfOutputStream.toByteArray();
        String filename = "GithubUsers.pdf";
        headers.setContentDispositionFormData(filename, filename);
        headers.setCacheControl("must-revalidate, post-check=0, pre-check=0");
        ResponseEntity<byte[]> response = new ResponseEntity<>(contents, headers, HttpStatus.OK);
        return response;
    }

}