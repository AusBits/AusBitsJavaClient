package org.bitcoin.market.bean;


/**
 * Created by lichang on 14-2-26.
 */
@SuppressWarnings("serial")
public class Asset {
    private Long id;
    private Long appAccountId;
    private Market market;
    private Double availableBtc = 0.0;
    private Double frozenBtc = 0.0;
    private Double availableLtc = 0.0;
    private Double frozenLtc = 0.0;
    private Double availableUsd = 0.0;
    private Double frozenUsd = 0.0;
    private Double availableAud = 0.0;
    private Double frozenAud = 0.0;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public Double getAvailableBtc() {
        return availableBtc == null ? 0.0 : availableBtc;
    }

    public void setAvailableBtc(Double availableBtc) {
        this.availableBtc = availableBtc;
    }

    public Double getFrozenBtc() {
        return frozenBtc == null ? 0.0 : frozenBtc;
    }

    public void setFrozenBtc(Double frozenBtc) {
        this.frozenBtc = frozenBtc;
    }

    public Double getAvailableAud() {
        return availableAud;
    }

    public void setAvailableAud(Double availableAud) {
        this.availableAud = availableAud;
    }

    public Double getFrozenAud() {
        return frozenAud;
    }

    public void setFrozenAud(Double frozenAud) {
        this.frozenAud = frozenAud;
    }

    public Double getAvailableUsd() {
        return availableUsd;
    }

    public void setAvailableUsd(Double availableUsd) {
        this.availableUsd = availableUsd;
    }

    public Double getFrozenUsd() {
        return frozenUsd;
    }

    public void setFrozenUsd(Double frozenUsd) {
        this.frozenUsd = frozenUsd;
    }

    public Double getAvailableLtc() {
        return availableLtc == null ? 0.0 : availableLtc;
    }

    public void setAvailableLtc(Double availableLtc) {
        this.availableLtc = availableLtc;
    }

    public Double getFrozenLtc() {
        return frozenLtc == null ? 0.0 : frozenLtc;
    }

    public void setFrozenLtc(Double frozenLtc) {
        this.frozenLtc = frozenLtc;
    }

    public Long getAppAccountId() {
        return appAccountId;
    }

    public void setAppAccountId(Long appAccountId) {
        this.appAccountId = appAccountId;
    }


    @Override
    public String toString() {
        return "Asset{" +
                "id=" + id +
                ", appAccountId=" + appAccountId +
                ", market=" + market +
                ", availableBtc=" + availableBtc +
                ", frozenBtc=" + frozenBtc +
                ", availableLtc=" + availableLtc +
                ", frozenLtc=" + frozenLtc +
                ", availableUsd=" + availableUsd +
                ", frozenUsd=" + frozenUsd +
                ", availableAud=" + availableAud +
                ", frozenAud=" + frozenAud +
                '}';
    }
}
