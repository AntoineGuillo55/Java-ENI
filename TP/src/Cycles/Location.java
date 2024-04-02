package Cycles;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.Temporal;
import java.util.*;

public class Location {

	public static void main(String[] args) {
		
		List<Cycle> cycles = new ArrayList<Cycle>();
		
		cycles.add(new Velo(LocalDate.of(2017,6,2), "Lapierre", "speed 400", 27));
		cycles.add(new Velo(LocalDate.of(2018,4,9), "Btwin", "Riverside 900", 27));
		cycles.add(new Gyropode(LocalDate.of(2018,4,9), "Segway", "Ninebot Elite", 40, 150));
		cycles.add(new Gyropode(LocalDate.of(2017,5,2), "Weebot", "Echo", 35, 160));
		cycles.add(new Gyroroue(LocalDate.of(2018,3,25), "Immotion", "v8", 40 ));
		cycles.add(new Gyroroue(LocalDate.of(2018,3,25), "Segway", "Ninebot One", 30));
		
		System.out.println("Voici les cycles que nous proposons à la location : ");
		for(Cycle c : cycles) {
			System.out.println(c.formatedDisplay90());
		}
		
		System.out.println("------------------------------");
		System.out.println("Voici les cycles électriques que nous proposons à la location : ");
		for(Cycle c : cycles) {
			if(c instanceof Rechargeable) {
				System.out.println(c.formatedDisplay90());
			}
		}
		System.out.println("------------------------------");
		System.out.println("Voici les cycles Velo que nous proposons à la location : ");
		for(Cycle c : cycles) {
			if(c instanceof Velo) {
				System.out.println(c.formatedDisplay90());
			}
		}
		
		System.out.println("**********PARTIE BONUS*************");
		System.out.println(calculateRentPrice(cycles.get(0), LocalDateTime.of(LocalDate.of(2024, 2, 27), LocalTime.of(14, 0))));

	}
	
	//FONCTIONNE PAS
	public static double calculateRentPrice(Cycle cycle, LocalDateTime dateLocation) {
		
		LocalDateTime dateActuelle = LocalDateTime.now();


        Duration difference = Duration.between(dateLocation, dateActuelle);
        

        int periodeEnHeures = difference.toHoursPart();
        
		return periodeEnHeures * cycle.getTarifLocationHeure();
	}

}
