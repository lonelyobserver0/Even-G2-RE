package Qb;

import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.Volatile;

/* renamed from: Qb.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0191e {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5859b = AtomicIntegerFieldUpdater.newUpdater(C0191e.class, StubApp.getString2(25500));

    /* renamed from: a, reason: collision with root package name */
    public final O[] f5860a;

    @Volatile
    private volatile int notCompletedCount;

    public C0191e(O[] oArr) {
        this.f5860a = oArr;
        this.notCompletedCount = oArr.length;
    }
}
