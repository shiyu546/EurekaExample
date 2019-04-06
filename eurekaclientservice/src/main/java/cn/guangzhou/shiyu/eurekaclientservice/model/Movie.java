package cn.guangzhou.shiyu.eurekaclientservice.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie {
    private Integer id;
    private String name;
    private String synopsis;

    public Movie(Integer id, String name, String synopsis) {
        this.id = id;
        this.name = name;
        this.synopsis = synopsis;
    }

    public Movie() {
    }
}
