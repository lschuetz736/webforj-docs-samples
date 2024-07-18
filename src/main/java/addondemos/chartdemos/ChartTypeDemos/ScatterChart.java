package addondemos.chartdemos.ChartTypeDemos;

import com.webforj.component.googlecharts.GoogleChart;
import java.util.List;
import java.util.Map;

public class ScatterChart {
  private final GoogleChart chart;

  public ScatterChart(Map<String, Object> data, Map<String, Object> options) {
    chart = new GoogleChart(GoogleChart.Type.SCATTER);
    chart.setOptions(options);
    chart.setData((List<Object>) data.get("data"));
  }

  public GoogleChart getChart() {
    return chart;
  }
}