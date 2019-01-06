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

        List<Film> newFilmList = serializer.deserialize("D:\\trainings\\Java2018_2\\MovieHomeTask");

        Map<String, Long> oscars =
                newFilmList.stream().collect(Collectors.groupingBy(x -> x.getDirector(), Collectors.counting()));

        long maxOscars = Collections.max(oscars.values());

        System.out.println(oscars.entrySet().stream()
                .filter(entry -> entry.getValue() == maxOscars)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList()));

    }
}
