package com.google.protobuf;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0732i0 f12223a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12224b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f12225c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12226d;

    public t0(InterfaceC0732i0 interfaceC0732i0, String str, Object[] objArr) {
        this.f12223a = interfaceC0732i0;
        this.f12224b = str;
        this.f12225c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f12226d = charAt;
            return;
        }
        int i3 = charAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 < 55296) {
                this.f12226d = i3 | (charAt2 << i10);
                return;
            } else {
                i3 |= (charAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            }
        }
    }

    public final int a() {
        int i3 = this.f12226d;
        if ((i3 & 1) != 0) {
            return 1;
        }
        return (i3 & 4) == 4 ? 3 : 2;
    }
}
