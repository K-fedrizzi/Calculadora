package br.com.karina.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador{
	
	public void valorAlterado(String novoValor);
	
}

