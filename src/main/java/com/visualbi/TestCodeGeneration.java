package com.visualbi;

import com.visualbi.automation.VBIConfig;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import java.io.*;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by praveenn on 1/12/2017.
 */
public class TestCodeGeneration {

    public static void main(String[] args){

        VelocityContext vc = new VelocityContext();



        List<String> charts = Arrays.asList(new String[]{ "AreaChart", "LineChart",  "PolarChart", "StackedColumnBarChart", "ColumnBarDrilldownChart", "ColumnBarChart", "ColumnBarChartNew", "StackedAreaChart",  "AngularGauge", "CombinationChart", "GroupStackedColumnBarChart", "SolidGauge", "DonutChart", "SemicircledonutChart", "FunnelPyramidDrilldownChart", "FunnelPyramidChart", "PieChart", "PieDrilldownChart", "WaterfallChart", "BulletChart", "SuperCombinationChart", "FixedColumnChart", "HeatMapChart", "DualAxesChart", "ScatterChart", "MultipleAxesChart", "BubbleChart", "BoxPlotChart", "MarimekkoChart", "RadarChart", "TreeMap", "TreeMapDrilldown"});      // List<String> charts = Arrays.asList(new String[]{"LineChart"});
       // List<String> charts = Arrays.asList(new String[]{"LineChart","BoxPlotChart"});
        String[] excludeDatalabel=new String[]{"BoxPlotChart","BubbleChart","TreeMap","TreeMapDrilldown"};
        String[] excludeLegend=new String[]{"WaterfallChart","HeatMapChart","TreeMapDrilldown","TreeMap","SolidGauge","BulletChart","BoxPlotChart","AngularGauge"};
        String[] excludeLegendSymbolStyle={"BubbleChart","HeatMapChart","LineChart","ScatterChart"};
        String[] excludeTooltip={"MultipleAxesChart","DualAxesChart","SolidGauge","AngularGauge"};
        //String[] excludeOnSelect={"PieDrilldownChart","FunnelPyramidDrilldownChart","SolidGauge","AngularGauge","ColumnBarDrilldownChart","TreeMapDrilldown"};
        String[] excludeOnSelect={"SolidGauge","AngularGauge"};
        String[] excludeOnAxisClick={"PieDrilldownChart","FunnelPyramidDrilldownChart","SolidGauge","AngularGauge","PieChart","FunnelChart","SemicircledonutChart","FunnelPyramidChart","DonutChart","TreeMapDrilldown","TreeMap","ScatterChart"};
        String[] excludeXAxis={"PieDrilldownChart","FunnelPyramidDrilldownChart","SolidGauge","AngularGauge","PieChart","FunnelChart","SemicircledonutChart","FunnelPyramidChart","DonutChart","TreeMapDrilldown","TreeMap","ColumnBarDrilldownChart"};
        String[] excludeYAxis={"PieDrilldownChart","FunnelPyramidDrilldownChart","SolidGauge","AngularGauge","PieChart","FunnelChart","SemicircledonutChart","FunnelPyramidChart","DonutChart","TreeMapDrilldown","TreeMap","MultipleAxesChart"};
        String[] excludeYAxisStyle={"RadarChart"};
        String[] excludeYAxisGridAndTick={"RadarChart","PolarChart","GroupStackedColumnBarChart"};
        String[] excludeXAxisGridAndTick={"RadarChart","PolarChart","GroupStackedColumnBarChart"};
        String[] excludeYAxisMinimum={"RadarChart","PolarChart"};
        String[] excludeXAxisMinimumMaximum={"RadarChart","PolarChart","HeatMapChart","ScatterChart","BubbleChart","MarimekkoChart"};
        String[] excludeXAxisCeilingFloor={"ScatterChart","BubbleChart","MarimekkoChart"};
        String[] excludeYAxisCeilingFloor={"ScatterChart","BubbleChart"};
        String[] excludeXAxisPlotBand={"HeatMapChart","ScatterChart","BubbleChart"};
        String[] excludeXAxisPlotLine={"HeatMapChart","ScatterChart","BubbleChart"};
        String[] includeXAxisBubblePlot={"ScatterChart","BubbleChart"};
        Template template = Velocity.getTemplate("src/main/code-templates/FluentTestTemplate.vm");
          charts.forEach(chart->{
            vc.put("Component",chart);
            vc.put("excludeDatalabel",excludeDatalabel);
            vc.put("excludeLegend",excludeLegend);
            vc.put("excludeLegendSymbolStyle",excludeLegendSymbolStyle);
            vc.put("excludeTooltip",excludeTooltip);
            vc.put("excludeOnSelect",excludeOnSelect);
            vc.put("excludeOnAxisClick",excludeOnAxisClick);
            vc.put("excludeXAxis",excludeXAxis);
            vc.put("excludeYAxis",excludeYAxis);
            vc.put("excludeYAxisStyle",excludeYAxisStyle);
            vc.put("excludeYAxisGridAndTick",excludeYAxisGridAndTick);
            vc.put("excludeXAxisGridAndTick",excludeXAxisGridAndTick);
            vc.put("excludeYAxisMinimum",excludeYAxisMinimum);
            vc.put("excludeXAxisMinimumMaximum",excludeXAxisMinimumMaximum);
            vc.put("excludeXAxisCeilingFloor",excludeXAxisCeilingFloor);
            vc.put("excludeYAxisCeilingFloor",excludeYAxisCeilingFloor);
            vc.put("excludeXAxisPlotBand",excludeXAxisPlotBand);
            vc.put("excludeXAxisPlotLine",excludeXAxisPlotLine);
            vc.put("includeXAxisBubblePlot",includeXAxisBubblePlot);
            vc.put("date",new Date());


            BufferedWriter writer = null;
            try {
                File file=new File(VBIConfig.WORKING_DIR+"\\src\\test\\java\\com\\visualbi\\automation\\"+chart+"Test.java");
                file.createNewFile();
                writer = new BufferedWriter(new FileWriter(file));
                template.merge(vc, writer);
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        });


    }

}
