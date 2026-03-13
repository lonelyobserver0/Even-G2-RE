package Lc;

import Kc.B;
import com.stub.StubApp;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class j extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f4423a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f4424b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f4425c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f4426d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(B b2, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3) {
        super(2);
        this.f4423a = b2;
        this.f4424b = objectRef;
        this.f4425c = objectRef2;
        this.f4426d = objectRef3;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r12v12, types: [T, java.lang.Long] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        if (intValue == 21589) {
            String string2 = StubApp.getString2(25398);
            if (longValue < 1) {
                throw new IOException(string2);
            }
            byte readByte = this.f4423a.readByte();
            boolean z2 = (readByte & 1) == 1;
            boolean z10 = (readByte & 2) == 2;
            boolean z11 = (readByte & 4) == 4;
            long j = z2 ? 5L : 1L;
            if (z10) {
                j += 4;
            }
            if (z11) {
                j += 4;
            }
            if (longValue < j) {
                throw new IOException(string2);
            }
            if (z2) {
                this.f4424b.element = Long.valueOf(r2.k() * 1000);
            }
            if (z10) {
                this.f4425c.element = Long.valueOf(r2.k() * 1000);
            }
            if (z11) {
                this.f4426d.element = Long.valueOf(r2.k() * 1000);
            }
        }
        return Unit.INSTANCE;
    }
}
