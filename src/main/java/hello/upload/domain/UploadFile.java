package hello.upload.domain;

import lombok.Data;
import org.springframework.web.util.UriUtils;

import java.nio.charset.StandardCharsets;

@Data
public class UploadFile {
    private String uploadFileName;
    private String storeFileName;

    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }

    public String getEncodedUploadFileName() {
        return UriUtils.encode(uploadFileName, StandardCharsets.UTF_8);
    }
}
