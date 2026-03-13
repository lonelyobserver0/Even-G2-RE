package Xa;

import aa.C0398e;
import android.util.Log;
import com.stub.StubApp;
import io.flutter.plugin.common.BinaryMessenger;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class w implements x {

    /* renamed from: a, reason: collision with root package name */
    public final BinaryMessenger f8603a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f8604b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f8605c;

    /* renamed from: d, reason: collision with root package name */
    public final i2.o f8606d;

    public w(BinaryMessenger binaryMessenger) {
        HashMap hashMap = new HashMap();
        this.f8605c = hashMap;
        this.f8606d = new i2.o();
        this.f8603a = binaryMessenger;
        A a3 = C.f8510a;
        B b2 = new B();
        b2.f8509a = false;
        B b10 = new B[]{b2}[0];
        b10.getClass();
        hashMap.put(4294967556L, b10);
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02f3  */
    @Override // Xa.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.KeyEvent r32, aa.C0398e r33) {
        /*
            Method dump skipped, instructions count: 904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Xa.w.a(android.view.KeyEvent, aa.e):void");
    }

    public final void b(t tVar, final C0398e c0398e) {
        long j;
        long j3;
        byte[] bArr = null;
        BinaryMessenger.BinaryReply binaryReply = c0398e == null ? null : new BinaryMessenger.BinaryReply() { // from class: Xa.u
            @Override // io.flutter.plugin.common.BinaryMessenger.BinaryReply
            public final void reply(ByteBuffer byteBuffer) {
                Boolean bool = Boolean.FALSE;
                if (byteBuffer != null) {
                    byteBuffer.rewind();
                    if (byteBuffer.capacity() != 0) {
                        bool = Boolean.valueOf(byteBuffer.get() != 0);
                    }
                } else {
                    Log.w(StubApp.getString2(7447), StubApp.getString2(7448));
                }
                C0398e.this.o(bool.booleanValue());
            }
        };
        try {
            String str = tVar.f8596g;
            if (str != null) {
                bArr = str.getBytes(StubApp.getString2("640"));
            }
            int length = bArr == null ? 0 : bArr.length;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(tVar.f8590a);
            int i3 = tVar.f8591b;
            if (i3 == 1) {
                j = 0;
            } else if (i3 == 2) {
                j = 1;
            } else {
                if (i3 != 3) {
                    throw null;
                }
                j = 2;
            }
            allocateDirect.putLong(j);
            allocateDirect.putLong(tVar.f8592c);
            allocateDirect.putLong(tVar.f8593d);
            allocateDirect.putLong(tVar.f8594e ? 1L : 0L);
            int i10 = tVar.f8595f;
            if (i10 == 1) {
                j3 = 0;
            } else if (i10 == 2) {
                j3 = 1;
            } else if (i10 == 3) {
                j3 = 2;
            } else if (i10 == 4) {
                j3 = 3;
            } else {
                if (i10 != 5) {
                    throw null;
                }
                j3 = 4;
            }
            allocateDirect.putLong(j3);
            if (bArr != null) {
                allocateDirect.put(bArr);
            }
            this.f8603a.send(StubApp.getString2(7455), allocateDirect, binaryReply);
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError(StubApp.getString2(7456));
        }
    }

    public final void c(boolean z2, Long l9, Long l10, long j) {
        t tVar = new t();
        tVar.f8590a = j;
        tVar.f8591b = z2 ? 1 : 2;
        tVar.f8593d = l9.longValue();
        tVar.f8592c = l10.longValue();
        tVar.f8596g = null;
        tVar.f8594e = true;
        tVar.f8595f = 1;
        if (l10.longValue() != 0 && l9.longValue() != 0) {
            if (!z2) {
                l9 = null;
            }
            d(l10, l9);
        }
        b(tVar, null);
    }

    public final void d(Long l9, Long l10) {
        HashMap hashMap = this.f8604b;
        if (l10 != null) {
            if (((Long) hashMap.put(l9, l10)) != null) {
                throw new AssertionError(StubApp.getString2(7457));
            }
        } else if (((Long) hashMap.remove(l9)) == null) {
            throw new AssertionError(StubApp.getString2(7458));
        }
    }
}
