
package com.hcp.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WpWinPosition {

    @SerializedName("apPoint")
    @Expose
    public Integer apPoint;
    @SerializedName("ahHorPos")
    @Expose
    public Integer ahHorPos;
    @SerializedName("avVerPos")
    @Expose
    public Integer avVerPos;
    @SerializedName("rcRows")
    @Expose
    public Integer rcRows;
    @SerializedName("ccCols")
    @Expose
    public Integer ccCols;

}
