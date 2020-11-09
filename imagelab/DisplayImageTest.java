package imagelab;
import org.junit.Test;
import static org.junit.Assert.*;

public class DisplayImageTest {
   @Test
   public void constructorOneTitleShouldMatchParameter() {
      ImgProvider img = new ImgProvider();
      DisplayImage newImage = new DisplayImage(img,"Title Test");
      assertEquals("Title Test", newImage.getTitle());
   }
}
