package br.com.karina.calc.visao;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame{
	
	public Calculadora() {
		setSize(335,540);           // Definir o tamanho da caluladora
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Fechar a aplica��o sair mata processo 
		setLocationRelativeTo(null);     		//para abrir a aplica��o no centro da tela
		setVisible(true); // Tela ficar visivel
	}

	public static void main(String[] args) {
		new Calculadora();
	}
}
