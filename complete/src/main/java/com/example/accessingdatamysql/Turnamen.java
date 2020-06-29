package com.example.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Column;

@Entity // This tells Hibernate to make a table out of this class
public class Turnamen {
    	@Id
    	@GeneratedValue(strategy=GenerationType.AUTO)
        private Integer id;

        private String name;

        private String email;

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }
    //@GeneratedValue(strategy=GenerationType.SEQUENCE, name="user_id")
    //@GeneratedValue(strategy=GenerationType.SEQUENCE)
    //@SequenceGenerator( name="user_id", sequenceName="subscription_id_user", allocationSize=7)
    /*
    private Integer id;

    //@Column(name="turnamen_id", nullable=false, length=5)
    private Integer turnamen_id;
    
    //@Column(name="nama_turnamen", nullable=false, length=50)
    private String nama_turnamen;

    //@Column(name="jumlah_burung", nullable=false, length=5)
    //private Integer jumlah_burung;
    
    //@Column(name="lokasi", nullable=false, length=50)
    //private String lokasi;

    //@Column(name="jumlah_juri", nullable=false, length=5)
    //private Integer jumlah_juri;

    //@Column(name="tinggi", nullable=false, length=5)
    //private Integer tinggi;

    //@Column(name="lebar", nullable=false, length=5)
    //private Integer lebar;

    //@Column(name="timestamps", nullable=false, length=5)
    //private String timestamps;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getTurnamen_id() {
		return turnamen_id;
	}

	public void setTurnamen_id(Integer turnamen_id) {
		this.turnamen_id = turnamen_id;
	}

	public String getNama_turnamen() {
		return nama_turnamen;
	}

	public void setNama_turnamen(String nama_turnamen) {
		this.nama_turnamen = nama_turnamen;
	}
`	*/
	/*public Integer getJumlah_burung() {
		return jumlah_burung;
	}

	public void setJumlah_burung(Integer jumlah_burung) {
		this.jumlah_burung = jumlah_burung;
	}

	public String getLokasi() {
		return lokasi;
	}

	public void setLokasi(String lokasi) {
		this.lokasi = lokasi;
	}

	public Integer getJumlah_juri() {
		return jumlah_juri;
	}

	public void setJumlah_juri(Integer jumlah_juri) {
		this.jumlah_juri = jumlah_juri;
	}

	public Integer getTinggi() {
		return tinggi;
	}

	public void setTinggi(Integer tinggi) {
		this.tinggi = tinggi;
	}

	public Integer getLebar() {
		return lebar;
	}

	public void setLebar(Integer lebar) {
		this.lebar = lebar;
	}

	public String getTimeStamps() {
		return timestamps;
	}

	public void setTimeStamps(String timestamps) {
		this.timestamps = timestamps;
	}
	*/
    
    
}

