package br.com.karina.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame{
	
	public Calculadora() {
		
		organizarLayout();
		
		setSize(335,540);           // Definir o tamanho da caluladora
		//setUndecorated(true); // pata tirar a barra de cima da aplicacao
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Fechar a aplicação sair mata processo 
		setLocationRelativeTo(null);     		//para abrir a aplicação no centro da tela
		setVisible(true); // Tela ficar visivel
	}

	private void organizarLayout() {
		setLayout(new BorderLayout());
		
		Display display = new Display();
		display.setPreferredSize(new Dimension(330, 190));  // para definir o tamanho da tela 
		add(display, BorderLayout.NORTH );   // Para definir a posição da tela do display
		
		Teclado teclado = new Teclado();
		add(teclado,BorderLayout.CENTER); ///Para definir a posição da teclado do teclado
	}

	public static void main(String[] args) {
		new Calculadora();
	}
}
