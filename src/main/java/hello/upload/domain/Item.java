package hello.upload.domain;

import lombok.Data;

import java.util.List;

@Data
public class Item {
    private Long id;
    String itemName;
    UploadFile attachFile;
    List<UploadFile> imageFiles;
}
