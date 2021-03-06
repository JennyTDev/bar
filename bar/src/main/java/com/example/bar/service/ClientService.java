package com.example.bar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bar.entity.Client;
import com.example.bar.repository.ClientRepository;

import lombok.Data;
import lombok.RequiredArgsConstructor;


 
@Data
@Service
@RequiredArgsConstructor
public  class  ClientService  {
	
	private final ClientRepository clientRepository;
	
	public Client saveClient(Client c) {
		return clientRepository.save(c);
	}
	public Client update(Client c) {
		return clientRepository.save(c);
	}
	public void deleteClient(Client c) {
		clientRepository.delete(c);
	}
	public void deleteClientById(Long Id) {
		clientRepository.deleteById(Id);
	}
	public Client getClient(Long Id) {
		return clientRepository.findById(Id).get();
	}
	public List<Client>getAllClient() {
		return clientRepository.findAll();
	}	
	
	

}
