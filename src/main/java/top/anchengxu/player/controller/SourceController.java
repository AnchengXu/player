package top.anchengxu.player.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import top.anchengxu.player.model.Source;
import top.anchengxu.player.service.SourceService;

@Controller
@RequestMapping(value = "/")
public class SourceController {

    @Autowired
    private SourceService sourceService;

    @GetMapping(value = "/source")
    public String getSource(String name, Model model){
        Source source = sourceService.selectSource(name);
        model.addAttribute("path",source.getPath());
        model.addAttribute("name",source.getName());
        model.addAttribute("kind",source.getKind());
        return "hello";
    }
}
