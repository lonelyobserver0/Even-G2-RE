package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.measurement.u, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0685u implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0621h f11664a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p2.h f11665b;

    public C0685u(AbstractC0621h abstractC0621h, p2.h hVar) {
        this.f11664a = abstractC0621h;
        this.f11665b = hVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        InterfaceC0651n interfaceC0651n = (InterfaceC0651n) obj;
        InterfaceC0651n interfaceC0651n2 = (InterfaceC0651n) obj2;
        if (interfaceC0651n instanceof r) {
            return !(interfaceC0651n2 instanceof r) ? 1 : 0;
        }
        if (interfaceC0651n2 instanceof r) {
            return -1;
        }
        AbstractC0621h abstractC0621h = this.f11664a;
        return abstractC0621h == null ? interfaceC0651n.b().compareTo(interfaceC0651n2.b()) : (int) a4.f.X(abstractC0621h.e(this.f11665b, Arrays.asList(interfaceC0651n, interfaceC0651n2)).d().doubleValue());
    }
}
