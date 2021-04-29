package com.formation.springwebflix.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.formation.springwebflix.entities.MovieEntity;

@Controller
@RequestMapping("/admin/movie")
public class AdminMovieController {
	
	@GetMapping("")
	public String getAddMovie(Model model) {
		model.addAttribute("page", "movie/add");
		MovieEntity mov = new MovieEntity();
		mov.setTitle("coucou");
		mov.setDescription("coucou");
		mov.setDuration(20);
		mov.setReleaseDate(new Date());
		model.addAttribute("movie", mov);
		return "index";
	}
	
	@PostMapping("")
	public String postAddMovie(Model model, @Validated @ModelAttribute(name="movie") MovieEntity movie, 
			BindingResult movieBindingResult,
			@RequestParam(name="file") MultipartFile file)
	{
		System.out.println(file.isEmpty());
		if (!movieBindingResult.hasErrors() && !file.isEmpty()) {
			// TODO sauvegarde en BDD
			System.out.println(movie);
			return "redirect:/";
		}
		model.addAttribute("page", "movie/add");
		model.addAttribute("fileError", "movie.add.form.file.empty.message");
		System.out.println(movieBindingResult.getAllErrors());
		return "index";
	}

}