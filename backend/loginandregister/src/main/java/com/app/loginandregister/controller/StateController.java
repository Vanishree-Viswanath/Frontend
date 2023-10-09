package com.app.loginandregister.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.loginandregister.model.State;
import com.app.loginandregister.service.StateService;

@RestController
@RequestMapping("api/states")
public class StateController {

	@Autowired
	private StateService stateService;

	@GetMapping
	public List<State> getAllStates() {
		return stateService.getAllStates();
	}

	@GetMapping("/{id}")
	public Optional<State> getStateById(@PathVariable Long id) {
		return stateService.getStateById(id);
	}

	@PostMapping
	public State createState(@RequestBody State state) {
		return stateService.createState(state);
	}

	@PostMapping("/{id}")
	public void updateState(@PathVariable Long id, @RequestBody State updatedState) {
		stateService.updateState(id, updatedState);
	}

	@DeleteMapping("/{id}")
	public void deleteState(@PathVariable Long id) {
		stateService.deleteState(id);
	}

}
