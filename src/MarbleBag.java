public class MarbleBag {
    public Integer numRedMarbles;
    public Integer numGreenMarbles;
    public Integer numBlueMarbles;


    public MarbleBag(Integer numRedMarbles, Integer numGreenMarbles, Integer numBlueMarbles) {
        this.numRedMarbles = numRedMarbles;
        this.numGreenMarbles = numGreenMarbles;
        this.numBlueMarbles = numBlueMarbles;
    }

    public Integer getTotalNumberOfMarbles(){
        //returns the total
        return numRedMarbles + numBlueMarbles + numGreenMarbles;
    }
    public void printInfo(){
        //prints each variable and returns total of each
        System.out.println("Red: " + numRedMarbles);
        System.out.println("Green: " + numGreenMarbles);
        System.out.println("Blue: " + numBlueMarbles);
        System.out.println("Total: " + getTotalNumberOfMarbles());

    }
    public void removeAllRedMarbles(){
        numRedMarbles = 0;
    }
    public void removeAllGreenMarbles(){
        numGreenMarbles = 0;
    }
    public void removeAllBlueMarbles(){
        numBlueMarbles = 0;
    }
}
