package com.torezone.dscatalogclient.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.torezone.dscatalogclient.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Tereza da Conceição", "088.751.386-00", 3500.00, 4 ));
		list.add(new Client(1L, "Genival Torezone E ribeiro", "066.211.886-03", 5550.01, 5 ));
		list.add(new Client(1L, "Jair Ribeiro Torezone ", "022.831.576-04", 5700.30, 2 ));
		return ResponseEntity.ok().body(list);
	}
	
}
