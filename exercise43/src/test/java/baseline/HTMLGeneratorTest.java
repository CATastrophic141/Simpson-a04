package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class HTMLGeneratorTest {

    @Test
    //Test if the base website folder is created
    void testWebFolderCreation() {
        //Setup directory/file creation
        //BeforeEach Fails to carry over class instance objects
        String name = "TestWebsite";
        String author = "TestName";
        String java = "Y";
        String css = "n";
        HTMLGenerator htmlG = new HTMLGenerator(name, author, java, css);

        File testWeb = new File ("./data/website/TestWebsite");
        htmlG.generateSiteData();
        htmlG.writeToSite();
        htmlG.manageDirectoryGeneration();

        assertTrue(testWeb.isDirectory());
    }

    @Test
    //Test if the html file is created
    void testHTMLFileCreation() {
        String name = "TestWebsite";
        String author = "TestName";
        String java = "Y";
        String css = "n";
        HTMLGenerator htmlG = new HTMLGenerator(name, author, java, css);

        File testFile = new File ("./data/website/TestWebsite/index.html");
        htmlG.generateSiteData();
        htmlG.writeToSite();
        htmlG.manageDirectoryGeneration();

        assertTrue(testFile.isFile());
    }

    @Test
    //Test if the js folder is created
    void testJSFolderCreation() {
        String name = "TestWebsite";
        String author = "TestName";
        String java = "Y";
        String css = "n";
        HTMLGenerator htmlG = new HTMLGenerator(name, author, java, css);

        File testJS = new File ("./data/website/TestWebsite/js");
        htmlG.generateSiteData();
        htmlG.writeToSite();
        htmlG.manageDirectoryGeneration();

        assertTrue(testJS.isDirectory());
    }

    @Test
    //Test if the css file is not created
    void testCSSFolderNotCreated() {
        String name = "TestWebsite";
        String author = "TestName";
        String java = "Y";
        String css = "n";
        HTMLGenerator htmlG = new HTMLGenerator(name, author, java, css);

        File testCSS = new File ("./data/website/TestWebsite/css");
        htmlG.generateSiteData();
        htmlG.writeToSite();
        htmlG.manageDirectoryGeneration();

        assertFalse(testCSS.isDirectory());
    }
}