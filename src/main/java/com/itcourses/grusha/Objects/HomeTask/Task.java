package com.itcourses.grusha.Objects.HomeTask;

import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class Task {
    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        List<Film> filmList = new HtmlFilmParser("https://www.filmsite.org/bestpics4.html").getFilms();

        ISerializier serializer = new GsonSerializer("D:\\trainings\\MovieHomeTask");
        long time = System.currentTimeMillis();
        serializer.serialize(filmList);
        time = System.currentTimeMillis() - time;
        System.out.println(time);
        List<Film> newFilmList = serializer.deserialize();

        Map<String, Long> oscars =
                newFilmList.
                stream().
                collect(
         Collectors.groupingBy(film -> (film.getDirectorFirstName() + " " + film.getDirectorLastName()), Collectors.counting()));

        System.out.println("-------------------------");
        System.out.println(oscars);
        System.out.println("-------------------------");

        long maxOscars = Collections.max(oscars.values());

      //   Map<Film ,Long > map =  newFilmList.stream()
      //          .collect(Collectors.groupingBy(film -> film.directorFirstName , Collectors.counting()))
      //          .entrySet().stream()
      //        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
      //          .collect(Collectors.toMap(get, Map.Entry::getValue,
      //                  (oldValue, newValue) -> oldValue, LinkedHashMap::new));


        System.out.println(
                oscars.entrySet().
                        stream()
                .filter(entry -> entry.getValue() == maxOscars)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList()));

        }
}
