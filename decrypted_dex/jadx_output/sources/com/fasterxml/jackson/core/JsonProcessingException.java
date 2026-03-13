package com.fasterxml.jackson.core;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class JsonProcessingException extends JacksonException {
    protected JsonLocation _location;

    public JsonProcessingException(String str, JsonLocation jsonLocation, Throwable th) {
        super(str, th);
        this._location = jsonLocation;
    }

    @Override // com.fasterxml.jackson.core.JacksonException
    public JsonLocation getLocation() {
        return this._location;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = StubApp.getString2(10289);
        }
        JsonLocation location = getLocation();
        String messageSuffix = getMessageSuffix();
        if (location == null && messageSuffix == null) {
            return message;
        }
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append(message);
        if (messageSuffix != null) {
            sb2.append(messageSuffix);
        }
        if (location != null) {
            sb2.append(StubApp.getString2(10290));
            sb2.append(location.toString());
        }
        return sb2.toString();
    }

    public String getMessageSuffix() {
        return null;
    }

    @Override // com.fasterxml.jackson.core.JacksonException
    public String getOriginalMessage() {
        return super.getMessage();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getClass().getName() + StubApp.getString2(994) + getMessage();
    }

    public JsonProcessingException(String str) {
        super(str);
    }

    public JsonProcessingException(String str, JsonLocation jsonLocation) {
        this(str, jsonLocation, null);
    }
}
