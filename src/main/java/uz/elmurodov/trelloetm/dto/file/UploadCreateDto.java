package uz.elmurodov.trelloetm.dto.file;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import uz.elmurodov.trelloetm.dto.Dto;

@Getter
@Setter
@Builder
public class UploadCreateDto implements Dto {
    private String originalName;
    private String generatedName;
    private String path;
    private String mimeType;
    private long size;
}
