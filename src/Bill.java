public class Bill {

    int count;
    Thing thing;
    public Bill(Thing thing, int count)  {
        this.thing = thing;
        this.count = count;

    }
    public float getAllSumm()  {
        return thing.thingPrice * thing.discount / 100 * count;
    }





}
