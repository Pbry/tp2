package fiuba.algo3.tp2.Cartas;

import fiuba.algo3.tp2.Jugador;

public class EfectoAgujeroNegro implements TieneUnEfecto {
	
	private Jugador jugador1;
	private Jugador jugador2;
	
	public EfectoAgujeroNegro(Jugador _jugador1, Jugador _jugador2) {
		this.jugador1 = _jugador1;
		this.jugador2 = _jugador2;
	}

	public void activarEfecto() {
		this.jugador1.destruirMonstruos();
		this.jugador2.destruirMonstruos();

	}

}
