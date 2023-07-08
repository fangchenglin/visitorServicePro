package com.sx.visitorService.controller;


import com.sx.visitorService.DTO.Graph;
import com.sx.visitorService.DTO.Path;
import com.sx.visitorService.utils.result.DataResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("path")
public class PathController {

    @PostMapping("getPath")

    public DataResult getPath(@RequestBody Path path ){
        Path response = new Path();
        System.out.println("前端："+path.toString());
        Graph graph =new Graph();
        graph.initGraph();
        List<Character> temp=path.getPath();
        List<Character> shortestPath=graph.shortestPath(temp.get(0), temp.get(1));

        response.setPath(shortestPath);
        System.out.println("后端："+response.toString());

        return DataResult.successByData(response);
    }
}
