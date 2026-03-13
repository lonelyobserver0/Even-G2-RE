package Vb;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.ranges.RangesKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class t {
    private volatile AtomicReferenceArray<Object> array;

    public t(int i3) {
        this.array = new AtomicReferenceArray<>(i3);
    }

    public final int a() {
        return this.array.length();
    }

    public final Object b(int i3) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i3 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i3);
        }
        return null;
    }

    public final void c(int i3, Xb.a aVar) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i3 < length) {
            atomicReferenceArray.set(i3, aVar);
            return;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(RangesKt.coerceAtLeast(i3 + 1, length * 2));
        for (int i10 = 0; i10 < length; i10++) {
            atomicReferenceArray2.set(i10, atomicReferenceArray.get(i10));
        }
        atomicReferenceArray2.set(i3, aVar);
        this.array = atomicReferenceArray2;
    }
}
