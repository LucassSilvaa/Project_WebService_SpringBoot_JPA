package com.lucas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
	
	//como essa interface já existe, não precisa definir nada dentro dela, ele vai usar as parametrizações padrão da interface JPARepository, levando em consideração os parâmetros inseridos por nós (Objeto !User! e o tipo do ID, que é !Long!)
	

}