package com.google.android.gms.common;

import S3.D;
import com.stub.StubApp;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class o implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f11206a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11207b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f11208c;

    public /* synthetic */ o(boolean z2, String str, r rVar) {
        this.f11206a = z2;
        this.f11207b = str;
        this.f11208c = rVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        r rVar = this.f11208c;
        boolean z2 = this.f11206a;
        String str = this.f11207b;
        String string2 = (z2 || !t.a(str, rVar, true, false).f11226a) ? StubApp.getString2(11539) : StubApp.getString2(11538);
        String string22 = StubApp.getString2(1488);
        int i3 = 0;
        while (true) {
            if (i3 >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance(string22);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                break;
            }
            i3++;
        }
        D.h(messageDigest);
        byte[] digest = messageDigest.digest(rVar.f11213g);
        int length = digest.length;
        char[] cArr = new char[length + length];
        int i10 = 0;
        for (byte b2 : digest) {
            int i11 = b2 & UByte.MAX_VALUE;
            char[] cArr2 = W3.b.f8101b;
            cArr[i10] = cArr2[i11 >>> 4];
            cArr[i10 + 1] = cArr2[b2 & 15];
            i10 += 2;
        }
        return string2 + StubApp.getString2(11540) + str + StubApp.getString2(11541) + new String(cArr) + StubApp.getString2(11542) + z2 + StubApp.getString2(11543);
    }
}
