package behavioral.chainOfResponsibility;

/**
 * Created by Administrator on 2017\10\15 0015.
 */
public class ConcreteHandle2 extends Handle {
    @Override
    public void handleRequest(int request) {
        if(request < 20){
            System.out.println("concrete_handle_2 handle the request!");
        }else if(successor != null){
            successor.handleRequest(request);
        }
    }
}
