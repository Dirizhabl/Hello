
public class Auto {
	private String ser_br;
	private String model;
	private String marka;
	private int cijena;
	private double potrosnja;
	private int godiste;
	private String gorivo;
		 Auto( String ser_br, String model, String marka,String gorivo,  int cijena, double potrosnja, int godiste){
			this.ser_br=ser_br;
			this.model=model;
			this.marka=marka;
			this.cijena=cijena;
			this.potrosnja=potrosnja;
			this.godiste=godiste;
			this.gorivo=gorivo;
		}
		String getMarka() {
			return marka;
		}
		void setMarka(String marka) {
			this.marka = marka;
		}
		String getModel() {
			return model;
		}
		void setModel(String model) {
			this.model = model;
		}
		int getCijena() {
			return cijena;
		}
		void setCijena(int cijena) {
			this.cijena = cijena;
		}
		String getSer_br() {
			return ser_br;
		}
		void setSer_br(String ser_br) {
			this.ser_br = ser_br;
		}
		double getPotrosnja() {
			return potrosnja;
		}
		void setPotrosnja(double potrosnja) {
			this.potrosnja = potrosnja;
		}
		int getGodiste() {
			return godiste;
		}
		void setGodiste(int godiste) {
			this.godiste = godiste;
		}
		String getGorivo() {
			return gorivo;
		}
		void setGorivo(String gorivo) {
			this.gorivo = gorivo;
		}

}
