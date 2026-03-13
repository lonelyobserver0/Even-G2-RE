package Qb;

import com.stub.StubApp;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Qb.s, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0218s {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5887a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0199i f5888b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f5889c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5890d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f5891e;

    public C0218s(Object obj, AbstractC0199i abstractC0199i, Function1 function1, Object obj2, Throwable th) {
        this.f5887a = obj;
        this.f5888b = abstractC0199i;
        this.f5889c = function1;
        this.f5890d = obj2;
        this.f5891e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0218s a(C0218s c0218s, AbstractC0199i abstractC0199i, CancellationException cancellationException, int i3) {
        Object obj = c0218s.f5887a;
        if ((i3 & 2) != 0) {
            abstractC0199i = c0218s.f5888b;
        }
        AbstractC0199i abstractC0199i2 = abstractC0199i;
        Function1 function1 = c0218s.f5889c;
        Object obj2 = c0218s.f5890d;
        CancellationException cancellationException2 = cancellationException;
        if ((i3 & 16) != 0) {
            cancellationException2 = c0218s.f5891e;
        }
        c0218s.getClass();
        return new C0218s(obj, abstractC0199i2, function1, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0218s)) {
            return false;
        }
        C0218s c0218s = (C0218s) obj;
        return Intrinsics.areEqual(this.f5887a, c0218s.f5887a) && Intrinsics.areEqual(this.f5888b, c0218s.f5888b) && Intrinsics.areEqual(this.f5889c, c0218s.f5889c) && Intrinsics.areEqual(this.f5890d, c0218s.f5890d) && Intrinsics.areEqual(this.f5891e, c0218s.f5891e);
    }

    public final int hashCode() {
        Object obj = this.f5887a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AbstractC0199i abstractC0199i = this.f5888b;
        int hashCode2 = (hashCode + (abstractC0199i == null ? 0 : abstractC0199i.hashCode())) * 31;
        Function1 function1 = this.f5889c;
        int hashCode3 = (hashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Object obj2 = this.f5890d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f5891e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return StubApp.getString2(25528) + this.f5887a + StubApp.getString2(25529) + this.f5888b + StubApp.getString2(25530) + this.f5889c + StubApp.getString2(25531) + this.f5890d + StubApp.getString2(25532) + this.f5891e + ')';
    }

    public /* synthetic */ C0218s(Object obj, AbstractC0199i abstractC0199i, Function1 function1, CancellationException cancellationException, int i3) {
        this(obj, (i3 & 2) != 0 ? null : abstractC0199i, (i3 & 4) != 0 ? null : function1, (Object) null, (i3 & 16) != 0 ? null : cancellationException);
    }
}
