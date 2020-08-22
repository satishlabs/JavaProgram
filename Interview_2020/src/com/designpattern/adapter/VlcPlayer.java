package com.designpattern.adapter;

public class VlcPlayer implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String filename) {
		System.out.println("Playing vlc file name: "+filename);
	}

	@Override
	public void playMp4(String filename) {
		System.out.println("Playing mp4 file name: "+filename);
	}

}
