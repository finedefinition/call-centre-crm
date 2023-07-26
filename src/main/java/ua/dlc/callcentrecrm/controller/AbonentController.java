package ua.dlc.callcentrecrm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.dlc.callcentrecrm.model.Abonent;
import ua.dlc.callcentrecrm.service.AbonentService;

@RestController
@RequestMapping("/abonents")
public class AbonentController {

    private final AbonentService abonentService;

    public AbonentController(AbonentService abonentService) {
        this.abonentService = abonentService;
    }

    @GetMapping("/save")
    public String save() {
        Abonent abonent = new Abonent();
        abonent.setFirstName("Ivan");
        abonent.setMiddleName("Sergiyovich");
        abonent.setLastName("Bezrukov");
        abonentService.save(abonent);
        return abonent.toString();
    }
}
