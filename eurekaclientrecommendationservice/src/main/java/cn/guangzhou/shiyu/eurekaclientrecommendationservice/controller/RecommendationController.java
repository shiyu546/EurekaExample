package cn.guangzhou.shiyu.eurekaclientrecommendationservice.controller;

import cn.guangzhou.shiyu.eurekaclientservice.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RecommendationController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/recommendations",method = RequestMethod.GET)
    @ResponseBody
    public Movie[] recommendations(){
        //服务注册与发现
        //Movie[] results=restTemplate.getForObject("http://movie-service/movies",Movie[].class);

        //ribbon客户端负载均衡
        Movie[] results=restTemplate.getForObject("http://say-Hello/movies",Movie[].class);
        return results;
    }
}
