package com.sx.visitorService.DTO;

import java.util.ArrayList;
import java.util.List;

public class Path {

    private List<String> path=new ArrayList<>();

    public Path() {
    }

    public Path(List<String> path) {
        this.path = path;
    }

    public List<String> getPath() {
        return path;
    }

    public void setPath(List<String> path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Path{" +
                "path=" + path +
                '}';
    }
}
