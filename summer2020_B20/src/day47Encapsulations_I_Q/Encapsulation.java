package day47Encapsulations_I_Q;

public class Encapsulation {

    private long ssn = 1234567;


    public long getSsn(){ // to read ONLY
        return ssn;
    }

    public void setSsn(long ssn){
        this.ssn = ssn;
    }



}
