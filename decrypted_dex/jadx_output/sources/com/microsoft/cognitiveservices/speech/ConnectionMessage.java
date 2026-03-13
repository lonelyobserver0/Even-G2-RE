package com.microsoft.cognitiveservices.speech;

import com.mapbox.common.b;
import com.microsoft.cognitiveservices.speech.util.Contracts;
import com.microsoft.cognitiveservices.speech.util.IntRef;
import com.microsoft.cognitiveservices.speech.util.SafeHandle;
import com.microsoft.cognitiveservices.speech.util.SafeHandleType;
import com.stub.StubApp;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class ConnectionMessage implements AutoCloseable {
    private byte[] binaryMessage = null;
    private SafeHandle messageHandle;
    private PropertyCollection properties;

    public ConnectionMessage(long j) {
        this.messageHandle = null;
        this.properties = null;
        Contracts.throwIfNull(j, StubApp.getString2(15687));
        this.messageHandle = new SafeHandle(j, SafeHandleType.ConnectionMessage);
        IntRef intRef = new IntRef(0L);
        this.properties = b.c(getPropertyBag(this.messageHandle, intRef), intRef);
    }

    private final native byte[] getMessageData(SafeHandle safeHandle, IntRef intRef);

    private final native long getPropertyBag(SafeHandle safeHandle, IntRef intRef);

    @Override // java.lang.AutoCloseable
    public void close() {
        SafeHandle safeHandle = this.messageHandle;
        if (safeHandle != null) {
            safeHandle.close();
            this.messageHandle = null;
        }
        PropertyCollection propertyCollection = this.properties;
        if (propertyCollection != null) {
            propertyCollection.close();
            this.properties = null;
        }
        this.binaryMessage = null;
    }

    public byte[] getBinaryMessage() {
        Contracts.throwIfNull(this.messageHandle, StubApp.getString2(15688));
        if (this.binaryMessage == null) {
            IntRef intRef = new IntRef(0L);
            this.binaryMessage = getMessageData(this.messageHandle, intRef);
            Contracts.throwIfFail(intRef.getValue());
        }
        return this.binaryMessage;
    }

    public String getPath() {
        Contracts.throwIfNull(this.messageHandle, StubApp.getString2(15688));
        return this.properties.getProperty(StubApp.getString2(15689));
    }

    public PropertyCollection getProperties() {
        Contracts.throwIfNull(this.messageHandle, StubApp.getString2(15688));
        return this.properties;
    }

    public String getTextMessage() {
        Contracts.throwIfNull(this.messageHandle, StubApp.getString2(15688));
        return this.properties.getProperty(StubApp.getString2(15690));
    }

    public boolean isBinaryMessage() {
        Contracts.throwIfNull(this.messageHandle, StubApp.getString2(15688));
        return this.properties.getProperty(StubApp.getString2(15691)).equals(StubApp.getString2(15692));
    }

    public boolean isTextMessage() {
        Contracts.throwIfNull(this.messageHandle, StubApp.getString2(15688));
        return this.properties.getProperty(StubApp.getString2(15691)).equals(StubApp.getString2(613));
    }

    public String toString() {
        Contracts.throwIfNull(this.messageHandle, StubApp.getString2(15688));
        boolean isTextMessage = isTextMessage();
        String string2 = StubApp.getString2(15693);
        if (isTextMessage) {
            return string2 + getPath() + StubApp.getString2(15694) + getTextMessage();
        }
        if (!isBinaryMessage()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(string2);
        sb2.append(getPath());
        sb2.append(StubApp.getString2(15695));
        return AbstractC1482f.f(getBinaryMessage() == null ? 0 : getBinaryMessage().length, StubApp.getString2(693), sb2);
    }
}
