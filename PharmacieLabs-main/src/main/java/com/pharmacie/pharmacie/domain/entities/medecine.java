package com.pharmacie.pharmacie.domain.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "med")
public class medecine implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 @Id
	 @GeneratedValue (strategy = GenerationType.IDENTITY)
	 @Column(name="medecineID")
	 private long medecineID;
	 @Column(name="name")
	 private String name;
	 @Column(name="price")
	 private double price;
	 @Column
	 private boolean okayForPregnancy;
	 @Column
	 private boolean isOrdonnanceRequired;
	 @Lob
		@Column(columnDefinition = "MEDIUMBLOB")
		private static String img;
	public medecine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public medecine(long medecineID, String name, double price, boolean okayForPregnancy, boolean isOrdonnanceRequired,String img) {
		super();
		this.medecineID = medecineID;
		this.name = name;
		this.price = price;
		this.okayForPregnancy = okayForPregnancy;
		this.isOrdonnanceRequired = isOrdonnanceRequired;
		this.img= img;
	}
	public long getMedecineID() {
		return medecineID;
	}
	public String getImg() {
		return img;
	}
	public static void setImg(String imge) {
		imge = img;
	}
	public void setMedecineID(long medecineID) {
		this.medecineID = medecineID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isOkayForPregnancy() {
		return okayForPregnancy;
	}
	public void setOkayForPregnancy(boolean okayForPregnancy) {
		this.okayForPregnancy = okayForPregnancy;
	}
	public boolean isOrdonnanceRequired() {
		return isOrdonnanceRequired;
	}
	public void setOrdonnanceRequired(boolean isOrdonnanceRequired) {
		this.isOrdonnanceRequired = isOrdonnanceRequired;
	}
	@Override
	public String toString() {
		return "Med [id=" + medecineID + ", name=" + name + ", price=" + price + ", okayForPregnancy=" + okayForPregnancy
				+ ", isOrdonnanceRequired=" + isOrdonnanceRequired + "]";
	}
	 
	 
	 
	 

}