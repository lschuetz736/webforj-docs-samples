package control_demos.comboboxdemos;

import java.util.HashMap;
import java.util.Map;
import org.dwcj.App;
import org.dwcj.annotation.InlineStyleSheet;
import org.dwcj.component.window.Frame;
import org.dwcj.component.window.Panel;
import org.dwcj.component.combobox.ComboBox;
import org.dwcj.exceptions.DwcjException;

@InlineStyleSheet("context://css/comboboxstyles/label_styles.css")
public class ComboboxLabelDemo extends App {
  @Override
  public void run() throws DwcjException {
    Frame panel = new Frame();
    panel.addClassName("Frame");

    ComboBox cb1 = new ComboBox();
    Panel container = new Panel().addClassName("container");
    panel.add(container);

    Map<Object, String> data = new HashMap<>();
    data.put("Random Data1", "Random Data");
    data.put("Random Data2", "Some Data");
    data.put("Random Data3", "More Data");
    data.put("Random Data4", "Test Data");

    container.add(cb1);

    cb1.setItems(data)
        .selectIndex(0)
        .setAttribute("label", "Example label");
  }
}
