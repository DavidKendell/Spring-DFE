package com.qa.onepiece.domain;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Characters {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private int health;
	
	private int attack;
	
	private int defence;
	
	private int speed;
	
	private int bounty;

	public Characters() {
		super();
	}

	public Characters(String name, int health, int attack, int defence, int speed, int bounty) {
		super();
		this.name = name;
		this.health = health;
		this.attack = attack;
		this.defence = defence;
		this.speed = speed;
		this.bounty = bounty;
	}

	public Characters(Long id, String name, int health, int attack, int defence, int speed, int bounty) {
		super();
		this.id = id;
		this.name = name;
		this.health = health;
		this.attack = attack;
		this.defence = defence;
		this.speed = speed;
		this.bounty = bounty;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getBounty() {
		return bounty;
	}

	public void setBounty(int bounty) {
		this.bounty = bounty;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(attack, id, name, defence, speed, health, bounty);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Characters other = (Characters) obj;
		return Objects.equals(name, other.name) && Objects.equals(id, other.id) && Objects.equals(attack, other.attack)
				&& speed == other.speed && defence == other.defence
				&& Objects.equals(health, other.health) && Objects.equals(bounty, other.bounty);
	}
}
