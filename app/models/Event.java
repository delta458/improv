package models;

import java.util.ArrayList;

import javax.persistence.*;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

/**
 * An improv theatre event.
 * @author Ifraimov David
 *
 */
@Entity
public class Event extends Model{

	@Required
	private String name;
	
	@Id
	private int id;
	
	private String date;
	private String description;
	private String type;
	private String location;
	private String entrance;
	private ArrayList<Groupe> groups;
	
	public Event(String name, String description, String type, String date, String location, ArrayList<Groupe> groups, String entrance) {
		this.name = name;
		this.description = description;
		this.type = type;
		this.date = date;
		this.location = location;
		this.groups = groups;
		this.entrance = entrance;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public ArrayList<Groupe> getGroups() {
		return groups;
	}

	public void setGroups(ArrayList<Groupe> groups) {
		this.groups = groups;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEntrance() {
		return entrance;
	}

	public void setEntrance(String entrance) {
		this.entrance = entrance;
	}
	
	
}
