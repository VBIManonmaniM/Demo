package com.visualbi.automation.constants;

/**
 * Created by praveenn on 1/12/2017.
 */
public final class Properties {

    public static class Title{
        public static final String ENABLE ="titleenable";
        public static final String TEXT ="titletext";
        public static final String FONTSIZE="titlefontsize";
        public static final String FONTFAMILY ="titlefontfamily";
        public static final String COLOR ="titlecolor";
        public static final String ALIGN ="titlealign";
        public static final String FONTWEIGHT ="titlefontweight";
    }

    public static class SubTitle{
        public static final String ENABLE ="subtitleenable";
        public static final String TEXT ="subtitletext";
        public static final String FONTSIZE="subtitlefontsize";
        public static final String FONTFAMILY ="subtitlefontfamily";
        public static final String COLOR ="subtitlecolor";
        public static final String ALIGN ="subtitlealign";
        public static final String FONTWEIGHT ="subtitlefontweight";
    }

    public static class GoogleFont{
        public static final String ENABLE ="globalfont";
        public static final String FONTFAMILY ="fontfamily";
    }

    public static class PlotOption{
        public static final String MARGINLEFT ="chartmarginleft";
        public static final String MARGINTOP ="chartmargintop";
        public static final String CHARTSHADOW ="chartshadow";
        public static final String PLOTSHADOW ="plotshadow";
    }

    public static class Background{
        public static final String COLOR ="chartbackgroundcolor";
    }

    public static class Border{
        public static final String COLOR ="chartbordercolor";
        public static final String RADIUS ="chartborderradius";
        public static final String WIDTH ="chartborderwidth";
    }

    public static class PlotArea{
        public static final String BORDERCOLOR ="plotbordercolor";
        public static final String BACKGROUNDCOLOR ="plotbackgroundcolor";
        public static final String BORDERWIDTH ="plotborderwidth";
    }

    public static class Datalabel {
        public static final String ENABLE ="datalabelenabled";
        public static final String FONTSIZE="datalabelfontsize";
        public static final String FONTFAMILY ="datalabelfontfamily";
        public static final String COLOR ="datalabeltextcolor";
        public static final String FONTWEIGHT ="datalabelfontweight";
    }
    public static class Credit{
        public static final String ENABLE ="creditsenabled";
        public static final String TEXT ="creditstext";
        public static final String ALIGN ="creditsalign";
        public static final String FONTSIZE="creditsfontsize";
        public static final String FONTFAMILY ="creditsfontfamily";
        public static final String COLOR ="creditstextcolor";
        public static final String FONTWEIGHT ="creditsfontweight";
        public static final String CURSOUR ="creditscursor";
    }

    public static class Legend {
        /* Legend properties */
        public static final String LEGEND_TITLE = "legendtitletext";
        public static final String LEGEND_COLOR ="legendtitlecolor";
        public static final String LEGEND_FONT_WEIGHT = "legendtitlefontweight";
        public static final String LEGEND_FONT_SIZE = "legendtitlefontsize";
        public static final String LEGEND_FONT_FAMILY = "legendtitlefontfamily";

        /*  Legend style Group */
        public static final String LEGEND_ITEM_COLOR = "legenditemstylecolor";
        public static final String LEGEND_ITEM_FONT_SIZE = "legenditemfontsize";
        public static final String LEGEND_ITEM_FONT_WEIGHT = "legenditemfontweight";
        public static final String LEGEND_ITEM_FONT_FAMILY = "legenditemfontfamily";
        public static final String LEGEND_BACKGROUNDCOLOR = "legendbackgroundcolor";

        public static final String LEGEND_BORDER_COLOR = "legendbordercolor";
        public static final String LEGEND_BORDER_RADIUS = "legendborderradius";
        public static final String LEGEND_BORDER_WIDTH = "legendborderwidth";
        public static final String LEGEND_SYMBOL_WIDTH = "legendsymbolwidth";
        public static final String LEGEND_SYMBOL_HEIGHT = "legendsymbolheight";
        public static final String LEGEND_SYMBOL_RADIUS = "legendsymbolradius";
        public static final String LEGEND_SYMBOL_PADDING = "legendsymbolpadding";
    }

    public static class Export {
        public static final String EXPORT_ICON_SYMBOL_FILL = "exportingsymbolfill";
        public static final String EXPORT_ICON_SYMBOL_STROKE = "exportingsymbolstroke";
        public static final String EXPORT_ICON_SYMBOL_STROKE_WIDTH = "exportingsymbolstrokewidth";

        public static final String EXPORT_BACKGROUND_RADIUS = "exportingsymbolradius";
        public static final String EXPORT_BACKGROUND_FILL = "exportingsymbolbackgroundfill";
        public static final String EXPORT_BACKGROUND_HOVER_FILL= "exportingsymbolhoverbackgroundfill";
        public static final String EXPORT_ENABLED = "exportingsymbolenabled";

        /* dropdown menu styles */
        public static final String EXPORT_MENU_BACKGROUND_COLOR = "exportingmenustylebackgroundcolor";
        public static final String EXPORT_MENU_TEXT_COLOR = "exportingmenuitemstyletextcolor";
        public static final String EXPORT_MENU_FONT_STYLE = "exportingmenuitemstylefontweight";
        public static final String EXPORT_MENU_TEXT_HOVER_COLOR = "exportingmenuitemhoverstyletextcolor";
        public static final String EXPORT_MENU_FONT_HOVER_STYLE = "exportingmenuitemhoverstylefontweight";
        public static final String EXPORT_MENU_HOVER_STYLE_BACKGROUND = "exportingmenuitemhoverstylebackgroundcolor";


    }

    public static class Tooltip {
        public static final String TOOLTIP_BACKGROUND_COLOR = "tooltipbackgroundcolor";
        public static final String TOOLTIP_BORDER_COLOR = "tooltipbordercolor";
        public static final String TOOLTIP_BORDER_RADIUS = "tooltipborderradius";
        public static final String TOOLTIP_BORDER_WIDTH = "tooltipborderwidth";
        public static final String TOOLTIP_TEXT_COLOR = "tooltipcolor";
        public static final String TOOLTIP_FONT_WEIGHT = "tooltipfontweight";
        public static final String TOOLTIP_FONT_SIZE = "tooltipfontsize";
        public static final String TOOLTIP_FONT_FAMILY = "tooltipfontfamily";

        public static final String TOOLTIP_DECIMAL_VALUE = "tooltipvaluedecimals";
        public static final String TOOLTIP_VALUE_PREFIX = "tooltipvalueprefix";
        public static final String TOOLTIP_VALUE_SUFFIX = "tooltipvaluesuffix";
    }

    public static class Event{
        public static final String ON_SELECT ="chartonpointclick";
        public static final String ON_AXIS_CLICK ="chartaxisclick";
        public static final String ON_CHART_LOAD ="chartafterload";
        public static final String ON_CLICK_EVENT ="onclickevent";
    }
    public static class NumberFormat{
        public static final String NO_OF_DECIMAL ="decimal";
        public static final String PREFIX ="datalabelprefix";
        public static final String SUFFIX ="datalabelsuffix";
        public static final String THOUSANDS_SEPARATOR ="progressthousandseparator";
        public static final String THOUSANDS_SEPARATOR2 ="bulletthousandseparator";
        public static final String DECIMAL_SEPARATOR ="progressdecimalseparator";
        public static final String DECIMAL_SEPARATOR2 ="bulletdecimalseparator";

    }
    public static class XAxis{
        public static final String CEILING ="xaxisceiling";
        public static final String FLOOR ="xaxisfloor";
        public static final String REVERSED ="xaxisreversed";
        public static final String MINIMUM ="xaxismin";
        public static final String MAXIMUM ="xaxismax";
        public static final String ON_TOP ="xaxisopposite";
        public static final String LINE_COLOR ="xaxislinecolor";
        public static final String LINE_WIDTH ="xaxislinewidth";
        public static final String ALTERNATIVE_GRID_COLOR ="xaxisalternategridcolor";
        public static final String PREFIX ="xaxislabelprefix";
        public static final String SUFFIX ="xaxislabelsuffix";
        public static final String ALIGN ="xaxislabelalign";
        public static final String FONTSIZE="xaxislabelfontsize";
        public static final String FONTFAMILY ="xaxislabelfontfamily";
        public static final String COLOR ="xaxislabelcolor";
        public static final String FONTWEIGHT ="xaxislabelfontweight";
        public static final String ROTATION ="xaxislabelrotation";
        public static final String ENABLE ="xaxislabelenabled";
        public static final String SHOW_FIST_LABEL ="xaxisshowfirstlabel";
        public static final String SHOW_LAST_LABEL ="xaxisshowlastlabel";

    }
    public static class YAxis{
        public static final String ALLOW_DECIMALS ="yaxisallowdecimals";
        public static final String CEILING ="yaxisceiling";
        public static final String FLOOR ="yaxisfloor";
        public static final String REVERSED ="yaxisreversed";
        public static final String MINIMUM ="yaxismin";
        public static final String MAXIMUM ="yaxismax";
        public static final String AXIS_OPPOSITE ="yaxisopposite";
        public static final String LINE_COLOR ="yaxislinecolor";
        public static final String LINE_WIDTH ="yaxislinewidth";
        public static final String ALTERNATIVE_GRID_COLOR ="yaxisalternategridcolor";
        public static final String PREFIX ="yaxislabelprefix";
        public static final String SUFFIX ="yaxislabelsuffix";
        public static final String ALIGN ="yaxislabelalign";
        public static final String FONTSIZE="yaxislabelfontsize";
        public static final String FONTFAMILY ="yaxislabelfontfamily";
        public static final String COLOR ="yaxislabelcolor";
        public static final String FONTWEIGHT ="yaxislabelfontweight";
        public static final String ROTATION ="yaxislabelrotation";
        public static final String ENABLE ="yaxislabelenabled";
        public static final String SHOW_FIST_LABEL ="yaxisshowfirstlabel";
        public static final String SHOW_LAST_LABEL ="yaxisshowlastlabel";

    }

    public static class XAxisTitle{

        public static final String TEXT ="xaxistitletext";
        public static final String ALIGN ="xaxistitlealign";
        public static final String FONTSIZE="xaxistitlefontsize";
        public static final String FONTFAMILY ="xaxistitlefontfamily";
        public static final String COLOR ="xaxistitlecolor";
        public static final String FONTWEIGHT ="xaxistitlefontweight";
        public static final String ROTATION ="xaxistitlerotation";
        public static final String ENABLE ="xaxistitleenabled";

    }

    public static class YAxisTitle{

        public static final String TEXT ="yaxistitletext";
        public static final String ALIGN ="yaxistitlealign";
        public static final String FONTSIZE="yaxistitlefontsize";
        public static final String FONTFAMILY ="yaxistitlefontfamily";
        public static final String COLOR ="yaxistitlecolor";
        public static final String FONTWEIGHT ="yaxistitlefontweight";
        public static final String ROTATION ="yaxistitlerotation";
        public static final String ENABLE ="yaxistitleenabled";

    }

    public static class XAxisPlotBand{
        public static final String FROM ="xaxisplotbandfrom";
        public static final String TO ="xaxisplotbandto";
        public static final String COLOR ="xaxisplotbandcolor";
        public static final String BORDER_WIDTH ="xaxisplotbandborderwidth";
        public static final String BORDER_COLOR ="xaxisplotbandbordercolor";
        public static final String ENABLE ="xaxisplotbandenabled";
    }

    public static class YAxisPlotBand{
        public static final String FROM ="yaxisplotbandfrom";
        public static final String TO ="yaxisplotbandto";
        public static final String COLOR ="yaxisplotbandcolor";
        public static final String BORDER_WIDTH ="yaxisplotbandborderwidth";
        public static final String BORDER_COLOR ="yaxisplotbandbordercolor";
        public static final String ENABLE ="yaxisplotbandenabled";
    }


    public static class XAxisPlotBandLabel {
        public static final String ENABLE ="xaxisplotbandlabelenabled";
        public static final String TEXT ="xaxisplotbandlabeltext";
        public static final String FONTSIZE="xaxisplotbandlabelfontsize";
        public static final String FONTFAMILY ="xaxisplotbandlabelfontfamily";
        public static final String COLOR ="xaxisplotbandlabelcolor";
        public static final String FONTWEIGHT ="xaxisplotbandlabelfontweight";
        public static final String ROTATION ="xaxisplotbandlabelrotation";

    }

    public static class YAxisPlotBandLabel {
        public static final String ENABLE ="yaxisplotbandlabelenabled";
        public static final String TEXT ="yaxisplotbandlabeltext";
        public static final String FONTSIZE="yaxisplotbandlabelfontsize";
        public static final String FONTFAMILY ="yaxisplotbandlabelfontfamily";
        public static final String COLOR ="yaxisplotbandlabelcolor";
        public static final String FONTWEIGHT ="yaxisplotbandlabelfontweight";
        public static final String ROTATION ="yaxisplotbandlabelrotation";

    }

    public static class XAxisPlotLine{
        public static final String ENABLE ="xaxisplotlineenabled";
        public static final String VALUE ="xaxisplotlinevalue";
        public static final String COLOR ="xaxisplotlinecolor";
        public static final String WIDTH ="xaxisplotlinewidth";
    }
    public static class YAxisPlotLine{
        public static final String ENABLE ="yaxisplotlineenabled";
        public static final String VALUE ="yaxisplotlinevalue";
        public static final String COLOR ="yaxisplotlinecolor";
        public static final String WIDTH ="yaxisplotlinewidth";
    }
    public static class XAxisPlotLineLabel{

        public static final String TEXT ="xaxisplotlinelabeltext";
        public static final String FONTSIZE="xaxisplotlinelabelfontsize";
        public static final String FONTFAMILY ="xaxisplotlinelabelfontfamily";
        public static final String COLOR ="xaxisplotlinelabelcolor";
        public static final String FONTWEIGHT ="xaxisplotlinelabelfontweight";
        public static final String ROTATION ="xaxisplotlinelabelrotation";
        public static final String ENABLE ="xaxisplotlinelabelenabled";


    }


    public static class YAxisPlotLineLabel{

        public static final String TEXT ="yaxisplotlinelabeltext";
        public static final String ALIGN ="yaxisplotlinelabelalign";
        public static final String FONTSIZE="yaxisplotlinelabelfontsize";
        public static final String FONTFAMILY ="yaxisplotlinelabelfontfamily";
        public static final String COLOR ="yaxisplotlinelabelcolor";
        public static final String FONTWEIGHT ="yaxisplotlinelabelfontweight";
        public static final String ROTATION ="yaxisplotlinelabelrotation";
        public static final String ENABLE ="yaxisplotlinelabelenabled";


    }

    public static class XAxisGridLine{
        public static final String COLOR ="xaxisgridlinecolor";
        public static final String WIDTH ="xaxisgridlinewidth";
    }

    public static class XAxisMajorTick{
        public static final String COLOR ="xaxistickcolor";
        public static final String WIDTH ="xaxistickwidth";
    }
    public static class YAxisGridLine{
        public static final String COLOR ="yaxisgridlinecolor";
        public static final String WIDTH ="yaxisgridlinewidth";
    }

    public static class YAxisMajorTick{
        public static final String COLOR ="yaxistickcolor";
        public static final String WIDTH ="yaxistickwidth";
    }
}
