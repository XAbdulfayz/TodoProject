package uz.elmurodov.trelloetm.mapper;

import uz.elmurodov.trelloetm.domain.BaseDomain;
import uz.elmurodov.trelloetm.dto.Dto;
import uz.elmurodov.trelloetm.dto.GenericDto;

import java.util.List;


public interface GenericMapper<E extends BaseDomain, D extends GenericDto, CD extends Dto, UD extends GenericDto> extends Mapper{

    D toDto(E domain);

    List<D> toDto(List<E> domain);

    E fromCreateDto(CD dto);

    E fromUpdateDto(UD dto);

}
