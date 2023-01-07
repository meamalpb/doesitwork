package com.example.doesitwork.topics;
import java.io.IOException;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(path = "/topic")
public class TopicMain {

    public ArrayList<Topic> topics = new ArrayList<>();

    @GetMapping("/")
    public ArrayList<Topic> getTopicsite(){
        return topics;
    }


    @RequestMapping(path = "/s",method = RequestMethod.GET)
    public Topic yes(){
        return  new Topic("amal", "kaal", 10);
    }

    @PostMapping("/add")
    public void taketopic(@RequestBody Topic topic, HttpServletResponse response){
        topics.add(topic);
        try {
            response.sendRedirect("http://localhost:8080/topic/");
        } catch (IOException e) {
            e.printStackTrace();
        };
    }

    @GetMapping("/{id}")
    public String updatetopic(@PathVariable String id){
        return id;
    }


}
