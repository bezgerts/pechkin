package me.bezgerts.pechkin.persistence.link;

import me.bezgerts.pechkin.domain.Link;
import me.bezgerts.pechkin.persistence.GenericDaoHibernateImpl;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

@Repository
public class LinkDAOHibernateImpl extends GenericDaoHibernateImpl<Link, Long> implements LinkDAO {

}
