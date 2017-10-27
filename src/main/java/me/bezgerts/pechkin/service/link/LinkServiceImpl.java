package me.bezgerts.pechkin.service.link;

import me.bezgerts.pechkin.domain.Link;
import me.bezgerts.pechkin.persistence.GenericDAO;
import me.bezgerts.pechkin.persistence.link.LinkDAO;
import me.bezgerts.pechkin.service.GenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class LinkServiceImpl extends GenericServiceImpl<Link, Long> implements LinkService {

    private LinkDAO linkDAO;

    public LinkServiceImpl() {}

    @Autowired
    public LinkServiceImpl(@Qualifier("linkDAOHibernateImpl") GenericDAO<Link, Long> genericDAO){
        super(genericDAO);
        this.linkDAO = (LinkDAO) genericDAO;
    }
}
