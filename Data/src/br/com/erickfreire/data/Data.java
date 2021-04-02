package br.com.erickfreire.data;

/**
 * Crie um programa que formata uma data
 * @author Erick Freire
 * @version 1 - Criado em 02-04-2021 as 16:13
 */

public class Data {
	
	private int mes;
	private int dia;
	private int ano;
	
	public Data(int m, int d, int a) {
		mes = m;
		dia = d;
		ano = a;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void mostraData() {
		System.out.printf("%d/%d/%d", mes, dia, ano);
	}

}
