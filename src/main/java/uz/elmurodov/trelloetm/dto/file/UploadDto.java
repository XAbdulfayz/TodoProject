package uz.elmurodov.trelloetm.dto.file;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.core.io.Resource;
import uz.elmurodov.trelloetm.dto.GenericDto;

@Getter
@Setter
public class UploadDto extends GenericDto {
    private String originalName;
    private String generatedName;
    private String path;
    private String mimeType;
    private Resource resource;
    private long size;

    @Builder(builderMethodName = "childBuilder")
    public UploadDto(Long id, String originalName, String generatedName, String path, String mimeType, Resource resource, long size) {
        super(id);
        this.originalName = originalName;
        this.generatedName = generatedName;
        this.path = path;
        this.mimeType = mimeType;
        this.resource = resource;
        this.size = size;
    }
}
