package com.example.servletjspdemo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/formularz")
public class formularz extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<html><body><h2>PROSTY FORMULARZ</h2>" +
				"<form action='/servletjspdemo/formularzwypelniony'>" +
				"Imie: <input type='text' name='imie' /> <br />"
				+"Wiek: <input type='text' name='wiek'/> <br /><br />"
				+"Hobby: <br />"
				+"<input type='checkbox' name='hobby' value='sport'>Uprawianie sportu<br />" +
				"<input type='checkbox' name='hobby' value='filmy'>Oglawdanie filmow i seriali<br />" +
				"<input type='checkbox' name='hobby' value='party'>Imprezowanie<br />" +
				"<input type='checkbox' name='hobby' value='podroze'>Podrozowanie<br />" +
				"<input type='checkbox' name='hobby' value='ksiazki'>Czytanie ksiazek<br /><br/>"
				+"Wojewodztwo: <br/>"
				+"<select name=wojewodztwo>"
				+"<option>Warminsko Mazurskie</option>"
				+"<option>Pomorskie</option>"
				+"<option>Mazowieckie</option>"
				+"<option>Podkarpackie</option>"
				+"<option>Dolnoslaskie</option>"
				+"</select><br /><br />"
				+"Zainteresowania: <br />"
				+"<textarea name='opis' cols='45' rows='3'>Wpisz swoje zainteresowania</textarea>"
				+"<br/> <br />"
				+"<input type='submit' value=' OK ' />" +
				"</form>" +	
				"</body></html>");
		out.close();
	}

}
