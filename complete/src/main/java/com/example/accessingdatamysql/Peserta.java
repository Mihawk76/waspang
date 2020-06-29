package com.example.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity // This tells Hibernate to make a table out of this class
public class Peserta{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    //@GeneratedValue(strategy=GenerationType.SEQUENCE, name="user_id")
    //@GeneratedValue(strategy=GenerationType.SEQUENCE)
    //@SequenceGenerator( name="user_id", sequenceName="subscription_id_user", allocationSize=7)
    private Integer id;

    @Column(name="burung_id", nullable=false, length=5)
    private Integer burung_id;
    
    @Column(name="burung_idi_tur", nullable=false, length=5)
    private Integer burung_id_tur;
    
    @Column(name="skor", nullable=false, length=5)
    private Integer skor;

    @Column(name="nama_burung", nullable=false, length=50)
    private String nama_burung;

    @Column(name="nama_pemilik", nullable=false, length=50)
    private String nama_pemilik;

    @Column(name="time_stamps", nullable=false, length=30)
    private String TimeStamps;
    
    @Column(name="value", nullable=false, length=5)
    private Integer value;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getBurung_id() {
		return burung_id;
	}

	public void setBurung_id(Integer burung_id) {
		this.burung_id = burung_id;
	}

	public Integer getBurung_id_tur() {
		return burung_id_tur;
	}

	public void setBurung_id_tur(Integer burung_id_tur) {
		this.burung_id_tur = burung_id_tur;
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

	public String getNama_pemilik() {
		return nama_pemilik;
	}

	public void setNama_pemilik(String nama_pemilik) {
		this.nama_pemilik = nama_pemilik;
	}

	public String getTimeStamps() {
		return TimeStamps;
	}

	public void setTimeStamps(String TimeStamps) {
		this.TimeStamps = TimeStamps;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
    
    
}

