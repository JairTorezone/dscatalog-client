package com.torezone.dscatalogclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.torezone.dscatalogclient.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
