package aa;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.UByte;

/* renamed from: aa.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0395b {

    /* renamed from: f, reason: collision with root package name */
    public int f9335f;

    /* renamed from: a, reason: collision with root package name */
    public int f9330a = 0;

    /* renamed from: b, reason: collision with root package name */
    public String f9331b = null;

    /* renamed from: c, reason: collision with root package name */
    public String f9332c = null;

    /* renamed from: d, reason: collision with root package name */
    public String f9333d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f9334e = 4;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f9336g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f9337h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f9338i = new HashMap();
    public final HashMap j = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f9339k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public int f9340l = -1;

    public static int c(int i3, byte[] bArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < i3; i11++) {
            i10 = (i10 << 8) | (bArr[i11] & UByte.MAX_VALUE);
        }
        return i10;
    }

    public final void a(String str, byte[] bArr) {
        this.f9338i.put(str, bArr.clone());
        int i3 = 0;
        for (byte b2 : bArr) {
            i3 = (i3 << 8) | ((b2 + UByte.MIN_VALUE) % 256);
        }
        this.f9337h.put(Integer.valueOf(i3), str);
        if (StubApp.getString2(397).equals(str)) {
            this.f9340l = i3;
        }
    }

    public final int b(int i3) {
        int i10;
        Integer num = (Integer) this.j.get(Integer.valueOf(i3));
        if (num != null) {
            return num.intValue();
        }
        Iterator it = this.f9339k.iterator();
        while (it.hasNext()) {
            C0394a c0394a = (C0394a) it.next();
            char c10 = (char) i3;
            char c11 = c0394a.f9327a;
            if (c11 > c10 || c10 > c0394a.f9328b) {
                i10 = -1;
            } else {
                i10 = (c10 - c11) + c0394a.f9329c;
            }
            if (i10 != -1) {
                return i10;
            }
        }
        return 0;
    }

    public final String toString() {
        return this.f9331b;
    }
}
