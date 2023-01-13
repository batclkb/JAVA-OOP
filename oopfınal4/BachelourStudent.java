package oopfınal4;


public class BachelourStudent extends Student implements ProjectScoreBehaviour {

    
    public BachelourStudent(int id, int mid, int fin) {
        super(id, mid, fin);
    }

    @Override
    float computeTotalScore() {
        return super.computeBaseScore()+this.projectScore();
    }

    @Override
    public float projectScore() {
        return 20;
    }
    
}
