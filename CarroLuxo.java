package Carros;

public interface CarroLuxo {
	void LigarAr();
	void DesligarAr();
	
	default int nivelDoAr() {
		return 1;
	}

}
