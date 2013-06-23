package models;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

/**
 * Represents an impro group, for example SpiKu.
 * @author Ifraimov David
 *
 */
@Entity
public class Groupe extends Model {

	@Id
	private String name;
	
	@Required
	private String password;
	
	private ArrayList<Player> members;
	//TODO Logo

	public Groupe(String name, ArrayList<Player> members) {
		super();
		this.name = name;
		this.members = members;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Player> getMembers() {
		return members;
	}
	
	public void setMembers(ArrayList<Player> members) {
		this.members = members;
	}
	
}
