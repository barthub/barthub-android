
package com.barthub.data.network.model.bart.rte;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RealTimeEstimate {

    @SerializedName("?xml")
    @Expose
    private Xml xml;
    @SerializedName("root")
    @Expose
    private Root root;

    public Xml getXml() {
        return xml;
    }

    public void setXml(Xml xml) {
        this.xml = xml;
    }

    public Root getRoot() {
        return root;
    }

    public void setRoot(Root root) {
        this.root = root;
    }

}
