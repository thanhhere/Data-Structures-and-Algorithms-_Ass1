public class Student {
    private int  id;
    private String name;
    private double score;

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;

    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public String getRanking() {
        if (score < 5.0) return "Fail";
        if (score < 6.5) return "Average";
        if (score < 7.5) return "Good";
        if (score < 9.0) return "Very Good";
        return "Excellent";
    }
}
