package uz.elmurodov.trelloetm.dto.organization;

import lombok.*;
import uz.elmurodov.trelloetm.dto.GenericDto;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationDto extends GenericDto {
    private String name;
    private String registerNumber;
    private String email;
    private String logo;
    private String website;

    @Builder(builderMethodName = "childBuilder")
    public OrganizationDto(Long id, String name, String registerNumber, String email, String logo, String website) {
        super(id);
        this.name = name;
        this.registerNumber = registerNumber;
        this.email = email;
        this.logo = logo;
        this.website = website;
    }
}
