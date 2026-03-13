package e6;

import J1.s;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h extends s {

    /* renamed from: c, reason: collision with root package name */
    public final String f13640c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13641d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f13642e;

    public h(int i3, String str) {
        super(i3, 3);
        this.f13640c = str;
        this.f13642e = false;
        this.f13641d = 0;
    }

    public h(int i3, int i10, String str) {
        super(i3, 3);
        this.f13642e = true;
        this.f13641d = i10;
        this.f13640c = str;
    }
}
