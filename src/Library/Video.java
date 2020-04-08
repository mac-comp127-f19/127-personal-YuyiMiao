package Library;

public class Video implements Media{
    private String title;
    private String director;
    private int numOfCopy;
    private int total;
    public Video(String title, String director, int numOfCopy){
        this.title = title;
        this.director = director;
        this.numOfCopy = numOfCopy;
        this.total = numOfCopy;
    }

    @Override
    public String toString() {

        return this.title + " by " + this.director + "\nAvailable: " + numOfCopy;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public boolean checkOut() {
        if(numOfCopy > 0){
            numOfCopy --;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean checkIn() {
        if(numOfCopy < total){
            numOfCopy++;
            return true;
        }else{
            return false;
        }
    }



}
