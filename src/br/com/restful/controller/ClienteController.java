package br.com.restful.controller;

import java.util.ArrayList;

import br.com.restful.dao.ClienteDAO;
import br.com.restful.model.Cliente;

public class ClienteController {
	
	public ArrayList<Cliente> listarTodos(){
		
		return ClienteDAO.getInstance().listarTodos();
	}

}
