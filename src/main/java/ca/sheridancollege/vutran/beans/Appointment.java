package ca.sheridancollege.vutran.beans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@RequiredArgsConstructor
public class Appointment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NonNull
	private String purpose;
	@NonNull
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate appointmentDate;
	@DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
	@NonNull
	private LocalTime appointmentTime;
	@NonNull
	private LocalTime endTime;
	private String location;
	public Appointment(@NonNull String purpose, @NonNull LocalDate appointmentDate, @NonNull LocalTime appointmentTime,
			@NonNull LocalTime endTime, String location) {
		super();
		this.purpose = purpose;
		this.appointmentDate = appointmentDate;
		this.appointmentTime = appointmentTime;
		this.endTime = endTime;
		this.location = location;
	}	
}
