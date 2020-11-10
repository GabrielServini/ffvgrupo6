package com.fatec.scel.servico;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fatec.scel.model.Emprestimo;
import com.fatec.scel.model.EmprestimoRepository;

@Service
public class EmprestimoServicoI implements EmprestimoServico{
@Autowired

	private EmprestimoRepository emprestimoRepository;
		public void save (Emprestimo emprestimo) {
		emprestimoRepository.save(emprestimo);
		}
	public Iterable<Emprestimo> findAll() {
		return emprestimoRepository.findAll();
		}
	public void deleteById(Long id) {
		emprestimoRepository.deleteById(id);
		}
	public List findByIsbnRa (String isbn, String ra) {
		return emprestimoRepository.findByIsbnRa(isbn, ra);
		}
	
}