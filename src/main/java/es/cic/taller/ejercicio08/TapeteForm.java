package es.cic.taller.ejercicio08;

import com.vaadin.ui.FormLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;


public class TapeteForm extends FormLayout {
	
	final VerticalLayout layout = new VerticalLayout();

	final TextField carta1 = new TextField("Carta 1:");
	final TextField carta2 = new TextField("Carta 2:");
	final TextField carta3 = new TextField("Carta 3:");
	final TextField carta4 = new TextField("Carta 4:");
    
	
	private MyUI myUI;
	
	public TapeteForm(MyUI myUI) {
		this.myUI = myUI;
		
		addComponents(carta1, carta2, carta3, carta4);
	}
}

