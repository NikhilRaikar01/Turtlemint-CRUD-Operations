package com.nikhilprojects.turtlemintclone.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Document (collection = "Profiles")
public class Profile {

	@Transient
    public static final String SEQUENCE_NAME = "users_sequence";

	@Id
	private long id;

	@NotBlank
    @Size(max=100)
	private String Vertical;
	private String Make;

	@NotBlank
    @Size(max=100)
    @Indexed(unique=true)
	private String Model;

	public Profile(String Vertical, String Make, String Model) {
		this.Vertical = Vertical;
		this.Make = Make;
		this.Model = Model;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getVertical() {
		return Vertical;
	}
	public void setVertical(String Vertical) {
		this.Vertical = Vertical;
	}
	
	public String getMake() {
		return Make;
	}
	public void setMake(String Make) {
		this.Make = Make;
	}
	
	public String getModel() {
		return Model;
	}
	public void setModel(String Model) {
		this.Model = Model;
	}

	@Override
	public String toString() {
		return "Profiles [id=" + id + ", Vertical=" + Vertical + ", Make=" + Make + ", Model" + Model
				+ "]";
	}	
}
