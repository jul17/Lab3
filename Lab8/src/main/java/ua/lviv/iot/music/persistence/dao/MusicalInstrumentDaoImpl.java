package ua.lviv.iot.music.persistence.dao;


import java.io.Serializable;

import javax.annotation.Resource;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import ua.lviv.iot.music.model.MusicalInstrument;

@Named
@Dependent
public class MusicalInstrumentDaoImpl extends AbstractDao<MusicalInstrument> implements MusicalInstrumentDao, Serializable {

    private static final long serialVersionUID = 1L;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    protected Class<MusicalInstrument> getEntityClass() {
        return MusicalInstrument.class;
    }

    @Resource
    private UserTransaction userTransaction;

}
