package com.ejemplo.servlet;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.hibernate.Session;


import com.ejemplo.connection.SessionManager;
import com.ejemplo.tablasDTO.Departments;


@ManagedBean
@RequestScoped
public class ListaDepartamentoJSF {
	
	private List<Departments> lista;

	public List<Departments> getLista() {
		return lista;
	}

	
	
	public ListaDepartamentoJSF() {
		//super();
		lista=new ArrayList<Departments>();
	}
	
	
	
@PostConstruct
 public void init(){
	Session session=SessionManager.obtenerSesionNueva();
	this.lista=session.createSQLQuery("SELECT * FROM DEPARTMENTS").addEntity(Departments.class).list();
	 
  }
	
	
}
