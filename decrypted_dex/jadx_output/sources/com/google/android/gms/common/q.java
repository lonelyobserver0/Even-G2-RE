package com.google.android.gms.common;

import S3.D;
import S3.y;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.stub.StubApp;
import e4.AbstractC0841a;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class q extends c4.b implements y {

    /* renamed from: f, reason: collision with root package name */
    public final int f11212f;

    public q(byte[] bArr) {
        super(StubApp.getString2(11548), 1);
        D.b(bArr.length == 25);
        this.f11212f = Arrays.hashCode(bArr);
    }

    public static byte[] N(String str) {
        try {
            return str.getBytes(StubApp.getString2("2882"));
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // c4.b
    public final boolean L(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 == 1) {
            Z3.a d8 = d();
            parcel2.writeNoException();
            AbstractC0841a.c(parcel2, d8);
            return true;
        }
        if (i3 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f11212f);
        return true;
    }

    public abstract byte[] O();

    @Override // S3.y
    public final int b() {
        return this.f11212f;
    }

    @Override // S3.y
    public final Z3.a d() {
        return new Z3.b(O());
    }

    public final boolean equals(Object obj) {
        Z3.a d8;
        if (obj != null && (obj instanceof y)) {
            try {
                y yVar = (y) obj;
                if (yVar.b() == this.f11212f && (d8 = yVar.d()) != null) {
                    return Arrays.equals(O(), (byte[]) Z3.b.O(d8));
                }
            } catch (RemoteException e10) {
                Log.e(StubApp.getString2(11524), StubApp.getString2(11527), e10);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f11212f;
    }
}
