package com.tutorial.main;

import java.awt.Graphics;
import java.util.ArrayList;

public class Handler {
	
	ArrayList<GameObject> object = new ArrayList<GameObject>();
	
	public int spd = 5;
	
	public void tick() {
		for (int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			
			tempObject.tick();
		}
	}
	
	public void render(Graphics g) {
		for (int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			
			tempObject.render(g);	
		}
	}
	
	public void clearEnemys() {
		for(int i = 0; i < object.size(); i++) {
			GameObject tempObject = object.get(i);
			
			if(tempObject.getID() == ID.Player)
			{
				//Deletes everything and adds back Player
				object.clear();
				if(Game.gameState != Game.STATE.End )
				addObject(new Player(tempObject.getX(), tempObject.getY(), ID.Player, this));
			}
		}
	}
	
	public void addObject(GameObject object) {
		this.object.add(object);
	}
	
	public void removeObject(GameObject object) {
		this.object.remove(object);
	}
	
}
