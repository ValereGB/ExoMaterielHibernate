package org.materiel.repositories;

import org.hibernate.Session;
import org.materiel.models.Materiel;
import org.materiel.utils.SessionHibernate;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

// <T> rend la classe générique
public abstract class MysqlRepository<T> {

    /**
     * permet de récuperer un materiel
     * @param id, Designation
     * @return Materiel
     */
    public T get(int id, Class<T> designation) {
        Session session = SessionHibernate.currentSession();
        // recupère les élements
        return session.get(designation, id);
    }

    /**
     * permet de récupérer une liste de <T>
     * @return
     */
    public List<T> getAll(Class<T> designation) {
        Session session = SessionHibernate.currentSession();
        // évite les injections SQL dans la requete
        //On récupère le buider pour construire la requete
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

        // On commence à construire la requete en indiquant la classe cible
        CriteriaQuery query = criteriaBuilder.createQuery(Materiel.class);
        Root<T> root = query.from(designation);

        // On continue la construction de la requete avec le FROM
        CriteriaQuery<T> all = query.select(root);

        // On recupère la requète
        TypedQuery<T> allQuery = session.createQuery(all);
        // et on l'éxécute
        return allQuery.getResultList();
    }

    /**
     * permet de persister un <T></T>
     * @param object
     */
    public void save(T object) {
        // Save
        Session session = SessionHibernate.currentSession();
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
        SessionHibernate.closeSession();
    }

    /**
     * permet de supprimer un <T></T>
     * @param object
     */
    public void delete(T object) {
        Session session = SessionHibernate.currentSession();
        session.beginTransaction();
        session.delete(object);
        session.getTransaction().commit();
        SessionHibernate.closeSession();
    }

    /**
     * permet de modifier un materiel
     * @param object
     */
    public void update(T object) {
        Session session = SessionHibernate.currentSession();
        session.beginTransaction();
        session.update(object);
        //
        session.getTransaction().commit();
        SessionHibernate.closeSession();
    }

}
