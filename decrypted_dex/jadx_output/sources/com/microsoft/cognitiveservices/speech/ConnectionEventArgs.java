package com.microsoft.cognitiveservices.speech;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class ConnectionEventArgs extends SessionEventArgs {
    public ConnectionEventArgs(long j) {
        super(j);
        storeEventData(false);
    }

    private void storeEventData(boolean z2) {
        if (z2) {
            super.close();
        }
    }

    public ConnectionEventArgs(long j, boolean z2) {
        super(j);
        storeEventData(z2);
    }
}
