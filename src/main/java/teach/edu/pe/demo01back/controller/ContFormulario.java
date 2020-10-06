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
@RequestMapping("/")
public class ContFormulario{
    private UsuariosRep uRep;
    @Autowired
    public void userController(UsuariosRep uRep){
        this.uRep = uRep;
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String getIndex(Model model){
        model.addAttribute("formulario", new Formulario());
        return "formulario";
    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String ingresar(@ModelAttribute Formulario f){
        Usuarios user = uRep.findByUsuarioAndContrasenia(f.campo1, f.campo2);
        if(user!=null){
            System.out.print("*se logea*");
            return "redirect:/";
        }
        System.out.print("*Usuario o contraseña incorrecta*");
        return "redirect:/";
    }

    @RequestMapping(value = "/reg",method = RequestMethod.POST)
    public String redRegistro(){
        return "redirect:/crearCuenta/";
    }
}