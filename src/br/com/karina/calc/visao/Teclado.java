package br.com.karina.calc.visao;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.com.karina.calc.modelo.Memoria;

@SuppressWarnings("serial")
public class Teclado extends JPanel  implements ActionListener{

	private final Color COR_CINZA_ESCURO = new Color(68, 68, 68);
	private final Color COR_CINZA_CLARO = new Color(99, 99, 99);
	private final Color COR_RED = new Color(223, 30, 38);
	
	

	public Teclado() {
		//setBackground(Color.RED); Para definir a cor
		//setLayout(new GridLayout(5,4)); // formato de grade os botao
		GridBagLayout layout = new GridBagLayout(); 
		GridBagConstraints c = new GridBagConstraints();
		
		setLayout(layout);
		
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH; // tira espaços em brancos
		
		// Linha 1
		c.gridwidth = 2;
		adicionarBotao("CE", COR_CINZA_ESCURO, c, 0, 0);
		c.gridwidth = 1;
		adicionarBotao("±", COR_CINZA_ESCURO, c, 2, 0);
		adicionarBotao("/", COR_CINZA_ESCURO, c, 3, 0);
		
		// Linha 2
		adicionarBotao("7", COR_CINZA_CLARO, c, 0, 1);
		adicionarBotao("8", COR_CINZA_CLARO, c, 1, 1);
		adicionarBotao("9", COR_CINZA_CLARO, c, 2, 1);
		adicionarBotao("x", COR_CINZA_ESCURO, c, 3, 1);
		// Linha 3
		adicionarBotao("4", COR_CINZA_CLARO, c, 0, 2);
		adicionarBotao("5", COR_CINZA_CLARO, c, 1, 2);
		adicionarBotao("6", COR_CINZA_CLARO, c, 2, 2);
		adicionarBotao("-", COR_CINZA_ESCURO, c, 3, 2);
		// Linha 4
		adicionarBotao("1", COR_CINZA_CLARO, c, 0, 3);
		adicionarBotao("2", COR_CINZA_CLARO, c, 1, 3);
		adicionarBotao("3", COR_CINZA_CLARO, c, 2, 3);
		c.gridheight = 2;
		adicionarBotao("+", COR_RED, c, 3, 3);
		c.gridheight = 1;
		
		// Linha 5
		adicionarBotao("0", COR_CINZA_CLARO, c, 0, 4);
		adicionarBotao(",", COR_CINZA_CLARO, c, 1, 4);
		adicionarBotao("=", COR_CINZA_ESCURO, c, 2, 4);
		
		 //definido as cores dos Botões 
		/*c.gridy = 0;
		c.gridx = 0;
		add(new Botao("%", COR_CINZA_ESCURO), c);
		c.gridx = 1;
		add(new Botao("AC", COR_CINZA_ESCURO), c);
		c.gridx = 2;
		add(new Botao("C", COR_CINZA_ESCURO), c);
		c.gridx = 3;
		add(new Botao("/", COR_CINZA_ESCURO ), c);
		
		c.gridy = 1;
		c.gridx = 0;
		add(new Botao("7", COR_CINZA_CLARO ), c);
		c.gridx = 1;
		add(new Botao("8", COR_CINZA_CLARO ), c);
		c.gridx = 2;
		add(new Botao("9", COR_CINZA_CLARO ), c);
		c.gridx = 3;
		add(new Botao("X", COR_CINZA_ESCURO ), c);
		
		c.gridy = 2;
		c.gridx = 0;
		add(new Botao("4",COR_CINZA_CLARO ), c);
		c.gridx = 9;
		add(new Botao("5",COR_CINZA_CLARO ), c);
		c.gridx = 10;
		add(new Botao("6",COR_CINZA_CLARO ), c);
		c.gridx = 11;
		add(new Botao("-",COR_CINZA_ESCURO ), c);
	
		c.gridy = 3;
		c.gridx = 0;
		add(new Botao("1", COR_CINZA_CLARO ), c);
		c.gridx = 13;
		add(new Botao("2", COR_CINZA_CLARO ), c);
		c.gridx = 14;
		add(new Botao("3", COR_CINZA_CLARO ), c);
		c.gridx = 15;
		add(new Botao("+", COR_CINZA_ESCURO ),c);
		
		c.gridy = 4;
		c.gridx = 0;
		add(new Botao("+/-", COR_CINZA_CLARO ), c);
		c.gridx = 17;
		add(new Botao("0", COR_CINZA_CLARO ), c);
		c.gridx = 18;
		add(new Botao(",", COR_CINZA_CLARO ), c);
		c.gridx = 19;
		add(new Botao("=", COR_ROXO ), c);*/
		
	}
	
	private void adicionarBotao(String texto, Color cor, GridBagConstraints c, int x, int y) {
		
		c.gridy = y;
		c.gridx = x;
		
		Botao botao  = new Botao(texto, cor);
		botao.addActionListener(this);
		add(botao,c);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// para pegar resultado executado
		if(e.getSource() instanceof JButton) {
			JButton botao  = (JButton) e.getSource();
			Memoria.getInstancia().processarComando(botao.getText()); // processamento dos botoes
			//System.out.println(botao.getText());
		}
		
		
		
	}

}
