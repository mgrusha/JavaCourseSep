package com.itcourses.grusha.Objects.HomeTask;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface ISerializier {
    void serialize(List<Film> filmList) throws ExecutionException, InterruptedException;

    List<Film> deserialize();
}
