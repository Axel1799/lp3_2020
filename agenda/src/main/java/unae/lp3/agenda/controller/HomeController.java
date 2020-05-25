package unae.lp3.agenda.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import unae.lp3.agenda.model.Notas;



@Controller

public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	
	public String index(Model model)
	{
		String titulo = "index";
		String contenido = "soy el contenido de index";
		model.addAttribute("titulo", titulo);
		model.addAttribute("contenido", contenido);
		System.out.println("entro a index");
		return "index";
	}
	
	@RequestMapping(value = "dos", method = RequestMethod.GET)
	
	public String dos(Model model)
	{
		String titulo = "dos";
		String contenido = "soy el contenido de dos";
		model.addAttribute("titulo", titulo);
		model.addAttribute("contenido", contenido);
		
		List <Notas> notas = getNotas();
		model.addAttribute("notas", notas);
		
		
		return "dos";
	}
	
	List<Notas> getNotas()
	{
		List<Notas> lista = null; 
		lista = new LinkedList<>();
		Notas nota1 = new Notas(1,"tarea","buscar libros");
		Notas nota2 = new Notas(2,"spring","https://www.baeldung.com/configuration-properties-in-spring-boot");
		Notas nota3 = new Notas(3,"otros","otros");
		
		lista.add(nota1);
		lista.add(nota2);
		lista.add(nota3);
		
		return lista;	
	}

}