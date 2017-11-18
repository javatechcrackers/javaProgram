package org.pkk.Collection;

public class Songs implements Comparable<Songs> {
	private String title;
	private String artist;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	/*public int compareTo(Songs s)
	{
		return title.compareTo(s.getTitle());
	}*/
	public String toString()
	{
		return title;
}
	@Override
	public int compareTo(Songs o) {
		// TODO Auto-generated method stub
		return 0;
	}


}
