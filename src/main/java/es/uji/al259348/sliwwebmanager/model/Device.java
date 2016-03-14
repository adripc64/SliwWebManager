package es.uji.al259348.sliwwebmanager.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "sliw", type = "devices")
public class Device {

    @Id
    private String id;
    private String mac;
    private User user;

    public Device() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id='" + id + '\'' +
                ", mac='" + mac + '\'' +
                ", user=" + user +
                '}';
    }

}
