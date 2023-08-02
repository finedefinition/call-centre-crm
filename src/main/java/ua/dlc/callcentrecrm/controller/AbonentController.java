package ua.dlc.callcentrecrm.controller;

import java.util.Comparator;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.dlc.callcentrecrm.model.Abonent;
import ua.dlc.callcentrecrm.service.AbonentService;

@Controller
@RequestMapping("/api")
public class AbonentController {

    private AbonentService abonentService;

    public AbonentController(AbonentService abonentService) {
        this.abonentService = abonentService;
    }

    @GetMapping("/mainpage/main-list")
    public String showFormForAdd(Model theModel) {

        Abonent abonent = new Abonent();
        theModel.addAttribute("abonent", abonent);
        List<Abonent> theAbonents = abonentService.findAll();

        // Create a custom comparator to sort in descending order based on 'id'
        Comparator<Abonent> descComparator = new Comparator<Abonent>() {
            @Override
            public int compare(Abonent ab1, Abonent ab2) {
                return Long.compare(ab2.getId(), ab1.getId());
            }
        };

        // Sort the list using the custom comparator (in descending order based on 'id')
        theAbonents.sort(descComparator);

        // Add the sorted list to the spring model
        theModel.addAttribute("abonents", theAbonents);

        return "mainpage/main-list";
    }

    @PostMapping("/getById")
    public String showFormForUpdate(@RequestParam("abonentId") Long theId,
                                    Model theModel) {
        Abonent abonent = abonentService.findById(theId);
        theModel.addAttribute("abonent", abonent);
        return "mainpage/main-list";
    }

    @PostMapping("/save")
    public String saveAbonent(@ModelAttribute("abonent") Abonent abonent) {
        abonentService.save(abonent);
        return "redirect:/api/mainpage/main-list";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("abonentId") Long theId) {
        abonentService.deleteById(theId);
        return "redirect:/api/mainpage/main-list";
    }
}
