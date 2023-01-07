package com.example.doesitwork.topics;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

    private ArrayList<Topic> topics = new ArrayList<>();

    public String Checkifworking(){
        System.out.println("Is this working");
        return "Working?";
    }

    public ArrayList<Topic> getTopics() {
        return topics;
    }

    public void addTopic(Topic topic){
        topics.add(topic);
    }

    public Topic show(String id){
        for (int index = 0; index < topics.size(); index++) {
            if(topics.get(index).getId().equals(id)){
                return topics.get(index);
            }
        }
        return null;
    }

    public ArrayList<Topic> updateTopic( Topic topic){
        String id=topic.getId();
        for (int i = 0; i < topics.size(); i++) {
            if(topics.get(i).getId().equals(id)){
                topics.set(i, topic);
            }
        }
        return topics;
    }

    public ArrayList<Topic> deleteTopic(String id){
        for (int i = 0; i < topics.size(); i++) {
            if(topics.get(i).getId().equals(id)){
                topics.remove(i);
            }
        }
        return topics;
    }
}
