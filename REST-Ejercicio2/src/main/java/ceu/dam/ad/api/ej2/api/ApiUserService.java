package ceu.dam.ad.api.ej2.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ceu.dam.ad.api.ej2.model.User;
import ceu.dam.ad.api.ej2.service.DuplicateUserException;
import ceu.dam.ad.api.ej2.service.UserException;
import ceu.dam.ad.api.ej2.service.UserNotFoundException;
import ceu.dam.ad.api.ej2.service.UserService;
import ceu.dam.ad.api.ej2.service.UserUnauthorizedException;
import jakarta.validation.Valid;

@RestController
@RequestMapping("api/usuarios")
public class ApiUserService {

	@Autowired
	UserService service;//usar la interfaz en vez de la UserServiceImpl

	@PostMapping
	public User create(@Valid @RequestBody User user) throws DuplicateUserException, UserException {
		return service.createUser(user);
	}

	@PutMapping
	public void changePassword(@RequestBody @Valid ChangePassRequest request)
			throws UserNotFoundException, UserUnauthorizedException, UserException {
		service.changePassword(request.getIdUser(), request.getPasswordOld(), request.getPasswordNew());
	}

	@GetMapping("/{id}")
	public User getUser(@PathVariable Long id) throws UserNotFoundException, UserException {
		return service.getUser(id);
	}

	@GetMapping
	public User login(@RequestParam String login, @RequestParam String password)
			throws UserNotFoundException, UserUnauthorizedException, UserException {
		return service.login(login, password);
	}
}
