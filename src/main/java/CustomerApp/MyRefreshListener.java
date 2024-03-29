package CustomerApp;

/**
 * Created with IntelliJ IDEA.
 * User: hakan
 * Date: 6/20/14
 * Time: 11:28 PM
 * To change this template use File | Settings | File Templates.
 */
import com.github.wolfie.refresher.Refresher;

public class MyRefreshListener implements Refresher.RefreshListener {
    private static final long serialVersionUID = 1L;
    CustomerApp customerApp;


    public MyRefreshListener(CustomerApp customerApp) {
        this.customerApp = customerApp;
    }

    public void refresh(final Refresher source) {
        try {
            customerApp.trayMessage() ;
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        // add the refresh page of your application logic here
        // e.g. the same code you use for changing views when a button click is happening
    }
}