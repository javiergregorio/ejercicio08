package es.cic.taller.ejercicio08;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Baraja {
	
	private List<Carta> listaCartas = new ArrayList<>();
	
	public Baraja() {
		listaCartas.addAll(getPalo("Oros"));
		listaCartas.addAll(getPalo("Copas"));
		listaCartas.addAll(getPalo("Bastos"));
		listaCartas.addAll(getPalo("Espadas"));
	}
	
	public List<Carta> getPalo(String palo) {
		
		List<Carta> listaCartasPalo = new ArrayList<>();
		
		for (int i=1; i<11; i++) {
			Carta carta = new Carta();
			carta.setNumero(i);
			carta.setPalo(palo);
			listaCartasPalo.add(carta);
		}
		return listaCartasPalo;
	}
	
	public int numAleatorio() {
		
		int randomNum = ThreadLocalRandom.current().nextInt(1, 40);
		
		return randomNum;
	}
	
	//barajear
	
	//getCarta
	private Carta getCarta() {
		if(listaCartas.isEmpty()) {
			throw new RuntimeException("No quedan cartas");
		}
		Carta carta = listaCartas.remove(0);
		return carta;
	}
	
	public Tapete getTapete(int z) {
		
		Tapete tapete = new Tapete();

		switch(z) {
		case 1:
			tapete.setCarta1(listaCartas.get(numAleatorio()));
			tapete.setCarta2(listaCartas.get(numAleatorio()));
			tapete.setCarta3(listaCartas.get(numAleatorio()));
			tapete.setCarta4(listaCartas.get(numAleatorio()));
			break;
		case 2:
			tapete.setCarta1(listaCartas.get(numAleatorio()));
			tapete.setCarta2(listaCartas.get(numAleatorio()));
			tapete.setCarta3(listaCartas.get(numAleatorio()));
			tapete.setCarta4(listaCartas.get(numAleatorio()));
			break;
		case 3:
			tapete.setCarta1(listaCartas.get(numAleatorio()));
			tapete.setCarta2(listaCartas.get(numAleatorio()));
			tapete.setCarta3(listaCartas.get(numAleatorio()));
			tapete.setCarta4(listaCartas.get(numAleatorio()));
			break;
		case 4:
			tapete.setCarta1(listaCartas.get(numAleatorio()));
			tapete.setCarta2(listaCartas.get(numAleatorio()));
			tapete.setCarta3(listaCartas.get(numAleatorio()));
			tapete.setCarta4(listaCartas.get(numAleatorio()));
			break;
		default:
			break;
		}
		
		
		return tapete;
		
	}

}
