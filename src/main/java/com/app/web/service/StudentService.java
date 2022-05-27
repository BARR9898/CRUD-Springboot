package com.app.web.service;
import com.app.web.entidad.Estudiante;
import java.util.List;
public interface StudentService {
	
	public List<Estudiante> ListAllStudents();
	
	public Estudiante guardarEstudiante(Estudiante estudiante);
	
	public Estudiante obtenerEstudiantePorId(Long id);
	
	public Estudiante actualizarEstudiante(Estudiante estudiante);
	
	public void eliminarEstudiante(Long id);
}
