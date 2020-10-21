
package com.hcp.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Seg {

    @SerializedName("utf8")
    @Expose
    public String utf8;
    @SerializedName("tOffsetMs")
    @Expose
    public Integer tOffsetMs;
    @SerializedName("acAsrConf")
    @Expose
    public Integer acAsrConf;

}
