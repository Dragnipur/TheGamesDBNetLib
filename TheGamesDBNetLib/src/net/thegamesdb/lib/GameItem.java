package net.thegamesdb.lib;

import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

public class GameItem {
	public int id;
	@Element(name="GameTitle")
	public String title;
	@Element(name="PlatformId")
	public int platformID;
	@Element(name="Platform")
	public String platform;
//	@Element(name="ReleaseDate")
//	public Date releaseDate;
	@Element(name="Overview")
	public 	String overview;
	@Element(name="ESRB")
	public String esrb;
	@ElementList(inline=true, entry="Genres")
	public List<String> genres;
	@Element(name="Players")
	public String players;
	@Element(name="Co-op")
	public String coop;
	@Element(name="Youtube")
	public String youtube;
	@Element(name="Publisher")
	public String publisher;
	@Element(name="Developer")
	public String developer;
	@Element(name="Rating")
	public double rating;
	
	public GameItem() {
		this.id = 0;
		this.title = "";
		this.platformID = 0;
		this.platform = "";
//		this.releaseDate = new Date();
		this.overview = "";
		this.esrb = "";
		this.players = "";
		this.coop = "";
		this.youtube = "";
		this.publisher = "";
		this.developer = "";
		this.rating = 0.0;
	}
}
