
package com.hcp.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WsWinStyle {

    @SerializedName("mhModeHint")
    @Expose
    public Integer mhModeHint;
    @SerializedName("juJustifCode")
    @Expose
    public Integer juJustifCode;
    @SerializedName("sdScrollDir")
    @Expose
    public Integer sdScrollDir;

}
