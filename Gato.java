package modelo;

public class Gato {


		private String Nombre;
        private String raza;
		public Gato(String nombre,String raza) {
			super();
			this.Nombre = nombre;
			this.raza = raza;
		}

		
		
		public String getNombre() {
			return Nombre;
		}



		public void setNombre(String nombre) {
			Nombre = nombre;
		}



		@Override
		public String toString() {
			return "Gato [Nombre=" + Nombre + "]";
		}
		
	}
