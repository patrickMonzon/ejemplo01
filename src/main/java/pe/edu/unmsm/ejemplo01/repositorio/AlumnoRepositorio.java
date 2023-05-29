package pe.edu.unmsm.ejemplo01.repositorio;

import org.springframework.data.repository.CrudRepository;
import pe.edu.unmsm.ejemplo01.entidades.Alumno;

public interface AlumnoRepositorio extends CrudRepository<Alumno, Integer>{
	
	/**
	 * Busca un alumno por su codip
	 * @param alu_vccodigo
	 * @return una instancia
	 */
	public Alumno findByAluvccodigo(String aluvccodigo);
}
