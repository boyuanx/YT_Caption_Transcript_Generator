
package com.hcp.json;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Event {

    @SerializedName("tStartMs")
    @Expose
    public Integer tStartMs;
    @SerializedName("dDurationMs")
    @Expose
    public Integer dDurationMs;
    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("wpWinPosId")
    @Expose
    public Integer wpWinPosId;
    @SerializedName("wsWinStyleId")
    @Expose
    public Integer wsWinStyleId;
    @SerializedName("wWinId")
    @Expose
    public Integer wWinId;
    @SerializedName("segs")
    @Expose
    public List<Seg> segs = null;
    @SerializedName("aAppend")
    @Expose
    public Integer aAppend;

}
