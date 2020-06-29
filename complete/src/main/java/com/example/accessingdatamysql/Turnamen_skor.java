package com.example.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity // This tells Hibernate to make a table out of this class
public class Turnamen_skor {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    //@GeneratedValue(strategy=GenerationType.SEQUENCE, name="user_id")
    //@GeneratedValue(strategy=GenerationType.SEQUENCE)
    //@SequenceGenerator( name="user_id", sequenceName="subscription_id_user", allocationSize=7)
    private Integer id;

/*    @Column(name="index", nullable=false, length=5)
    private Integer index;*/
    
    @Column(name="turnamen_id", nullable=false, length=5)
    private Integer turnamen_id;
    
    @Column(name="burung_id", nullable=false, length=5)
    private Integer burung_id;
    
    @Column(name="skor", nullable=false, length=5)
    private Integer skor;
    
    @Column(name="nama_burung", nullable=false, length=50)
    private String nama_burung;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
/*	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}
*/	
	public Integer getTurnamen_id() {
		return turnamen_id;
	}

	public void setTurnamen_id(Integer turnamen_id) {
		this.turnamen_id = turnamen_id;
	}

	public Integer getBurung_id() {
		return burung_id;
	}

	public void setBurung_id(Integer burung_id) {
		this.burung_id = burung_id;
	}

	public Integer getSkor() {
		return skor;
	}

	public void setSkor(Integer skor) {
		this.skor = skor;
	}
	
	public String getNama_burung() {
		return nama_burung;
	}

	public void setNama_burung(String nama_burung) {
		this.nama_burung = nama_burung;
	}
	
}

