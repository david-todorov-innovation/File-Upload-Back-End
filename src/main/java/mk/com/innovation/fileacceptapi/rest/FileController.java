package mk.com.innovation.fileacceptapi.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class FileController {

    @PostMapping("/upload")
    public ResponseEntity<String> newFile(@RequestParam MultipartFile fileContent) throws IOException {
        if (fileContent != null) {
            return ResponseEntity.ok().body(fileContent.toString());
        } else return ResponseEntity.badRequest().build();
    }
}
