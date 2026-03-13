package com.microsoft.cognitiveservices.speech.dialog;

import com.microsoft.cognitiveservices.speech.PropertyId;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class CustomCommandsConfig extends DialogServiceConfig {
    private static final native long fromAuthorizationToken(IntRef intRef, String str, String str2, String str3);

    public static CustomCommandsConfig fromAuthorizationToken(String str, String str2, String str3) {
        Contracts.throwIfNull(str, StubApp.getString2(2633));
        Contracts.throwIfNullOrWhitespace(str2, StubApp.getString2(15908));
        Contracts.throwIfNullOrWhitespace(str3, StubApp.getString2(2051));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(fromAuthorizationToken(intRef, str, str2, str3));
        return new CustomCommandsConfig(intRef.getValue());
    }

    private static final native long fromSubscription(IntRef intRef, String str, String str2, String str3);

    public static CustomCommandsConfig fromSubscription(String str, String str2, String str3) {
        Contracts.throwIfNull(str, StubApp.getString2(2633));
        Contracts.throwIfNull(str2, StubApp.getString2(16031));
        Contracts.throwIfNull(str3, StubApp.getString2(2051));
        IntRef intRef = new IntRef(0L);
        Contracts.throwIfFail(fromSubscription(intRef, str, str2, str3));
        return new CustomCommandsConfig(intRef.getValue());
    }

    public String getApplicationId() {
        return getProperty(PropertyId.Conversation_ApplicationId);
    }

    public void setApplicationId(String str) {
        setProperty(PropertyId.Conversation_ApplicationId, str);
    }
}
