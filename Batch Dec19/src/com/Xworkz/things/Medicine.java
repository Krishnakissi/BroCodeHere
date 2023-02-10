package com.Xworkz.things;

public class Medicine {
	public static double price(String Medicine) {
		if (Medicine == "dolo") {
			return 20.0d;
		}

		if (Medicine == "crocin") {
			return 35.0d;
		}

		if (Medicine == "cipla") {
			return 55.0d;
		}

		if (Medicine == "vicks action 500") {
			return 25.0d;
		}

		if (Medicine == "dart") {
			return 15.0d;
		}

		if (Medicine == "asprin") {
			return 75.0d;
		}

		if (Medicine == "easprin") {
			return 60.50d;
		}

		if (Medicine == "aleve") {
			return 10.0d;
		}

		if (Medicine == "vazalore") {
			return 45.0d;
		}

		if (Medicine == "genebs") {
			return 45.0d;
		}

		if (Medicine == "tycolene") {
			return 45.0d;
		}

		return -500d;

	}
}