package designpatterns;

import java.util.*;
interface Observer { void update(String news); }
class NewsAgency {
    List<Observer> observers=new ArrayList<>();
    void add(Observer o){ observers.add(o); }
    void notifyObservers(String news){
        for(Observer o:observers) o.update(news);
    }
}
class Subscriber implements Observer {
    public void update(String news){ System.out.println(news); }
}
public class ObserverExample {
    public static void main(String[] args){
        NewsAgency agency=new NewsAgency();
        agency.add(new Subscriber());
        agency.notifyObservers("Breaking News!");
    }
}
