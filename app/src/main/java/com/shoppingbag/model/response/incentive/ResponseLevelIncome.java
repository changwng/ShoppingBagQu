package com.shoppingbag.model.response.incentive;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseLevelIncome {

    @SerializedName("listLevelIncomeDetails")
    private List<ListLevelIncomeDetailsItem> listLevelIncomeDetails;

    @SerializedName("response")
    private String response;

    @SerializedName("amountTotal")
    private String amountTotal;

    @SerializedName("businessAmountTotal")
    private String businessAmountTotal;

    public List<ListLevelIncomeDetailsItem> getListLevelIncomeDetails() {
        return listLevelIncomeDetails;
    }

    public void setListLevelIncomeDetails(List<ListLevelIncomeDetailsItem> listLevelIncomeDetails) {
        this.listLevelIncomeDetails = listLevelIncomeDetails;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getAmountTotal() {
        return amountTotal;
    }

    public String getBusinessAmountTotal() {
        return businessAmountTotal;
    }
}