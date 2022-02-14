package br.com.karina.calc.visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Botao extends JButton {

	public Botao(String texto, Color cor) {
		setText(texto);// escrever texto
		setFont(new Font("courier", Font.PLAIN, 25)); // font do butao
		setOpaque(true);   //  para pintar a cor
		setBackground(cor);  // colocar a cor
		setForeground(Color.WHITE); // cor da fonte dos numeros
		setBorder(BorderFactory.createLineBorder(Color.BLACK));   //  colocar um bordar ao redor dos botao
		
		
		
	}
}
