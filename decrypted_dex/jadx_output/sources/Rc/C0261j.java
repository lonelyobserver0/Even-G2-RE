package Rc;

import com.google.android.gms.internal.measurement.F1;
import com.stub.StubApp;

/* renamed from: Rc.j, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0261j extends F1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6401e;

    public /* synthetic */ C0261j(int i3) {
        this.f6401e = i3;
    }

    @Override // com.google.android.gms.internal.measurement.F1
    public final Object s(String str, Qc.c cVar, Qc.g gVar, boolean z2) {
        switch (this.f6401e) {
            case 0:
                throw new C0260i(StubApp.getString2(25591));
            case 1:
                try {
                    Pc.a b2 = Pc.a.b(cVar, str);
                    return cVar.getClass() == gVar.getClass() ? b2 : new Pc.a(gVar, b2);
                } catch (Exception e10) {
                    if (z2 && str != null && str.endsWith(StubApp.getString2(25589))) {
                        try {
                            Pc.a b10 = Pc.a.b(cVar, str.substring(0, str.length() - 1));
                            return cVar.getClass() == gVar.getClass() ? b10 : new Pc.a(gVar, b10);
                        } catch (Exception unused) {
                            throw new C0260i(E1.a.j(StubApp.getString2(25590), str), e10);
                        }
                    }
                    throw new C0260i(E1.a.j(StubApp.getString2(25590), str), e10);
                }
            case 2:
                try {
                    return EnumC0259h.valueOf(str);
                } catch (IllegalArgumentException unused2) {
                    throw new C0260i(E1.a.j(StubApp.getString2(25588), str));
                }
            case 3:
                String string2 = StubApp.getString2(25585);
                gVar.getClass();
                String string22 = StubApp.getString2(25586);
                try {
                    int parseInt = Integer.parseInt(str) - 1;
                    if (parseInt >= 0 && parseInt < 12) {
                        return Integer.valueOf(parseInt);
                    }
                    throw new IllegalArgumentException(string22 + str + string2);
                } catch (NumberFormatException e11) {
                    throw new IllegalArgumentException(E1.a.j(StubApp.getString2(25587), str), e11);
                }
            case 4:
                Qc.a aVar = (Qc.a) O.f6395a.get(str);
                if (aVar != null) {
                    return aVar.a(cVar.f5917a);
                }
                throw new C0260i(E1.a.k(StubApp.getString2(25584), str, StubApp.getString2(620)));
            case 5:
                try {
                    return L.valueOf(str);
                } catch (IllegalArgumentException unused3) {
                    throw new C0260i(E1.a.j(StubApp.getString2(25583), str));
                }
            case 6:
                try {
                    return Pc.b.valueOf(str);
                } catch (IllegalArgumentException unused4) {
                    throw new C0260i(E1.a.j(StubApp.getString2(25582), str));
                }
            default:
                String string23 = StubApp.getString2(620);
                String string24 = StubApp.getString2(25581);
                try {
                    int length = str.length();
                    if (length <= 2) {
                        return new M(0, Pc.b.valueOf(str));
                    }
                    int i3 = length - 2;
                    int parseInt2 = Integer.parseInt(str.substring(str.charAt(0) == '+' ? 1 : 0, i3));
                    if (!z2 && (parseInt2 == 0 || parseInt2 < -53 || parseInt2 > 53)) {
                        throw new C0260i(string24 + str + string23);
                    }
                    return new M(parseInt2, Pc.b.valueOf(str.substring(i3)));
                } catch (Exception e12) {
                    throw new C0260i(E1.a.k(string24, str, string23), e12);
                }
        }
    }

    @Override // com.google.android.gms.internal.measurement.F1
    public void x(StringBuilder sb2, Object obj, Qc.g gVar) {
        switch (this.f6401e) {
            case 3:
                int intValue = ((Integer) obj).intValue();
                gVar.getClass();
                sb2.append(String.valueOf(intValue + 1));
                break;
            default:
                super.x(sb2, obj, gVar);
                break;
        }
    }
}
