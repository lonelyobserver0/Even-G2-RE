package Kc;

import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public static final C f3783a = new C(new byte[0], 0, 0, false, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f3784b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f3785c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f3784b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i3 = 0; i3 < highestOneBit; i3++) {
            atomicReferenceArr[i3] = new AtomicReference();
        }
        f3785c = atomicReferenceArr;
    }

    public static final void a(C segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (segment.f3781f != null || segment.f3782g != null) {
            throw new IllegalArgumentException(StubApp.getString2(353));
        }
        if (segment.f3779d) {
            return;
        }
        AtomicReference atomicReference = f3785c[(int) (Thread.currentThread().getId() & (f3784b - 1))];
        C c10 = f3783a;
        C c11 = (C) atomicReference.getAndSet(c10);
        if (c11 == c10) {
            return;
        }
        int i3 = c11 != null ? c11.f3778c : 0;
        if (i3 >= 65536) {
            atomicReference.set(c11);
            return;
        }
        segment.f3781f = c11;
        segment.f3777b = 0;
        segment.f3778c = i3 + 8192;
        atomicReference.set(segment);
    }

    public static final C b() {
        AtomicReference atomicReference = f3785c[(int) (Thread.currentThread().getId() & (f3784b - 1))];
        C c10 = f3783a;
        C c11 = (C) atomicReference.getAndSet(c10);
        if (c11 == c10) {
            return new C();
        }
        if (c11 == null) {
            atomicReference.set(null);
            return new C();
        }
        atomicReference.set(c11.f3781f);
        c11.f3781f = null;
        c11.f3778c = 0;
        return c11;
    }
}
