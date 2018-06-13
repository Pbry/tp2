package fiuba.algo3.tp2;

public interface EstadoMonstruo {
	
//	public void atacarMonstruo();
	public void recibirAtaque();
	public void colocarPosicionAtaque();
	public boolean estaEnPosicionAtaque();
	public void atacarMonstruo(PosicionMonstruo posicion, int puntosDeAtaque, CartaMonstruo cartaAtacada);
}
