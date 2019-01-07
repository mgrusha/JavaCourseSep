package com.itcourses.grusha.Objects.HomeTask;

public class Film {
    public int year;
    public String filmName;
    public String directorFirstName;
    public String directorLastName;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public void setDirectorFirstName(String directorFirstName) {
        this.directorFirstName = directorFirstName;
    }

    public String getDirectorFirstName() {
        return directorFirstName;
    }

    public void setDirectorLastName(String directorLastName) {
        this.directorLastName = directorLastName;
    }

    public String getDirectorLastName() {
        return directorLastName;
    }

    @Override
    public String toString() {
        return String.format("%d [%s] [%s %s]", filmName, year, directorLastName, directorFirstName);
    }
}
