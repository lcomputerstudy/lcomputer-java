package com.lcomputerstudy.books.java.ch17;

import java.util.ArrayList;
import java.util.List;

public class Ex03SubType {

	public static void main(String[] args) {
		// List<Content> musicList = new ArrayList<Music>();	// error
		List<Music> musicList = new ArrayList<Music>();
		musicList.add(new Music("노래1"));
		musicList.add(new Music("노래2"));
		
		// PECS: Producer Extends, Consumer super
		Player.play(musicList);
				
		Player.addRecommendedContent(musicList);
		Player.play(musicList);
		
		List<Content> contents = new ArrayList<Content>();
		contents.add(new Music("노래3"));
		contents.add(new Music("노래4"));
		
		Player.play(contents);
		
		Player.addRecommendedContent(contents);
		Player.play(contents);
		
		List<Movie> movieList = new ArrayList<Movie>();
		movieList.add(new Movie("영화1"));
		movieList.add(new Movie("영화2"));
		
		Player.play(movieList);
		
		//Player.addRecommendedContent(movieList);	// error (1)
		//Player.play(movieList);
		
		Player.<Music>play(new Music("음악1"));
		Player.play(new Movie("무비1"));
	}

}


class Player {
	// 제너릭스 오버로딩 안됨
	/*
	public static void play(List<Content> playList) {
		for (Content c : playList) {
			System.out.println("재생: " + c.getTitle());
		}
	}
	
	public static void play(List<Music> playList) {
		for (Content c : playList) {
			System.out.println("재생: " + c.getTitle());
		}
	}*/

	// Producer Extends (read)
	public static void play(List<? extends Content> playList) {
		for (Content c : playList) {
			System.out.println("재생: " + c.getTitle());
		}
		System.out.println();
		
		// playList.add(new Music("노래"));		// error
		// playList.add(new Movie("영화"));		// error
		// 제네릭스는 컴파일 타임에 오류를 잡을 수 있도록 해줍니다.
		// Music 타입인지 Movie 타입인지는 런타임이 돼서야 알 수 있기 때문에 제네릭스는 이를 허용하지 않습니다.
	}
	
	// Consumer Super (write)
	public static void addRecommendedContent(List<? super Music> playList) {
		Music music = new Music("인공지능추천음악1");
		playList.add(music);
		
		// playList.add(new Movie("영화1"));		// 컴파일러가 에러를 잡아낼 수 있습니다.
		
	}
	
	// 제한된 타입 파라미터
	/*
	public static <T> void play(T content) {
		System.out.println(content.getTitle());	// error
	}
	*/
	public static <T extends Content> void play(T content) {
		System.out.println(content.getTitle());
		System.out.println();
	}
}

interface Content {
	public abstract String getTitle();
}

class Movie implements Content {
	private String title;
	private String writer;
	private String director;
	
	public Movie(String title) {
		this.title = title;
	}

	@Override
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
}

class Music implements Content {
	private String songTitle;
	private String songWriter;
	private String lyricist;
	
	public Music(String songTitle) {
		this.songTitle = songTitle;
	}

	@Override
	public String getTitle() {
		return songTitle;
	}
	public void setSongTitle(String songTitle) {
		this.songTitle = songTitle;
	}

	public String getSongWriter() {
		return songWriter;
	}
	public void setSongWriter(String songWriter) {
		this.songWriter = songWriter;
	}

	public String getLyricist() {
		return lyricist;
	}
	public void setLyricist(String lyricist) {
		this.lyricist = lyricist;
	}
}



