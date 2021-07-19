package com.example.demo.rest;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping ("/api/Employee")
public class EmployeeREST {

	@Autowired
	private EmployeeService employeeService;
	
	@CrossOrigin
	@PostMapping
	private ResponseEntity<Employee> guardar (@RequestBody Employee employee){
		Employee temp = employeeService.create(employee);
		try {
			return ResponseEntity.created(new URI("/api/Employee"+temp.getId())).body(temp);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@CrossOrigin
	@GetMapping
	private ResponseEntity<List<Employee>> ListAll (){
		return ResponseEntity.ok(employeeService.getAllEmployees());
	}
	
	@CrossOrigin
	@GetMapping (value="{id}")
	private ResponseEntity<Optional<Employee>> ListById (@PathVariable ("id") Long id){
		return ResponseEntity.ok(employeeService.findById(id));
	}
	
	
}
