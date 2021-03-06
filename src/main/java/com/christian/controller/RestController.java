package com.christian.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.christian.model.ContactModel;

/**
 * The Class RestController.
 * Se utiliza en el front-end con una tecnologia que ya no es montar las plantillas en la parte del servidor
 * sino el cliente se encarga de montar las plantillas (angular , react, vue)
 */
@org.springframework.web.bind.annotation.RestController
@RequestMapping("rest") // Vienen todas las peticiones que empiezen por REST

public class RestController {

	/**
	 * Check rest.
	 *
	 * @return the response entity
	 */
	// Devuelve un json
	@GetMapping("/checkrest")
	public ResponseEntity<ContactModel> checkRest() {
		ContactModel cm = new ContactModel(2, "usuario2", "usuario2", "4564654", "Arequipa");
		return new ResponseEntity<ContactModel>(cm, HttpStatus.OK);
		// {"id":2,"firstname":"usuario2","lastname":"usuario2","telephone":"4564654","city":"Arequipa"}
	}
}
