package br.com.karina.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.karina.calc.modelo.Memoria;

@SuppressWarnings("serial")
public class Display extends JPanel{
	
	private final JLabel label ;
	
	public Display() {
		setBackground(new Color(46,49,50)); ///Para definir a cor
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		label.setForeground(Color.WHITE);
		label.setFont(new Font("courier", Font.PLAIN, 30));
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 135));
		add(label);
	
	}

}
