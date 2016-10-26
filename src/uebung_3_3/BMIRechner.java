package uebung_3_3;

public class BMIRechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double koerperGroesse = 1.60, gewicht = 70.0;
		double bmi;
		int alter = 33;
		boolean männlich = false;

		// Berechnung BMI
		bmi = gewicht / Math.pow(koerperGroesse, 2);
		System.out.println("Ihr BMI liegt bei " + bmi);

		// Bewertung BMI
		if (alter <= 24) {
			if (männlich == true) {
				if (bmi < 20) {
					System.out.println("Sie sind untergewichtig!");
				}
				if (bmi > 25) {
					System.out.println("Sie sind übergewichtig!");
				}
				if (bmi <= 25 && bmi >= 20) {
					System.out.println("Sie haben Normalgewicht!");
				}
			} else {
				if (bmi < 19) {
					System.out.println("Sie sind untergewichtig!");
				}
				if (bmi > 24) {
					System.out.println("Sie sind übergewichtig!");
				}
				if (bmi <= 24 && bmi >= 19) {
					System.out.println("Sie haben Normalgewicht!");
				}
			}

		}
		if (alter >= 25 && alter <= 34) {
			if (männlich == true) {
				if (bmi < 21) {
					System.out.println("Sie sind untergewichtig!");
				}
				if (bmi > 26) {
					System.out.println("Sie sind übergewichtig!");
				}
				if (bmi <= 26 && bmi >= 21) {
					System.out.println("Sie haben Normalgewicht!");
				}
			} else {
				if (bmi < 20) {
					System.out.println("Sie sind untergewichtig!");
				}
				if (bmi > 25) {
					System.out.println("Sie sind übergewichtig!");
				}
				if (bmi <= 25 && bmi >= 20) {
					System.out.println("Sie haben Normalgewicht!");
				}

			}

		}
		if (alter >= 35 && alter <= 44) {
			if (männlich == true) {
				if (bmi < 22) {
					System.out.println("Sie sind untergewichtig!");
				}
				if (bmi > 27) {
					System.out.println("Sie sind übergewichtig!");
				}
				if (bmi <= 27 && bmi >= 22) {
					System.out.println("Sie haben Normalgewicht!");
				}
			} else {
				if (bmi < 21) {
					System.out.println("Sie sind untergewichtig!");
				}
				if (bmi > 26) {
					System.out.println("Sie sind übergewichtig!");
				}
				if (bmi <= 26 && bmi >= 21) {
					System.out.println("Sie haben Normalgewicht!");
				}

			}

		}
		if (alter >= 45 && alter <= 54) {
			if (männlich == true) {
				if (bmi < 23) {
					System.out.println("Sie sind untergewichtig!");
				}
				if (bmi > 28) {
					System.out.println("Sie sind übergewichtig!");
				}
				if (bmi <= 28 && bmi >= 23) {
					System.out.println("Sie haben Normalgewicht!");
				}
			} else {
				if (bmi < 22) {
					System.out.println("Sie sind untergewichtig!");
				}
				if (bmi > 27) {
					System.out.println("Sie sind übergewichtig!");
				}
				if (bmi <= 27 && bmi >= 22) {
					System.out.println("Sie haben Normalgewicht!");
				}

			}
		}
		if (alter >= 55 && alter <= 64) {
			if (männlich == true) {
				if (bmi < 24) {
					System.out.println("Sie sind untergewichtig!");
				}
				if (bmi > 29) {
					System.out.println("Sie sind übergewichtig!");
				}
				if (bmi <= 29 && bmi >= 24) {
					System.out.println("Sie haben Normalgewicht!");
				}
			} else {
				if (bmi < 23) {
					System.out.println("Sie sind untergewichtig!");
				}
				if (bmi > 28) {
					System.out.println("Sie sind übergewichtig!");
				}
				if (bmi <= 38 && bmi >= 23) {
					System.out.println("Sie haben Normalgewicht!");
				}

			}
		}
		if (alter > 64) {
			if (männlich == true) {
				if (bmi < 25) {
					System.out.println("Sie sind untergewichtig!");
				}
				if (bmi > 30) {
					System.out.println("Sie sind übergewichtig!");
				}
				if (bmi <= 30 && bmi >= 25) {
					System.out.println("Sie haben Normalgewicht!");
				}
			} else {
				if (bmi < 24) {
					System.out.println("Sie sind untergewichtig!");
				}
				if (bmi > 29) {
					System.out.println("Sie sind übergewichtig!");
				}
				if (bmi <= 29 && bmi >= 24) {
					System.out.println("Sie haben Normalgewicht!");
				}
			}
		}
	}

}
