package uz.elmurodov.trelloetm.dto.organization;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;
import uz.elmurodov.trelloetm.dto.Dto;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationCreateDto implements Dto {
    private String name;
    private String registerNumber;
    private String email;
    private MultipartFile logo;
    private String website;
}
