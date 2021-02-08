package ed;

import java.util.Scanner;

public class Cliente {
	
	//Atributos
	private String nombreCliente;
	private int edadCliente;
	
	
	//Constructor por parametros
	public Cliente(String nombreCliente, int edadCliente) {
		this.nombreCliente = nombreCliente;
		this.edadCliente = edadCliente;
	}
	
	//Metodos getters
	public String getNombreCliente() {
		return this.nombreCliente;
	}
	
	public int getEdadCliente() {
		return this.edadCliente;
	}
	
	//Metodos setters
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	
	public void setEdadCliente(int edadCliente) {
		this.edadCliente = edadCliente;
	}
	
	//Metodos adicionales
	public void darAlta() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su nombre");
		this.nombreCliente = sc.nextLine();
		System.out.println("Introduzca su edad");
		this.edadCliente = sc.nextInt();
	}
	
	public void darBaja() {
		this.nombreCliente = " ";
		this.edadCliente = 0;
	}
	
	@Override
	public String toString() {
		return "Cliente = " + this.nombreCliente + " " + this.edadCliente;
	}
}
