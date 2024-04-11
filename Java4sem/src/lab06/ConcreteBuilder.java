package lab06;

public class ConcreteBuilder implements Builder{
    private Guild guild = new Guild();

    @Override
    public void buildManaGuild() {
        guild.setManaGuild("mana guild");
    }

    @Override
    public void buildMetalGuild() {
        guild.setMetalGuild("metal guild");
    }

    @Override
    public Guild getGuild() {
        return guild;
    }
}
