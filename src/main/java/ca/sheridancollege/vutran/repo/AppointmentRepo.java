package ca.sheridancollege.vutran.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import ca.sheridancollege.vutran.beans.Appointment;

public interface AppointmentRepo extends JpaRepository<Appointment, Long> {
	public Appointment findByLocation(String location);
	public Appointment findByLocationAndPurpose(String location, String purpose);
	public List<Appointment> findByLocationIsNull();
	public List<Appointment> findByAppointmentDateAfter(LocalDate date);
	public List<Appointment> findByLocationContaining(String location);
}
