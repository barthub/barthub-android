
package com.barthub.data.network.model.bart.rte;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Xml {

    @SerializedName("@version")
    @Expose
    private String version;
    @SerializedName("@encoding")
    @Expose
    private String encoding;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

}
