package com.itcourses.grusha.Objects.HomeTask;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HtmlFilmParser {
    private final String url;

    public HtmlFilmParser(String url) {
        this.url = url;
    }

    public List<Film> getFilms() throws IOException {
        List<Film> films = new ArrayList<>();
        Document doc = Jsoup.connect(url).get();

        Elements years = doc.select("#mainBodyWrapper > center:nth-child(9) > table > tbody > tr > td:nth-child(1) > center");
        years.remove(0);
        Elements filmNames = doc.select("#mainBodyWrapper > center > table > tbody > tr > td> b > font");
        Elements directors = doc.select("#mainBodyWrapper > center> table > tbody > tr > td:nth-child(3) > font");
        for (int i = 0; i < years.size(); i++) {
            Film tmpFilm = new Film();
            tmpFilm.setYear(Integer.parseInt(years.get(i).text()));
            tmpFilm.setFilmName(filmNames.get(i).text());
            String replaceableValue = "\\*";
            tmpFilm.setDirector(directors.get(i).text().replaceAll(replaceableValue,""));
            films.add(tmpFilm);
        }
        return films;
    }
}
