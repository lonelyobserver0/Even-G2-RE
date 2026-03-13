package com.mapbox.navigator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum HistoryRecordType {
    UPDATE_LOCATION,
    GET_STATUS,
    SET_ROUTE,
    PUSH_HISTORY;

    private int getValue() {
        return ordinal();
    }
}
