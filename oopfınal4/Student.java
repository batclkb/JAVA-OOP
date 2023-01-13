
package oopfınal4;

public abstract class Student {
    private int id;
    private int mid;
    private int fin;
    
    Student(int id,int mid,int fin){
        this.id=id;
        this.mid=mid;
        this.fin=fin;
    }
    abstract float computeTotalScore();
    public float computeBaseScore(){
        return 0.4f*mid+0.6f*fin;
    }
    
    @Override
    public String toString(){
        return "id : "+this.id+"  Total Score: "+this.computeTotalScore();
    }
}
