//package ru.mrgutsy.spring_boot.dao;
//
//import org.springframework.stereotype.Repository;
//import Role;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.TypedQuery;
//import java.util.List;
//
//@Repository
//public class roleRepositoryImpl implements RoleRepository {
//
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Override
//    public void addRole(Role role) {
//        entityManager.persist(role);
//    }
//
//    @Override
//    public void updateRole(Role role) {
//        entityManager.merge(role);
//    }
//
//    @Override
//    public void removeRoleById(long id) {
//        entityManager.remove(entityManager.find(Role.class, id));
//    }
//
//    @Override
//    public List<Role> getAllRoles() {
//        return entityManager.createQuery("from Role").getResultList();
//    }
//
//    @Override
//    public Role getRoleByName(String name) {
//        TypedQuery<Role> queryRole = entityManager.createQuery("select r from Role r where r.name=:role",
//                Role.class).setParameter("role", name);
//        return queryRole.getSingleResult();
//    }
//}
