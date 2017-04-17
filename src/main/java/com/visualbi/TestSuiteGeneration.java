package com.visualbi;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import java.io.*;
import java.util.Arrays;
import java.util.List;

/**
 * Created by praveenn on 1/12/2017.
 */
public class TestSuiteGeneration {

    public static void main(String[] args){

        VelocityContext vc = new VelocityContext();



        List<String> charts = Arrays.asList(new String[]{ "AreaChart", "LineChart",  "PolarChart", "StackedColumnBarChart", "ColumnBarDrilldownChart", "ColumnBarChart", "ColumnBarChartNew", "StackedAreaChart",  "AngularGauge", "CombinationChart", "GroupStackedColumnBarChart", "SolidGauge", "DonutChart", "SemicircledonutChart", "FunnelPyramidDrilldownChart", "FunnelPyramidChart", "PieChart", "PieDrilldownChart", "WaterfallChart", "BulletChart", "SuperCombinationChart", "FixedColumnChart", "HeatMapChart", "DualAxesChart", "ScatterChart", "MultipleAxesChart", "BubbleChart", "ChartContainer", "BoxPlotChart", "MarimekkoChart", "RadarChart", "TreeMap", "TreeMapDrilldown"});      // List<String> charts = Arrays.asList(new String[]{"LineChart"});
        // List<String> charts = Arrays.asList(new String[]{"LineChart"});
        Template template = Velocity.getTemplate("src/main/code-templates/TestSuiteTemplate.vm");
      vc.put("components",charts);

        BufferedWriter writer =
                null;
        try {
            File file=new File("src/main/resources/TestSuite.xml");
            file.createNewFile();
            writer = new BufferedWriter(new FileWriter(file));
            template.merge(vc, writer);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
