package ConversorDeTemperatura;

import javax.swing.JOptionPane;

public class functionTemp {
	ConvertirTemp temperatura = new ConvertirTemp();
	
	public void ConvertirTemperatura(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Grados Celcius a Grados Farenheit", "Grados Celcius a Grados Kelvin", "Grados Farenheit a Grados Celcius","Grados Kelvin a Grados Celcius","Grados Kelvin a Grados Farenheit"}, "Seleccion")).toString();
        switch(opcion) {
        case "Grados Celcius a Grados Farenheit":
        	temperatura.ConvertirCelciusAFarenheit(Minput);
        	break;
        case "Grados Celcius a Kelvin":
            temperatura.ConvertirCelciusAKelvin(Minput);
            break;
        case "Grados Farenheit a Grados Celcius":
           temperatura.ConvertirFarenheitACelcius(Minput);
           break;
        case "Kelvin a Grados Celcius":
           temperatura.ConvertirKelvinACelcius(Minput);
           break;
        case "Kelvin a Grados Farenheit":
        	temperatura.ConvertirKelvinAFarenheit(Minput);
        	break;
        }	
	}
}
