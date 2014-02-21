package nln.neo4j.test;

public class Relationship {
	public static final String OUT = "out";
	public static final String IN = "in";
	public static final String BOTH = "both";
	
	private String type;
	private String direction;
	
	public Relationship(String type, String direction) {
		setType(type);
		setDirection(direction);
	}

	public Relationship(String type) {
		this(type, null);
	}

	public String toJsonCollection() {
		StringBuilder sb = new StringBuilder();
		sb.append("{ ");
		sb.append(" \"type\" : \"" + type + "\"");
		if (direction != null) {
			sb.append(", \"direction\" : \"" + direction + "\"");
		}
		sb.append(" }");
		return sb.toString();
	}
	
	private void setDirection(String direction2) {
		this.direction = direction2;
	}

	private void setType(String type2) {
		this.type = type2;
	} 
}
