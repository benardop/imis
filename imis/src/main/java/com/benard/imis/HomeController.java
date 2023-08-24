package com.benard.imis;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    List<Video> videos = List.of(
            new Video("Fast and Furious"),
            new Video("Transporter Series"),
            new Video("Game of thrones")
    );

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("videos", videos);
        return "index";
    }
}
