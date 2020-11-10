package com.fatec.scel.servico;
import java.util.List;

import com.fatec.scel.model.Emprestimo;



public interface EmprestimoServico {
	
		public void save (Emprestimo emprestimo);
		public Iterable<Emprestimo> findAll() ;
		public void deleteById(Long id);
		public List findByIsbnRa (String isbn, String ra);
		
}

