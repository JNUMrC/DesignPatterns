package behavioral.chainOfResponsibility;

/**
 * Created by Administrator on 2017\10\15 0015.
 */
public class ConcreteHandle3 extends Handle {
    @Override
    public void handleRequest(int request) {
        if(request < 30){
            System.out.println("concrete_handle_3 handle the request!");
        }else if(successor != null){
            successor.handleRequest(request);
        }
    }
}
