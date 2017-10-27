package me.bezgerts.pechkin.controller;

import me.bezgerts.pechkin.domain.Link;
import me.bezgerts.pechkin.service.link.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LinkController {

    @Autowired(required = true)
    private LinkService linkService;

    @RequestMapping(path = "/links", method = RequestMethod.GET)
    public String getAllLinks(Model model) {
        model.addAttribute("links", linkService.getAll());
        return "links/links";
    }

    @RequestMapping(path = "/links/add", method = RequestMethod.GET)
    public String createLink(Model model) {
        model.addAttribute("link", new Link());
        return "links/edit";
    }

    @RequestMapping(path = "/links", method = RequestMethod.POST)
    public String saveLink(Link link) {
        linkService.saveOrUpdate(link);
        return "redirect:/links";
    }

    @RequestMapping(path = "/links/edit/{id}", method = RequestMethod.GET)
    public String editLink(Model model, @PathVariable(value = "id") String id) {
        model.addAttribute("link", linkService.get(Long.valueOf(id)));
        return "links/edit";
    }

    @RequestMapping(path = "/links/delete/{id}", method = RequestMethod.GET)
    public String deleteLink(@PathVariable(name = "id") String id) {;
        Link link = linkService.get(Long.valueOf(id));
        linkService.remove(link);
        return "redirect:/links";
    }



}
