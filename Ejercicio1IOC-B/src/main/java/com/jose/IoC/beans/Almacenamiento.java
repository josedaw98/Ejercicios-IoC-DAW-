package com.jose.IoC.beans;


	public class Almacenamiento {

		private int almacenamiento;
		private String ruta;
		
		
		public int getAlmacenamiento() {
			return almacenamiento;
		}
		public void setAlmacenamiento(int almacenamiento) {
			this.almacenamiento = almacenamiento;
		}
		public String getRuta() {
			return ruta;
		}
		public void setRuta(String ruta) {
			this.ruta = ruta;
		}
		@Override
		public String toString() {
			return "Almacenamiento [almacenamiento=" + almacenamiento + ", ruta=" + ruta + "]";
		}
		
	}

