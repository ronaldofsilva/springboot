package br.ueg.posse.si.p4.reflection.fw.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ueg.posse.si.p4.reflection.fw.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {
	
}
