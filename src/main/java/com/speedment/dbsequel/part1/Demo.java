package com.speedment.dbsequel.part1;

import com.company.sakila.SakilaApplicationBuilder;
import com.company.sakila.sakila.sakila.film.Film;
import com.company.sakila.sakila.sakila.film.FilmManager;
import com.speedment.runtime.core.ApplicationBuilder;
import com.speedment.runtime.core.Speedment;

final class Demo {

    public static void main(final String... args) {

        // Create a Speedment instance
        Speedment app = new SakilaApplicationBuilder()
            // Replace with your real password
            .withPassword("sakila-password")
            .withLogging(ApplicationBuilder.LogType.STREAM)
            .build();


        // Obtains a FilmManager that allows us to
        // work with the "film" table
        FilmManager films = app.getOrThrow(FilmManager.class);

        films.stream()
            .sorted(Film.LENGTH)
            .limit(5)
            .forEach(System.out::println);

        long longFilms = films.stream()
            .filter(Film.LENGTH.greaterThan(60))
            .count();

        System.out.format("There are %d films longer than 1 hour.", longFilms);


    }


}
