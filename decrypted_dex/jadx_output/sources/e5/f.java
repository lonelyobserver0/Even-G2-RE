package e5;

import i5.C1059c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class f implements k {

    /* renamed from: c, reason: collision with root package name */
    public static final c7.f f13613c = new c7.f(2);

    /* renamed from: a, reason: collision with root package name */
    public final Object f13614a;

    /* renamed from: b, reason: collision with root package name */
    public Object f13615b;

    public f(C1059c c1059c) {
        this.f13614a = c1059c;
        this.f13615b = f13613c;
    }

    @Override // e5.k
    public void a(j jVar, int i3) {
        int[] iArr = (int[]) this.f13615b;
        try {
            jVar.read((byte[]) this.f13614a, iArr[0], i3);
            iArr[0] = iArr[0] + i3;
        } finally {
            jVar.close();
        }
    }

    public f(byte[] bArr, int[] iArr) {
        this.f13614a = bArr;
        this.f13615b = iArr;
    }
}
