package AdapterDP.Adapter;
import AdapterDP.Adaptee.IWeightInPound;

public class AdapterConcrete implements IAdapter {
    IWeightInPound wtInPound;
    public AdapterConcrete(IWeightInPound wtInPound){
        this.wtInPound = wtInPound;
    }
    /**
     * @return
     */
    @Override
    public double getWtInKgs() {
        double poundWt = wtInPound.getWtInPounds();
        double wtInKgs = poundWt*0.45;
        return wtInKgs;
    }
}
