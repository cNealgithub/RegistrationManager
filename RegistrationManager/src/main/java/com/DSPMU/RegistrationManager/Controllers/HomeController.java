package com.DSPMU.RegistrationManager.Controllers;

import com.DSPMU.RegistrationManager.Entities.Attendees;
import com.DSPMU.RegistrationManager.Services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private RegistrationService registrationService;

    @GetMapping("/")
    public String welcome(){
        return "index.html";
    }

    @GetMapping("/register_form")
    public String RegisterPage(){
        return"registerForm.html";
    }


    @PostMapping("/submit-registration")
    public String registerAttendee(@ModelAttribute Attendees ad, RedirectAttributes redatter){
        registrationService.saveAttendee(ad);
        LocalDateTime ldt = LocalDateTime.now();
        String mydate = ldt.toString();
        ad.setRegistered_on(mydate);
        redatter.addFlashAttribute("success_msg", "Attendee Registered Succesfully!!!");
        return "redirect:/register_form";
    }

    //we can use this too, by using model we can send response msg directly using the html file but not with RedirectAttributes but it is best practise
//    @PostMapping("/submit-registration")
//    public String registerAttendee(@ModelAttribute Attendees ad, Model model){
//        registrationService.saveAttendee(ad);
//        model.addAttribute("success_msg", "Attendee Registered Succesfully!!!");
//        return "registerForm.html";
//    }

    @GetMapping("/view-entries")
    public String allEntries(Model model){
        List<Attendees> attendees = registrationService.getAllEntries();
        model.addAttribute("attendees", attendees);
        return "EntriesList";
    }
}
