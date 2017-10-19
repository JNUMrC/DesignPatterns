package behavioral.chainOfResponsibility;

/**
 * Created by Administrator on 2017\10\15 0015.
 */
public class ConcreteHandle1 extends Handle {
    @Override
    public void handleRequest(int request) {
        if(request < 10){
            System.out.println("concrete_handle_1 handle the request!");
        }else if(successor != null){
            successor.handleRequest(request);
        }
    }
}
