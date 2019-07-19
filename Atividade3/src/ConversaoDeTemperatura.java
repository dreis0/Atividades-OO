
public class ConversaoDeTemperatura {

	public static double celsiusParaFarenheit(double celsius) {
		return ((9.0 / 5.0) * celsius + 32);
	}

	public static double celsiusParaKelvin(double celsius) {
		return (celsius + 273.15);
	}

	public static double farenheitParaCelsius(double faren) {
		return ((5.0 / 9.0) * (faren - 32));
	}

	public static double kelvinParaCelsius(double kelvin) {
		return kelvin - 273.15;
	}

	public static double farenheitParaKelvin(double faren) {
		return ((5.0 / 9.0) * (faren + 459.67));
	}

	public static double kelvinParaFarenheit(double kelvin) {
		return ((5.0 / 9.0) * kelvin - 459.67);
	}
}
