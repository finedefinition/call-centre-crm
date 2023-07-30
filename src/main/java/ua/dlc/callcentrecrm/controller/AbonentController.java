package ua.dlc.callcentrecrm.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.dlc.callcentrecrm.model.Abonent;
import ua.dlc.callcentrecrm.service.AbonentService;

@RestController
@RequestMapping("/api")
public class AbonentController {
    private AbonentService abonentService;

    public AbonentController(AbonentService abonentService) {
        this.abonentService = abonentService;
    }

    // expose "/abonents" and return a list of abonents
    @GetMapping("/abonents")
    public List<Abonent> findAll() {
        return abonentService.findAll();
    }

    // add mapping for GET /abonents/{abonentId}

    @GetMapping("/abonents/{abonentId}")
    public Abonent getAbonent(@PathVariable Long abonentId) {

        Abonent abonent = abonentService.findById(abonentId);

        if (abonent == null) {
            throw new RuntimeException("Abonent id not found - " + abonentId);
        }

        return abonent;
    }

    // add mapping for POST /employees - add new employee

    @PostMapping("/abonents")
    public Abonent addAbonent(@RequestBody Abonent abonent) {

        // also just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update
        abonent.setId(null);

        Abonent dbAbonent = abonentService.save(abonent);

        return dbAbonent;
    }

    @PutMapping("/abonents")
    public Abonent updateAbonent(@RequestBody Abonent abonent) {

        Abonent dbAbonent = abonentService.save(abonent);

        return dbAbonent;
    }

    // add mapping for DELETE /employees/{employeeId} - delete employee

    @DeleteMapping("/abonents/{abonentId}")
    public String deleteAbonent(@PathVariable Long abonentId) {
        Abonent abonent = abonentService.findById(abonentId);

        // throw exception if null

        if (abonent == null) {
            throw new RuntimeException("Employee id not found - " + abonentId);
        }

        abonentService.deleteById(abonentId);

        return "Deleted abonent id - " + abonentId;
    }
}

