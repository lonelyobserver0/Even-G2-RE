package Tb;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: Tb.l, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0331l extends Lambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0331l f7370a = new C0331l(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.areEqual(obj, obj2));
    }
}
