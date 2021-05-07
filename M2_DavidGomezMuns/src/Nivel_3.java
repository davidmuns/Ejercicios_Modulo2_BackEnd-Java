
public class Nivel_3 {
	
	public static void main(String[] args) {
		try {
			clock();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void clock() throws InterruptedException {
		int s = 0, m = 0, h = 0;
		String seg, min, hor;
		
		while (true) {
			//Formato (00:00:00) si valor es menor que 10
			if (s < 10) {
				seg = "0";
			} else {
				seg = "";
			}
			if (m < 10) {
				min = "0";
			} else {
				min = "";
			}
			if (h < 10) {
				hor = "0";
			} else {
				hor = "";
			}
			//Imprimir reloj
			System.out.println(hor + h + ":" + min + m + ":" + seg + s);
			//Incrementar segundos
			s++;
			//Resetear segundos e incrementar minutos
			if (s == 60) {
				s = 0;
				m++;
				//Resetear minutos e incrementar horas
				if (m == 60) {
					m = 0;
					h++;
					//Resetear segundos, minutos y horas
					if (h == 24) {
						s = 0;
						m = 0;
						h = 0;
					}
				}
			}
			//Detener la ejecución del programa durante 1 segundo (1000 ms)
			Thread.sleep(1000); //El uso de esta clase obliga al método a lanzar una excepción y a capturarla
								//con un try catch		
		}	
	}
}
