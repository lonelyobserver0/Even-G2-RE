package com.shockwave.pdfium.util;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class Size {

    /* renamed from: a, reason: collision with root package name */
    public final int f12762a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12763b;

    public Size(int i3, int i10) {
        this.f12762a = i3;
        this.f12763b = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.f12762a == size.f12762a && this.f12763b == size.f12763b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = this.f12762a;
        return ((i3 >>> 16) | (i3 << 16)) ^ this.f12763b;
    }

    public final String toString() {
        return this.f12762a + StubApp.getString2(925) + this.f12763b;
    }
}
