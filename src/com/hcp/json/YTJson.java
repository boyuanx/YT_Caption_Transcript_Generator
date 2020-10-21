
package com.hcp.json;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class YTJson {

    @SerializedName("wireMagic")
    @Expose
    public String wireMagic;
    @SerializedName("pens")
    @Expose
    public List<Pen> pens = null;
    @SerializedName("wsWinStyles")
    @Expose
    public List<WsWinStyle> wsWinStyles = null;
    @SerializedName("wpWinPositions")
    @Expose
    public List<WpWinPosition> wpWinPositions = null;
    @SerializedName("events")
    @Expose
    public List<Event> events = null;

}
