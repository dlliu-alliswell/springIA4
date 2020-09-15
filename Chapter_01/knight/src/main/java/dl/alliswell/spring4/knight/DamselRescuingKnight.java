package dl.alliswell.spring4.knight;

public class DamselRescuingKnight implements Knight{

    private RescueDamselQuest request;

    public DamselRescuingKnight() {
        this.request = new RescueDamselQuest();
    }

    @Override
    public void embarkOnQuest() {
        request.embark();
    }
}
