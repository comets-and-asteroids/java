package lab06;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Guild construct(){
        builder.buildManaGuild();
        builder.buildMetalGuild();
        return builder.getGuild();
    }
}
