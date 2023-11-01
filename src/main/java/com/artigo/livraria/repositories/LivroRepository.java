package com.artigo.livraria.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.artigo.livraria.entity.LivroEntity;


@Repository
public interface LivroRepository extends JpaRepository<LivroEntity, Long> {
	List<LivroEntity> findAll();
}
