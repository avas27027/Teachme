package teach.edu.pe.demo01back.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import teach.edu.pe.demo01back.model.*;
import teach.edu.pe.demo01back.repository.*;

@Controller
@RequestMapping("/explorar")
public class Explorar{

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String getIndex(){
        return "Explorar";
    }
    /*
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String buscar(Model model, @ModelAtributte Formulario f){
        f.getCampo1();
        List<clase> cla=findByCursoAndEstado(f,true);
        model.addAtrbutte(cla)
        return "redirect:/Explorar/";
    }*/
}