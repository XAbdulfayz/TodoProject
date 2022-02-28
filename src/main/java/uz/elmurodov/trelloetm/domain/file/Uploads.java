package uz.elmurodov.trelloetm.domain.file;

import lombok.Getter;
import lombok.Setter;
import uz.elmurodov.trelloetm.domain.Auditable;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Uploads extends Auditable {

    private String originalName;

    private String generatedName;

    private String path;

    private String mimeType;

    private long size;
}
