package ua.lviv.iot.persistence.dao;

import ua.lviv.iot.model.Part;

import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

    @Named
    @Dependent
    public class PartDaoImpl extends ua.lviv.iot.persistence.dao.AbstractDao<Part> implements PartDao, Serializable {

        private static final long serialVersionUID = 1L;

        @PersistenceContext
        private EntityManager entityManager;

        @Override
        protected Class<Part> getEntityClass() {
            return Part.class;
        }

        //@Resource
        //private UserTransaction userTransaction;

    }


