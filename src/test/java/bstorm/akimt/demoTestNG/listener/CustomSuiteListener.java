package bstorm.akimt.demoTestNG.listener;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class CustomSuiteListener implements ISuiteListener {

    @Override
    public void onStart(ISuite suite) {

        System.out.println("----------------------------------------");
        System.out.println("La suite " + suite.getName() + " démarre");
        System.out.println("----------------------------------------");

    }

    @Override
    public void onFinish(ISuite suite) {

        System.out.println("----------------------------------------");
        System.out.println("La suite " + suite.getName() + " est terminée");
        System.out.println("----------------------------------------");
    }
}
