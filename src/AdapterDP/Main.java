package AdapterDP;

import AdapterDP.Adaptee.BabyWeights;
import AdapterDP.Adapter.AdapterConcrete;
import AdapterDP.Adapter.IAdapter;

public class Main {
    public static void main(String args[]){
        IAdapter adp=new AdapterConcrete(new BabyWeights());
        System.out.println(adp.getWtInKgs());
    }
}
