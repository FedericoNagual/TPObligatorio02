/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.ClienteCanino;
import persistencia.exceptions.NonexistentEntityException;
import persistencia.exceptions.PreexistingEntityException;

/**
 *
 * @author Federico
 */
public class ClienteCaninoJpaController implements Serializable {

    public ClienteCaninoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    public ClienteCaninoJpaController(){
        emf=Persistence.createEntityManagerFactory("PeluqueriaCanina_PU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(ClienteCanino clienteCanino) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(clienteCanino);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findClienteCanino(clienteCanino.getNum_cliente()) != null) {
                throw new PreexistingEntityException("ClienteCanino " + clienteCanino + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(ClienteCanino clienteCanino) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            clienteCanino = em.merge(clienteCanino);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = clienteCanino.getNum_cliente();
                if (findClienteCanino(id) == null) {
                    throw new NonexistentEntityException("The clienteCanino with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ClienteCanino clienteCanino;
            try {
                clienteCanino = em.getReference(ClienteCanino.class, id);
                clienteCanino.getNum_cliente();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The clienteCanino with id " + id + " no longer exists.", enfe);
            }
            em.remove(clienteCanino);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<ClienteCanino> findClienteCaninoEntities() {
        return findClienteCaninoEntities(true, -1, -1);
    }

    public List<ClienteCanino> findClienteCaninoEntities(int maxResults, int firstResult) {
        return findClienteCaninoEntities(false, maxResults, firstResult);
    }

    private List<ClienteCanino> findClienteCaninoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ClienteCanino.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public ClienteCanino findClienteCanino(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ClienteCanino.class, id);
        } finally {
            em.close();
        }
    }

    public int getClienteCaninoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ClienteCanino> rt = cq.from(ClienteCanino.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
