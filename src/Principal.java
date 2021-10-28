
	
	import java.util.ArrayList;

	import base.Usuario;
	import derivadas.TarjetaMercadoPago;

	public class Principal {
		
		
		public static void main (String[] Args) {
			
			
			ArrayList<Usuario> usuario = new ArrayList<Usuario>();
			
			
			Usuario Melisa = new Usuario("Melisa","Sh1llst3r1975k00ks" ,"Melisa","Monje","39657612", "melisamonjeintili@gmail.com", "3135878032");
			
			
			usuario.add(Melisa);
			
			System.out.println(Melisa);
			
			
		
			TarjetaMercadoPago tarjetaMercadoPago = new TarjetaMercadoPago(10000);		
			
			
			
			
			
			
		}

	}
	

