// Louis Kruysse 19-123-041
// Andreas Dobler 19-105-238
// P1 Übungsserie 7 Aufgabe 7-2

public class Man implements Comparable<Man> {
    private String name;
    private int height; //[cm]
    private int money; //[1000 Fr.-]
    private boolean straight;
    private int weight; //[kg]

    public Man(String name, int height, int money, boolean straight, int weight) {
        this.name = name;
        this.height = height;
        this.money = money;
        this.straight = straight;
        this.weight = weight;
    }

    // returns Attractiveness
    public int getAttractiveness() {
        int attractive = 0;
        if (height < 150) return -100;
        if (height < 180) return 0;
        if (!straight) attractive += 100;
        return (int) (attractive + (((long) money + 1) * height) / weight);
    }

    public int compareTo(Man other){
        return this.getAttractiveness() - other.getAttractiveness();
    }

    @Override
    public boolean equals(Object other){
        if (other instanceof Man){
            return this.getAttractiveness() == ((Man) other).getAttractiveness();
        }
        return false;
    }

    public String toString(){
        return "name: " + name + " Attractiveness: " + this.getAttractiveness();
    }


}