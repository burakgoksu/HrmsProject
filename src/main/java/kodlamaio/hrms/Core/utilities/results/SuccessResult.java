package kodlamaio.hrms.Core.utilities.results;

public class SuccessResult extends Result{

    public SuccessResult(){
        super(true,null);
    }

    public SuccessResult(String message){
        super(true, message);
    }
}