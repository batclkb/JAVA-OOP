
package oopfınal4;


public class PhDStudent extends MasterStudent implements ArticleScoreBehaviour {
    
    int numberofArticles;
    public PhDStudent(int id, int mid, int fin, int nConference, int numberofArticles) {
        super(id, mid, fin, nConference);
        this.numberofArticles=numberofArticles;
    }

    
    @Override
    float computeTotalScore() {
       return super.computeTotalScore()+this.articleScore();
    }
    
    @Override
    public float articleScore() {
       return 8*this.numberofArticles;
    }
    
}
