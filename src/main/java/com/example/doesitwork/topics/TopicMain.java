package com.example.doesitwork.topics;
import java.io.IOException;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(path = "/topic")
public class TopicMain {
    String id1;
    public ArrayList<Topic> topics = new ArrayList<>();

    @GetMapping("/")
    public ArrayList<Topic> getTopicsite(){
        return topics;
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

    @GetMapping("/show/{id}")
    public Topic updatetopic(@PathVariable String id){
        for (int index = 0; index < topics.size(); index++) {
            id1=topics.get(index).getId();
            if(id1.equals(id)){
                return topics.get(index);
            }
        }
        return null;
    }

    @PutMapping("/update")
    public ArrayList<Topic> updateTopics(@RequestBody Topic topic){
        String id=topic.getId();
        for (int i = 0; i < topics.size(); i++) {
            if(topics.get(i).getId().equals(id)){
                topics.set(i, topic);
            }
        }
        return topics;
    }

    @DeleteMapping("/delete/{id}")
    public ArrayList<Topic> deleteTopic(@PathVariable String id){
        for (int i = 0; i < topics.size(); i++) {
            if(topics.get(i).getId().equals(id)){
                topics.remove(i);
            }
        }
        return topics;
    }

}
