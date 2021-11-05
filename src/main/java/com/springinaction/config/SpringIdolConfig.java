package com.springinaction.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springinaction.springidol.Audience;
import com.springinaction.springidol.Instrumentalist;
import com.springinaction.springidol.Juggler;
import com.springinaction.springidol.Performer;
import com.springinaction.springidol.Poem;
import com.springinaction.springidol.PoeticJuggler;
import com.springinaction.springidol.Sonnet29;

@Configuration
public class SpringIdolConfig {
	
	@Bean
	public Performer duke() {
		
		return new Juggler();
	}
	
	@Bean
	public Performer duke25() {
		
		return new Juggler(25);
	}
	
	@Bean
	public Performer kenny() {
	
		Instrumentalist kenny=new Instrumentalist();
	
		kenny.setSong("JingleBells");
	
		return kenny;
	}
	
	@Bean
	
	public Poem sonnet29(){
		
	return new Sonnet29();
	}
	
	@Bean
	
	public Performer poeticDuke(){
		
	return new PoeticJuggler(sonnet29());
	}
	
	@Bean
	public Audience audience() {
		
		return new Audience();
	}
	

}
