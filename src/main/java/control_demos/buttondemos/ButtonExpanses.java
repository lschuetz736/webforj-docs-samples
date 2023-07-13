package control_demos.buttondemos;

import org.dwcj.App;
import org.dwcj.annotation.InlineStyleSheet;
import org.dwcj.component.window.Frame;
import org.dwcj.component.window.Panel;
import org.dwcj.component.Expanse;
import org.dwcj.component.button.Button;
import org.dwcj.exceptions.DwcjException;

@InlineStyleSheet("context://css/buttonstyles/expanse_styles.css")
public class ButtonExpanses extends App {
  @Override
  public void run() throws DwcjException {
    Frame panel = new Frame();
    Panel container = new Panel().addClassName("container");
    panel.addClassName("Frame");

    Button be1 = new Button("XSMALL").setExpanse(Expanse.XSMALL);
    Button be2 = new Button("SMALL").setExpanse(Expanse.SMALL);
    Button be3 = new Button("MEDIUM").setExpanse(Expanse.MEDIUM);
    Button be4 = new Button("LARGE").setExpanse(Expanse.LARGE);
    Button be5 = new Button("XLARGE").setExpanse(Expanse.XLARGE);

    panel.add(container);
    container.add(be1, be2, be3, be4, be5);
  }
}
