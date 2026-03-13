package Ub;

import java.util.Arrays;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ub.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class AbstractC0346b {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0348d[] f7572a;

    /* renamed from: b, reason: collision with root package name */
    public int f7573b;

    /* renamed from: c, reason: collision with root package name */
    public int f7574c;

    /* renamed from: d, reason: collision with root package name */
    public B f7575d;

    public final AbstractC0348d b() {
        AbstractC0348d abstractC0348d;
        B b2;
        synchronized (this) {
            try {
                AbstractC0348d[] abstractC0348dArr = this.f7572a;
                if (abstractC0348dArr == null) {
                    abstractC0348dArr = d();
                    this.f7572a = abstractC0348dArr;
                } else if (this.f7573b >= abstractC0348dArr.length) {
                    Object[] copyOf = Arrays.copyOf(abstractC0348dArr, abstractC0348dArr.length * 2);
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                    this.f7572a = (AbstractC0348d[]) copyOf;
                    abstractC0348dArr = (AbstractC0348d[]) copyOf;
                }
                int i3 = this.f7574c;
                do {
                    abstractC0348d = abstractC0348dArr[i3];
                    if (abstractC0348d == null) {
                        abstractC0348d = c();
                        abstractC0348dArr[i3] = abstractC0348d;
                    }
                    i3++;
                    if (i3 >= abstractC0348dArr.length) {
                        i3 = 0;
                    }
                    Intrinsics.checkNotNull(abstractC0348d, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!abstractC0348d.a(this));
                this.f7574c = i3;
                this.f7573b++;
                b2 = this.f7575d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (b2 != null) {
            b2.w(1);
        }
        return abstractC0348d;
    }

    public abstract AbstractC0348d c();

    public abstract AbstractC0348d[] d();

    public final void e(AbstractC0348d abstractC0348d) {
        B b2;
        int i3;
        Continuation[] b10;
        synchronized (this) {
            try {
                int i10 = this.f7573b - 1;
                this.f7573b = i10;
                b2 = this.f7575d;
                if (i10 == 0) {
                    this.f7574c = 0;
                }
                Intrinsics.checkNotNull(abstractC0348d, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b10 = abstractC0348d.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : b10) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m40constructorimpl(Unit.INSTANCE));
            }
        }
        if (b2 != null) {
            b2.w(-1);
        }
    }

    public final B f() {
        B b2;
        synchronized (this) {
            b2 = this.f7575d;
            if (b2 == null) {
                int i3 = this.f7573b;
                b2 = new B(1, IntCompanionObject.MAX_VALUE, 2);
                b2.o(Integer.valueOf(i3));
                this.f7575d = b2;
            }
        }
        return b2;
    }
}
