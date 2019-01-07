package com.itcourses.grusha.Objects.HomeTask;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task {
    public static void main(String[] args) throws IOException {
        List<Film> filmList = new HtmlFilmParser("https://www.filmsite.org/bestpics4.html").getFilms();

        ISerializier serializer = new GsonSerializer("D:\\trainings\\Java2018_2\\MovieHomeTask");
        serializer.serialize(filmList);

        List<Film> newFilmList = serializer.deserialize();

        Map<String, Long> oscars =
                newFilmList.stream().collect(Collectors.groupingBy(x -> (x.getDirectorFirstName() + " " + x.getDirectorLastName()), Collectors.counting()));

        long maxOscars = Collections.max(oscars.values());

        System.out.println(oscars.entrySet().stream()
                .filter(entry -> entry.getValue() == maxOscars)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList()));

        System.out.println(newFilmList.stream().filter(film -> film.year > 1965 && film.year < 2000).collect(Collectors.toList()));
    }
}
