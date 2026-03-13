package va;

import kotlin.UByte;

/* renamed from: va.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1840a {

    /* renamed from: a, reason: collision with root package name */
    public int f21892a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f21893b = false;

    public C1840a(byte[] bArr) {
        this.f21892a = 0;
        int i3 = (bArr[0] & UByte.MAX_VALUE) << 8;
        this.f21892a = i3;
        int i10 = (i3 | (bArr[1] & UByte.MAX_VALUE)) << 8;
        this.f21892a = i10;
        int i11 = (i10 | (bArr[2] & UByte.MAX_VALUE)) << 8;
        this.f21892a = i11;
        this.f21892a = (bArr[3] & UByte.MAX_VALUE) | i11;
    }

    public final void a(int i3) {
        this.f21892a = (1 << (i3 - 1)) | this.f21892a;
    }
}
