package prueba;

public class Actor {
	private String first_name;
	private String last_name;
	private int actor_id;

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getActor_id() {
		return actor_id;
	}

	public void setActor_id(int actor_id) {
		this.actor_id = actor_id;
	}

	@Override
	public String toString() {
		return "Actor [first_name=" + first_name + ", last_name=" + last_name + ", actor_id=" + actor_id + "]";
	}

}
