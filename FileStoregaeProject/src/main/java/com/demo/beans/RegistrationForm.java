package com.demo.beans;

import java.time.LocalDate;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertFalse.List;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

public class RegistrationForm {
	@NotBlank
	private String id;
	@NotBlank
	private String name;
	private String gender;
	@Past(message = "date must be not expired................")
	@NotNull
	@DateTimeFormat(pattern = "yyyy=MM-dd")
	private LocalDate dob;
	@NotNull
	
}
