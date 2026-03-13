package no.nordicsemi.android.dfu.internal.exception;

import com.stub.StubApp;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RemoteDfuException extends Exception {
    private static final long serialVersionUID = -6901728550661937942L;
    private final int mState;

    public RemoteDfuException(String str, int i3) {
        super(str);
        this.mState = i3;
    }

    public int getErrorNumber() {
        return this.mState;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.getMessage());
        sb2.append(StubApp.getString2(26679));
        return AbstractC1482f.f(this.mState, StubApp.getString2(74), sb2);
    }
}
