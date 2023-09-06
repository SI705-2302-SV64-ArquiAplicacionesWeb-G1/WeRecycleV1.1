package pe.edu.upc.aww.werecycle.serviceinterfaces;

import pe.edu.upc.aww.werecycle.entities.Notification;

import java.util.List;

public interface IUNotificationService {
    public void insert(Notification notification);
    public List<Notification>list();
    public void delete(int idNotification);
}
