package lab06;

public class Guild {
    public String manaGuild;
    public String metalGuild;

    public void setManaGuild(String manaGuild) {
        this.manaGuild = manaGuild;
    }

    public void setMetalGuild(String metalGuild) {
        this.metalGuild = metalGuild;
    }
    public void show(){
        System.out.println("Guilds were builded: " + manaGuild + ", " + metalGuild);
    }

}
