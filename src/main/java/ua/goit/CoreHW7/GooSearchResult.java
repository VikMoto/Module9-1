package ua.goit.CoreHW7;

import java.net.MalformedURLException;
import java.net.URL;

class GooSearchResult {

    private String url;
    public String getUrl() {
        return url;
    }


    public GooSearchResult(String url) {
        this.url = url;
    }
    public String parseDomain() {
        String result = "";
        try {
            URL urlTemp = new URL(url);
            result = new String(urlTemp.getHost());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    return result;
    }

}

class GooSearchResultTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());
    }
}