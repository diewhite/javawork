package body;

public class Calculator {
	private double total;
	private double cabo;
	private double protein;
	private double fat;

	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getCabo() {
		return cabo;
	}
	public void setCabo(double cabo) {
		this.cabo = cabo;
	}
	public double getProtein() {
		return protein;
	}
	public void setProtein(double protein) {
		this.protein = protein;
	}
	public double getFat() {
		return fat;
	}
	public void setFat(double fat) {
		this.fat = fat;
	}
	public void cal(double total) {
		double caboG = 0;
		double proG = 0;
		double fatG = 0;
		cabo = total * 0.45;
		protein = total * 0.35;
		fat = total * 0.2;
		caboG = cabo / 4;
		proG = protein / 4;
		fatG = fat / 9;
		
		System.out.println("탄 :"+caboG+"g 단 :"+proG+"g 지 :"+fatG+"g");
	}
}
