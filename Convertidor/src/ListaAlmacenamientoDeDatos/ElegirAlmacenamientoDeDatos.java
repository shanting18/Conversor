package ListaAlmacenamientoDeDatos;

import javax.swing.JOptionPane;

public class ElegirAlmacenamientoDeDatos {
	
	ConvertirAlmacenamientoDeDatos tiposDeDatos = new ConvertirAlmacenamientoDeDatos();
	
	public void ConvertirAlmacenamientoDeDatos(double valor) {
		
		String Elegir = (JOptionPane.showInputDialog(null, "Elige el tipo de dato que deseas convertir", "tipos de datos", JOptionPane.QUESTION_MESSAGE, 
				null, new Object[] {"Bit a Byte","Kilobit a kilobyte","Megabit a megabyte","Gigabit a gigabyte","Terabit a terabyte","Petabit a petabyte","Exabit a exabyte",
						            "Byte a bit","Kilobyte a kilobit","Megabyte a megabit","Gigabyte a gigabit","Terabyte a terabit","Petabyte a petabit","Exabyte a exabit"}, null)).toString();
		
		
		switch (Elegir) {
		
		case "Bit a Byte":
			tiposDeDatos.Bitabyte(valor);
			break;
			
		case "Kilobit a kilobyte":
			tiposDeDatos.Kilobitakilobyte(valor);
			break;
			
		case "Megabit a megabyte":
			tiposDeDatos.Megabitamegabyte(valor);
			break;
	
		case "Gigabit a gigabyte":
			tiposDeDatos.Gigabitagigabyte(valor);
			break;
	
		case "Terabit a terabyte":
			tiposDeDatos.Terabitaterabyte(valor);
			break;
	
		case "Petabit a petabyte":
			tiposDeDatos.Petabitapetabyte(valor);
			break;
	
		case "Exabit a exabyte":
			tiposDeDatos.Exabitaexabyte(valor);
			break;
			
		case "Byte a bit":
			tiposDeDatos.Byteabit(valor);
			break;
			
		case "Kilobyte a kilobit":
			tiposDeDatos.Kilobyteakilobit(valor);
			break;
			
		case "Megabyte a megabit":
			tiposDeDatos.Megabyteamegabit(valor);
			break;
			
		case "Gigabyte a gigabit":
			tiposDeDatos.Gigabyteagigabit(valor);
			break;
			
		case "Terabyte a terabit":
			tiposDeDatos.Terabyteaterabit(valor);
			break;
			
		case "Petabyte a petabit":
			tiposDeDatos.Petabyteapetabit(valor);
			break;
			
		case "Exabyte a exabit":
			tiposDeDatos.Exabyteaexabit(valor);
			break;
		}
	}
}
