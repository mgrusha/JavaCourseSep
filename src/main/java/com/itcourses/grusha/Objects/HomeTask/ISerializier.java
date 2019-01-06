package com.itcourses.grusha.Objects.HomeTask;

import java.util.List;

public interface ISerializier {
    void serialize(List<Film> filmList);

    List<Film> deserialize();
}
