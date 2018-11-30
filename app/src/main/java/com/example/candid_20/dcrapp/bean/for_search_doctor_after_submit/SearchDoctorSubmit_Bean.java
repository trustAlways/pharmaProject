package com.example.candid_20.dcrapp.bean.for_search_doctor_after_submit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SearchDoctorSubmit_Bean {
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("status_code")
    @Expose
    private Integer statusCode;
    @SerializedName("result")
    @Expose
    private List<SearchDoctorSubmit_LxDetails_Bean> result = null;
    @SerializedName("message")
    @Expose
    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public List<SearchDoctorSubmit_LxDetails_Bean> getResult() {
        return result;
    }

    public void setResult(List<SearchDoctorSubmit_LxDetails_Bean> result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
