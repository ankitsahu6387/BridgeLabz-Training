class Movie {
    String name;
    double rating;
    int year;
    Movie(String name, double rating, int year){
        this.name = name;
        this.rating = rating;
        this.year = year;
    }
    @Override
    public String toString(){
        return name + " | rating: " + rating + " | Year: " + year;
    }
}
