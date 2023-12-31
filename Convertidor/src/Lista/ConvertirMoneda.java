package Lista;

import javax.swing.JOptionPane;

public class ConvertirMoneda {
	
	public void PesoaDolar(double valor) {
		double peso = valor * 0.00025;
		peso = (double)Math.round(peso);
		JOptionPane.showMessageDialog(null, "Tienes " + peso + "  pesos(s)");
	}

	public void PesoaEuro(double valor) {
		double peso = valor * 0.00023;
		peso = (double)Math.round(peso);
		JOptionPane.showMessageDialog(null, "Tienes " + peso + "  peso(s)");
	}
	
	public void PesoaLibrasEsterlinas(double valor) {
		double peso = valor * 0.00020;
		peso = (double)Math.round(peso);
		JOptionPane.showMessageDialog(null, "Tienes " + peso + "  peso(s)");

	}
	
	public void PesoaYenJaponés(double valor) {
		double peso = valor * 0.036;
		peso = (double)Math.round(peso);
		JOptionPane.showMessageDialog(null, "Tienes " + peso + "  peso(s)");

	}
	
	public  void PesoaWonsurCoreano(double valor) {
		double peso = valor * 0.32;
		peso = (double)Math.round(peso);
		JOptionPane.showMessageDialog(null, "Tienes " + peso + "  peso(s)");
	}

	   
	public void DolaraPeso(double valor) {
		double dolar = valor * 3988.00;
		dolar = (double)Math.round(dolar);
		JOptionPane.showMessageDialog(null, "Tienes " + dolar + "  dolar(es)");
	}

	public void EuroaPeso(double valor) {
		double euro = valor * 4482.54;
		euro = (double)Math.round(euro);
		JOptionPane.showMessageDialog(null, "Tienes " + euro + "  euro(s)");
	}
	
	public void LibrasEsterlinasaPeso(double valor) {
		double librasEsterlinas = valor * 5352.38;
		librasEsterlinas = (double)Math.round(librasEsterlinas);
		JOptionPane.showMessageDialog(null, "Tienes " + librasEsterlinas + "  libras Esterlinas");

	}
	
	public void YenJaponésaPeso(double valor) {
		double yenJaponés = valor * 29.47;
		yenJaponés = (double)Math.round(yenJaponés);
		JOptionPane.showMessageDialog(null, "Tienes " + yenJaponés + "  yen Japonés");

	}
	
	public  void WonsurCoreanoaPeso(double valor) {
		double wonsulCoreano = valor * 3.22;
		wonsulCoreano = (double)Math.round(wonsulCoreano);
		JOptionPane.showMessageDialog(null, "Tienes " + wonsulCoreano + "  won sul Coreano");
	}

}
