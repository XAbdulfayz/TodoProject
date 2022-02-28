package uz.elmurodov.trelloetm.service;

import uz.elmurodov.trelloetm.mapper.GenericMapper;
import uz.elmurodov.trelloetm.mapper.Mapper;
import uz.elmurodov.trelloetm.repository.AbstractRepository;
import uz.elmurodov.trelloetm.utils.BaseUtils;
import uz.elmurodov.trelloetm.utils.validators.Validator;

/**
 * @param <R> repository
 * @param <M> mapper
 * @param <V> validator
 */
public abstract class AbstractService<
        R extends AbstractRepository,
        M extends Mapper,
        V extends Validator> {
    protected final R repository;
    protected final M mapper;
    protected final V validator;
    protected final BaseUtils baseUtils;

    protected AbstractService(R repository, M mapper, V validator, BaseUtils baseUtils) {
        this.repository = repository;
        this.mapper = mapper;
        this.validator = validator;
        this.baseUtils = baseUtils;
    }
}
