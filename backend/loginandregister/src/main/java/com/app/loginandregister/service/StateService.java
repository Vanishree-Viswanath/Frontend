package com.app.loginandregister.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.loginandregister.model.State;
import com.app.loginandregister.repository.StateRepo;

@Service
public class StateService {

	@Autowired
	private StateRepo stateRepo;
	
	public List<State> getAllStates(){
		return stateRepo.findAll();	
	}
	
	public Optional<State> getStateById(Long id){
		return stateRepo.findById(id);
	}
	
	public State createState (State state) {
		return stateRepo.save(state);
	}
	
	public void updateState(Long id, State updatedState) {
		if(stateRepo.existsById(id)) {
			updatedState.setId(id);
			stateRepo.save(updatedState);
		}
	}
	
	public void deleteState(Long id) {
		stateRepo.deleteById(id);
	}
}
