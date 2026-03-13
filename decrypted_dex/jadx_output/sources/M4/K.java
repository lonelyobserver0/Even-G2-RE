package M4;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4551a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4552b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4553c;

    public K(Object obj, Object obj2, Object obj3) {
        this.f4551a = obj;
        this.f4552b = obj2;
        this.f4553c = obj3;
    }

    public final IllegalArgumentException a() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(3541));
        Object obj = this.f4551a;
        sb2.append(obj);
        String string2 = StubApp.getString2(2359);
        sb2.append(string2);
        sb2.append(this.f4552b);
        sb2.append(StubApp.getString2(3542));
        sb2.append(obj);
        sb2.append(string2);
        sb2.append(this.f4553c);
        return new IllegalArgumentException(sb2.toString());
    }
}
