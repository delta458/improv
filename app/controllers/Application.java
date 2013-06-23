package controllers;

import java.util.ArrayList;

import models.Event;
import models.Groupe;
import models.Player;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class Application extends Controller {
  
    public static Result index() {
    	
    	return ok(index.render("index"));
    	
    }
    
    public static Result events() {
    	Player a = new Player("John", "Albert", "john.albert@gmail.com");
    	Player b = new Player("Alex", "Ulrich", "a.ulrich@gmail.com");
    	Player c = new Player("Tudher", "Meine", "t.meine@gmail.com");
    	
    	ArrayList<Player> spikuPlayers = new ArrayList<Player>();
    	spikuPlayers.add(a);
    	spikuPlayers.add(b);
    	
    	ArrayList<Player> fuchsPlayers = new ArrayList<Player>();
    	spikuPlayers.add(c);
    	
    	Groupe g1 = new Groupe("SpikU", spikuPlayers);
    	Groupe g2 = new Groupe("Fuchs", fuchsPlayers);
    	
    	ArrayList<Groupe> oneGroup = new ArrayList<Groupe>();
    	oneGroup.add(g1);
    	
    	ArrayList<Groupe> multiGroup = new ArrayList<Groupe>();
    	multiGroup.add(g1);
    	multiGroup.add(g2);
    	
    	ArrayList<Event> eventsList = new ArrayList<Event>();
    	eventsList.add(new Event("Impro mit Susi","Yuhu um 5 Uhr im Algos!","Impro-Nacht","04.07.2013 12:00 - 14:00", "Amerling",oneGroup,"Freie Spende"));
    	eventsList.add(new Event("Impro mit Charlie","Yuhu um 5 Uhr in der Stuthe!","Impro-Training","05.07.2013 12:00 - 14:00", "Stuthe", multiGroup, "Kostenlos"));
    	eventsList.add(new Event("Impro mit Gustav","Yuhu um 7 Uhr im Amerling!","Auftritt","06.07.2013 12:00 - 14:00", "Beisl", oneGroup, "€ 5"));
    	return ok(events.render(eventsList));
    	
    }
    
   
    public static Result groups() {
    	return ok(index.render("groups"));
    }
    
    public static Result about() {
    	return ok(index.render("about"));
    }
    public static Result videos() {
    	return ok(index.render("videos"));
    }
    public static Result login() {
    	return ok(index.render("login"));
    }
    
  
}
