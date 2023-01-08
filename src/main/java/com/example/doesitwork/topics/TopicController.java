package com.example.doesitwork.topics;
import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
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
public class TopicController {

    @Autowired
    private TopicService topicService;
    

    public ArrayList<Topic> topics = new ArrayList<>();

    @GetMapping("/")
    public ArrayList<Topic> getTopicsite(){
        return topicService.getTopics();
    }

    @PostMapping("/add")
    public void taketopic(@RequestBody Topic topic, HttpServletResponse response){

        topicService.addTopic(topic);
        try {
            response.sendRedirect("http://localhost:8080/topic/");
        } catch (IOException e) {
            e.printStackTrace();
        };
    }

    @GetMapping("/show/{id}")
    public Topic showtopic(@PathVariable String id){
        return topicService.show(id);
    }

    @PutMapping("/update")
    public ArrayList<Topic> updateTopics(@RequestBody Topic topic){
         topicService.updateTopic(topic);
         return topicService.getTopics();
    }

    @DeleteMapping("/delete/{id}")
    public ArrayList<Topic> deleteTopic(@PathVariable String id){
           topicService.deleteTopic(id);
           return topicService.getTopics();
    }

}
