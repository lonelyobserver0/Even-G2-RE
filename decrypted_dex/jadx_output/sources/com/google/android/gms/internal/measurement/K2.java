package com.google.android.gms.internal.measurement;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class K2 {

    /* renamed from: a, reason: collision with root package name */
    public final V1 f11301a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11302b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f11303c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11304d;

    public K2(V1 v12, String str, Object[] objArr) {
        this.f11301a = v12;
        this.f11302b = str;
        this.f11303c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f11304d = charAt;
            return;
        }
        int i3 = charAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 < 55296) {
                this.f11304d = i3 | (charAt2 << i10);
                return;
            } else {
                i3 |= (charAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            }
        }
    }

    public final int a() {
        int i3 = this.f11304d;
        if ((i3 & 1) != 0) {
            return 1;
        }
        return (i3 & 4) == 4 ? 3 : 2;
    }
}
