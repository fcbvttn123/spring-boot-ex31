package ca.sheridancollege.vutran.bootstrap;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ca.sheridancollege.vutran.beans.Appointment;
import ca.sheridancollege.vutran.repo.AppointmentRepo;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class BootstrapData implements CommandLineRunner {
	private AppointmentRepo ar;
	
	@Override
    public void run(String... args) throws Exception {
        Appointment a1 = new Appointment("Purpose1", LocalDate.parse("2024-01-28"), LocalTime.parse("08:00:00"), LocalTime.parse("10:00:00"), "location1");
        Appointment a2 = new Appointment("Purpose2", LocalDate.parse("2024-02-12"), LocalTime.parse("12:30:00"), LocalTime.parse("09:00:00"), "location 2");
        Appointment a3 = new Appointment("Purpose3", LocalDate.parse("2024-03-02"), LocalTime.parse("15:00:00"), LocalTime.parse("11:00:00"));

        ar.save(a1);
        ar.save(a2);
        ar.save(a3);
    }
}
