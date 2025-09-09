/*

25. Media Player
Scenario: A media player can play both Audio and Video files.
Problem Statement:
● Interface AudioPlayer → method playAudio(String song)
● Interface VideoPlayer → method playVideo(String movie)
● Class MediaPlayer implements both → provides implementation for both methods
Sample Input:
Audio → song="Shape of You"
Video → movie="Inception"
Sample Output:
Playing Audio: Shape of You
Playing Video: Inception


code:
*/


class Q25_MediaPlayer{
	public static void main(String args[]){
		MediaPlayer a1 = new MediaPlayer();
		
		a1.playAudio("Shape of You");
		a1.playVideo("Inception");
		
	}
}

interface AudioPlayer{
	void playAudio(String song);
}

interface VideoPlayer{
	void playVideo(String movie);
}

class MediaPlayer implements AudioPlayer, VideoPlayer{
	public void playAudio(String song){
		System.out.println("Playing Audio: " + song);
	}
	
	public void playVideo(String movie){
		System.out.println("Playing Video: " + movie);
	}
}

/*
C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_3>javac Q25_MediaPlayer.java

C:\Users\Niraj\Desktop\CDAC\OOPJ_ASSIGNMENT_3>java Q25_MediaPlayer
Playing Audio: Shape of You
Playing Video: Inception
*/