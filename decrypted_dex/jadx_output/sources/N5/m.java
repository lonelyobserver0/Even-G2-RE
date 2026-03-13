package N5;

import java.util.EnumMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f4908a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f4909b;

    /* renamed from: c, reason: collision with root package name */
    public o[] f4910c;

    /* renamed from: d, reason: collision with root package name */
    public final a f4911d;

    /* renamed from: e, reason: collision with root package name */
    public EnumMap f4912e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(String str, byte[] bArr, o[] oVarArr, a aVar) {
        this(str, bArr, oVarArr, aVar, 0);
        System.currentTimeMillis();
    }

    public final void a(EnumMap enumMap) {
        if (enumMap != null) {
            EnumMap enumMap2 = this.f4912e;
            if (enumMap2 == null) {
                this.f4912e = enumMap;
            } else {
                enumMap2.putAll(enumMap);
            }
        }
    }

    public final void b(n nVar, Object obj) {
        if (this.f4912e == null) {
            this.f4912e = new EnumMap(n.class);
        }
        this.f4912e.put((EnumMap) nVar, (n) obj);
    }

    public final String toString() {
        return this.f4908a;
    }

    public m(String str, byte[] bArr, o[] oVarArr, a aVar, int i3) {
        this.f4908a = str;
        this.f4909b = bArr;
        this.f4910c = oVarArr;
        this.f4911d = aVar;
        this.f4912e = null;
    }
}
