package com.AshvFinance.practice.courseapidata;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;
//    public List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic(100,"Spring","spring Frame work"),
//            new Topic(101,"Java","Java Programming"),
//            new Topic(102,"SpringBoot","springBoot Frame work")
//           ));
    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        for (Topic topic : topicRepository.findAll()) {
            topics.add(topic);
        }

        return topics;
    }

//    public void getTopic(String id){
//        return;
//
//        //return topics.stream().filter(t-> t.getId()==id).findFirst().get();
//    }

    public void addTopic(Topic topic){

        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic,String id) {
//        for(int i=0;i< topics.size();i++){
//            Topic t= topics.get(i);
//            if(t.getId()==id) {
//                topics.set(i, topic);
//                return;
//            }
//
//
//        }
        topicRepository.save(topic);

    }

    public void deleteTopic(String id) {

//        topics.removeIf(t->t.getId()==id);
        topicRepository.deleteById(id);

    }

    public Topic getTopic(String id) {
        Optional<Topic> one = topicRepository.findById(id);
        return one.get();
    }


}
