package com.AshvFinance.practice.courseapidata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;
        @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
            return topicService.getAllTopics();
//        Topic t1 = new Topic(100,"Spring","spring Frame work");
//        Topic t2 = new Topic(101,"Java","Java Programming");
//        Topic t3 = new Topic(102,"SpringBoot","springBoot Frame work");
//        Topic t4 =new Topic();
//        List<Topic> topiclist = new ArrayList<>();
//        topiclist.add(t1);
//        topiclist.add(t2);
//        topiclist.add(t3);
//        topiclist.add(t4);
//        return Arrays.asList( new Topic(100,"Spring","spring Frame work"),
//                new Topic(101,"Java","Java Programming"),
//                new Topic(102,"SpringBoot","springBoot Frame work"));
    }

    @RequestMapping("topics/{id}")
    public Topic getTopic(@PathVariable String id){
            return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST,value="/topics")
    public void addTopic(@RequestBody Topic topic){
            topicService.addTopic(topic);
    }


    @RequestMapping(method = RequestMethod.PUT,value="/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String  id) {
        topicService.updateTopic(topic, id);

    }

    @RequestMapping(method = RequestMethod.DELETE,value="/topics/{id}")
    public void deleteTopic(@PathVariable String  id) {
        topicService.deleteTopic(id);

    }

}
