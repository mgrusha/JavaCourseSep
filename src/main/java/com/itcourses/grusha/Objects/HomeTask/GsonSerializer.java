package com.itcourses.grusha.Objects.HomeTask;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GsonSerializer implements ISerializier {
    private final String path;

    public GsonSerializer(String path) {
        this.path = path;
    }

    @Override
    public void serialize(List<Film> filmList) {
        for (Film film : filmList) {
            new ThreadWriting(path,film).run();
        }

    }

    @Override
    public List<Film> deserialize() {
        Gson gson = new Gson();
        List<Film> films = new ArrayList<>();
        File location = new File(path);
        for (File file : location.listFiles()) {
            try {
                Film film = gson.fromJson(new FileReader(file), Film.class);
                films.add(film);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return films;
    }
}

class ThreadWriting extends Thread{

    private final String path;
    private final Film film;

    public ThreadWriting(String path, Film film){
        this.path = path;
        this.film = film;
    }
    @Override
    public void run() {
        String filePath = (path + "\\" + film.getFilmName().replaceAll("[\\\\/:*?\"<>|]", "") + ".json");
        try (Writer writer = new FileWriter(filePath)) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(film, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}