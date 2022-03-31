package baseballGame;

public class User implements Comparable<User> {
	private String id;
	private int score;

	protected String getId() {
		return id;
	}

	protected void setId(String id) {
		this.id = id;
	}

	protected int getScore() {
		return score;
	}

	protected void setScore(int score) {
		this.score = score;
	}

	// 점수 내림차순 정렬
	@Override
	public int compareTo(User o) {
		if (score > o.getScore()) {
			return 1;
		} else if (score < o.getScore()) {
			return -1;
		}
		return 0;
	}

}
