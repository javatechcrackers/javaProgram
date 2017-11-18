package org.pkk.Collection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class JukeBox {

	ArrayList<Songs> songList=new ArrayList<Songs>();
	
	public void go() throws IOException
	{
		getSongs();
		//String[] sortTitle = new String[4];
		// int i=0;
		for(Songs songs:songList){
			
			/*sortTitle[i]=songs.getTitle();
			i=i+1;*/
		System.out.println("Artist: "+songs.getArtist()+ "\tTitle: " +songs.getTitle());
			
		}
		System.out.println(songList);
		ArtistCompare artistCompare=new ArtistCompare();
		
		//System.out.println(songList);
		Collections.sort(songList,artistCompare);
		
		System.out.println(songList);
		
		
	}
	
	public void getSongs() throws IOException
	{
		File file=new File("P:\\Projects\\Workspace\\Java_Demo\\src\\com\\Tutorials\\Collection\\songList.txt");
		BufferedReader reader=new BufferedReader(new FileReader(file));
		
		try {
			
			String line=null;
			//line=reader.readLine();
			while((line=reader.readLine())!=null){
				//System.out.println("inside while");
				addSong(line);
				
			}
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
		reader.close();
		}
		
	}
	private void addSong(String lineToParse) {
		System.out.println(lineToParse);
		String[] token= lineToParse.split("/");
		Songs next= new Songs();
		next.setArtist(token[1]);
		next.setTitle(token[0]);
		songList.add(next);
		
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) throws IOException {
		JukeBox jk=new JukeBox();
		jk.go();
		
		// TODO Auto-generated method stub

	}
	class ArtistCompare implements Comparator<Songs>
	{
		public int compare(Songs one, Songs two)
		{
			return one.getArtist().compareTo(two.getArtist());
		}
	}
}
