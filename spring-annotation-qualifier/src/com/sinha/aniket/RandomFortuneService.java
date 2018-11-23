package com.sinha.aniket;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{

	String data[] = {"Lucky","Badluck","Awesome","Average","Bad"};
	
	Random random=new Random();
	
	@Override
	public String getFortune() {

		int num=random.nextInt(data.length);
	
		return data[num];
	}
	
}
