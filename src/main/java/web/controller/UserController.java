package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.dao.UserDao;
import web.model.User;

@Controller
public class UserController {

	@Autowired
	private UserDao userDao;

	@GetMapping(value = "/")
	public String showAllUser(Model model) {
		model.addAttribute("user", userDao.showAllUser());
		return "index";
	}

	@GetMapping("/{id}")
	public String showUserID(@PathVariable("id") long id, Model model){
		model.addAttribute("userid",userDao.showUserId(id));
		return "userid";
	}

	@GetMapping("/new")
	public String saveUser(@ModelAttribute("user") User user){
		return "newUser";
	}

	@PostMapping
	public String create(@ModelAttribute("user") User user){
		userDao.save(user);
		return "redirect:/";
	}

	@GetMapping("/{id}/edit")
	public String updateUser(Model model, @PathVariable("id") long id){
		model.addAttribute("user",userDao.showUserId(id));
		return "edit";
	}


	@PatchMapping("/{id}")
	public String update(@ModelAttribute("user") User user){
		userDao.update(user, user.getId());
		return "redirect:/";
	}

	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable("id") int id){
		userDao.delete(id);
		return "redirect:/";
	}
}