package uz.elmurodov.trelloetm.service;

import uz.elmurodov.trelloetm.criteria.GenericCriteria;
import uz.elmurodov.trelloetm.dto.Dto;
import uz.elmurodov.trelloetm.dto.GenericDto;

import java.io.IOException;
import java.io.Serializable;

/**
 * @param <D>  -> Dto
 * @param <CD> -> Create Dto
 * @param <UD> -> Update Dto
 * @param <K>  -> class that defines the primary key for your pojo class
 * @param <C>  -> Criteria (For Filtering Request)
 */
public interface GenericCrudService<
        D extends GenericDto,
        CD extends Dto,
        UD extends GenericDto,
        C extends GenericCriteria,
        K extends Serializable> extends GenericService<D, C, K> {

    K create(CD createDto) throws IOException;

    Void delete(K id);

    Void update(UD updateDto) throws IOException;

}
