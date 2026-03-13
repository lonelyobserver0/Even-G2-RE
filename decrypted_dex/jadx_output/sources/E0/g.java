package E0;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g implements n {

    /* renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f1748g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f1749h = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f1750a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f1751b;

    /* renamed from: c, reason: collision with root package name */
    public e f1752c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f1753d;

    /* renamed from: e, reason: collision with root package name */
    public final R4.b f1754e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1755f;

    public g(MediaCodec mediaCodec, HandlerThread handlerThread) {
        R4.b bVar = new R4.b(5);
        this.f1750a = mediaCodec;
        this.f1751b = handlerThread;
        this.f1754e = bVar;
        this.f1753d = new AtomicReference();
    }

    public static f e() {
        ArrayDeque arrayDeque = f1748g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new f();
                }
                return (f) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // E0.n
    public final void a(int i3, u0.b bVar, long j, int i10) {
        d();
        f e10 = e();
        e10.f1743a = i3;
        e10.f1744b = 0;
        e10.f1746d = j;
        e10.f1747e = i10;
        int i11 = bVar.f21390f;
        MediaCodec.CryptoInfo cryptoInfo = e10.f1745c;
        cryptoInfo.numSubSamples = i11;
        int[] iArr = bVar.f21388d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 == null || iArr2.length < iArr.length) {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = bVar.f21389e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 == null || iArr4.length < iArr3.length) {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            } else {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = bVar.f21386b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 == null || bArr2.length < bArr.length) {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = bVar.f21385a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 == null || bArr4.length < bArr3.length) {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            } else {
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = bVar.f21387c;
        if (AbstractC1560u.f20190a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(bVar.f21391g, bVar.f21392h));
        }
        this.f1752c.obtainMessage(2, e10).sendToTarget();
    }

    @Override // E0.n
    public final void b(Bundle bundle) {
        d();
        e eVar = this.f1752c;
        int i3 = AbstractC1560u.f20190a;
        eVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // E0.n
    public final void c(int i3, int i10, long j, int i11) {
        d();
        f e10 = e();
        e10.f1743a = i3;
        e10.f1744b = i10;
        e10.f1746d = j;
        e10.f1747e = i11;
        e eVar = this.f1752c;
        int i12 = AbstractC1560u.f20190a;
        eVar.obtainMessage(1, e10).sendToTarget();
    }

    @Override // E0.n
    public final void d() {
        RuntimeException runtimeException = (RuntimeException) this.f1753d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // E0.n
    public final void flush() {
        if (this.f1755f) {
            try {
                e eVar = this.f1752c;
                eVar.getClass();
                eVar.removeCallbacksAndMessages(null);
                R4.b bVar = this.f1754e;
                synchronized (bVar) {
                    bVar.f6177b = false;
                }
                e eVar2 = this.f1752c;
                eVar2.getClass();
                eVar2.obtainMessage(3).sendToTarget();
                synchronized (bVar) {
                    while (!bVar.f6177b) {
                        bVar.wait();
                    }
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // E0.n
    public final void shutdown() {
        if (this.f1755f) {
            flush();
            this.f1751b.quit();
        }
        this.f1755f = false;
    }

    @Override // E0.n
    public final void start() {
        if (this.f1755f) {
            return;
        }
        HandlerThread handlerThread = this.f1751b;
        handlerThread.start();
        this.f1752c = new e(this, handlerThread.getLooper(), 0);
        this.f1755f = true;
    }
}
