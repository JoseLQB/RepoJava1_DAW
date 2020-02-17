public class Person {
        private String name;
        private String address;
        private String tlf;
       
        //private static int contadorDeInstancias = 0;
        public static int contadorDeInstancias = 0;
        public Person() {
                contadorDeInstancias ++;
        }
        public Person(String name, String address, String tlf) {
       
                this.name = name;
                this.address = address;
                this.tlf = tlf;
                contadorDeInstancias ++;
        }
        public static int getContadorDeInstancias() {//obligatoriamente es static
                return contadorDeInstancias;
        }
       
        public String getName() {
                return name;
        }
        public void setName(String name) {
                this.name = name;
        }
        public String getAddress() {
                return address;
        }
        public void setAddress(String address) {
                this.address = address;
        }
		public String getTlf() {
			return tlf;
		}
		public void setTlf(String tlf) {
			this.tlf = tlf;
		}
       
        //Atributo de clase, contador instancias
       
}