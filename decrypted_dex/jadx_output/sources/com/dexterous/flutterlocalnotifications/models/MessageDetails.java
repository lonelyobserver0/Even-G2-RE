package com.dexterous.flutterlocalnotifications.models;

import androidx.annotation.Keep;
import java.io.Serializable;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class MessageDetails implements Serializable {
    public String dataMimeType;
    public String dataUri;
    public PersonDetails person;
    public String text;
    public Long timestamp;

    public MessageDetails(String str, Long l9, PersonDetails personDetails, String str2, String str3) {
        this.text = str;
        this.timestamp = l9;
        this.person = personDetails;
        this.dataMimeType = str2;
        this.dataUri = str3;
    }
}
