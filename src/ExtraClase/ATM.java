package ExtraClase;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class ATM {
	Persona persona=new Persona();
	int contador=0;	
	LinkedList cola=new LinkedList();
	public void registroDatos() {
		persona.setPin((Integer.parseInt(JOptionPane.showInputDialog("Ingreso de Datos\nDigite su pin:"))));
		persona.setSaldo((Integer.parseInt(JOptionPane.showInputDialog("Ingreso de Datos\nSaldo De la cuenta:"))));
		
	}
	public void retiroEfectivo() {
		
		persona.setMonto(Integer.parseInt(JOptionPane.showInputDialog("Digite el monto a retirar: ")));
		int resultado=persona.getSaldo()-persona.getMonto();
		persona.setSaldo(resultado);
		JOptionPane.showMessageDialog(null,"Su retiro fue exitoso");
	}
	
	public void consultaCuenta() {
		JOptionPane.showMessageDialog(null, "Su saldo actual es de:"+persona.getSaldo()+"");
	}
	
	public void pagoDeRecibo() {
		int numCliente=Integer.parseInt(JOptionPane.showInputDialog("Digite su numero de recibo electrico:"));
		int monto=Integer.parseInt(JOptionPane.showInputDialog("Digite el monto a pagar:"));
		int resultado=persona.getSaldo()-monto;
		persona.setSaldo(resultado);
		JOptionPane.showMessageDialog(null,"Se pago el recibo:"+numCliente+"\nMonto pagado:"+monto+"");
		
	}
	public void acelerar() {
		String velocidad=JOptionPane.showInputDialog("Eliga la velocidad de la simulacion:\nNormal\n2x\n3x\nVelocidad Máxima");
		JOptionPane.showMessageDialog(null, "La velocidad del programa es: "+velocidad+"");
		
	}
	
	

}
