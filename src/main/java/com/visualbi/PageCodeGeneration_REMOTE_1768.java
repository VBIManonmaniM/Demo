package com.visualbi;

import com.visualbi.automation.VBIConfig;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import java.io.*;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by praveenn on 1/12/2017.
 */
public class PageCodeGeneration {

    public static void main(String[] args){

        VelocityContext vc = new VelocityContext();

        List<String> charts = Arrays.asList(new String[]{ "AreaChart", "LineChart", "ProgressBar", "PolarChart", "StackedColumnBarChart", "ColumnBarDrilldownChart", "ColumnBarChart", "ColumnBarChartNew", "StackedAreaChart", "NumberCounter", "CircularCounter", "AngularGauge", "CombinationChart", "GroupStackedColumnBarChart", "SolidGauge", "DonutChart", "SemicircledonutChart", "FunnelPyramidDrilldownChart", "FunnelPyramidChart", "PieChart", "PieDrilldownChart", "WaterfallChart", "BulletChart", "SuperCombinationChart", "FixedColumnChart", "HeatMapChart", "DualAxesChart", "SparkLineChart", "ScatterChart", "MultipleAxesChart", "BubbleChart", "SparkLineTableChart", "ChartSelector", "ChartContainer", "BoxPlotChart", "MarimekkoChart", "RadarChart", "WaffleChart", "TreeMap", "TreeMapDrilldown", "CalendarHeatmap", "TagCloud"});      // List<String> charts = Arrays.asList(new String[]{"LineChart"});
        Template template = Velocity.getTemplate("src/main/code-templates/FluentPageTemplate.vm");
        StringWriter sw = new StringWriter();
        charts.forEach(chart->{
            vc.put("Component",chart);
            vc.put("date",new Date());


            BufferedWriter writer =
                    null;
            try {
                File file=new File(VBIConfig.WORKING_DIR+"\\src\\main\\java\\com\\visualbi\\automation\\pages\\"+chart+"Page.java");
                file.createNewFile();
				//file.delteNewFile();
                writer = new BufferedWriter(new FileWriter(file));
                template.merge(vc, writer);
                writer.flush();
				//writer.flushEnd();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
				//System.out.println(e);
				//Svafe
            }


        });


    }

}
