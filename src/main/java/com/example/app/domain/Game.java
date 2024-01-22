package com.example.app.domain;




import java.time.LocalDate;

import lombok.Data;

@Data
public class Game {
    
	private LocalDate match;
	private String home;
	private String away;
	private Integer score;
	private String result;
	private String comment;
}
