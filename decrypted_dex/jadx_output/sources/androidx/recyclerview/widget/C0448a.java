package androidx.recyclerview.widget;

import p0.AbstractC1482f;

/* renamed from: androidx.recyclerview.widget.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0448a {

    /* renamed from: a, reason: collision with root package name */
    public int f10100a;

    /* renamed from: b, reason: collision with root package name */
    public int f10101b;

    /* renamed from: c, reason: collision with root package name */
    public int f10102c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C0448a.class != obj.getClass()) {
                return false;
            }
            C0448a c0448a = (C0448a) obj;
            int i3 = this.f10100a;
            if (i3 != c0448a.f10100a) {
                return false;
            }
            if (i3 != 8 || Math.abs(this.f10102c - this.f10101b) != 1 || this.f10102c != c0448a.f10101b || this.f10101b != c0448a.f10102c) {
                return this.f10102c == c0448a.f10102c && this.f10101b == c0448a.f10101b;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f10100a * 31) + this.f10101b) * 31) + this.f10102c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[");
        int i3 = this.f10100a;
        sb2.append(i3 != 1 ? i3 != 2 ? i3 != 4 ? i3 != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb2.append(",s:");
        sb2.append(this.f10101b);
        sb2.append("c:");
        return AbstractC1482f.f(this.f10102c, ",p:null]", sb2);
    }
}
