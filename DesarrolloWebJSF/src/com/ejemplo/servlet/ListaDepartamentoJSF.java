package com.ejemplo.servlet;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.hibernate.Session;


import com.ejemplo.connection.SessionManager;
import com.ejemplo.tablasDTO.Departments;
import com.ejemplo.tablasDTO.Employees;


@ManagedBean
@RequestScoped
public class ListaDepartamentoJSF {
	
	private List<Departments> lista;
	private List<Employees> lista2;
	
	private String selected;

	public String getSelected() {
		return selected;
	}

	public List<Employees> getLista2() {
		return lista2;
	}

	public void setLista2(List<Employees> lista2) {
		this.lista2 = lista2;
	}

	public void setSelected(String selected) {
		this.selected = selected;
	}

	public List<Departments> getLista() {
		return lista;
	}

	public ListaDepartamentoJSF() {
		//super();
		lista=new ArrayList<Departments>();
		lista2=new ArrayList<Employees>();
	}
	
	
	
@PostConstruct
 public void init(){
	Session session=SessionManager.obtenerSesionNueva();
	this.lista=session.createSQLQuery("SELECT * FROM DEPARTMENTS").addEntity(Departments.class).list();
	session.close();
  }
	
public String mostrarEmpleados(){
	
	Session session=SessionManager.obtenerSesionNueva();
	this.lista2=session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID =" +selected).addEntity(Employees.class).list();
	
	return "vistaempleados";
}
	
}
