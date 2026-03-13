package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.x2, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0703x2 extends AbstractC0621h {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11766c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0703x2(String str, int i3) {
        super(str);
        this.f11766c = i3;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0621h
    public final InterfaceC0651n e(p2.h hVar, List list) {
        switch (this.f11766c) {
            case 0:
                return InterfaceC0651n.f11619U;
            case 1:
            case 2:
                return this;
            case 3:
                return new C0616g(Double.valueOf(0.0d));
            default:
                return InterfaceC0651n.f11619U;
        }
    }
}
