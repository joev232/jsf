package com.ejemplo.servlet;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.hibernate.Session;

import com.ejemplo.connection.SessionManager;

import com.ejemplo.tablasDTO.Departments;
import com.ejemplo.tablasDTO.Employees;

@ManagedBean
@RequestScoped
public class EmpleadoJSF {
	
	private int id;
	private Employees empleado;
	
	public EmpleadoJSF() {
		//super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employees getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Employees empleado) {
		this.empleado = empleado;
	}
	
	public String buscar(){
	
		
//		Session session=SessionManager.obtenerSesionNueva();
//		empleado=(Employees) session.get(Employees.class, id);
		
		System.out.println(id);
		Session session=SessionManager.obtenerSesionNueva();
		empleado=(Employees) session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID =  "+ this.id).addEntity(Employees.class).uniqueResult();
		
		return "verempleado";
		
	}
	
}
