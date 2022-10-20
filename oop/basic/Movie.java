package oop.basic;

public class Movie {
	private String Title;
	private String Genre;
	public Movie() {
		
	}
	public void setTitle(String Title) {
		this.Title = Title;
	}
	public void setGenre(String Genre) {
		this.Genre = Genre;
	}
	public void play() {
		System.out.println(this.Title+"("+this.Genre+")상영 중입니다.");
	}
	public Movie(String Title, String Genre) {
		this.Title = Title;
		this.Genre = Genre;
	}
}
