
package oopfınal4;


public class MasterStudent extends Student implements ConferenceScoreBehaviour {

    protected int numberofConference;

    public MasterStudent(int id, int mid, int fin, int nConference) {
        super(id, mid, fin);
        this.numberofConference=nConference;
    }

    @Override
    float computeTotalScore() {
       return super.computeBaseScore()+this.conferenceScore();
    }

    @Override
    public float conferenceScore() {
        return 5*this.numberofConference;
    }
    
}
