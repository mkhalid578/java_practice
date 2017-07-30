class Game {
    private String answer;
    private String misses;
    private String hits;
    public Game(String answer) {
	this.answer = answer;
	hits = "";
	misses = "";
    }

    public boolean applyGuess(char letter) {
	boolean isHit = answer.indexOf(letter) != -1;
	if (isHit) {
	    hits += letter;
	} else {
	    misses += letter;
	}

	return isHit;
    }
}