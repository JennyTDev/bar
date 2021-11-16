package com.example.bar.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Gardiennage {


		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		public Long id;
		
		public Date dateDebut;
		public Date dateFin;
		public Float tarifHeure;
	
}