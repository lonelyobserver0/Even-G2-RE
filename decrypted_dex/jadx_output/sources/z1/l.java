package z1;

import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class l {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f23850f = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f23851a;

    /* renamed from: b, reason: collision with root package name */
    public int f23852b;

    /* renamed from: c, reason: collision with root package name */
    public int f23853c;

    /* renamed from: d, reason: collision with root package name */
    public int f23854d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f23855e;

    public final void a(int i3, int i10, byte[] bArr) {
        if (this.f23851a) {
            int i11 = i10 - i3;
            byte[] bArr2 = this.f23855e;
            int length = bArr2.length;
            int i12 = this.f23853c + i11;
            if (length < i12) {
                this.f23855e = Arrays.copyOf(bArr2, i12 * 2);
            }
            System.arraycopy(bArr, i3, this.f23855e, this.f23853c, i11);
            this.f23853c += i11;
        }
    }
}
