
package com.example.retrofitrecylcer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Example {

    @SerializedName("tableData")
    @Expose
    private List<TableDatum> tableData = null;

    public List<TableDatum> getTableData() {
        return tableData;
    }

    public void setTableData(List<TableDatum> tableData) {
        this.tableData = tableData;
    }

}
