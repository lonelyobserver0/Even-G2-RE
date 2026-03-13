package com.google.protobuf;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f12081a;

    /* renamed from: b, reason: collision with root package name */
    public final O0 f12082b;

    public C(K k3, int i3, O0 o02, boolean z2, boolean z10) {
        this.f12081a = i3;
        this.f12082b = o02;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f12081a - ((C) obj).f12081a;
    }
}
