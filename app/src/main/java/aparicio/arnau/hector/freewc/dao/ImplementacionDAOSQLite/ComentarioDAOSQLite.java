package aparicio.arnau.hector.freewc.dao.ImplementacionDAOSQLite;

import java.util.List;

import aparicio.arnau.hector.freewc.dao.BusinessException;
import aparicio.arnau.hector.freewc.dao.ComentarioDAO;
import aparicio.arnau.hector.freewc.modelo.Comentario;

/**
 * Created by hector on 16/08/17.
 */

public class ComentarioDAOSQLite implements ComentarioDAO {
    @Override
    public Comentario create() throws BusinessException {
        return null;
    }

    @Override
    public void saveOrUpdate(Comentario entity) throws BusinessException {

    }

    @Override
    public void save(Comentario entity) throws BusinessException {

    }

    @Override
    public void update(Comentario entity) throws BusinessException {

    }

    @Override
    public Comentario get(Integer integer) throws BusinessException {
        return null;
    }

    @Override
    public void delete(Integer integer) throws BusinessException {

    }

    @Override
    public List<Comentario> findAll() throws BusinessException {
        return null;
    }
}
