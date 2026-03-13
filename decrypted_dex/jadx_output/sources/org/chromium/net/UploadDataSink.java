package org.chromium.net;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class UploadDataSink {
    public abstract void onReadError(Exception exc);

    public abstract void onReadSucceeded(boolean z2);

    public abstract void onRewindError(Exception exc);

    public abstract void onRewindSucceeded();
}
