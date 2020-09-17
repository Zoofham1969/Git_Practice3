package day51_Exceptions.BrowserTask;

public class FireFoxBrowser extends WebDriver {

    public void get(String url){

        System.out.println("Opening the "+url+ "in fireFox browser");


    }

    public void close(){
        System.out.println("Closing the fireFox browser");
    }

}
