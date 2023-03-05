package lk.manytomany.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Subject {
    @Id
    private String sId;
    private  String name;

    @ManyToMany
    private List<Lecturer> lecturerList=new ArrayList<>();


    public Subject() {
    }

    public Subject(String sId, String name, List<Lecturer> lecturerList) {
        this.sId = sId;
        this.name = name;
        this.lecturerList = lecturerList;
    }


    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Lecturer> getLecturerList() {
        return lecturerList;
    }

    public void setLecturerList(List<Lecturer> lecturerList) {
        this.lecturerList = lecturerList;
    }


    @Override
    public String toString() {
        return "Subject{" +
                "sId='" + sId + '\'' +
                ", name='" + name + '\'' +
                ", lecturerList=" + lecturerList +
                '}';
    }
}
