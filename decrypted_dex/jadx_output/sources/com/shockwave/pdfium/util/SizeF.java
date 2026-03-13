package com.shockwave.pdfium.util;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class SizeF {

    /* renamed from: a, reason: collision with root package name */
    public final float f12764a;

    /* renamed from: b, reason: collision with root package name */
    public final float f12765b;

    public SizeF(float f10, float f11) {
        this.f12764a = f10;
        this.f12765b = f11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof SizeF) {
            SizeF sizeF = (SizeF) obj;
            if (this.f12764a == sizeF.f12764a && this.f12765b == sizeF.f12765b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f12764a) ^ Float.floatToIntBits(this.f12765b);
    }

    public final String toString() {
        return this.f12764a + StubApp.getString2(925) + this.f12765b;
    }
}
