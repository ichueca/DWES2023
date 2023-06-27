package org.zabalburu.gt.servicio;

import java.util.List;

import org.zabalburu.gt.dao.TareasDAO;
import org.zabalburu.gt.dao.TareasList;
import org.zabalburu.gt.modelo.Empleado;
import org.zabalburu.gt.modelo.Tarea;

public final class TareasServicio {

	private TareasDAO dao = TareasList.getInstance();
	
	private static TareasServicio tareasServicio;
	
	public static TareasServicio getInstance() {
		if (tareasServicio == null) {
			tareasServicio = new TareasServicio();
		}
		return tareasServicio;
	}
	
	private TareasServicio() {}
	
	public List<Empleado> getEmpleados() {
		return dao.getEmpleados();
	}

	public Empleado getEmpleado(Integer id) {
		return dao.getEmpleado(id);
	}

	public void nuevaTarea(Tarea t) {
		dao.nuevaTarea(t);
	}

	public Tarea getTarea(Integer id) {
		return dao.getTarea(id);
	}
	
	public Empleado login(String email, String password) {
		return dao.login(email, password);
	}

}