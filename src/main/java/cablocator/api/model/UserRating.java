package cablocator.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_rating")
public class UserRating implements Serializable {

	@Id
	@Column(name="id")
	int id;
	
	@Column(name="from_user")
	int fromUser;
	
	@Column(name="to_user")
	int toUser;
	
	@Column(name="rating")
	int rating;
	
	public UserRating(){
		
	}

	private int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFromUser() {
		return fromUser;
	}

	public void setFromUser(int fromUser) {
		this.fromUser = fromUser;
	}

	public int getToUser() {
		return toUser;
	}

	public void setToUser(int toUser) {
		this.toUser = toUser;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
