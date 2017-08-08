package aparicio.arnau.hector.freewc.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by hector on 9/08/17.
 */

public interface GenericDAO<T,ID extends Serializable> {
     T create() throws BusinessException;
     void saveOrUpdate(T entity) throws BusinessException;
    void save(T entity) throws BusinessException;
    void pdate(T entity) throws BusinessException;
     T get(ID id) throws BusinessException;
     void delete(ID id) throws BusinessException;
     List<T> findAll() throws BusinessException;
 }
