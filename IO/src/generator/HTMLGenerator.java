package generator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HTMLGenerator {

    private String headTitle;
    private String heading;
    private String fileName;

    public HTMLGenerator(String headTitle, String bodyText, String fileName) {
        this.headTitle = headTitle;
        this.heading = bodyText;
        this.fileName = fileName;
    }

    public String getHeadTitle() {
        return headTitle;
    }

    public void setHeadTitle(String headTitle) {
        this.headTitle = headTitle;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public void generateHTML(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(this.fileName + ".html"));
            writer.write("<html>");
            writer.write("\n    <head>");
            writer.write("\n        <title>" + this.headTitle + "</title>");
            writer.write("\n    </head>");
            writer.write("\n    <body>");
            writer.write("\n        <h1>" + this.heading + "</h1>");
            writer.write("\n    </body>");
            writer.write("\n</html>");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
