package ea;

import Xa.h;
import Z9.K;
import ba.AbstractC0534b;
import ca.C0582a;
import com.stub.StubApp;
import fa.C0935a;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* renamed from: ea.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0857d implements InterfaceC0856c, X9.a, X9.b {

    /* renamed from: a, reason: collision with root package name */
    public String f13674a = "";

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0534b f13675b = null;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f13676c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f13677d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public String f13678e = "";

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f13679f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f13680g;

    /* renamed from: h, reason: collision with root package name */
    public final ConcurrentHashMap f13681h;

    public C0857d() {
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        this.f13679f = new ArrayList();
        this.f13680g = new LinkedHashMap();
        this.f13681h = new ConcurrentHashMap();
    }

    public static C0857d c(FileInputStream fileInputStream) {
        C0582a c0582a = new C0582a();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Blake2xsDigest.UNKNOWN_DIGEST_LENGTH];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read == -1) {
                c0582a.a(byteArrayOutputStream.toByteArray());
                V6.b bVar = new V6.b(12, false);
                byte[] copyOfRange = Arrays.copyOfRange(c0582a.f11053a, 0, c0582a.f11054b[0]);
                byte[] bArr2 = c0582a.f11053a;
                int[] iArr = c0582a.f11054b;
                int i3 = iArr[0];
                return bVar.N(copyOfRange, Arrays.copyOfRange(bArr2, i3, iArr[1] + i3));
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static C0857d f(byte[] bArr) {
        C0582a c0582a = new C0582a();
        c0582a.a(bArr);
        V6.b bVar = new V6.b(12, false);
        byte[] copyOfRange = Arrays.copyOfRange(c0582a.f11053a, 0, c0582a.f11054b[0]);
        byte[] bArr2 = c0582a.f11053a;
        int[] iArr = c0582a.f11054b;
        int i3 = iArr[0];
        return bVar.N(copyOfRange, Arrays.copyOfRange(bArr2, i3, iArr[1] + i3));
    }

    @Override // X9.b
    public final List a() {
        return Collections.unmodifiableList(this.f13676c);
    }

    @Override // X9.a
    public final AbstractC0534b b() {
        return this.f13675b;
    }

    @Override // X9.b
    public final C0935a d() {
        return new C0935a(this.f13677d);
    }

    @Override // X9.b
    public final boolean e(String str) {
        return this.f13680g.get(str) != null;
    }

    @Override // X9.b
    public final String getName() {
        return this.f13674a;
    }

    @Override // X9.b
    public final float h(String str) {
        K n10 = n(str);
        if (n10.f9093d == null) {
            n10.a();
        }
        return n10.f9094e;
    }

    @Override // ea.InterfaceC0856c
    public final K n(String str) {
        ConcurrentHashMap concurrentHashMap = this.f13681h;
        K k3 = (K) concurrentHashMap.get(str);
        if (k3 != null) {
            return k3;
        }
        LinkedHashMap linkedHashMap = this.f13680g;
        byte[] bArr = (byte[]) linkedHashMap.get(str);
        if (bArr == null) {
            bArr = (byte[]) linkedHashMap.get(StubApp.getString2(7719));
        }
        C2.a aVar = new C2.a(this.f13674a, str, false);
        ArrayList arrayList = this.f13679f;
        ArrayList arrayList2 = new ArrayList();
        aVar.a(bArr, arrayList, arrayList2);
        K k4 = new K(this, this.f13674a, str);
        k4.j = arrayList2;
        concurrentHashMap.put(str, k4);
        return k4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        h.w(C0857d.class, sb2, StubApp.getString2(17387));
        sb2.append(this.f13674a);
        sb2.append(StubApp.getString2(17388));
        sb2.append(this.f13678e);
        sb2.append(StubApp.getString2(17389));
        sb2.append(this.f13675b);
        sb2.append(StubApp.getString2(17390));
        sb2.append(this.f13680g);
        sb2.append(StubApp.getString2(511));
        return sb2.toString();
    }
}
