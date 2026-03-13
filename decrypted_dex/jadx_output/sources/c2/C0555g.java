package c2;

import android.content.Context;
import d2.InterfaceC0798a;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* renamed from: c2.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0555g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C0555g f10796a = new C0555g();

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f10797b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0549a f10798c;

    static {
        Reflection.getOrCreateKotlinClass(InterfaceC0556h.class).getSimpleName();
        f10797b = LazyKt.lazy(C0554f.f10795a);
        f10798c = C0549a.f10778a;
    }

    public static C0550b a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        InterfaceC0798a interfaceC0798a = (InterfaceC0798a) f10797b.getValue();
        if (interfaceC0798a == null) {
            f2.k kVar = f2.k.f13730c;
            Intrinsics.checkNotNullParameter(context, "context");
            if (f2.k.f13730c == null) {
                ReentrantLock reentrantLock = f2.k.f13731d;
                reentrantLock.lock();
                try {
                    if (f2.k.f13730c == null) {
                        Intrinsics.checkNotNullParameter(context, "context");
                        f2.i iVar = null;
                        try {
                            Z1.i b2 = f2.h.b();
                            if (b2 != null) {
                                Z1.i other = Z1.i.f8964f;
                                Intrinsics.checkNotNullParameter(other, "other");
                                Object value = b2.f8969e.getValue();
                                Intrinsics.checkNotNullExpressionValue(value, "<get-bigInteger>(...)");
                                Object value2 = other.f8969e.getValue();
                                Intrinsics.checkNotNullExpressionValue(value2, "<get-bigInteger>(...)");
                                if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                    f2.i iVar2 = new f2.i(context);
                                    if (iVar2.e()) {
                                        iVar = iVar2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        f2.k.f13730c = new f2.k(iVar);
                    }
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            interfaceC0798a = f2.k.f13730c;
            Intrinsics.checkNotNull(interfaceC0798a);
        }
        C0563o c0563o = C0563o.f10811b;
        C0550b tracker = new C0550b(interfaceC0798a);
        f10798c.getClass();
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return tracker;
    }
}
