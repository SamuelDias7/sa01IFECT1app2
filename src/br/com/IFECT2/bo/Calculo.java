package br.com.IFECT2.bo;

public class Calculo {
	
	private int n1;
	private int n2;
	private int n3;
	private int n4;
	private int n5;
	private int n6;
	private int media1;
	private int media2;
	private double mediaTotal;
	
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	public int getN3() {
		return n3;
	}
	public void setN3(int n3) {
		this.n3 = n3;
	}
	public int getN4() {
		return n4;
	}
	public void setN4(int n4) {
		this.n4 = n4;
	}
	public int getN5() {
		return n5;
	}
	public void setN5(int n5) {
		this.n5 = n5;
	}
	public int getN6() {
		return n6;
	}
	public void setN6(int n6) {
		this.n6 = n6;
	}
	public int getMedia1() {
		return media1;
	}
	public void setMedia1(int media1) {
		this.media1 = media1;
	}
	public int getMedia2() {
		return media2;
	}
	public void setMedia2(int media2) {
		this.media2 = media2;
	}
	
	public double getMediaTotal() {
		return mediaTotal;
	}
	public void setMediaTotal(int mediaTotal) {
		this.mediaTotal = mediaTotal;
	}
	
	public Calculo(int n1, int n2, int n3, int n4, int n5, int n6) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.n4 = n4;
		this.n5 = n5;
		this.n6 = n6;
	}
	
	public void calculo() {
		// Atribuindo os numeros aos atributos "media"
		this.media1 = this.n1 + this.n2 + this.n3;
		this.media2 = this.n4 + this.n5 + this.n6;
		
		// Calculando as medias
		this.media1 /= 3;
		this.media2 /= 3;
		
		// Somando os valores das medias
		this.mediaTotal = this.media1 + this.media2;
		
		// Tirando as medias das medias
		this.mediaTotal /= 2;
		
		System.out.println(mediaTotal);
		
	}
	
	
	
	

	


	
	
	
	

}
