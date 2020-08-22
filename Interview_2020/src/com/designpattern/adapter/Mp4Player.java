package com.designpattern.adapter;

public class Mp4Player implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String filename) {
		System.out.println("Playing vlc player using: "+filename);
	}

	@Override
	public void playMp4(String filename) {
		System.out.println("Playing mp4 player using: "+filename);
	}

}
