package uebung_3_3;

public class BMIRechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double koerperGroesse = 2.00, gewicht = 95.0;
		double bmi;
		int alter = 21;
		boolean männlich = true;

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
				} else {
					System.out.println("Sie haben Normalgewicht!");
				}
			} else {
				if (bmi < 19) {
					System.out.println("Sie sind untergewichtig!");
				}
				if (bmi > 24) {
					System.out.println("Sie sind übergewichtig!");
				} else {
					System.out.println("Sie haben Normalgewicht!");
				}

			}
			if (alter > 24) {
				if (männlich == true) {
					if (bmi < 21) {
						System.out.println("Sie sind untergewichtig!");
					}
					if (bmi > 26) {
						System.out.println("Sie sind übergewichtig!");
					} else {
						System.out.println("Sie haben Normalgewicht!");
					}
				} else {
					if (bmi < 20) {
						System.out.println("Sie sind untergewichtig!");
					}
					if (bmi > 25) {
						System.out.println("Sie sind übergewichtig!");
					} else {
						System.out.println("Sie haben Normalgewicht!");
					}

				}

			}
			if (alter > 34) {
				if (männlich == true) {
					if (bmi < 22) {
						System.out.println("Sie sind untergewichtig!");
					}
					if (bmi > 27) {
						System.out.println("Sie sind übergewichtig!");
					} else {
						System.out.println("Sie haben Normalgewicht!");
					}
				} else {
					if (bmi < 21) {
						System.out.println("Sie sind untergewichtig!");
					}
					if (bmi > 26) {
						System.out.println("Sie sind übergewichtig!");
					} else {
						System.out.println("Sie haben Normalgewicht!");
					}

				}

			}
			if (alter > 44) {
				if (männlich == true) {
					if (bmi < 23) {
						System.out.println("Sie sind untergewichtig!");
					}
					if (bmi > 28) {
						System.out.println("Sie sind übergewichtig!");
					} else {
						System.out.println("Sie haben Normalgewicht!");
					}
				} else {
					if (bmi < 22) {
						System.out.println("Sie sind untergewichtig!");
					}
					if (bmi > 27) {
						System.out.println("Sie sind übergewichtig!");
					} else {
						System.out.println("Sie haben Normalgewicht!");
					}

				}
			}
			if (alter >= 64) {
				if (männlich == true) {
					if (bmi < 24) {
						System.out.println("Sie sind untergewichtig!");
					}
					if (bmi > 29) {
						System.out.println("Sie sind übergewichtig!");
					} else {
						System.out.println("Sie haben Normalgewicht!");
					}
				} else {
					if (bmi < 23) {
						System.out.println("Sie sind untergewichtig!");
					}
					if (bmi > 28) {
						System.out.println("Sie sind übergewichtig!");
					} else {
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
					} else {
						System.out.println("Sie haben Normalgewicht!");
					}
				} else {
					if (bmi < 24) {
						System.out.println("Sie sind untergewichtig!");
					}
					if (bmi > 29) {
						System.out.println("Sie sind übergewichtig!");
					} else {
						System.out.println("Sie haben Normalgewicht!");
					}

				}
			}
		}
	}
}
