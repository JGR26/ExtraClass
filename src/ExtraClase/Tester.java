package ExtraClase;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Tester {
	public static void main(String[] args) {
		int menu=0;
		int contador=0;	
		LinkedList cola=new LinkedList();
		ATM atm=new ATM();
		while(cola.size()<=15) {
			atm.registroDatos();
			contador++;
			cola.add(contador);
			while(menu!=6) {

				menu=Integer.parseInt(JOptionPane.showInputDialog("----Bienvenido al ATM---- \n1.Retiro de efectivo\n2.Consulta de cuenta\n3.Pago de servicios electricos\n4.Acelerar simulación del ATM\n5.Información de ocupacion del cajero\n6.Salir"));

				switch(menu) {

				case 1:
					atm.retiroEfectivo();
					break;
				case 2:
					atm.consultaCuenta();
					break;
				case 3:
					atm.pagoDeRecibo();
					break;
				case 4:
					atm.acelerar();
					break;
				case 5:
					if(cola.size()==0) {
						System.out.println("La fila esta vacía");
					}
					else if(cola.size()>0&&cola.size()<=5) {
						System.out.println("El porcentaje de ocupación es de:30%");
					}
					else if(cola.size()>5&&cola.size()<=10) {
						System.out.println("El porcentaje de ocupación es de:40%");
					}
					else if(cola.size()>10&&cola.size()<=14) {
						System.out.println("El porcentaje de ocupación es de:70%");
					}
					else if(cola.size()==15) {
						System.out.println("El porcentaje de ocupación es de:100%");
					}

					break;
				default:
					JOptionPane.showMessageDialog(null, "No selecciono ninguna opcion de nuestro menú");
					
				}
			}
			menu=0;
		}
		JOptionPane.showMessageDialog(null, "El ATM ha llegado a su limite de usuarios");
	
	}
}
