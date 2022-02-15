package br.com.karina.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.karina.calc.modelo.Memoria;
import br.com.karina.calc.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador{
	
	private final JLabel label ;
	
	public Display() {
		Memoria.getInstancia().adicionarObservador(this);  // Vai notificar sempre que o valor ser alterado
		
		setBackground(new Color(46,49,50)); ///Para definir a cor
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		label.setForeground(Color.WHITE);
		label.setFont(new Font("courier", Font.PLAIN, 30));
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 135));
		add(label);
	
	}

	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
		
	}

}
