package com.sx.visitorService.DTO;

import java.util.ArrayList;
import java.util.List;

public class Path {

    private List<Character> path=new ArrayList<>();

    public Path() {
    }

    public Path(List<Character> path) {
        this.path = path;
    }

    public List<Character> getPath() {
        return path;
    }

    public void setPath(List<Character> path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Path{" +
                "path=" + path +
                '}';
    }
}
