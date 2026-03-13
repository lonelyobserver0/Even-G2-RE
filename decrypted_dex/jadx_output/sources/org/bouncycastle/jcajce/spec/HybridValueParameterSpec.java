package org.bouncycastle.jcajce.spec;

import com.stub.StubApp;
import java.security.spec.AlgorithmParameterSpec;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.security.auth.Destroyable;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class HybridValueParameterSpec implements AlgorithmParameterSpec, Destroyable {
    private volatile AlgorithmParameterSpec baseSpec;
    private final AtomicBoolean hasBeenDestroyed = new AtomicBoolean(false);

    /* renamed from: t, reason: collision with root package name */
    private volatile byte[] f19145t;

    public HybridValueParameterSpec(byte[] bArr, AlgorithmParameterSpec algorithmParameterSpec) {
        this.f19145t = bArr;
        this.baseSpec = algorithmParameterSpec;
    }

    private void checkDestroyed() {
        if (isDestroyed()) {
            throw new IllegalStateException(StubApp.getString2(32443));
        }
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        if (this.hasBeenDestroyed.getAndSet(true)) {
            return;
        }
        Arrays.clear(this.f19145t);
        this.f19145t = null;
        this.baseSpec = null;
    }

    public AlgorithmParameterSpec getBaseParameterSpec() {
        checkDestroyed();
        return this.baseSpec;
    }

    public byte[] getT() {
        checkDestroyed();
        return this.f19145t;
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return this.hasBeenDestroyed.get();
    }
}
