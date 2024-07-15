package addondemos.chartdemos;

import com.webforj.App;
import com.webforj.annotation.InlineStyleSheet;
import com.webforj.component.googlecharts.GoogleChart;
import com.webforj.component.window.Frame;
import com.webforj.exceptions.WebforjException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@InlineStyleSheet(/*css*/ """
    .window {
      display: flex;
      flex-direction: column;
      align-items: center;
    }
    """)
public class ChartDemoSettingData extends App {

  GoogleChart chart = new GoogleChart(GoogleChart.Type.PIE);

  @Override
  public void run() throws WebforjException {

    Frame window = new Frame();
    window.addClassName("window");

    chart.setStyle("width", "100vh");

    List<Object> data = new ArrayList<>();
    data.add(List.of("Region", "Sales"));
    data.add(List.of("North America", 500));
    data.add(List.of("Europe", 300));
    data.add(List.of("Asia", 200));
    data.add(List.of("Latin America", 100));
    data.add(List.of("Middle East", 80));
    data.add(List.of("Africa", 60));
    chart.setData(data);

    Map<String, Object> options = new HashMap<>();
    options.put("title", "Sales Distribution by Region");
    options.put("is3D", "true");
    options.put(
        "colors",
        List.of("#BBDEFB", "#64B5F6", "#1E88E5", "#0D47A1", "#1565C0", "#82B1FF")
    );

    chart.setOptions(options);
    window.add(chart);
  }
}
