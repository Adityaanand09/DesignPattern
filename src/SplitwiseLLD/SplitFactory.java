package SplitwiseLLD;

public class SplitFactory {
    EqualSplit equalSplit =null;
    UnequalSplit unequalSplit =null;
    PercentageSplit percentageSplit =null;
    public ExpenseSplit getSplitObj(Type t){
        if(t.equals(Type.EQUAL)){
            if(equalSplit == null){
                equalSplit = new EqualSplit();
            }
            return equalSplit;
        }else if(t.equals(Type.UNEQUAL)){
            if(unequalSplit == null){
                unequalSplit = new UnequalSplit();
            }
            return unequalSplit;
        }else{
            if(percentageSplit == null){
                percentageSplit = new PercentageSplit();
            }
            return percentageSplit;
        }
    }
}
