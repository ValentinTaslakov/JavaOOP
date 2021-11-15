package Animals;

public abstract class Animal {
    private String name;
    private String favouriteFood;

    protected Animal (String name, String favouriteFood){
        this.setName(name);
        this.setFavoriteFood(favouriteFood);
    }

    private void setFavoriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    private void setName(String name) {
        this.name = name;
    }


    public String explainSelf(){
        return String.format("I am %s and my favourite food is %s%n"
                ,this.name, this.favouriteFood);
    }
}
