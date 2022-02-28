package uz.elmurodov.trelloetm.dto.organization;


import lombok.*;
import org.springframework.web.multipart.MultipartFile;
import uz.elmurodov.trelloetm.dto.GenericDto;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationUpdateDto extends GenericDto {
    private String name;
    private String registerNumber;
    private String email;
    private MultipartFile logo;
    private String website;

    @Builder(builderMethodName = "childBuilder")
    public OrganizationUpdateDto(Long id, String name, String registerNumber, String email, MultipartFile logo, String website) {
        super(id);
        this.name = name;
        this.registerNumber = registerNumber;
        this.email = email;
        this.logo = logo;
        this.website = website;
    }
}
