package lesson28.home;

import java.util.Date;

public class Capability implements Comparable<Capability>
{
private long id;
private String channelName;
private String fingerprint;
private boolean isActive;
private Date dateCreated;

public Capability(long id, String channelName, String fingerprint, boolean isActive, Date dateCreated) {
        this.id = id;
        this.channelName = channelName;
        this.fingerprint = fingerprint;
        this.isActive = isActive;
        this.dateCreated = dateCreated;
        }

public long getId() {
        return id;
        }

public String getChannelName() {
        return channelName;
        }

public String getFingerprint() {
        return fingerprint;
        }

public boolean isActive() {
        return isActive;
        }

public Date getDateCreated() {
        return dateCreated;
        }

public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
        }

@Override
public String toString() {
        return "Capability{" +
        "id=" + id +
        ", channelName='" + channelName + '\'' +
        ", fingerprint='" + fingerprint + '\'' +
        ", isActive=" + isActive +
        ", dateCreated=" + dateCreated +
        '}';
        }


@Override
public int compareTo(Capability capability){
        System.out.println("compareTo is used");
        return(int) (this.id - capability.id);
        }
}