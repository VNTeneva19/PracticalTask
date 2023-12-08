package io.datajek.spring.basics.movierecommendersystem.lesson2;

import io.datajek.spring.basics.movierecommendersystem.lesson1.RecommenderImplementation;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		RecommenderImplementation recommenderImplementation = new RecommenderImplementation(new CollaborativeFilter());
		String[] result = recommenderImplementation.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(result));
//		SpringApplication.run(MovieRecommenderSystemApplication.class, args);
	}

}
