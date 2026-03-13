package no.nordicsemi.android.dfu.internal.exception;

import com.stub.StubApp;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RemoteDfuExtendedErrorException extends RemoteDfuException {
    private static final long serialVersionUID = -6901728550661937942L;
    private final int mError;

    public RemoteDfuExtendedErrorException(String str, int i3) {
        super(str, 11);
        this.mError = i3;
    }

    public int getExtendedErrorNumber() {
        return this.mError;
    }

    @Override // no.nordicsemi.android.dfu.internal.exception.RemoteDfuException, java.lang.Throwable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.getMessage());
        sb2.append(StubApp.getString2(26680));
        return AbstractC1482f.f(this.mError, StubApp.getString2(74), sb2);
    }
}
